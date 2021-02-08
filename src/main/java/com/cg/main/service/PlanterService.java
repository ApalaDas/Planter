package com.cg.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.main.model.Planter;
import com.cg.main.repository.IPlanterRepository;

/**
 * @author Apala Das
 *
 */
@Service
@Transactional
public class PlanterService implements IService {
	@Autowired
	IPlanterRepository repository;
	
	/** 
	 * @param planter
	 * @return Planter
	 */
	@Override
	public Planter addPlanter(Planter planter) {
		return repository.save(planter);
	}

	/**
	 * 
	 * @param planter
	 * @return Planter
	 */
	@Override
	public Planter updatePlanter(Planter planter) {
		return repository.save(planter);
	}

	/**
	 * 
	 * @param id
	 * @return List<Planter>
	 */
	@Override
	public List<Planter> deletePlanter(int planterId) {
		repository.deleteById(planterId);
		return repository.findAll();
	}

	/**
	 * 
	 * @param planterId
	 * @return Planter
	 */
	@Override
	public Planter viewPlanter(int planterId) {
		return repository.findById(planterId).get();
	}

	/**
	 * 
	 * @param planterShape
	 * @return List<Planter>
	 */
	@Override
	public List<Planter> viewPlantersByShape(String planterShape) {
		return repository.findAllByPlanterShape(planterShape);
	}


	/**
	 * 
	 * @return List<Planter>
	 */
	@Override
	public List<Planter> viewAllPlanters() {
		return repository.findAll();
	}

	/**
	 * 
	 * @param minCost
	 * @param maxCost
	 * @return List<Planter>
	 */
	@Override
	public List<Planter> viewAllPlanters(double minCost, double maxCost) {
		return repository.findPlanterCostGreaterThanEqualAndPlanterCostLessThanEqual(minCost, maxCost);
	}
	
	
}
