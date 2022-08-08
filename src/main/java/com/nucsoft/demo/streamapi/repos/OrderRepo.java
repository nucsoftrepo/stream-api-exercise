package com.nucsoft.demo.streamapi.repos;

import java.util.List;

import com.nucsoft.demo.streamapi.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends CrudRepository<Order, Long> {

	List<Order> findAll();
}
