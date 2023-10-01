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
@Table(name = "domicilio")
public class Domicilio extends BaseEntidad{
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;
}
