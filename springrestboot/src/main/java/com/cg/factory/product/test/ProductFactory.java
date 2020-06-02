package com.cg.factory.product.test;

import com.cg.model.product.test.Product;

public interface ProductFactory {
	
	Product create(long productId, String productName, String productCode, String releaseDate, String description,
			double price, float starRating, String imageUrl);

}
