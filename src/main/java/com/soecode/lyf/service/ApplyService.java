package com.soecode.lyf.service;

import java.util.List;

import com.soecode.lyf.entity.Apply;
import com.soecode.lyf.entity.Houselist;

public interface ApplyService {
	
	public void insertapply(Apply apply);
	public List<Apply> findapplylist() throws Exception;
	Apply findbyhouse_id(String house_id);
	public void deletebyhouse_id(String house_id);
	public void refuseapply(Houselist houselist);
}
