package com.gcu.busiuness;

import java.util.List;

import com.gcu.model.OrderModel;

public interface OrdersBusinessInterface 
{
	public void test();
	public List<OrderModel> getOrders();
	public void init();
	public void destroy();
}