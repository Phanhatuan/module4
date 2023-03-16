package ss4.thucHanh.TH3.service;

import ss4.thucHanh.TH3.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
