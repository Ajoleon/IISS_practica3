package org.ujaen.p3;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DAOcredito implements DAOcredito_interface {
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
	   this.dataSource = dataSource;
	   this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public DTOcredito nuevo(DTOcredito coche){
		
		String sql = "insert into creditos(Id,Matricula,Credito) values(?,?,?)";
		Object[] parametros ={0,coche.getMatricula(),coche.getCredito()};
		this.jdbcTemplate.update(sql,parametros);
		return coche;
	}
	public double disponible(String matricula){
		String sql = "select * from creditos where Matricula = ? ";
		Object[] parametros = {matricula};
		CreditoMapper mapper  = new CreditoMapper();
		List<DTOcredito> coches = this.jdbcTemplate.query(sql,parametros,mapper);
		if (coches.isEmpty()){
			System.out.println("Coche no registrado");
			return 0;
		}else{
			return coches.get(0).getCredito();
		}
		
	}
	public DTOcredito resta(String matricula, double dinero){
		double creditoactual = disponible(matricula);
		if(creditoactual == 0){
			System.out.println("No existe");
			return null;
		}else{
			String sql = "update creditos set Credito = ? where Matricula = ? ";
			this.jdbcTemplate.update(sql,(creditoactual-dinero),matricula);
			DTOcredito dto = new DTOcredito(matricula,creditoactual-dinero);
			return dto;

		}
	}
	public DTOcredito suma(String matricula, double dinero){
		double creditoactual = disponible(matricula);
		if(creditoactual == (Double) null){
			System.out.println("No existe");
			return null;
		}else{
			String sql = "update creditos set Credito = ? where Matricula = ? ";
			this.jdbcTemplate.update(sql,(creditoactual+dinero),matricula);
			DTOcredito dto = new DTOcredito(matricula,creditoactual+dinero);
			return dto;

		}
	}
	
}
