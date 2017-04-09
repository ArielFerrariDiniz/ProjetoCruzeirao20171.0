package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Categoria;
import sistema.service.CategoriaService;

@ManagedBean
@SessionScoped
public class CategoriaManagedBean {
	
	private int codigoCategoria = 1;
	private Categoria categoria = new Categoria(codigoCategoria);
	private Categoria categoriaAtual;
	private CategoriaService service = new CategoriaService();
	
	public void salvar()
	{
		service.salvar(categoria);
		codigoCategoria++;
		categoria = new Categoria(codigoCategoria);
	}
	
	public String salvarEditar()
	{
		return "cadastroCategoria";
	}
	
	public String editarCategoria(Categoria categoria)
	{
		this.categoriaAtual = categoria;
		return "editarCategoria";
	}
	
	public void removerCategoria(Categoria categoria)
	{
		service.removerCategoria(categoria);
	}
	
	public void removerCategoria2(Categoria categoria)
	{
		service.removerCategoria(categoria);
	}
	
	public String descricaoCategoria(Categoria categoria)
	{
		this.categoriaAtual = categoria;
		return "descricaoCategoria";
	}
	
	public String descricaoCategoria2 (Categoria categoria)
	{
		this.categoriaAtual = categoria;
		return "descricaoCategoria2";
	}
	
	public String voltar()
	{
		return "cadastroCategoria";
	}
	
	public String voltar2()
	{
		return "inserirCategorias";
	}
	
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public List<Categoria> getCategorias() {
		return service.getCategorias();
	}
	public Categoria getCategoriaAtual() {
		return categoriaAtual;
	}
	public void setCategoriaAtual(Categoria categoriaAtual) {
		this.categoriaAtual = categoriaAtual;
	}
}

