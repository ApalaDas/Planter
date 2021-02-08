package com.cg.main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.model.Planter;
import com.cg.main.service.IService;

@SpringBootTest
class PlanterTest {
	@Autowired
	IService service;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Test start...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test end...");
	}

	/**
	 * Test for addPlanter method
	 */
	@Test
	void test() {
		Planter planter = new Planter(5, 3, 10, 250.0, "round", "red", 5f);
		Integer i = 3;
		Planter p = service.addPlanter(planter);
		assertEquals(i, p.getHoles());
	}

	/**
	 * Test for updatePlanter method
	 */
	@Test
	void test2() {
		Integer i = 1;
		// System.out.println(service.updatePlanter( new Planter( 5, 5, 10, 250.0,
		// "round", "red", 5f)));
		assertEquals(i, service.updatePlanter(new Planter( 5, 1, 10, 250.0, "square", "purple", 5f)).getHoles());
	}

	/**
	 * Test for deletePlanter method
	 */
	@Test
	void test3() {
		assertNotNull(service.deletePlanter(91));
	}

	/**
	 * Test for viewPlantersByShape method
	 */
	@Test
	void test4() {
		assertEquals(4, service.viewPlantersByShape("triangle").size());
	}

	/**
	 * Test for viewAllPlanters method
	 */
	@Test
	void test5() {
		// System.out.println(service.viewAllPlanters());
		assertFalse(service.viewAllPlanters().isEmpty());
	}

	/**
	 * Test for viewPlanter method
	 */
	@Test
	void test6() {
		assertEquals("round", service.viewPlanter(8).getPlanterShape());
	}

	/**
	 * Test for viewAllPlanters method to view all planters within a range
	 */
	@Test
	void test7() {
		List<Planter> pList = service.viewAllPlanters(100, 700);
		assertFalse(pList.isEmpty());
	}

}
