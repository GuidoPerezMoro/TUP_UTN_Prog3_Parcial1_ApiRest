package prog3.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import prog3.apirest.entities.BaseEntidad;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<E extends BaseEntidad, ID extends Serializable> extends JpaRepository<E,ID> {
}
