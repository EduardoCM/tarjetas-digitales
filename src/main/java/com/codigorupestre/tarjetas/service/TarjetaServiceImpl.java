package com.codigorupestre.tarjetas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigorupestre.tarjetas.model.Tarjeta;
import com.codigorupestre.tarjetas.model.TarjetaEntity;
import com.codigorupestre.tarjetas.repository.TarjetaRepository;
import com.codigorupestre.tarjetas.repository.TarjetaRepositoryOracle;


@Service
public class TarjetaServiceImpl implements TarjetaService {
	
	@Autowired
	private TarjetaRepositoryOracle repository;

	@Override
	public TarjetaEntity creartarjeta(TarjetaEntity tarjeta) {
		return repository.save(tarjeta);
	}

	@Override
	public List<TarjetaEntity> obtenerTarjetas() {
		return repository.findAll();
	}

	@Override
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		  return new Tarjeta();
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
	}

	@Override
	public Tarjeta actualizarTarjeta(int index, Tarjeta tarjeta) {
	  return new Tarjeta();
	}

	@Override
	public void eliminarTodos() {
		
	}

}
