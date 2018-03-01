package com.soecode.lyf.dao;
import com.soecode.lyf.entity.Apply;
import com.soecode.lyf.entity.Applyout;

import java.util.List;



public interface ApplyMapper {
	void insertapply(Apply apply);
	public List<Apply> findapplylist() throws Exception;
	Apply findbyhouse_id(String house_id);
	public void deletebyhouse_id(String house_id);
	public void updateapplyout(Applyout applyout);
}
