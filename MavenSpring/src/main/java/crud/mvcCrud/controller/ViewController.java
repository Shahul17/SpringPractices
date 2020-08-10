package crud.mvcCrud.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import crud.mvcCrud.bean.Customer;
import crud.mvcCrud.dao.CustomerDao;

@Controller
public class ViewController 

{
	@Autowired
	CustomerDao customerDao;
	@RequestMapping(value="/singleview")
	public ModelAndView addCustomer() throws IOException{
		ModelAndView modelAndView =new ModelAndView("singlecustomerviewpage");
		
		return modelAndView;
	}
	@RequestMapping(value="/singleviewprocess",method=RequestMethod.POST)
	public ModelAndView getOnelCustomer() throws IOException{
		ModelAndView modelAndView =new ModelAndView("singlecustomerlist");
		List<Customer> customerr = customerDao.getOne();
		modelAndView.addObject("customerr",customerr);
		return modelAndView;
	}
}
