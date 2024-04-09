package mx.edu.itcm.product.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.edu.itcm.product.dto.CategoryDto;
import mx.edu.itcm.product.dto.CategoryDtoResponse;
import mx.edu.itcm.product.entity.Category;
import mx.edu.itcm.product.repository.CategoryRepository;
import mx.edu.itcm.product.service.CategoryService;

@Component
public class CategoryServiceImpl implements CategoryService {

	@Autowired CategoryRepository categoryRepository;
	@Autowired ModelMapper modelMapper;
	@Override
	public CategoryDtoResponse create(CategoryDto categoryDto) {
		//ModelMapper modelMapper = new ModelMapper();
		Category categoryEntity = modelMapper.map(categoryDto, Category.class);
		Category newCategory = categoryRepository.save(categoryEntity);
		return modelMapper.map(newCategory, CategoryDtoResponse.class);
	}

	@Override
	public CategoryDtoResponse findOneById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryDtoResponse> getAll() {
		//ModelMapper modelMapper = new ModelMapper();
		List<Category> categories = categoryRepository.findAll();
		List<CategoryDtoResponse> categoryDtos = new ArrayList<>();
		for (Category category : categories) {
			CategoryDtoResponse categoryDto = modelMapper.map(category, CategoryDtoResponse.class);
			categoryDtos.add(categoryDto);
		}
		return categoryDtos;
	}

}
