package com.soecode.lyf.dao;
import java.util.List;

import com.soecode.lyf.entity.Houselist;
import com.soecode.lyf.entity.QueryVo;

public interface HouselistMapper {
List<Houselist> selectAll();
public Integer findhouselistByVoCount(QueryVo vo);
Houselist findhouseid(String houseid);
void inserthouse(Houselist houselist);
void deletehouse(int id);
Houselist findid(int id);
Houselist findhouseidupdate(Houselist houselist);
void updatehouse(Houselist houselist);
void updatehousestatus(Houselist houselist);
public void deletehousebyhouseid(String house_id);
public void updatestatus(Houselist houselist);
}
