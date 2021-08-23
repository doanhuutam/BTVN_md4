package service;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IProduct;

import java.util.ArrayList;

public class ProductService implements IProductService{
    @Autowired
    IProduct iProductrepo;
    @Override
    public Product save(Product product) {
        return iProductrepo.save(product);
    }

    @Override
    public Product findbyId(long id) {
        return iProductrepo.findById(id).get();
    }

    @Override
    public ArrayList<Product> finAll() {
        return (ArrayList<Product>) iProductrepo.findAll();
    }

    @Override
    public ArrayList<Product> finAllByName(String name) {
        return null;
    }

    @Override
    public void delete(Product product) {
iProductrepo.delete(product);
    }

    @Override
    public void edit(Product product) {
iProductrepo.save(product);
    }
}
