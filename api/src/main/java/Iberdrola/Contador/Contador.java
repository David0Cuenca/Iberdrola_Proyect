import javax.persistence.*;

@Entity
public class Contador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCont;

    private String modelo;
    private String actividad;

    // Getter, Setter y otros métodos según tus necesidades
}
