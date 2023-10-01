package prog3.apirest.repositories;

import org.springframework.stereotype.Repository;
import prog3.apirest.entities.Domicilio;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio,Long> {
}
