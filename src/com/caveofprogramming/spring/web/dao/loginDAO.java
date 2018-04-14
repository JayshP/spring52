package com.caveofprogramming.spring.web.dao;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component("loginDao")
public class loginDAO {
	
	private NamedParameterJdbcTemplate jdbc;
	
	
	
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc= new NamedParameterJdbcTemplate(jdbc);
	}
	
public List<login> getNames(){
	
	
	return jdbc.query("select * from login", new RowMapper() {

		@Override
		public login mapRow(ResultSet rs, int rowNum) throws SQLException {
			login login = new login();
			login.setE_ID(rs.getInt("E_ID"));
		    login.setE_name(rs.getString("E_name"));
		    login.setE_type(rs.getString("E_type"));
		    login.setE_password(rs.getString("E_password"));
			
			return login;
		}
		
	});
	
	
}

public login getname(int id){
	
	MapSqlParameterSource params = new MapSqlParameterSource();
	params.addValue("id", id);
	
	return jdbc.queryForObject("select * from login where E_ID = :id",params, new RowMapper<login>() {

		@Override
		public login mapRow(ResultSet rs, int rowNum) throws SQLException {
			login login = new login();
			login.setE_ID(rs.getInt("E_ID"));
		    login.setE_name(rs.getString("E_name"));
		    login.setE_type(rs.getString("E_type"));
		    login.setE_password(rs.getString("E_password"));
			
			return login;
		}
		
	});
	
}

public boolean create(login login) {
	
	BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(login);
	
	return jdbc.update("insert into login(E_type,E_name,E_password) values (:type,:name,:password)",params)==1;
	

}

public boolean delete(int id) {
	MapSqlParameterSource params = new MapSqlParameterSource();
	params.addValue("id", id);
	
	return jdbc.update("delete from login where id = :id", params)==1;
	
}


}



