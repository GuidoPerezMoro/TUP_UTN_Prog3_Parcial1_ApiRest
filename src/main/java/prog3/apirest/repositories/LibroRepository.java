package prog3.apirest.repositories;

import org.springframework.stereotype.Repository;
import prog3.apirest.entities.Libro;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long>{
}
