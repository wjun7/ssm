package com.soecode.lyf.dao;
import java.util.List;

import com.soecode.lyf.entity.Apply;
import com.soecode.lyf.entity.Zulist;

public interface ZulistMapper {
	public void insertzulist(Zulist zulist);
	public List<Zulist> findzuuserlist() throws Exception;
	Zulist findzulist(String house_id);
	public void deletezulist(String house_id);
	public List<Zulist> findzulistbyuid(Integer userlist_id);
	public Zulist findzukezulist(Integer id);
}
