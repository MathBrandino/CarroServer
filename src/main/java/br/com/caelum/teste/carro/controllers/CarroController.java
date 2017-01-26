package br.com.caelum.teste.carro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.teste.carro.daos.CarroDao;

@Controller
public class CarroController {

	@Autowired
	private CarroDao dao;

	@RequestMapping(value = "/carro/lista", method = RequestMethod.GET)
	public ModelAndView lista() {
		ModelAndView modelAndView = new ModelAndView("carros/lista");

		modelAndView.addObject("carros", dao.findAll());

		return modelAndView;
	}

}
