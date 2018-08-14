package com.mkyong.SpringExample.webcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mkyong.spring.model.Stock;

@Controller
public class BusController {
	
	
	@RequestMapping(value="/Unidades")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
		
		
		ApplicationContext appContext;
		
		try {
			appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
			
			System.out.println("ruta encontrada");
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("no se encontro el archivo");
		}
		

        return new ModelAndView("pruebaindex");
    }

}
