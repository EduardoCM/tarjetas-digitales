package com.codigorupestre.tarjetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codigorupestre.tarjetas.model.TarjetaEntity;

public interface TarjetaRepositoryOracle extends JpaRepository<TarjetaEntity, Integer> {

}
