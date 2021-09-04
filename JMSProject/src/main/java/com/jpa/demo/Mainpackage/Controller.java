package com.jpa.demo.Mainpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

		@Autowired
		Service1 obj1; 
		@Autowired private JmsTemplate jmsTemplate;
		@PostMapping("/hello")
		public Message show(@RequestBody Message obj)
		{
			  System.out.println("Sending a transaction.");
			    // Post message to the message queue named "OrderTransactionQueue"
			    jmsTemplate.convertAndSend("OrderTransactionQueue", obj); 
			    return obj1.show1(obj);
		}
		
		
		
}
