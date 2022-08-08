package com.nucsoft.demo.streamapi.repos;

import java.util.List;

import com.nucsoft.demo.streamapi.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {

	List<Product> findAll();
}
