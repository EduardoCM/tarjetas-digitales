package com.codigorupestre.tarjetas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigorupestre.tarjetas.model.Tarjeta;
import com.codigorupestre.tarjetas.repository.TarjetaRepository;


@Service
public class TarjetaServiceImpl implements TarjetaService {
	
	@Autowired
	private TarjetaRepository repository;

	@Override
	public Tarjeta creartarjeta(Tarjeta tarjeta) {
		return repository.creartarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {
		return repository.obtenerTarjetas();
	}

	@Override
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		return repository.obtenerTarjeta(numeroTarjeta);
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		repository.eliminarTarjeta(numeroTarjeta);
	}

	@Override
	public Tarjeta actualizarTarjeta(int index, Tarjeta tarjeta) {
		return repository.actualizarTarjeta(index, tarjeta);
	}

	@Override
	public void eliminarTodos() {
		repository.eliminarTodos();
		
	}

}
