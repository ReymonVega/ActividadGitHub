package net.jaumebalmes.m12.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.m12.entitats.Client;

public interface clientsRepo extends CrudRepository<Client, Long>{

	public List<Client> findAll();
}
