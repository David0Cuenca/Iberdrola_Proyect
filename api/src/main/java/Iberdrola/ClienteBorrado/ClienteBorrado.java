import javax.persistence.*;
import java.util.Date;

@Entity
public class ClienteBorrado {
    @Id
    private String dni;
    private Date fechaBaja;

    @OneToOne
    @MapsId
    @JoinColumn(name = "dni")
    private Cliente cliente;

    // Getter y Setter para dni
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Getter y Setter para fechaBaja
    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    // Getter y Setter para cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Otros métodos según tus necesidades

    @Override
    public String toString() {
        return "ClienteBorrado{" +
                "dni='" + dni + '\'' +
                ", fechaBaja=" + fechaBaja +
                ", cliente=" + cliente +
                '}';
    }
    
}
