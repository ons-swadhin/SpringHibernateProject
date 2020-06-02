package com.cg.model.product.test;

public interface Product {

	public long getProductId();

	public void setProductId(long productId);

	public String getProductName();

	public void setProductName(String productName);

	public String getProductCode();

	public void setProductCode(String productCode);

	public String getReleaseDate();

	public void setReleaseDate(String releaseDate);

	public String getDescription();

	public void setDescription(String description);

	public double getPrice();

	public void setPrice(double price);

	public float getStarRating();

	public void setStarRating(float starRating);

	public String getImageUrl();

	public void setImageUrl(String imageUrl);
}
