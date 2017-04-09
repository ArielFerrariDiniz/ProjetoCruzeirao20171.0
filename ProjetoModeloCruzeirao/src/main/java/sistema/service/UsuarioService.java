package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Usuario;

public class UsuarioService {
	
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public UsuarioService()
	{
		
	}
	
	public void salvar(Usuario usuario) 
	{
		usuarios.add(usuario);
	}
	
	public boolean entrar(Usuario usuario)
	{
		if((usuarios.equals(usuario.getNome()) || usuarios.equals(usuario.getEmail())) && usuarios.equals(usuario.getSenha()))
			return true;
		else
			return false;
	}
	
	public void recuperarSenha(Usuario usuario)
	{
					
	}

	public List <Usuario> getUsuarios()
	{
		return usuarios;
	}
}
