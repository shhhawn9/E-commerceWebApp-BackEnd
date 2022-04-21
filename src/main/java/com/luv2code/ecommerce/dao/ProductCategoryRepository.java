package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// CrossOrigin - to accept calls from web browser scripts for this origin
// Origin is protocol (http) + hostname (localhost) + port (4200)
// Since http://localhost:4200 != http://localhost:8080, we need to add CrossOrigin.
//@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
