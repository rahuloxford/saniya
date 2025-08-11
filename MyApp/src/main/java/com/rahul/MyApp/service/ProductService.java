package com.rahul.MyApp.service;

import com.rahul.MyApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(1000, "Cricket bat", 3300),
            new Product(1001, "Football", 2500),
            new Product(1002, "Basketball", 1700)
    );

    public List<Product> getProducts() {
        return products;
    }

}
