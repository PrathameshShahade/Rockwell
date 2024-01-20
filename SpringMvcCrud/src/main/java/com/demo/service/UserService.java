package com.demo.service;

import java.util.List;

import com.demo.model.Product;
import com.demo.model.User;

public interface UserService {

	public User validateUser(String username,String password);

	public List<Product> getAllProducts();

	public void addProduct(Product p);

	public void deleteProduct(int id);
}
