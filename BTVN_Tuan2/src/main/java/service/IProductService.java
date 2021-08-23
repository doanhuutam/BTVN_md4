package service;

import model.Product;

import java.util.ArrayList;

public interface IProductService {
    Product save(Product product);
    Product findbyId(long id);
    ArrayList<Product> finAll();
    ArrayList<Product> finAllByName(String name);
    void delete(Product product);
    void edit(Product product);


}
