package br.com.caelum.teste.carro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.caelum.teste.carro.daos.CarroDao;
import br.com.caelum.teste.carro.models.Carro;

@RestController
public class DeviceController {

	@Autowired
	CarroDao dao;

	@RequestMapping(value = "recomendacao", method = RequestMethod.POST, consumes = "application/json")
	public Carro recebeRecomendacao(@RequestBody Carro carro) {
		Carro save = dao.save(carro);

		return save;
	}

}
