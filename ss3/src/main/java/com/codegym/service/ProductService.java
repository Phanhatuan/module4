package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Car", 10000, "Nice", "Toyota"));
        products.put(2,new Product(2,"Bike", 20000, "Nice", "Giant"));
        products.put(3,new Product(3,"Train", 30000, "Nice", "German"));
        products.put(4,new Product(4,"Plane", 40000, "Nice", "VietNam Airline"));
        products.put(5,new Product(5,"Ship", 50000, "Nice", "Titanic"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product customer) {
        products.put(id, customer);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findByName(String name) {
        return products.get(name);
    }
}
