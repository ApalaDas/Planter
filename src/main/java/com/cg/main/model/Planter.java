package com.cg.main.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
	@Table(name = "planter_table")
	public class Planter {
		@Id
		@GeneratedValue
		@Column(name="planterid")
		private Integer planterId;
		
		@Column(name="plantercapacity")
		@NotNull(message = "cannot be null...")
		private Integer plantCapacity;
		
		private Integer holes;
		
		@Column(name="planterstock")
		@NotNull(message = "cannot be null...")
		private Integer planterStock;
		
		@Column(name="planter_cost")
		@NotNull(message = "cost cannot be null...")
		private Double planterCost;
		
		
		@Column(name="planter_shape")
		@NotEmpty(message = " cannot be null...")
		private String planterShape;
		
		@Column(name="planter_color")
		private String planterColor;
		
		private Float height;
		/**
		 * No arg constructor
		 */
		public Planter() {
			super();
		}
		
		/**
		 * @param plantCapacity
		 * @param holes
		 * @param planterStock
		 * @param planterCost
		 * @param planterShape
		 * @param planterColor
		 * @param height
		 */
		public Planter(Integer plantCapacity, Integer holes, Integer planterStock, Double planterCost,
				String planterShape, String planterColor, Float height) {
			super();
			this.plantCapacity = plantCapacity;
			this.holes = holes;
			this.planterStock = planterStock;
			this.planterCost = planterCost;
			this.planterShape = planterShape;
			this.planterColor = planterColor;
			this.height = height;
		}

		/**
		 * @return the planterId
		 */
		public Integer getPlanterId() {
			return planterId;
		}
		/**
		 * @param planterId the planterId to set
		 */
		public void setPlanterId(Integer planterId) {
			this.planterId = planterId;
		}
		/**
		 * @return the plantCapacity
		 */
		public Integer getPlantCapacity() {
			return plantCapacity;
		}
		/**
		 * @param plantCapacity the plantCapacity to set
		 */
		public void setPlantCapacity(Integer plantCapacity) {
			this.plantCapacity = plantCapacity;
		}
		/**
		 * @return the holes
		 */
		public Integer getHoles() {
			return holes;
		}
		/**
		 * @param holes the holes to set
		 */
		public void setHoles(Integer holes) {
			this.holes = holes;
		}
		/**
		 * @return the planterStock
		 */
		public Integer getPlanterStock() {
			return planterStock;
		}
		/**
		 * @param planterStock the planterStock to set
		 */
		public void setPlanterStock(Integer planterStock) {
			this.planterStock = planterStock;
		}
		/**
		 * @return the planterCost
		 */
		public Double getPlanterCost() {
			return planterCost;
		}
		/**
		 * @param planterCost the planterCost to set
		 */
		public void setPlanterCost(Double planterCost) {
			this.planterCost = planterCost;
		}
		/**
		 * @return the planterShape
		 */
		public String getPlanterShape() {
			return planterShape;
		}
		/**
		 * @param planterShape the planterShape to set
		 */
		public void setPlanterShape(String planterShape) {
			this.planterShape = planterShape;
		}
		/**
		 * @return the planterColor
		 */
		public String getPlanterColor() {
			return planterColor;
		}
		/**
		 * @param planterColor the planterColor to set
		 */
		public void setPlanterColor(String planterColor) {
			this.planterColor = planterColor;
		}
		/**
		 * @return the height
		 */
		public Float getHeight() {
			return height;
		}
		/**
		 * @param height the height to set
		 */
		public void setHeight(Float height) {
			this.height = height;
		}
		@Override
		public String toString() {
			return "Planter [planterId=" + planterId + ", plantCapacity=" + plantCapacity + ", holes=" + holes
					+ ", planterStock=" + planterStock + ", planterCost=" + planterCost + ", planterShape="
					+ planterShape + ", planterColor=" + planterColor + ", height=" + height + "]";
		}

	
		

			}