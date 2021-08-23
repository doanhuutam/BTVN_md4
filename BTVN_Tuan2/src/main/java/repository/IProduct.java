package repository;

import model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProduct extends CrudRepository<Product,Long> {
}
