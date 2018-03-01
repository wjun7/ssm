package com.soecode.lyf.dao;
import java.util.List;

import com.soecode.lyf.entity.Checkout;

public interface CheckoutMapper {
	public void insertcheckout(Checkout checkout);
	public List<Checkout> getallcheckout();
	public void deletecheckout(Integer id);
}
