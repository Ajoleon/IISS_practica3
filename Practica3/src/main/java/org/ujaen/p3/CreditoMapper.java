package org.ujaen.p3;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CreditoMapper implements RowMapper<DTOcredito> {
	public DTOcredito mapRow(ResultSet rs, int rowNum) throws SQLException{
		DTOcredito dto = new DTOcredito();
		
		dto.setMatricula(rs.getString("Matricula"));
		dto.setCredito(rs.getDouble("Credito"));
	
		return dto;
	}

}
