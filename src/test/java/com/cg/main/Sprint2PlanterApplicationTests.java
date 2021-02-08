package com.cg.main;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.main.controller.MyContoller;

/**
 * @author Apala Das
 *
 */
@SpringBootTest
class Sprint2PlanterApplicationTests {
	
	// Autowire Controller class
	@Autowired
	private MyContoller controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
