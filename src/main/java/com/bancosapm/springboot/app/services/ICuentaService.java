package com.bancosapm.springboot.app.services;

import java.util.List;

import com.bancosapm.springboot.app.models.entity.Cuenta;

public interface ICuentaService {
	
	public Cuenta getById(Long id, List<Cuenta> lista);

}
