package net.jaumebalmes.m12.repos;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import net.jaumebalmes.m12.entitats.Alumne;
	
public interface AlumnesRepository extends CrudRepository<Alumne, Long>{
	
	public List<Alumne> findAll();
}