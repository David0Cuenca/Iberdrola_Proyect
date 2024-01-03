import javax.persistence.*;
import java.util.Date;

@Entity
public class ClienteActivo {
    @Id
    private String dni;
    private Date fechaAlta;

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

    // Getter y Setter para fechaAlta
    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    // Getter y Setter para cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ClienteActivo{" +
                "dni='" + dni + '\'' +
                ", fechaAlta=" + fechaAlta +
                ", cliente=" + cliente +
                '}';
    }
}
