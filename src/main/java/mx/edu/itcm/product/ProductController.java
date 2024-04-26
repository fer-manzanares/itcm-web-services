package mx.edu.itcm.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import mx.edu.itcm.product.dto.ProductDto;
import mx.edu.itcm.product.dto.ProductDtoResponse;
import mx.edu.itcm.product.service.ProductService;

@RestController
@RequestMapping(path="/products")
public class ProductController {
	@Autowired
	ProductService productService;
	
	 @PostMapping("")
	 ProductDtoResponse newProduct(@RequestBody ProductDto newProduct) {
		 System.out.println(newProduct.toString());
		 try {
			 return productService.create(newProduct);
		 }catch(Exception e) {
			 throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "No pudo crearse el producto debido a información incorrecta", e);
		 }
	 }
	 
	 @PutMapping("")
	 ProductDtoResponse updateProduct(@RequestBody ProductDtoResponse product) {
		 System.out.println(product.toString());
		 try {
			 return productService.update(product);
		 }catch(Exception e) {
			 throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "No pudo crearse el producto debido a información incorrecta", e);
		 }
	 }
	 
	 @GetMapping("")
		public List<ProductDtoResponse> getProduct() {
			return productService.getAll();
		}
	
	 @GetMapping("/productUpc")
		public ProductDtoResponse getProduct(@RequestParam String upc) {
			return productService.findOneByUpc(upc);
		}
}
