package com.soecode.lyf.service;

import java.util.List;

import com.soecode.lyf.entity.Applyout;
import com.soecode.lyf.entity.Checkout;
import com.soecode.lyf.entity.Zulist;

public interface CheckoutService {
public void insertcheckout(Checkout checkout);
public List<Checkout> getallcheckout();
public void deletecheckout(Integer id);
}
