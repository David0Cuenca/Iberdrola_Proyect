import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Cliente {
    @Id
    private String dni;
    private String nombre;
    private Date nacimiento;
    private String domicilio;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, Date nacimiento, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.domicilio = domicilio;
    }

    public String getDni() {
        return dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }  

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private ClienteBorrado clienteBorrado;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private ClienteActivo clienteActivo;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Contrato> contratos;

// Otros mapeos según tus necesidades

}
