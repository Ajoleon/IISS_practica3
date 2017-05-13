package org.ujaen.p3;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MatriculaMapper implements RowMapper<DTOmatricula> {
	public DTOmatricula mapRow(ResultSet rs, int rowNum) throws SQLException{
		DTOmatricula dto = new DTOmatricula();
		
		dto.setParkingId(rs.getInt("ParkingId"));
		dto.setMatricula(rs.getString("Matricula"));
		dto.setFecha(rs.getTimestamp("Tiempo"));
	
		return dto;
	}
}
