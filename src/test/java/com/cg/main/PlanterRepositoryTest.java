package com.cg.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.repository.IPlanterRepository;
import com.cg.main.service.IService;

@SpringBootTest
class PlanterRepositoryTest {
	@Autowired
	IPlanterRepository repo;

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
	 * Test for findAllByPlanterShape method
	 */
	@Test
	void test1() {
		assertEquals(4, repo.findAllByPlanterShape("triangle").size());
	}

	/**
	 * Test for findPlanterCostGreaterThanEqualAndPlanterCostLessThanEqual method
	 */
	@Test
	void test2() {
		assertFalse(repo.findPlanterCostGreaterThanEqualAndPlanterCostLessThanEqual(100, 700).isEmpty());
	}

}
