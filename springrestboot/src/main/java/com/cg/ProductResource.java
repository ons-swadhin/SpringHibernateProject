package com.cg;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.product.test.Product;
import com.cg.model.student.test.Student;
import com.cg.service.product.test.ProductService;


/*to avoid below error use @CrossOrigin
 *Access to XMLHttpRequest at 'http://localhost:8080/products' from origin 'http://localhost:4200' has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource.
product.service.ts:36 Server returned code: 0, error message is: Http failure response for http://localhost:8080/products: 0 Unknown Error
handleError @ product.service.ts:35
:8080/products:1 Failed to load resource: net::ERR_FAILED
 * 
 */

@RestController
@CrossOrigin
@Validated
public class ProductResource {
	
	@Autowired
	ProductService productService;
	
	
	@RequestMapping("products")
	public List<Product> getStudents() {
		System.out.println("@CrossOrigin");
		return productService.getProducts();
	}
	
	
	@RequestMapping(value = "/products/{productId}", method = RequestMethod.GET)
	@ResponseBody
	Product getProductById(
			@PathVariable 
			@Min(value = 1, message = "id must be greater than or equal to 1") 
    		@Max(value = 1000, message = "id must be lower than or equal to 1000")
			final long productId
			
			) {

	  return productService.getProduct(productId);
	}
}
