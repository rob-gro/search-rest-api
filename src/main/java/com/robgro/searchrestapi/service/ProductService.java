package com.robgro.searchrestapi.service;

import com.robgro.searchrestapi.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);
}
