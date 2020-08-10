package crud.mvcCrud.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import crud.mvcCrud.bean.Customer;
import crud.mvcCrud.dao.CustomerDao;

@Controller
public class UpdateController {
	@Autowired
	CustomerDao ForUpdatereferenceDao;
	@RequestMapping(value="/update")
	public ModelAndView updateCustomer() throws IOException{
		ModelAndView modelAndview= new ModelAndView("updateCustomer");
		return modelAndview;
	}
	@RequestMapping(value="/updateprocess" , method=RequestMethod.POST)
	public ModelAndView updateCustomer(@ModelAttribute Customer customer) throws IOException{
		ModelAndView modelAndview= new ModelAndView("updateCustomer");
		
		
		try {
			if(customer != null)
			{
				ForUpdatereferenceDao.update(customer);
				modelAndview = new ModelAndView("Afterupdate");
				modelAndview.addObject("customer",customer);
			}
		}catch(Exception e)
			{
				//modelAndview= new ModelAndView("updatecustomer");
			}
			return modelAndview;}
	}
		