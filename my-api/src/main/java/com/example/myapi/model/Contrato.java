import javax.persistence.*;

@Entity
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrato;

    @ManyToOne
    @JoinColumn(name = "dni_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_tarifa")
    private Tarifa tarifa;

    @ManyToOne
    @JoinColumn(name = "id_cont")
    private Contador contador;

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    // Getter y Setter para cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Getter y Setter para tarifa
    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    // Getter y Setter para contador
    public Contador getContador() {
        return contador;
    }

    public void setContador(Contador contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "idContrato=" + idContrato +
                ", cliente=" + cliente +
                ", tarifa=" + tarifa +
                ", contador=" + contador +
                '}';
    }
}
