package sistema.beans;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Campeonato;

import sistema.service.CampeonatoService;

@ManagedBean
@SessionScoped
public class CampeonatoManagedBean {
	
	private int codigoCampeonato = 1;
	private Campeonato campeonato = new Campeonato(codigoCampeonato);
	private Campeonato campeonatoAtual;
	private CampeonatoService service = new CampeonatoService();
	
	public void salvar()
	{
		service.salvar(campeonato);
		codigoCampeonato++;
		campeonato = new Campeonato(codigoCampeonato);	
	}
	public String inserirCategorias (Campeonato campeonato)
	{
		this.campeonatoAtual = campeonato;
		return "inserirCategorias";
	}
	public String voltar()
	{
		return "cadastroCampeonato";
	}
	
	public String editarCampeonato(Campeonato campeonato)
	{
		this.campeonatoAtual = campeonato;
		return "editarCampeonato";
	}
	
	public void removerCampeonato(Campeonato campeonato)
	{
		service.removerCampeonatos(campeonato);
	}
	
	public String salvarEditar()
	{
		return "cadastroCampeonato";
	}
	
	public String descricaoCampeonato(Campeonato campeonato)
	{
		this.campeonatoAtual = campeonato;
		return "descricaoCampeonato";
	}
	
	public boolean mostrarInscricao(Campeonato campeonato)
	{
		this.campeonatoAtual = campeonato;
		return campeonatoAtual.isInscricao();
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		return service.getCampeonatos();
	}

	public Campeonato getCampeonatoAtual() {
		return campeonatoAtual;
	}

	public void setCampeonatoAtual(Campeonato campeonatoAtual) {
		this.campeonatoAtual = campeonatoAtual;
	}
}
