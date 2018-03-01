package com.soecode.lyf.dao;
import java.util.List;

import com.soecode.lyf.entity.QueryVo;
import com.soecode.lyf.entity.Wrong;

public interface WrongMapper {
  public List<Wrong> findwrong(QueryVo vo);
  public Wrong findbyid(Integer id);
  public void insertwrong(Wrong wrong);
  public void deletewrong(Integer id);
}
