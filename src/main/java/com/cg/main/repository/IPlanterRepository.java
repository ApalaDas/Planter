package com.cg.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.main.model.Planter;

@Repository
public interface IPlanterRepository  extends JpaRepository<Planter,Integer>{
	/**
	 * 
	 * @param planterShape
	 * @return List<Planter>
	 */
	List<Planter> findAllByPlanterShape(String planterShape);
	@Query("select p from Planter p where p.planterCost between :minCost and :maxCost")
	List<Planter> findPlanterCostGreaterThanEqualAndPlanterCostLessThanEqual(double minCost, double maxCost);
}
