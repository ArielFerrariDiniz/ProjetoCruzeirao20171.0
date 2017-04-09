package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Categoria;

public class CategoriaService {

	private ArrayList <Categoria> categorias = new ArrayList<Categoria>();
	
	public CategoriaService()
	{ 
		
	}
	
	public void salvar(Categoria categoria)
	{
	    categorias.add(categoria);
	}
	
	public void removerCategoria(Categoria categoria)
	{
		categorias.remove(categoria);
	}

	public List<Categoria> getCategorias()
	{
		return categorias;
	}	
}

