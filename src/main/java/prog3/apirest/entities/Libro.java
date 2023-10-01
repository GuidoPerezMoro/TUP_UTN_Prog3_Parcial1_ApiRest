package prog3.apirest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "libro")
public class Libro extends BaseEntidad{
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "genero")
    private String genero;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "paginas")
    private int paginas;

}
