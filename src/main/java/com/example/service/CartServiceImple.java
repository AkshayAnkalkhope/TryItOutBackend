package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Cart;
import com.example.exception.UserException;
import com.example.repository.GenericCartRepo;

@Service
public class CartServiceImple implements CartService {

	@Autowired
	private GenericCartRepo cartRepo;
	
	@Override
	public Cart addUserCart(Cart c) {
		
		try {
			return cartRepo.save(c);
		}
		catch(Exception e) {
			throw new UserException("Cart not added");
		}
		
	}
	
	

}
