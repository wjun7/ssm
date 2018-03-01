package com.soecode.lyf.service;

import java.util.List;

import com.soecode.lyf.entity.Paid;
import com.soecode.lyf.entity.QueryVo;
import com.soecode.lyf.entity.Solve;
import com.soecode.lyf.entity.Wrong;

public interface SolveService {
	public List<Solve> selectall(QueryVo vo);
	public Integer selectcount(QueryVo vo);
	public void deletesolve(Integer id);
	
	public List<Wrong> findwrong(QueryVo vo);
	public Wrong findbyid(Integer id);
	 public void insertwrong(Wrong wrong);
	 public void gotosolve(Integer id, Solve solve);
}
