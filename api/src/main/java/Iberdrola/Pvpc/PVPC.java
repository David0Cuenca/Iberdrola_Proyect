import javax.persistence.*;

@Entity
public class PVPC {
    @Id
    private Long idTarifa;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_tarifa")
    private Tarifa tarifa;

    private Float precios;

    // Getter, Setter y otros métodos según tus necesidades
}
