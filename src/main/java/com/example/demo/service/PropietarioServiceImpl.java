package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class PropietarioServiceImpl implements PropietarioService{
	@Autowired
	PropietarioRepository propietarioRepository;
	@Override
	
	@Transactional(value = TxType.REQUIRES_NEW)
	public Propietario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscarPorId(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(propietario);
		
	}

	@Override
	@Transactional(value =TxType.REQUIRES_NEW)
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public List<Propietario> buscarTodos() {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscarTodos();
	}

}
