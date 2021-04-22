package com.product.api;

import static com.product.api.Category.Kitchen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;


/**
 * Unit testing of Product class with Junit.
 * @author Sasikala
 *
 */
class ProductTest {
	
	/**
	 * Creating instance of Product class.
	 */
	private Product product;
	
	/**
	 * Variable declaration and initialisation.
	 * Declaring the variables as static final means they can never change from their initial value.
	 */
	private static final Category TYPE=Kitchen;
	private static final String NAME= "HP Pavilion Laptop";
	private static final double PRICE= 6798.87;
	
	
	/**
	 * Setting up name, price, category fields before tests.
	 */
	@BeforeEach
	public void SetUp() {
		product= new Product(NAME,PRICE,TYPE);
	}
	
	/**
	 * Verification of name field.
	 */
	@Test
	public void testName(){
		String Expected ="HP Pavilion Laptop";
		assertEquals(Expected,product.getName());
	}
	
	/**
	 * Verification of price field.
	 */
	@Test
	public void testPrice(){
		double Expected =6798.87;
		assertEquals(Expected,product.getPrice());
	}
	
	/**
	 * Verification of category field.
	 */
	@Test
	public void testCategory(){
		Category Expected =Kitchen;
		assertEquals(Expected,product.getCategory());
	}

}
