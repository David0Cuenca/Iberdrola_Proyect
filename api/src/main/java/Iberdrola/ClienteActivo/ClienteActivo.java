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

    // Getter, Setter y otros métodos según tus necesidades
}
