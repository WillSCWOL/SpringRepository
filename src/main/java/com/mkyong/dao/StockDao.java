package com.mkyong.dao;

import java.util.List;

import com.mkyong.spring.model.Stock;

public interface StockDao {
	
	/*void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);*/
	
	public List<Stock> list();

}
