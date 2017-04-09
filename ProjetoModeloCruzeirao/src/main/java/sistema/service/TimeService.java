package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Time;

public class TimeService {
	
	private ArrayList <Time> times = new ArrayList<Time>();
	
	public TimeService()
	{
	}
	
	public void salvar(Time time)
	{
	    times.add(time);
	}

	public List<Time> getTimes()
	{
		return times;
	}

	public void removerTime(Time time) {
		// TODO Auto-generated method stub
		times.remove(time);
	}
}