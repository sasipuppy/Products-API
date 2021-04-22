/**
 * 
 */
package com.product.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * ProductService class that provides the business logic.
 * @author Sasikala
 *
 */
@Service
public class ProductService {

	
		@Autowired
		private ProductRepository productRepository;
		
		/**
		 * Get all products.
		 * @return product
		 */
		public List<Product> getAll(){
	        List<Product> product = new ArrayList<>();
	        productRepository.findAll().forEach(product::add);
	        return product;
	    }
		
		/**
		 * Get a product by id.
		 * @param id Id of the product to be found
		 * @return product
		 */
		public Product getProductById(long id) {
	        if(productRepository.existsById(id)){
	    	return productRepository.findById(id).get();
	        }
	          return null;
	    }
		
		/**
		 * Add a product
		 * @param product product object with details of the product to be added
		 */
		public void addProduct(Product product) {
			productRepository.save(product);
	    }
		
		/**
		 * Update a product by id.
		 * @param id Id of the product to be updated
		 * @param product product object with details of the product to be updated
		 */
		public void updateProduct(long id,Product product) {
			if (productRepository.existsById(id)){
	            Product tempproduct = productRepository.findById(id).get();
	        	tempproduct.setName(product.getName());
	        	tempproduct.setPrice(product.getPrice());
	        	tempproduct.setCategory(product.getCategory());
	            productRepository.save(tempproduct);
			 }
	        }
		
		/**
		 * Delete a product by id.
		 * @param id Id of the product to be deleted
		 */
		public void deleteProduct(long id){
	        if (productRepository.existsById(id)){
	        	productRepository.deleteById(id);
	        }
		}
	}


