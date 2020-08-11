package Mavenlogreg.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Mavenlogreg.bean.Register;
import Mavenlogreg.dao.registerDao;



@Controller
public class HomeController {
@Autowired
registerDao RegisterDao;
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/register")
	public ModelAndView addCustomer() throws IOException{
		ModelAndView modelAndView =new ModelAndView("registerpage");
		
		return modelAndView;
	}
	@RequestMapping(value="/registerprocess", method=RequestMethod.POST)
	public ModelAndView Registration(@ModelAttribute Register register) throws IOException{
		ModelAndView modelAndView =null;//=new ModelAndView("addCustomer");
		try {
			if(register != null)
			{
				RegisterDao.save(register);
				modelAndView = new ModelAndView("Afterregister");
				modelAndView.addObject("register",register);
			}
		} catch (Exception e) {
			modelAndView = new ModelAndView("Registration");
			modelAndView.addObject("message","Could not Register");
		}
		return modelAndView;
	}
	@RequestMapping(value="/login")
	public ModelAndView userLogin() throws IOException{
		ModelAndView modelAndView =new ModelAndView("loginpage");
		return modelAndView;
	}
	@RequestMapping(value="/loginprocess", method=RequestMethod.POST)
	public ModelAndView userPostLogin(@ModelAttribute Register register) throws IOException{
		ModelAndView modelAndView =null;
		int res = RegisterDao.login(register);
		System.out.println(res);
		if(res == 1)
		{
			System.out.println("Done");
			modelAndView =new ModelAndView("Afterlogin");
			modelAndView.addObject("message","Welcome. You are Logged in...");
		}
		else
		{
			modelAndView =new ModelAndView("failedlogin");
			modelAndView.addObject("message","Invalid username or password");
		}
			
		return modelAndView;
	}
}
