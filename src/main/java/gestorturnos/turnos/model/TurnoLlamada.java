package gestorturnos.turnos.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "turno_llamada")
public class TurnoLlamada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_turno_llamada ;
    private Long cod_turno;
    private LocalDateTime llamada_fecha;
    private String llamada_usuario;

    public Long getCod_turno_llamada() {
        return cod_turno_llamada;
    }

    public void setCod_turno_llamada(Long cod_turno_llamada) {
        this.cod_turno_llamada = cod_turno_llamada;
    }

    public Long getCod_turno() {
        return cod_turno;
    }

    public void setCod_turno(Long cod_turno) {
        this.cod_turno = cod_turno;
    }

    public LocalDateTime getLlamada_fecha() {
        return llamada_fecha;
    }

    public void setLlamada_fecha(LocalDateTime llamada_fecha) {
        this.llamada_fecha = llamada_fecha;
    }

    public String getLlamada_usuario() {
        return llamada_usuario;
    }

    public void setLlamada_usuario(String llamada_usuario) {
        this.llamada_usuario = llamada_usuario;
    }
}
