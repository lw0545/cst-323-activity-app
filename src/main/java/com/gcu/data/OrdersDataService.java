package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.gcu.CST323ActivityApp;
import com.gcu.data.entity.OrderEntity;
import com.gcu.data.repository.OrdersRepository;
import com.gcu.model.OrderModel;

@SuppressWarnings("rawtypes")
@Service
public class OrdersDataService implements DataAccessInterface<OrderEntity>
{
	private static Logger logger = LoggerFactory.getLogger(OrdersDataService.class);
	@Autowired
	private OrdersRepository ordersRepository;
	
	/**
	 * Non-Default constructor
	 */
	
	public OrdersDataService(OrdersRepository ordersRepository)
	{
		this.ordersRepository = ordersRepository;
	}

	public List<OrderEntity> findAll() 
	{
		logger.info("Entered findAll()");
		List<OrderEntity> orders = new ArrayList<OrderEntity>();
		try
		{
			Iterable<OrderEntity> ordersIterable = ordersRepository.findAll();
			
			// Convert to a list and return the list
			orders = new ArrayList<OrderEntity>();
			ordersIterable.forEach(orders::add);
			logger.info("Added orders to List 'orders'");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		logger.info("Entered /orders");
		return orders;
	}
	@Override
	public OrderEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean create(OrderEntity order) {
		try
		{
			this.ordersRepository.save(order);
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return false;
	}

	@Override
	public boolean update(OrderEntity t) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(OrderEntity t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean create(OrderModel t) {
		// TODO Auto-generated method stub
		return false;
	}

}
