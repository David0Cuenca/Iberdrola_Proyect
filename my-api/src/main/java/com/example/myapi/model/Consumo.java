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
    public Long getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(Long idConsumo) {
        this.idConsumo = idConsumo;
    }

    // Getter y Setter para idContador
    public Long getIdContador() {
        return idContador;
    }

    public void setIdContador(Long idContador) {
        this.idContador = idContador;
    }

    // Getter y Setter para contador
    public Contador getContador() {
        return contador;
    }

    public void setContador(Contador contador) {
        this.contador = contador;
    }

    // Getter y Setter para fecha
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Getter y Setter para kWh
    public Double getkWh() {
        return kWh;
    }

    public void setkWh(Double kWh) {
        this.kWh = kWh;
    }

    // Getter y Setter para horas específicas
    public Double getHora_0() {
        return hora_0;
    }

    public void setHora_0(Double hora_0) {
        this.hora_0 = hora_0;
    }

    public Double getHora_1() {
        return hora_1;
    }

    public void setHora_1(Double hora_1) {
        this.hora_1 = hora_1;
    }

    public Double getHora_2() {
        return hora_2;
    }

    public void setHora_2(Double hora_2) {
        this.hora_2 = hora_2;
    }

    public Double getHora_3() {
        return hora_3;
    }

    public void setHora_3(Double hora_3) {
        this.hora_3 = hora_3;
    }

    public Double getHora_4() {
        return hora_4;
    }

    public void setHora_4(Double hora_4) {
        this.hora_4 = hora_4;
    }

    public Double getHora_5() {
        return hora_5;
    }

    public void setHora_5(Double hora_5) {
        this.hora_5 = hora_5;
    }

    public Double getHora_6() {
        return hora_6;
    }

    public void setHora_6(Double hora_6) {
        this.hora_6 = hora_6;
    }

    public Double getHora_7() {
        return hora_7;
    }

    public void setHora_7(Double hora_7) {
        this.hora_7 = hora_7;
    }

    public Double getHora_8() {
        return hora_8;
    }

    public void setHora_8(Double hora_8) {
        this.hora_8 = hora_8;
    }

    public Double getHora_9() {
        return hora_9;
    }

    public void setHora_9(Double hora_9) {
        this.hora_9 = hora_9;
    }

    public Double getHora_10() {
        return hora_10;
    }

    public void setHora_10(Double hora_10) {
        this.hora_10 = hora_10;
    }

    public Double getHora_11() {
        return hora_11;
    }

    public void setHora_11(Double hora_11) {
        this.hora_11 = hora_11;
    }

    public Double getHora_12() {
        return hora_12;
    }

    public void setHora_12(Double hora_12) {
        this.hora_12 = hora_12;
    }

    public Double getHora_13() {
        return hora_13;
    }

    public void setHora_13(Double hora_13) {
        this.hora_13 = hora_13;
    }

    public Double getHora_14() {
        return hora_14;
    }

    public void setHora_14(Double hora_14) {
        this.hora_14 = hora_14;
    }

    public Double getHora_15() {
        return hora_15;
    }

    public void setHora_15(Double hora_15) {
        this.hora_15 = hora_15;
    }

    public Double getHora_16() {
        return hora_16;
    }

    public void setHora_16(Double hora_16) {
        this.hora_16 = hora_16;
    }

    public Double getHora_17() {
        return hora_17;
    }

    public void setHora_17(Double hora_17) {
        this.hora_17 = hora_17;
    }

    public Double getHora_18() {
        return hora_18;
    }

    public void setHora_18(Double hora_18) {
        this.hora_18 = hora_18;
    }

    public Double getHora_19() {
        return hora_19;
    }

    public void setHora_19(Double hora_19) {
        this.hora_19 = hora_19;
    }

    public Double getHora_20() {
        return hora_20;
    }

    public void setHora_20(Double hora_20) {
        this.hora_20 = hora_20;
    }

    public Double getHora_21() {
        return hora_21;
    }

    public void setHora_21(Double hora_21) {
        this.hora_21 = hora_21;
    }

    public Double getHora_22() {
        return hora_22;
    }

    public void setHora_22(Double hora_22) {
        this.hora_22 = hora_22;
    }

    public Double getHora_23() {
        return hora_23;
    }

    public void setHora_23(Double hora_23) {
        this.hora_23 = hora_23;
    }

    @Override
    public String toString() {
        return "Consumo{" +
                "idConsumo=" + idConsumo +
                ", idContador=" + idContador +
                ", contador=" + contador +
                ", fecha=" + fecha +
                ", kWh=" + kWh +
                ", hora_0=" + hora_0 +
                ", hora_1=" + hora_1 +
                ", hora_2=" + hora_2 +
                ", hora_3=" + hora_3 +
                ", hora_4=" + hora_4 +
                ", hora_5=" + hora_5 +
                ", hora_6=" + hora_6 +
                ", hora_7=" + hora_7 +
                ", hora_8=" + hora_8 +
                ", hora_9=" + hora_9 +
                ", hora_10=" + hora_10 +
                ", hora_11=" + hora_11 +
                ", hora_12=" + hora_12 +
                ", hora_13=" + hora_13 +
                ", hora_14=" + hora_14 +
                ", hora_15=" + hora_15 +
                ", hora_16=" + hora_16 +
                ", hora_17=" + hora_17 +
                ", hora_18=" + hora_18 +
                ", hora_19=" + hora_19 +
                ", hora_20=" + hora_20 +
                ", hora_21=" + hora_21 +
                ", hora_22=" + hora_22 +
                ", hora_23=" + hora_23 +
                '}';
    }
}
