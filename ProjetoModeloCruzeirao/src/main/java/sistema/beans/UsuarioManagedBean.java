package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioManagedBean {
	
	private Usuario usuario = new Usuario();
	private Usuario usuarioRecuperarSenha = new Usuario();
	private Usuario usuarioEntrar = new Usuario();
	private Usuario usuarioAtual;
	private UsuarioService service = new UsuarioService();
	
	public String salvar()
	{
		service.salvar(usuario);
		usuario = new Usuario();
		return "login";
	}
	
	public String entrar()
	{
		if(service.entrar(usuarioEntrar))
		{
			usuarioEntrar = new Usuario();
			return "inicio";
		}
		else
		{
			usuarioEntrar = new Usuario();
			return "login";
		}
	}
	
	public String voltar()
	{
		return "login";
	}
	
	public String recuperarSenha()
	{
		service.recuperarSenha(usuarioRecuperarSenha);
		usuarioRecuperarSenha = new Usuario();
		return "login";
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Usuario> getUsuarios() {
		return service.getUsuarios();
	}
	public Usuario getUsuarioAtual() {
		return usuarioAtual;
	}
	public void setUsuarioAtual(Usuario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}

	public Usuario getUsuarioRecuperarSenha() {
		return usuarioRecuperarSenha;
	}

	public void setUsuarioRecuperarSenha(Usuario usuarioRecuperarSenha) {
		this.usuarioRecuperarSenha = usuarioRecuperarSenha;
	}

	public Usuario getUsuarioEntrar() {
		return usuarioEntrar;
	}

	public void setUsuarioEntrar(Usuario usuarioEntrar) {
		this.usuarioEntrar = usuarioEntrar;
	}
}
