package com.mkyong.daoImpl;

import com.mkyong.dao.StockDao;
import com.mkyong.spring.model.Stock;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class StockDaoImpl implements StockDao{
	
	private SessionFactory sessionFactory;
	
	public StockDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	

	@Override
    @Transactional
    public List<Stock> list() {
        @SuppressWarnings("unchecked")
        
        List<Stock> listUser = /*(List<Stock>)*/ sessionFactory.getCurrentSession().createQuery("from stock").list();
        return listUser;
    }
	

	

}
