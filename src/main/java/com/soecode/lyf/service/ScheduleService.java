package com.soecode.lyf.service;

import java.util.List;

import com.soecode.lyf.entity.Schedule;

public interface ScheduleService {
	public void insertschedule(Schedule schedule);
	public List<Schedule> selectAll();
	public void deleteschedule(Integer id);
	public void updateschedule(Schedule schedule);
	public Schedule selectbyid(Integer id);
}
