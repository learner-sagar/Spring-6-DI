package com.example.spring6di;

import com.example.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testGetControllerFromCtx(){
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}
	@Test
	void contextLoads() {
	}

}
