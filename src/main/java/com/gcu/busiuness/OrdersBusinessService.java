package com.gcu.busiuness;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.data.OrdersDataService;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessInterface 
{
	@Autowired
	OrdersDataService service;
	//DataAccessInterface<OrderEntity> service;
	
	@Override
	public void test()
	{
		OrderEntity entity = new OrderEntity(null, "0000011111", "My Product", 1.00f, 1);
		
		System.out.println("Hello from the OrdersBusinessService");		
	}

	@Override
	public List<OrderModel> getOrders() {
		// Create some Orders
		List<OrderEntity> ordersEntity = service.findAll();
		
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(OrderEntity entity : ordersEntity)
		{
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), 
					entity.getProductName(), entity.getPrice(), entity.getQuantity()));
		}
//		orders.add(new OrderModel(0L, "000000001", "Product 1", 1.00f, 1));
//		orders.add(new OrderModel(0L, "000000002", "Product 2", 5.00f, 2));
//		orders.add(new OrderModel(0L, "000000003", "Product 3", 8.00f, 3));
//		orders.add(new OrderModel(0L, "000000004", "Product 4", 12.00f, 4));
//		orders.add(new OrderModel(0L, "000000005", "Product 5", 3.00f, 5));
		
		return ordersDomain;
	}

	@Override
	public void init() {
		System.out.println("Hello from the OrdersBusinessService.init()");
		
	}

	@Override
	public void destroy() {
		System.out.println("Hello from the OrdersBusinessService.destroy()");
		
	}
}
