package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.service.UserService;


@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	UserService us;
	
	
	@GetMapping("/all")
	public ModelAndView showProducts() {
		List<Product> lp =us.getAllProducts();
		return new ModelAndView("allproducts","plist",lp);
	}
	
	@GetMapping("/addproduct")
	public String showaddproduct() {
		return "addproduct";
	}
	
	@PostMapping("/addp")
	public ModelAndView addproduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int price) {
		Product p=new Product(pid,pname,price);
		us.addProduct(p);
		return new ModelAndView("redirect:/product/all");
	}
	
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteproduct(@PathVariable int id) {
		us.deleteProduct(id);
		return new ModelAndView("redirect:/product/all");
	}
}
