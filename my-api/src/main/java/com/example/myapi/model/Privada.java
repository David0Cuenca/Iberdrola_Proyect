import javax.persistence.*;

@Entity
public class Privada {
    @Id
    private Long idTarifa;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_tarifa")
    private Tarifa tarifa;

    private Float precio;

    // Getter, Setter y otros métodos según tus necesidades
}
