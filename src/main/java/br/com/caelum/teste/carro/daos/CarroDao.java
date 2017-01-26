package br.com.caelum.teste.carro.daos;

import org.springframework.data.repository.CrudRepository;

import br.com.caelum.teste.carro.models.Carro;

public interface CarroDao extends CrudRepository<Carro, Integer> {

}
