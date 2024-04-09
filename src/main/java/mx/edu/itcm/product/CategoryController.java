package mx.edu.itcm.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itcm.product.dto.CategoryDto;
import mx.edu.itcm.product.dto.CategoryDtoResponse;
import mx.edu.itcm.product.entity.Category;
import mx.edu.itcm.product.service.CategoryService;

@RestController
@RequestMapping(path="/categories")
public class CategoryController {
	@Autowired
	CategoryService CategoryService;
	
	 @PostMapping("")
	 CategoryDtoResponse newCategory(@RequestBody CategoryDto newCategory) {
		 return CategoryService.create(newCategory);
	 }
	 
	 @GetMapping("")
		public List<CategoryDtoResponse> getCategory() {
			return CategoryService.getAll();
		}
}
