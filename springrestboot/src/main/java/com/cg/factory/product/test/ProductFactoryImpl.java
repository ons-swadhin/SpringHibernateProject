package com.cg.factory.product.test;

import org.springframework.stereotype.Component;

import com.cg.model.product.test.Product;
import com.cg.model.product.test.ProductImpl;

@Component
public class ProductFactoryImpl implements ProductFactory {

	@Override
	public Product create(long productId, String productName, String productCode, String releaseDate, String description,
			double price, float starRating, String imageUrl) {
		System.out.println("ProductFactoryImpl create");
		Product product = new ProductImpl();
		
		product.setProductId(productId);
		product.setProductName(productName);
		product.setProductCode(productCode);
		product.setReleaseDate(releaseDate);
		product.setDescription(description);
		product.setPrice(price);
		product.setStarRating(starRating);
		product.setImageUrl(imageUrl);
		
	
		return product;
	}

}
