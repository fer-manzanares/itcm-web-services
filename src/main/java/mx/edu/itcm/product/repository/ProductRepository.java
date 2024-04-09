package mx.edu.itcm.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.itcm.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	public Product findOneById(int productKey);
	public Product findOneByUpc(String cup);
	public Product findOneByDescription(String desc);
}
