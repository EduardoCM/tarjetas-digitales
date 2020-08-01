package com.codigorupestre.tarjetas.service;

import java.util.List;

import com.codigorupestre.tarjetas.model.Tarjeta;
import com.codigorupestre.tarjetas.model.TarjetaEntity;

public interface TarjetaService {

	TarjetaEntity creartarjeta(TarjetaEntity tarjeta);

	List<TarjetaEntity> obtenerTarjetas();

	Tarjeta obtenerTarjeta(String numeroTarjeta);

	void eliminarTarjeta(String numeroTarjeta);

	Tarjeta actualizarTarjeta(int index, Tarjeta tarjeta);
	
	void eliminarTodos();

}
