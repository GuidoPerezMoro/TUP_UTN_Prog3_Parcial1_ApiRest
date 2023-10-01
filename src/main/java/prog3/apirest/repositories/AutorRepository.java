package prog3.apirest.repositories;

import org.springframework.stereotype.Repository;
import prog3.apirest.entities.Autor;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
