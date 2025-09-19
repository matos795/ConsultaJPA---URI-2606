package com.consultaJPA.uri2606.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.consultaJPA.uri2606.dto.ProductMinDTO;
import com.consultaJPA.uri2606.entities.Product;
import com.consultaJPA.uri2606.projections.ProductProjection;

public interface ProductRepository extends JpaRepository<Product, Long>{



    @Query(nativeQuery = true, value = "SELECT products.id, products.name FROM products " + 
                "INNER JOIN categories ON products.id_categories = categories.id " + 
                "WHERE categories.name LIKE :str")
    List<ProductProjection> search1(String str);

    @Query("SELECT new com.consultaJPA.uri2606.dto.ProductMinDTO(obj.id, obj.name) FROM Product obj WHERE obj.category.name LIKE :str")
    List<ProductMinDTO> search2(String str);
}
