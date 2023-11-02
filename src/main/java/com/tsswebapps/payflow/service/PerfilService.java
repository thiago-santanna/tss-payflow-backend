package com.tsswebapps.payflow.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tsswebapps.payflow.model.Perfil;
import com.tsswebapps.payflow.repository.PerfilRepository;

@Service
public class PerfilService {

    private PerfilRepository repository;

	public PerfilService(PerfilRepository repository) {
		this.repository = repository;
	}
    
	public Perfil salvarPerfil(Perfil perfil) {
		return this.repository.save(perfil);
	}
	
	public List<Perfil> todos() {
		return this.repository.findAll();
	}

}
