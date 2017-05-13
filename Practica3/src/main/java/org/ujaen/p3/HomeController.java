package org.ujaen.p3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	private static SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//al formato del sql
	private final double preciominuto = 0.03/360000; //3 centimos minuto
	@Autowired
	DAOmatricula dao;
	@Autowired
	DAOcredito dao1;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		return "home";
	}
	@RequestMapping(value = "/saveMatricula", method = RequestMethod.POST)
	public ResponseEntity<DTOmatricula> matricula(@RequestBody DTOmatricula datos) {
		
		System.out.println(datos.getMatricula());
		System.out.println(datos.getParkingId());
		ResponseEntity<DTOmatricula> respuesta = null;
		HttpHeaders cabeceras = new HttpHeaders();
		DTOmatricula coche = new  DTOmatricula();
		
		switch(datos.getParkingId()){
		case 1:
			 coche = dao.obtener(datos.getMatricula());
			if(coche == null|| coche.getParkingId()==2){
				Date date = new Date();
				try {
					date =  dateformat.parse(dateformat.format(date.getTime()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
					datos.setFecha(date);
					dao.entrada(datos);
					respuesta = new ResponseEntity<DTOmatricula>(datos,cabeceras,HttpStatus.OK);
			}else{ 
				System.out.println("El coche ya esta dentro");
				respuesta = new ResponseEntity<DTOmatricula>(null,cabeceras,HttpStatus.ALREADY_REPORTED);
			}
			if(coche==null){
				DTOcredito dto = new DTOcredito(datos.getMatricula(),10);
				dao1.nuevo(dto);
			}
			break;	
		case 2: 
			 coche = dao.obtener(datos.getMatricula());
			 if(coche==null){
					System.out.println("El coche no habia entrado");
					respuesta = new ResponseEntity<DTOmatricula>(null,cabeceras,HttpStatus.BAD_REQUEST);
			}else{
				if(coche.getParkingId()==1){
					Date salida = new Date();
					Date entrada = coche.getFecha();
					try {
						entrada =  dateformat.parse(dateformat.format(entrada));
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					try {
						salida =  dateformat.parse(dateformat.format(salida.getTime()));
					} catch (ParseException e) {
						e.printStackTrace();
					}
						datos.setFecha(salida);
						long diferencia = salida.getTime() - entrada.getTime() ;
						double precio = diferencia * preciominuto;
						System.out.println("Entrada: "+ entrada);
						System.out.println("Salida: "+ salida);
						System.out.println("A pagar: "+ precio);
						System.out.println("Direferencia horaria: "+diferencia);

						dao1.resta(datos.getMatricula(), precio);	
						dao.salida(datos);
						
						respuesta = new ResponseEntity<DTOmatricula>(datos,cabeceras,HttpStatus.OK);
				}else{ 
					
						System.out.println("El coche ya ha salido");
						respuesta = new ResponseEntity<DTOmatricula>(null,cabeceras,HttpStatus.ALREADY_REPORTED);
				}
			}

		break;
		default:
			System.out.println("ParkingId erroneo");
			respuesta = new ResponseEntity<DTOmatricula>(null,cabeceras,HttpStatus.BAD_REQUEST);
			break;
		}
		System.out.println(respuesta);
		return respuesta;
		
		
		
	}
	
	
}
