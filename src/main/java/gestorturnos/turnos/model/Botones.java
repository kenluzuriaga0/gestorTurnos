/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorturnos.turnos.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kenlu
 */
@Entity
@Table(name = "botones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Botones.findAll", query = "SELECT b FROM Botones b")
    , @NamedQuery(name = "Botones.findByIdBoton", query = "SELECT b FROM Botones b WHERE b.idBoton = :idBoton")
    , @NamedQuery(name = "Botones.findByNombre", query = "SELECT b FROM Botones b WHERE b.nombre = :nombre")
    , @NamedQuery(name = "Botones.findByDescripcion", query = "SELECT b FROM Botones b WHERE b.descripcion = :descripcion")
    , @NamedQuery(name = "Botones.findByEstado", query = "SELECT b FROM Botones b WHERE b.estado = :estado")})
public class Botones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_boton")
    private Integer idBoton;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Boolean estado;

    public Botones() {
    }

    public Botones(Integer idBoton) {
        this.idBoton = idBoton;
    }

    public Integer getIdBoton() {
        return idBoton;
    }

    public void setIdBoton(Integer idBoton) {
        this.idBoton = idBoton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBoton != null ? idBoton.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Botones)) {
            return false;
        }
        Botones other = (Botones) object;
        if ((this.idBoton == null && other.idBoton != null) || (this.idBoton != null && !this.idBoton.equals(other.idBoton))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gestorturnos.turnos.model.Botones[ idBoton=" + idBoton + " ]";
    }
    
}
