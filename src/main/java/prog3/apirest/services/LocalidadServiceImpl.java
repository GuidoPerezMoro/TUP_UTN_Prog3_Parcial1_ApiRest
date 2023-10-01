package prog3.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import prog3.apirest.entities.Localidad;
import prog3.apirest.repositories.BaseRepository;
import prog3.apirest.repositories.LocalidadRepository;

import java.util.List;

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}
