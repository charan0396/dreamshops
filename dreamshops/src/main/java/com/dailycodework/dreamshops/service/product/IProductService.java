package com.dailycodework.dreamshops.service.product;

import com.dailycodework.dreamshops.model.Product;
import com.dailycodework.dreamshops.request.AddProductRequest;

import java.util.*;


public interface IProductService {

	Product addProduct(AddProductRequest product);
	Product getProductById(Long id);
	void deleteProductById(Long id);
	void updateProduct(Product product , Long productId);
	
	List<Product> getAllproducts();
	List<Product> getProductsByCategory(String category);
	List<Product> getProductsByBrand(String brand);
	List<Product> getProductsByCategoryAndBrand(String category, String brand);
	List<Product> getProductsByName(String name);
	List<Product> getProductsByBrandAndName(String brand,String name);
	Long countProductsByBrandAndName(String brand, String name);
	
	
}
	