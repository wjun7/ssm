package com.soecode.lyf.dao;
import java.util.List;

import com.soecode.lyf.entity.Paid;
import com.soecode.lyf.entity.QueryVo;

public interface PaidMapper {
public List<Paid> selectall(QueryVo vo);
public Double selectsum(QueryVo vo);
public void deletepaid(Integer id);
public void insertpaid(Paid paid);
}
