package com.cg.main.service;

import java.util.List;

import com.cg.main.model.Planter;

public interface IService {
	/**
	 * 
	 * @param planter
	 * @return Planter
	 */
	public Planter addPlanter(Planter planter);

	/**
	 * 
	 * 
	 * @param Planter
	 * @return Planter
	 */
	public Planter updatePlanter(Planter planter);

	/**
	 * 
	 * @param id
	 * @return List<Planter>
	 */
	public List<Planter> deletePlanter(int planterId);

	/**
	 * 
	 * @param planterId
	 * @return Planter
	 */
	public Planter viewPlanter(int planterId);

	/**
	 * 
	 * @param planterShape
	 * @return List<Planter>
	 */
	public List<Planter> viewPlantersByShape(String planterShape);

	/**
	 * 
	 * @return List<Planter>
	 */
	public List<Planter> viewAllPlanters();

	/**
	 * 
	 * @param minCost
	 * @param maxCost
	 * @return List<Planter>
	 */
	public List<Planter> viewAllPlanters(double minCost, double maxCost);

}
