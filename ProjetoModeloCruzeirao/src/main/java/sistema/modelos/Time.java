package sistema.modelos;

public class Time {
	
	private int matricula;
	private String nome;
	private String tecnico;
	private String categoria;
	private String jogador;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTecnico() {
		return tecnico;
	}
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getJogador() {
		return jogador;
	}
	public void setJogador(String jogador) {
		this.jogador = jogador;
	}
	public String salvarEditar()
	{
		return "cadastroTime";
	}
	
}
