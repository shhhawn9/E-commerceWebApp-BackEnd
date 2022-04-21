package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

// CrossOrigin - to accept calls from web browser scripts for this origin
//@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    /**
     * NOTE:
     * findBy, readyBy, queryBy are query methods.
     * findBy - query method, CategoryId - matched by category id, "id" parameter value
     * it will execute a query like this "SELECT * FROM product WHERE category_id=?;"
     * I can also provide a custom query using @Query("...")
     * detail can be found Spring Data Reference Manual
     * <p>
     * Spring Data REST automatically expose endpoints for query methods
     * Exposes endpoints: /search/{queryMethodName}
     * <p>
     * Here it says "http://localhost:8080/api/products/search/findByCategoryId?id=2"
     * "id=2" is from the RequestParam("id") if "id" is 2
     */

    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

    /**
     * Searching
     * Spring Data REST and Spring Data JPA supports "query methods"
     * Spring will construct a query based on method naming conventions
     * <p>
     * "Containing" here means similar to SQL: "LIKE"
     * So here the query is:
     * SELECT * FROM Product p WHERE p.name LIKE CONCAT('%', :name , '%')
     * <p>
     * Here the link is:
     * http://localhost:8080/api/products/search/findByNameContaining?name=Python
     * if "Python" is passed in as "name"
     */

    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}
