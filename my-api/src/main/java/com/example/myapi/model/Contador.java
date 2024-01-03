import javax.persistence.*;

@Entity
public class Contador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCont;

    private String modelo;
    private String actividad;

   // Getter y Setter para idCont
   public Long getIdCont() {
    return idCont;
}

public void setIdCont(Long idCont) {
    this.idCont = idCont;
}

// Getter y Setter para modelo
public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

// Getter y Setter para actividad
public String getActividad() {
    return actividad;
}

public void setActividad(String actividad) {
    this.actividad = actividad;
}

@Override
public String toString() {
    return "Contador{" +
            "idCont=" + idCont +
            ", modelo='" + modelo + '\'' +
            ", actividad='" + actividad + '\'' +
            '}';
}
}
