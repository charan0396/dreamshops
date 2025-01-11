package com.dailycodework.dreamshops.service.product;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dailycodework.dreamshops.exception.productNotFoundException;
import com.dailycodework.dreamshops.model.Category;
import com.dailycodework.dreamshops.model.Product;
import com.dailycodework.dreamshops.repository.ProductRepository;
import com.dailycodework.dreamshops.request.AddProductRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService{
	private ProductRepository productRepository;
	
	@Override
	public Product addProduct(AddProductRequest request) {
		return null ;
	}
	
	private Product createProduct(AddProductRequest request, Category category) {
		return new Product(
			request.getName(),
			request.getBrand(),
			request.getPrice(),
			request.getInventory(),
			request.getdescription(),
			category                                // time 53
			
		}
	}
	
	@Override
	public Product getProductById(Long id) {
		return  productRepository.findById(id)
								 .orElseThrow(()-> new productNotFoundException("Product Not Found!"));
	}

	@Override
	public void deleteProductById(Long id) {
		productRepository.findById(id)
						 .ifPresentOrElse(productRepository::delete, 
								 			()->{throw new productNotFoundException("Product Not Found!");});
	}

	@Override
	public void updateProduct(Product product, Long productId) {
		
		
	}

	@Override
	public List<Product> getAllproducts() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		return productRepository.findByCategoryName(category);
	}

	@Override
	public List<Product> getProductsByBrand(String brand) {
		return productRepository.findByBrand(brand);
	}

	@Override
	public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
		return productRepository.findByCategoryNameAndBrand(category,brand);
	}

	@Override
	public List<Product> getProductsByName(String name) {
		return productRepository.findByName(name); 
	}

	@Override
	public List<Product> getProductsByBrandAndName(String brand, String name) {
		return productRepository.findByBrandAndName(brand,name);
	}

	@Override
	public Long countProductsByBrandAndName(String brand, String name) {
		return productRepository.countByBrandAndName(brand,name);
	}

}
