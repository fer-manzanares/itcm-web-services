package mx.edu.itcm.product.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.edu.itcm.product.dto.ProductDto;
import mx.edu.itcm.product.dto.ProductDtoResponse;
import mx.edu.itcm.product.entity.Category;
import mx.edu.itcm.product.entity.Product;
import mx.edu.itcm.product.repository.CategoryRepository;
import mx.edu.itcm.product.repository.ProductRepository;
import mx.edu.itcm.product.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public ProductDtoResponse create(ProductDto productDto) throws Exception {
		try {
			Product product = modelMapper.map(productDto, Product.class);
			Category category = categoryRepository.findById(product.getCategory().getId()).get();
			product.setCategory(category);
			System.out.println("Creating: " + product.toString());
			Product newProduct = productRepository.save(product);
			return modelMapper.map(newProduct, ProductDtoResponse.class);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public ProductDtoResponse findOneById(int id) {
		return modelMapper.map(productRepository.findOneById(id), ProductDtoResponse.class);
	}

	@Override
	public ProductDtoResponse findOneByUpc(String upc) {
		return modelMapper.map(productRepository.findOneByUpc(upc), ProductDtoResponse.class);
	}

	@Override
	public ProductDtoResponse save(ProductDto newProduct) {
		Product product = modelMapper.map(newProduct, Product.class);
		return modelMapper.map(productRepository.save(product), ProductDtoResponse.class);
	}

	@Override
	public List<ProductDtoResponse> getAll() {
		List<Product> products = productRepository.findAll();
		List<ProductDtoResponse> productDtosResponse = new ArrayList<>();
		for (Product product : products) {
			ProductDtoResponse productDtoResponse = modelMapper.map(product, ProductDtoResponse.class);
			productDtosResponse.add(productDtoResponse);
		}
		return productDtosResponse;
	}

	@Override
	public ProductDtoResponse update(ProductDtoResponse productDto) {
		try {
			Product product = modelMapper.map(productDto, Product.class);
			//Category category = categoryRepository.findById(product.getCategory().getId()).get();
			//product.setCategory(category);
			System.out.println("Updating: " + product.toString());
			Product newProduct = productRepository.save(product);
			return modelMapper.map(newProduct, ProductDtoResponse.class);
		} catch (Exception e) {
			throw e;
		}
	}

}
