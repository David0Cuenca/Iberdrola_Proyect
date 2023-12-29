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

    // Getter, Setter y otros métodos según tus necesidades
    
}
