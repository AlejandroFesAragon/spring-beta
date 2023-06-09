package ico.fes.intro.models;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Empleado {
    private int id;
    private String nombre;
    private double sueldo;
    private String departamento;
    private String fechaNacimiento;
    
}
