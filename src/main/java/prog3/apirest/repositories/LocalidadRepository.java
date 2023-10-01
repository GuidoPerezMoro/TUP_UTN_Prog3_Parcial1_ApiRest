package prog3.apirest.repositories;

import org.springframework.stereotype.Repository;
import prog3.apirest.entities.Localidad;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long> {
}
