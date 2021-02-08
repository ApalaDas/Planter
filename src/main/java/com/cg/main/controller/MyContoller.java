package com.cg.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.main.exceptions.PlanterNotFoundException;
import com.cg.main.model.Planter;
import com.cg.main.service.IService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Apala Das
 *
 */
@Api(value="Controller",description= "Handler methods for Planter Module...")
@RestController
@RequestMapping("/nursery")
public class MyContoller {
	@Autowired
	IService service;
	/**
	 * addPlanter method to add a planter object to the database table
	 * @param planter
	 * @return Planter
	 */
	@ApiOperation(value="Click here to add a Planter")
	@PostMapping("/planterAdd")
	public Planter addPlanter (@Valid @RequestBody Planter planter) {
		return service.addPlanter(planter);
		 
	}
	
	/**
	 *  updatePlanterto update a planter
	 * @param planter
	 * @return ResponseEntity<Planter>
	 */
	@ApiOperation(value="Click here to update update a Planter")
	@PutMapping("/planterUpdate")
	public ResponseEntity<Planter> updatePlanter(@RequestBody Planter planter){
		Planter p=service.updatePlanter(planter);
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	/**
	 * deletePlanter method to delete a planter by given id
	 */
	@ApiOperation(value="Click here to delete a Planter")
	@DeleteMapping("/planterDelete/{planterId}")
	public ResponseEntity<List<Planter>> deletePlanter(@PathVariable("planterId") int planterId){
		List<Planter> p= service.deletePlanter(planterId);
		return new ResponseEntity<> (p,HttpStatus.OK);
	}
	
	/**
	 * viewPlanter method to view planters by a given Id
	 */
	@ApiOperation(value="Click here to view a specific Planter by Id")
	@GetMapping("/planterView/{planterId}")
	public ResponseEntity<Planter> viewPlanter(@PathVariable("planterId") int planterId){
		Planter p= service.viewPlanter(planterId);
		if(p==null) {
			throw new PlanterNotFoundException("No planter with this id found.");
		}
		return new ResponseEntity<>(p,HttpStatus.OK); 
	}
	
	/**
	 * viewPlantersByShape method to view planters by a specific shape
	 * 
	 */
	@ApiOperation(value="Click here to view Planters by shape")
	@GetMapping("/planterViewByShape/{planterShape}")
	public ResponseEntity<List<Planter>> viewPlantersByShape(@PathVariable("planterShape") String planterShape ){
		List<Planter> p=service.viewPlantersByShape(planterShape);
		return new ResponseEntity<> (p,HttpStatus.OK); 
	}
	
	/**
	 * viewAllPlanters method to view all the planters
	 */
	@ApiOperation(value="Click here to view all the Planters")
	@GetMapping("/plantersViewAll")
	public ResponseEntity<List<Planter>> viewAllPlanters(){
		List<Planter> p=service.viewAllPlanters();
		if(p.isEmpty()) {
			throw new PlanterNotFoundException("No planter with this shape found.");
		}
		return new ResponseEntity<> (p,HttpStatus.OK); 
	
	}
	
	
	/**
	 *
	 * viewAllPlanters method to view planters
	 * within a range of cost
	 */
	@ApiOperation(value="Click here to view all the Planters in a range of cost")
	@GetMapping("/plantersViewByCost/{minCost}/{maxCost}")
	public ResponseEntity<List<Planter>> viewAllPlanters(@PathVariable("minCost") double minCost, @PathVariable("maxCost") double maxCost){
		List<Planter> p=service.viewAllPlanters(minCost, maxCost);
		if(p==null) {
			throw new PlanterNotFoundException("No planter found in this range.");
		}
		return new ResponseEntity<> (p,HttpStatus.OK); 
	}


}
