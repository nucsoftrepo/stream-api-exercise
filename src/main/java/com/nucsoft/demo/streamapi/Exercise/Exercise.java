package com.nucsoft.demo.streamapi.Exercise;

import com.nucsoft.demo.streamapi.models.Customer;
import com.nucsoft.demo.streamapi.models.Order;
import com.nucsoft.demo.streamapi.models.Product;
import com.nucsoft.demo.streamapi.repos.CustomerRepo;
import com.nucsoft.demo.streamapi.repos.OrderRepo;
import com.nucsoft.demo.streamapi.repos.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
@Component
public class Exercise {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private ProductRepo productRepo;


//  Obtain a list of product with category ="Books" and price > 100
    public void exercise1() {

    }

//  Obtain a list of order with product category = "Baby"
    public void exercise2() {

    }

//  Obtain a list of product with category = “Toys” and then apply 10% discount
    public void exercise3() {

    }

//  Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
    public void exercise4() {

    }

//    Get the 3 cheapest products of "Books" category
    public void exercise5() {

    }

//  Get the 3 most recent placed order
    public void exercise6() {

    }

//  Get a list of products which was ordered on 15-Mar-2021
    public void exercise7() {

    }

//  Calculate the total lump of all orders placed in Feb 2021
    public void exercise8() {

    }

//  Calculate the average price of all orders placed on 15-Mar-2021
    public void exercise9() {

    }

//  Obtain statistics summary of all products belong to "Books" category
    public void exercise10() {

    }

//    Obtain a mapping of order id and the order's product count
    public void exercise11() {

    }

//    Obtain a data map of customer and list of orders
    public void exercise12() {

    }

//  Obtain a data map of customer_id and list of order_id(s)
    public void exercise12a() {

    }

//    Obtain a data map with order and its total price
    public void exercise13() {

    }

//  Obtain a data map of product name by category
    public void exercise14() {

    }

//  Get the most expensive product per category
//  Expected Output: {Grocery=Optional[Product(id=14, name=quos sunt ipsam, category=Grocery, price=534.64)], Toys=Optional[Product(id=30, name=excepturi nesciunt accusantium, category=Toys, price=911.46)], Games=Optional[Product(id=19, name=doloremque incidunt sed, category=Games, price=988.49)], Baby=Optional[Product(id=18, name=aut accusamus quia, category=Baby, price=881.38)], Books=Optional[Product(id=24, name=veniam consequatur et, category=Books, price=893.44)]}
    public void exercise15() {

    }

//  Get the most expensive product (by name) per category
//  Expected Output:- {Grocery=quos sunt ipsam, Toys=excepturi nesciunt accusantium, Games=doloremque incidunt sed, Baby=aut accusamus quia, Books=veniam consequatur et}
    public void exercise15a() {

    }

}
