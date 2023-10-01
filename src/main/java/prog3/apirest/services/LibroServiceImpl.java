package prog3.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import prog3.apirest.entities.Libro;
import prog3.apirest.repositories.BaseRepository;
import prog3.apirest.repositories.LibroRepository;

import java.util.List;

public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}
