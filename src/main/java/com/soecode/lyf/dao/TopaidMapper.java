package com.soecode.lyf.dao;
import java.util.List;

import com.soecode.lyf.entity.QueryVo;
import com.soecode.lyf.entity.Topaid;

public interface TopaidMapper {
public void inserttopaid(Topaid topaid);
public List<Topaid> findtopaid(QueryVo vo);
public Topaid findbyid(Integer id);
public void deletetopaid(Integer id);
}
