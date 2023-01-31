package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.gcu.busiuness.OrdersBusinessInterface;
import com.gcu.busiuness.AnotherOrdersBusinessService;
import com.gcu.busiuness.OrdersBusinessService;

@Configuration
public class SpringConfig 
{
	@Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
	@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
	@SessionScope
	public OrdersBusinessInterface getOrdersBusiness()
	{
		return new OrdersBusinessService();
	}
}
