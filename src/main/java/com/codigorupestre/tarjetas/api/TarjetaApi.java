package com.codigorupestre.tarjetas.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.codigorupestre.tarjetas.model.Tarjeta;
import com.codigorupestre.tarjetas.service.TarjetaService;


@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/v1/tarjeta")
public class TarjetaApi {
	
	@Autowired
	private TarjetaService tarjetaService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Tarjeta creartarjeta(@RequestBody Tarjeta tarjeta) {
		return tarjetaService.creartarjeta(tarjeta);	
	}
	
	@GetMapping("/{numeroTarjeta}")
	public Tarjeta obtenerTarjeta(@PathVariable(name="numeroTarjeta") String numeroTarjeta) {
		return tarjetaService.obtenerTarjeta(numeroTarjeta);		
	}

	@GetMapping
	public  List<Tarjeta> obtenerTarjetas(){
		return tarjetaService.obtenerTarjetas();
	}


	@DeleteMapping("/{numeroTarjeta}")
	public void eliminarTarjeta(@PathVariable(name="numeroTarjeta") String numeroTarjeta) {
		tarjetaService.eliminarTarjeta(numeroTarjeta);
	}

	@PutMapping("/{index}")
	public Tarjeta actualizarTarjeta(@PathVariable(name="index") int index, @RequestBody Tarjeta tarjeta) {
		return tarjetaService.actualizarTarjeta(index, tarjeta);
	}
	
	@DeleteMapping("/todos")
	public void eliminarTodos() {
		tarjetaService.eliminarTodos();
	}

}
