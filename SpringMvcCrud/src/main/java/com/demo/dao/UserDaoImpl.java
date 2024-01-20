package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.*;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private JdbcTemplate jd;
	
	
	@Override
	public User checkUser(String username, String password) {
		
		try {
			String str ="select username,password from user where username=? and password=?";
			return jd.queryForObject(str,new Object[] {username,password},BeanPropertyRowMapper.newInstance(User.class));
		}
		catch(EmptyResultDataAccessException e) {
			System.out.println("not found"+e.getMessage());
			return null;
		}
	}


	@Override
	public List<Product> findAllProducts() {
		
		try {
			String str ="select * from product";
			return jd.query(str,(rs,num)->{
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				return p;
			});
		}
		catch(EmptyResultDataAccessException e) {
			System.out.println("not found"+e.getMessage());
			return null;
		}
		
	}


	@Override
	public void addNewProduct(Product p) {
		String str = "insert into product values(?,?,?)";
		jd.update(str,new Object[]{p.getId(),p.getName(),p.getPrice()});
		
		
	}


	@Override
	public void deleteProd(int id) {
		String str = "delete from product where id=?";
		jd.update(str,new Object[]{id});
		
	}




}
