import javax.persistence.*;

@Entity
public class Tarifa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarifa;

     // Getter y Setter para idTarifa
     public Long getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(Long idTarifa) {
        this.idTarifa = idTarifa;
    }


    @Override
    public String toString() {
        return "Tarifa{" +
                "idTarifa=" + idTarifa +
                '}';
    }
}
