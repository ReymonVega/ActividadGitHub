package net.jaumebalmes.m12.repos;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import net.jaumebalmes.m12.entitats.Curs;
	
public interface CursRepository extends CrudRepository<Curs, Long>{
	
	public List<Curs> findAll();
}
