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

        // Getter y Setter para idTarifa
        public Long getIdTarifa() {
            return idTarifa;
        }
    
        public void setIdTarifa(Long idTarifa) {
            this.idTarifa = idTarifa;
        }
    
        // Getter y Setter para tarifa
        public Tarifa getTarifa() {
            return tarifa;
        }
    
        public void setTarifa(Tarifa tarifa) {
            this.tarifa = tarifa;
        }
    
        // Getter y Setter para precios
        public Float getPrecios() {
            return precios;
        }
    
        public void setPrecios(Float precios) {
            this.precios = precios;
        }
    
        @Override
        public String toString() {
            return "PVPC{" +
                    "idTarifa=" + idTarifa +
                    ", tarifa=" + tarifa +
                    ", precios=" + precios +
                    '}';
        }
}
