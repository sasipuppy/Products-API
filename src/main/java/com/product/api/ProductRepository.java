/**
 * 
 */
package com.product.api;

import org.springframework.data.repository.CrudRepository;


/**
 * ProductRepository Interface that provides the mechanism for storage, retrieval, search,
 * update and delete operation on objects.
 * @author Sasikala
 *
 */
public interface ProductRepository extends CrudRepository<Product, Long>{

}
