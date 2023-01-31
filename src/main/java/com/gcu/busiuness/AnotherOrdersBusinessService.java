package com.gcu.busiuness;

import java.util.List;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessInterface 
{
	@Override
	public void test()
	{
		System.out.println("Hello from the AnotherOrdersBusinessService");
	}

	@Override
	public List<OrderModel> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init() {
		System.out.println("Hello from the AnotherOrdersBusinessService.init()");
		
	}

	@Override
	public void destroy() {
		System.out.println("Hello from the AnotherOrdersBusinessService.destroy()");
		
	}
}
