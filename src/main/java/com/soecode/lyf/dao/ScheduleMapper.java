package com.soecode.lyf.dao;
import java.util.List;

import com.soecode.lyf.entity.Schedule;

public interface ScheduleMapper {
	public void insertschedule(Schedule schedule);
	public List<Schedule> selectAll();
	public void deleteschedule(Integer id);
	public void updateschedule(Schedule schedule);
	public Schedule selectbyid(Integer id);
}
