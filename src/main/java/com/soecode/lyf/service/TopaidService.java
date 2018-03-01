package com.soecode.lyf.service;

import java.util.List;

import com.soecode.lyf.entity.Paid;
import com.soecode.lyf.entity.QueryVo;
import com.soecode.lyf.entity.Topaid;

public interface TopaidService {
	public void inserttopaid(Topaid topaid);
	public List<Topaid> findtopaid(QueryVo vo);
	public Topaid findbyid(Integer id);
	public void gotopay(Integer id,Paid paid);
}
