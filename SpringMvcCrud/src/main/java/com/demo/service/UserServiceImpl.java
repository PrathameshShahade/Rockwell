package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDao;
import com.demo.model.Product;
import com.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao ud;

	@Override
	public User validateUser(String username, String password) {
		return ud.checkUser(username, password);
	}

	@Override
	public List<Product> getAllProducts() {
		return ud.findAllProducts();
		
	}

	@Override
	public void addProduct(Product p) {
		ud.addNewProduct(p);
		
	}

	@Override
	public void deleteProduct(int id) {
		ud.deleteProd(id);
		
	}

}
