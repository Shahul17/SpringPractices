package Mavenlogreg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import Mavenlogreg.bean.Register;


public class registerDaoImpl implements registerDao{
	JdbcTemplate jdbcTemplate;
	//private String id;
	
	public registerDaoImpl() {}
	public registerDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	@Override
	public int save(Register register) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			jdbcTemplate.update("Insert into register values(?,?,?,?)",register.getFullName(),register.getEmail(),register.getUsername(),register.getPassword());
			result = 1;
		}
		catch(Exception ex) {
			result = 0;
		}
		return result;
	}
	@Override
	public int login(Register register) {
		
			int result = 0;
			String strSelect = "Select * from register where Password=?";
			Register dbCustomer = jdbcTemplate.queryForObject(strSelect,new Object[] {register.getPassword()}, new BeanPropertyRowMapper<Register>(Register.class));
			if(dbCustomer!= null && dbCustomer.getUsername().equals(register.getUsername()))
				result = 1;
			return result;
		}
	}

	


