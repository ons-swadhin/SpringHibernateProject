package com.cg.service.product.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.factory.product.test.ProductFactory;
import com.cg.model.product.test.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductFactory productFactory;

	@Override
	public List<Product> getProducts() {
		System.out.println("StudentService -> getStudents ");
		List<Product> products = new ArrayList<>();

		products.add(productFactory.create(1l, "Leaf Rake", "GDN-0011", "March 19, 2019",
				"Leaf rake with 48-inch wooden handle.", 19.95d, 3.2f, "assets/images/leaf_rake.png"));

		products.add(productFactory.create(2l, "Garden Cart", "GDN-0023", "March 18, 2019",
				"15 gallon capacity rolling garden cart", 32.99d, 4.2f, "assets/images/garden_cart.png"));

		products.add(productFactory.create(3l, "Hammer", "TBX-0048", "May 21, 2019", "Curved claw steel hammer", 8.9d,
				4.8f, "assets/images/hammer.png"));

		products.add(productFactory.create(4l, "Saw", "TBX-0022", "May 15, 2019", "15-inch steel blade hand saw",
				11.55d, 3.7f, "assets/images/saw.png"));

		products.add(productFactory.create(5l, "Video Game Controller", "GMG-0042", "October 15, 2018",
				"Standard two-button video game controller", 35.95d, 4.6f, "assets/images/xbox-controller.png"));

		return products;
	}

	@Override
	public Product getProduct(long productId) {
		System.out.println("getProduct "+productId);
		return productFactory.create(productId, "Leaf Rake", "GDN-0011", "March 19, 2019",
				"Leaf rake with 48-inch wooden handle.", 19.95d, 3.2f, "assets/images/leaf_rake.png");
	}

}
