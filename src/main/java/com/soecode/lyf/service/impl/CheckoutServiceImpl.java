package com.soecode.lyf.service.impl;

import java.util.List;

import com.soecode.lyf.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.soecode.lyf.entity.Applyout;
import com.soecode.lyf.entity.Checkout;
import com.soecode.lyf.entity.Zulist;
import com.soecode.lyf.dao.CheckoutMapper;
@Service
@Transactional
public class CheckoutServiceImpl implements CheckoutService {
	
	@Autowired
	private CheckoutMapper checkoutMapper;

	@Override
	public void insertcheckout(Checkout checkout) {
		checkoutMapper.insertcheckout(checkout);
		
	}

	@Override
	public List<Checkout> getallcheckout() {
		List<Checkout> checkout=checkoutMapper.getallcheckout();
		return checkout;
	}

	@Override
	public void deletecheckout(Integer id) {
		
		checkoutMapper.deletecheckout(id);
	}


}
