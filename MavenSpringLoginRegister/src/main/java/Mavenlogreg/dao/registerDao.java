package Mavenlogreg.dao;


import Mavenlogreg.bean.Register;

public interface registerDao {

	int save(Register register);

	int login(Register register);

	

}
