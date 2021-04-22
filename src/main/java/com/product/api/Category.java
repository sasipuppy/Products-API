/**
 * 
 */
package com.product.api;

/**
 * @author Sasikala
 *
 */
public enum Category {
	
	Sports("Sports"),
	Toys("Toys"),
	Electronics("Electronics"), 
	Mobile("Mobile"),
	Kitchen("Kitchen");

    private String category;

    Category(String category) {
        this.category = category;
    }

}

