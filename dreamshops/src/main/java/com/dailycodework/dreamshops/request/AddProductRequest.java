package com.dailycodework.dreamshops.request;

import java.math.BigDecimal;
import com.dailycodework.dreamshops.model.Category;
import lombok.Data;

@Data
public class AddProductRequest {

	private Long id;
	private String name;
	private String brand;
	private BigDecimal price;
	private int inventory;
	private String description;
	private Category category;
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getBrand() {
		// TODO Auto-generated method stub
		return null;
	}
	public BigDecimal getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getInventory() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getdescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
