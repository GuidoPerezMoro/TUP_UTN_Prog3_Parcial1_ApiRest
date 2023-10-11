package prog3.apirest.services;

import prog3.apirest.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {
    List<Persona> search(String filtro) throws Exception;
}
