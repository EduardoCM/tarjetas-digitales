package com.codigorupestre.tarjetas.repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.codigorupestre.tarjetas.model.Tarjeta;

@Repository
public class TarjetaRepositoryImpl implements TarjetaRepository {

	private Logger LOG = LoggerFactory.getLogger(TarjetaRepositoryImpl.class);

	private static List<Tarjeta> tarjetasDigitales = new ArrayList<Tarjeta>();

	static {
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setId(1);
		tarjeta.setNombreTitular("Eduardo Castillo Mendoza");
		tarjeta.setNombreEntidad("Space Money");
		tarjeta.setNumeroTarjeta("5645-2345-2367-3242");
		tarjeta.setMarca("SPACE-VISA");
		tarjeta.setFechaCaudicidad("20/26");
		tarjeta.setCvv("234");
		tarjetasDigitales.add(tarjeta);
	}

	@Override
	public Tarjeta creartarjeta(Tarjeta tarjeta) {
		LOG.info("Creacion de tarjeta {}", tarjeta);
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {
		LOG.info("Obtener todas las tarjetas");
		return tarjetasDigitales;
	}

	@Override
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		LOG.info("Obtener tarjeta {}", numeroTarjeta);
		return tarjetasDigitales.stream().filter(td -> td.getNumeroTarjeta().equals(numeroTarjeta)).findFirst().get();
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		LOG.info("Eliminar tarjeta {}", numeroTarjeta);
		tarjetasDigitales.remove(
				tarjetasDigitales.stream().filter(td -> td.getNumeroTarjeta().equals(numeroTarjeta)).findFirst().get());
	}

	@Override
	public Tarjeta actualizarTarjeta(int index, Tarjeta tarjeta) {
		LOG.info("Eliminar tarjeta {}", tarjeta);
		Tarjeta resultado = tarjetasDigitales.stream().filter(td -> td.getNumeroTarjeta().equals(index)).findFirst().get();
		return tarjetasDigitales.set(index, tarjeta);
	}

	@Override
	public void eliminarTodos() {
		tarjetasDigitales.clear();
	}

}
