package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Campeonato;

public class CampeonatoService {

	private ArrayList <Campeonato> campeonatos = new ArrayList<Campeonato>();
	
	public CampeonatoService()
	{
	}
	
	public void salvar(Campeonato campeonato)
	{
	    campeonatos.add(campeonato);
	}
	
	public void removerCampeonatos(Campeonato campeonato)
	{
		campeonatos.remove(campeonato);
	}

	public List <Campeonato> getCampeonatos()
	{
		return campeonatos;
	}	
}
