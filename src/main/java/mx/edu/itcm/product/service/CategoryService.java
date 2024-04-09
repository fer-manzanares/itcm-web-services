package mx.edu.itcm.product.service;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

import mx.edu.itcm.product.dto.CategoryDto;
import mx.edu.itcm.product.dto.CategoryDtoResponse;


@Service
public interface CategoryService {
	public CategoryDtoResponse create(CategoryDto category);
	public CategoryDtoResponse findOneById(UUID id);
	public List<CategoryDtoResponse> getAll();
}
