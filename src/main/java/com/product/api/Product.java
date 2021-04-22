package com.product.api;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Product class, model class that contains the data of the application.
 * This class is mapped to a database table using @Entity annotation.
 * @author Sasikala
 *
 */
@Entity
public class Product {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private long id;
	    
		private String name;
		private double price;
		
		@Enumerated(EnumType.STRING)
		private Category category;
		
		/**
		 * Default product constructor
		 */				
		public Product() {
			
		}
		
		/**
		 * product constructor with three parameters 
		 * @param name name of the product
		 * @param price  price of the product
		 * @param category category of the product
		 */
		public Product( String name, double price, Category category) {
			this.name = name;
			this.price = price;
			this.category = category;
		}
		
		/**
		 * Getter method for id field.
		 * @return id 
		 */
		public long getId() {
			return id;
		}
		
		/**
		 * getter method for name field.
		 * @return name
		 */
		public String getName() {
			return name;
		}
		
		/**
		 * Setter method for name field.
		 * @param name name of the product object
		 */
		public void setName(String name) {
			this.name = name;
		}
		
		/**
		 * getter method for price field.
		 * @return price
		 */	
		public double getPrice() {
			return price;
		}
		
		/**
		 * Setter method for price field.
		 * @param price price of the product object
		 */
		public void setPrice(double price) {
			this.price = price;
		}
		
		/**
		 * getter method for category field.
		 * @return category
		 */	
		public Category getCategory() {
			return category;
		}
		
		/**
		 * Setter method for category field.
		 * @param name name of the product object
		 */
		public void setCategory(Category category) {
			this.category = category;
		}
		
	
	}
		