package com.demo.dao;

import java.util.List;

import com.demo.model.Product;
import com.demo.model.User;

public interface UserDao {

	public User checkUser(String username,String password);

	public List<Product> findAllProducts();

	public void addNewProduct(Product p);

	public void deleteProd(int id);
}
