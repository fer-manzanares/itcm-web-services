package mx.edu.itcm.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.itcm.product.entity.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Integer>{
	Category getByName(String name);
}
