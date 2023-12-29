import javax.persistence.*;
import java.util.Date;

@Entity
public class Cliente {
    @Id
    private String dni;
    private String nombre;
    private Date nacimiento;
    private String domicilio;
    // Otros campos y métodos getter/setter
}
