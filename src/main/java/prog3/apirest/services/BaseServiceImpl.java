package prog3.apirest.services;

import jakarta.transaction.Transactional;
import prog3.apirest.entities.BaseEntidad;
import prog3.apirest.repositories.BaseRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends BaseEntidad, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E,ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E,ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional //Evita errores por si se corta la luz, entre otras cosas
    public List<E> findAll() throws Exception {
        try {
            List<E> entities = baseRepository.findAll();
            return entities;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            E persona = entityOptional.get();
            persona = baseRepository.save(entity);
            return persona;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            }
            else {
                throw new Exception();
            }
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
