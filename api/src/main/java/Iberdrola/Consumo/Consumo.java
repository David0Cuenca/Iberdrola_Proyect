import javax.persistence.*;

@Entity
public class Consumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsumo;

    @ManyToOne
    @JoinColumn(name = "id_contador")
    private Contador contador;

    private Date fecha;
    private Float horas_0;
    private Float horas_1;
    private Float horas_2;
    private Float horas_3;
    private Float horas_4;
    private Float horas_5;
    private Float horas_6;
    private Float horas_7;
    private Float horas_8;
    private Float horas_9;
    private Float horas_10;
    private Float horas_11;
    private Float horas_12;
    private Float horas_13;
    private Float horas_14;
    private Float horas_15;
    private Float horas_16;
    private Float horas_17;
    private Float horas_18;
    private Float horas_19;
    private Float horas_20;
    private Float horas_21;
    private Float horas_22;
    private Float horas_23;
    private Float kWh;

    // Getter, Setter y otros métodos según tus necesidades
}
