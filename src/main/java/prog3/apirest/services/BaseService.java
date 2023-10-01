package prog3.apirest.services;

import java.util.List;

public interface BaseService<E> {
    public List<E> findAll() throws Exception; //GET
    public E findById(Long id) throws Exception; //GET
    public E save(E entity) throws Exception; //POST
    public E update(Long id, E entity) throws Exception; //PUT
    public boolean delete(Long id) throws Exception; //DELETE
}
