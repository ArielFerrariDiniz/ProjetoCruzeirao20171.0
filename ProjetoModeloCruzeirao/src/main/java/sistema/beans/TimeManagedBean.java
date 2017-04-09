package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Time;
import sistema.service.TimeService;

@ManagedBean
@SessionScoped
public class TimeManagedBean {
	
	private Time time = new Time();
	private TimeService service = new TimeService();
	private Time timeAtual;
	
	public void salvar()
	{
		service.salvar(time);
		time = new Time();	
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public List<Time> getTimes() {
		return service.getTimes();
	}
	
	public String descricaoTime(Time time)
	{
		this.timeAtual = time;
		return "descricaoTime";
	}
	
	public String editarTime(Time time)
	{
		this.timeAtual = time;
		return "editarTime";
	}
	public String voltar()
	{
		return "cadastroTime";
	}

	public TimeService getService() {
		return service;
	}

	public void setService(TimeService service) {
		this.service = service;
	}

	public Time getTimeAtual() {
		return timeAtual;
	}

	public void setTimeAtual(Time timeAtual) {
		this.timeAtual = timeAtual;
	}
	
	public void removerTime(Time time)
	{
		service.removerTime(time);
	}
	
}
