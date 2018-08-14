package com.mkyong.SpringExample.webcontroller;

import java.util.List;


 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mkyong.dao.StockDao;
import com.mkyong.daoImpl.StockDaoImpl;
import com.mkyong.spring.model.Stock;


@Controller
public class HomeController {
	
	@Autowired
    private StockDao stockDao;
	
	@RequestMapping(value="/Home")
    public ModelAndView home() {
        List<Stock> listUsers = stockDao.list();
        ModelAndView model = new ModelAndView("home");
        model.addObject("userList", listUsers);
        return model;
    }

}
