package prog3.apirest.services;

import prog3.apirest.entities.BaseEntidad;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends BaseEntidad, ID extends Serializable> {
    public List<E> findAll() throws Exception; //GET
    public E findById(ID id) throws Exception; //GET
    public E save(E entity) throws Exception; //POST
    public E update(ID id, E entity) throws Exception; //PUT
    public boolean delete(ID id) throws Exception; //DELETE
}
