/**
 * 
 */
package com.product.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductController class that invokes the business logic and controls the data flow.
 * @author Sasikala
 *
 */
@RestController
public class ProductController {
	
	@Autowired
	 private ProductService productService;
	 
	/**
	 * Get all products.
	 * @return list of all the products 
	 */
	@GetMapping(path = "/product")
    public List<Product> findAll(){
	      return productService.getAll();
    }
	
	/**
	 * Get a single product based on id.
	 * @param id Id of the product to be found
	 * @return single product record with specific id
	 */
	@GetMapping(path= "/product/{id}")
    public Product getProductById(@PathVariable long id){
        Product product = productService.getProductById(id);
        if (product != null){
         return productService.getProductById(id);
        }
        else
         return null;
     }
	
	/**
	 * Add a product.
	 * @param product Product object with details of the product to be added
	 * @return message indicating product addition.
	 */
	@PostMapping(path = "/product",consumes = "application/json", produces = "application/json")
    public String addProduct(@RequestBody Product product){
	  List<Product> tempProduct = new ArrayList<>();
	  tempProduct= productService.getAll();
        if (tempProduct != null){
        	for(Product p : tempProduct)
        	{
        	  if((p.getName()).equalsIgnoreCase(product.getName()))	
        	    {
        		  return "Error! Product already exists!";
        		  
        		}
        	  else
        		  continue;
        	}
  
        	 productService.addProduct(product);
    		 return "Product added!";
         }
        return null;
    } 
	
	/**
	 * Update product details based on id.
	 * @param id Id of the product to be updated
	 * @param product Product object with details of the product to be updated
	 * @return message indicating product update.
	 */
	@PutMapping(path = "/product/{id}",consumes = "application/json", produces = "application/json")
    public String updateProduct(@PathVariable long id,@RequestBody Product product) {
        
        Product newProduct = productService.getProductById(id);
        if (newProduct != null){
        	productService.updateProduct(id,product);
        return "Product updated!";
        }
        return "Product does not exist!";
    }
	
	/**
	 * Delete a product based on id.
	 * @param id Id of the product to be deleted
	 * @return message indicating product deletion.
	 */
	@DeleteMapping(path = "/product/{id}")
    public String deleteProduct(@PathVariable long id){
        Product product = productService.getProductById(id);
        if (product != null){
            productService.deleteProduct(id);
        return "Product deleted!";
        }
        return "Product does not exist!";
    }
	
}


