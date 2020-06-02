package com.cg.service.product.test;

import java.util.List;

import com.cg.model.product.test.Product;

public interface ProductService {

	List<Product> getProducts();

	Product getProduct(long productId);

}
