package prog3.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prog3.apirest.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
