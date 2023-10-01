package prog3.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prog3.apirest.entities.Autor;
import prog3.apirest.repositories.AutorRepository;
import prog3.apirest.repositories.BaseRepository;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
