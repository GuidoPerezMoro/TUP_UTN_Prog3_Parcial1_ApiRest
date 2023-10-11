package prog3.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import prog3.apirest.entities.Persona;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    //Anotación con Método de Query (no se usa por lo general ya que los métodos con nombres tan largos son difíciles de mantener)
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    boolean existsByDni(int dni);

    //Anotación JPQL parámetros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %?1%")
    List<Persona> search(@Param("filtro") String filtro);


    /*
    //Anotación JPQL parámetros nombrados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'") //El parámetro se nombra directamente
    List<Persona> search(@Param("filtro") String filtro);
    */

    //Anotación Query nativo
    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %?1% OR persona.apellido LIKE %?1%",
            nativeQuery = true)
    List<Persona> searchNativo(@Param("filtro") String filtro);


}
