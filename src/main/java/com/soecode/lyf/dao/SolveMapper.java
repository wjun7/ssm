package com.soecode.lyf.dao;
import java.util.List;

import com.soecode.lyf.entity.QueryVo;
import com.soecode.lyf.entity.Solve;

public interface SolveMapper {
	public List<Solve> selectall(QueryVo vo);
	public Integer selectcount(QueryVo vo);
	public void deletesolve(Integer id);
	public void insertsolve(Solve solve);
}
