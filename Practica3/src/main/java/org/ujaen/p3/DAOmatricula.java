package org.ujaen.p3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DAOmatricula implements DAOmatricula_interface{
	
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
	   this.dataSource = dataSource;
	   this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public void entrada(DTOmatricula matricula){
		String sql = "insert into matriculas(Id,ParkingId,Matricula,Tiempo) values(?,?,?,?)";
		Object[] parametros ={0,1,matricula.getMatricula(),matricula.getFecha()};
		this.jdbcTemplate.update(sql,parametros);

	}
	public void salida(DTOmatricula matricula){
		String sql = "insert into matriculas(Id,ParkingId,Matricula,Tiempo) values(?,?,?,?)";
		Object[] parametros ={0,2,matricula.getMatricula(),matricula.getFecha()};
		this.jdbcTemplate.update(sql,parametros);
		
		//aqui deberia actualizar la tabla de credito ya que se llama al 
	}
	public DTOmatricula obtener(String matricula){
		String sql = "select * from matriculas where Matricula = ? order by Id desc limit 1";
		Object[] parametros = {matricula};
		MatriculaMapper mapper = new MatriculaMapper ();
		List<DTOmatricula> coche = this.jdbcTemplate.query(sql, parametros,mapper);
		if(coche.isEmpty()){
			return null;
		}else{
			return coche.get(0);
		}
	}
}
