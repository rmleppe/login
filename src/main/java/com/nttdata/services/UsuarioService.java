package com.nttdata.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.Usuario;
import com.nttdata.repositories.UsuarioRepository;


//LOGICA DE NEGOCIO DE LA APP
@Service
public class UsuarioService {
	
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public void insertarUsuario(@Valid Usuario usuario) {
		
		usuarioRepository.save(usuario);
		
	}

	public List<Usuario> obtenerListaUsuarios() {
		
		
		return usuarioRepository.findAll();
	}
	
	public Usuario buscarUsuarioId(Long id) {
		
		return usuarioRepository.findById(id).get();
	}

	public void eliminarUsuario(Long id) {
		
		usuarioRepository.deleteById(id);
		
	}
	
	public void eliminarUsuarioObjeto(Usuario usuario) {
		
		usuarioRepository.delete(usuario);
		
	}
	
	public Usuario editarUsuario(Long id) {
		return usuarioRepository.findById(id).get();
	}
}
