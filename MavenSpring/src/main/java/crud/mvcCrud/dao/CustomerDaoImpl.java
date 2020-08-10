package crud.mvcCrud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import crud.mvcCrud.bean.Customer;

public class CustomerDaoImpl implements CustomerDao{
	
	JdbcTemplate jdbcTemplate;
	private String id;
	
	public CustomerDaoImpl() {}
	public CustomerDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	@Override
	public List<Customer> getOne() {
		String strSelect1 = "Select * from customer where id="+id+"";
		//System.out.println(strSelect1);
		List<Customer> customerr = jdbcTemplate.query(strSelect1, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet ps, int rowNum) throws SQLException {
				Customer twoCustomer = new Customer();
				twoCustomer.setId(ps.getInt(1));
				twoCustomer.setName(ps.getString(2));
				twoCustomer.setAge(ps.getInt(3));
				return twoCustomer;
			}
		});
		return customerr;
	}
	@Override
	public List<Customer> getAll() {
		String strSelect = "Select * from customer";
		List<Customer> customers = jdbcTemplate.query(strSelect, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer oneCustomer = new Customer();
				oneCustomer.setId(rs.getInt(1));
				oneCustomer.setName(rs.getString(2));
				oneCustomer.setAge(rs.getInt(3));
				return oneCustomer;
			}
		});
		return customers;
	}

	@Override
	public int save(Customer customer) {
		//Insert into customer values(?,?,?)
		int result = 0;
		try {
			jdbcTemplate.update("Insert into customer values(?,?,?)",customer.getId(),customer.getName(),customer.getAge());
			result = 1;
		}
		catch(Exception ex) {
			result = 0;
		}
		return result;
	}
	@Override
	public int update(Customer customer) {
		int result=0;
		try {
			jdbcTemplate.update("update customer set name='"+customer.getName()+"', age="+customer.getAge()+" where id="+customer.getId()+"");
			result = 1;
		}
		catch(Exception ex) {
			result = 0;
		}
	
		
	return result;
}
	@Override
	public int delete(Customer customer) {
		// TODO Auto-generated method stub
		int result=0;
		try {
			jdbcTemplate.update("delete from customer where id="+customer.getId()+"");
			result = 1;
		}
		catch(Exception ex) {
			result = 0;
		}
	
		return result;
	}
	
	

}

