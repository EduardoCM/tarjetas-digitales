package com.codigorupestre.tarjetas.service;

import java.util.List;

import com.codigorupestre.tarjetas.model.Tarjeta;

public interface TarjetaService {

	Tarjeta creartarjeta(Tarjeta tarjeta);

	List<Tarjeta> obtenerTarjetas();

	Tarjeta obtenerTarjeta(String numeroTarjeta);

	void eliminarTarjeta(String numeroTarjeta);

	Tarjeta actualizarTarjeta(int index, Tarjeta tarjeta);
	
	void eliminarTodos();

}
