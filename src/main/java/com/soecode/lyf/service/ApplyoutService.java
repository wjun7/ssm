package com.soecode.lyf.service;

import java.util.List;

import com.soecode.lyf.entity.Applyout;
import com.soecode.lyf.entity.Zulist;

public interface ApplyoutService {
	public void insertapplyout(Zulist zulist);
	List<Applyout> findallapplyout();
	public void updateapplyout(Applyout applyout);
	public void agreeapplyout(Integer id);
	public void deleteapplyout(Integer id);
}
