package com.bancosapm.springboot.app.models.dao;

import java.util.List;

import com.bancosapm.springboot.app.models.entity.Cuenta;

public interface ICuentaDao {

	public List<Cuenta> findAll();
	
	public void save(Cuenta cuenta);

}
