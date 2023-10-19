package prog3.apirest.services;

import prog3.apirest.entities.BaseEntidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends BaseEntidad, ID extends Serializable> {
    public List<E> findALL() throws Exception; //GET
    public Page<E> findALL(Pageable pageable) throws Exception; //GET usando paginación
    public E findById(ID id) throws Exception; //GET
    public E save(E entity) throws Exception; //POST
    public E update(E entity, ID id) throws Exception; //PUT
    public boolean delete(ID id) throws Exception; //DELETE
}
