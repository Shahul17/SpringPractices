package crud.mvcCrud.dao;

import crud.mvcCrud.bean.*;
import java.util.List;

public interface CustomerDao {
	
	public List<Customer> getAll();
	public List<Customer> getOne();

	public int save(Customer customer);
	public int update(Customer customer);
	public int delete(Customer customer);

	
	

}