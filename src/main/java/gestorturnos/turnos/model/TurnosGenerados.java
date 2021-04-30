package gestorturnos.turnos.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "turnos_Generados")
public class TurnosGenerados {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cod_turno")
    private Long codTurno;
    @Column(name = "tno_fecha_completa")
    private LocalDateTime  tnoFechaCompleta;
    private LocalDateTime  tno_fecha;
    private Integer tno_numero;
    private Integer tno_caja;
    private LocalDateTime tno_fecha_atendido;
    private LocalDateTime  tno_tiempo_atencion;
    private String tno_centro;
    private String tno_usuario_crea;
    private String tno_usuaro_modifica;
    private String tno_estado;
    @ManyToOne
    @JoinColumn(name = "id_boton")
    private Botones idBoton;

    public TurnosGenerados() {
    }

    public TurnosGenerados(Long cod_turno, LocalDateTime tno_fecha_completa, LocalDateTime tno_fecha, Integer tno_numero, Integer tno_caja, LocalDateTime tno_fecha_atendido, LocalDateTime tno_tiempo_atencion, String tno_centro, String tno_usuario_crea, String tno_usuaro_modifica, String tno_estado, Botones idBoton) {
        this.codTurno = cod_turno;
        this.tnoFechaCompleta = tno_fecha_completa;
        this.tno_fecha = tno_fecha;
        this.tno_numero = tno_numero;
        this.tno_caja = tno_caja;
        this.tno_fecha_atendido = tno_fecha_atendido;
        this.tno_tiempo_atencion = tno_tiempo_atencion;
        this.tno_centro = tno_centro;
        this.tno_usuario_crea = tno_usuario_crea;
        this.tno_usuaro_modifica = tno_usuaro_modifica;
        this.tno_estado = tno_estado;
        this.idBoton = idBoton;
    }

    public Long getCod_turno() {
        return codTurno;
    }

    public void setCod_turno(Long cod_turno) {
        this.codTurno = cod_turno;
    }

    public LocalDateTime getTno_fecha_completa() {
        return tnoFechaCompleta;
    }

    public void setTno_fecha_completa(LocalDateTime tno_fecha_completa) {
        this.tnoFechaCompleta = tno_fecha_completa;
    }

    public LocalDateTime getTno_fecha() {
        return tno_fecha;
    }

    public void setTno_fecha(LocalDateTime tno_fecha) {
        this.tno_fecha = tno_fecha;
    }

    public Integer getTno_numero() {
        return tno_numero;
    }

    public void setTno_numero(Integer tno_numero) {
        this.tno_numero = tno_numero;
    }

    public Integer getTno_caja() {
        return tno_caja;
    }

    public void setTno_caja(Integer tno_caja) {
        this.tno_caja = tno_caja;
    }

    public LocalDateTime getTno_fecha_atendido() {
        return tno_fecha_atendido;
    }

    public void setTno_fecha_atendido(LocalDateTime tno_fecha_atendido) {
        this.tno_fecha_atendido = tno_fecha_atendido;
    }

    public LocalDateTime getTno_tiempo_atencion() {
        return tno_tiempo_atencion;
    }

    public void setTno_tiempo_atencion(LocalDateTime tno_tiempo_atencion) {
        this.tno_tiempo_atencion = tno_tiempo_atencion;
    }

    public String getTno_centro() {
        return tno_centro;
    }

    public void setTno_centro(String tno_centro) {
        this.tno_centro = tno_centro;
    }

    public String getTno_usuario_crea() {
        return tno_usuario_crea;
    }

    public void setTno_usuario_crea(String tno_usuario_crea) {
        this.tno_usuario_crea = tno_usuario_crea;
    }

    public String getTno_usuaro_modifica() {
        return tno_usuaro_modifica;
    }

    public void setTno_usuaro_modifica(String tno_usuaro_modifica) {
        this.tno_usuaro_modifica = tno_usuaro_modifica;
    }

    public String getTno_estado() {
        return tno_estado;
    }

    public void setTno_estado(String tno_estado) {
        this.tno_estado = tno_estado;
    }

    public Botones getIdBoton() {
        return idBoton;
    }

    public void setIdBoton(Botones idBoton) {
        this.idBoton = idBoton;
    }
}
