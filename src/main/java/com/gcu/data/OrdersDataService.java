package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.OrderEntity;
import com.gcu.data.repository.OrdersRepository;
import com.gcu.model.OrderModel;

@SuppressWarnings("rawtypes")
@Service
public class OrdersDataService implements DataAccessInterface<OrderEntity>
{
	
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
		List<OrderEntity> orders = new ArrayList<OrderEntity>();
		try
		{
			Iterable<OrderEntity> ordersIterable = ordersRepository.findAll();
			
			// Convert to a list and return the list
			orders = new ArrayList<OrderEntity>();
			ordersIterable.forEach(orders::add);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
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
