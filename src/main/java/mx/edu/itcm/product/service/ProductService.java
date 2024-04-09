package mx.edu.itcm.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.edu.itcm.product.dto.ProductDto;
import mx.edu.itcm.product.dto.ProductDtoResponse;


@Service
public interface ProductService {
	public ProductDtoResponse create(ProductDto product) throws Exception;
	public ProductDtoResponse findOneById(int id);
	public ProductDtoResponse findOneByUpc(String upc);
	public ProductDtoResponse save(ProductDto newProduct);
	public List<ProductDtoResponse> getAll();
	public ProductDtoResponse update(ProductDtoResponse newProduct);
}
