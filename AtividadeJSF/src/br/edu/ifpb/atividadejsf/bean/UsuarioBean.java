package br.edu.ifpb.atividadejsf.bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifpb.atividadejsf.dao.UsuarioDAO;
import br.edu.ifpb.atividadejsf.entidades.Usuario;

@SessionScoped
@ManagedBean
public class UsuarioBean {
	
	private Usuario usuario;
	private UsuarioDAO usuarioDao;
	private ArrayList<Usuario> usuarios;
	private String a;
	
	public UsuarioBean() {
	
		this.usuario = new Usuario();
		this.usuarioDao = new UsuarioDAO();
		this.usuarios = new ArrayList<Usuario>();
		this.a = " ";
	}
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public UsuarioDAO getUsuarioDao() {
		return usuarioDao;
	}



	public void setUsuarioDao(UsuarioDAO usuarioDao) {
		this.usuarioDao = usuarioDao;
	}



	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}



	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}



	public String listarUsuarios(){
		
		usuarios = usuarioDao.consultaUser();
		
		return "exibe.xhtml";
	}



	public String getA() {
		return a;
	}



	public void setA(String a) {
		this.a = a;
	}
	
	
	

}
