package com.dailycodework.dreamshops.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String brand;
	private double price;
	private int inventory;
	private String description;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="category_id")
	private Category category;
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Image> images;
	
	
}
