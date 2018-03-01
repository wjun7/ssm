package com.soecode.lyf.service;

import java.util.List;

import com.soecode.lyf.entity.Paid;
import com.soecode.lyf.entity.QueryVo;
import com.soecode.lyf.entity.Zulist;

public interface PaidService {
	public List<Paid> selectall(QueryVo vo);
	public Double selectsum(QueryVo vo);
	public void deletepaid(Integer id);
	public List<Zulist> findzuuserlist() throws Exception;
	public Zulist findzukezulist(Integer id);
	
}
