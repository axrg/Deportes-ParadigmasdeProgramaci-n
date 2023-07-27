/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisdeportes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author aresendizg002
 */
@Entity
@Table(name = "horarios", catalog = "dbdeporte", schema = "")
@NamedQueries({
    @NamedQuery(name = "Horarios.findAll", query = "SELECT h FROM Horarios h"),
    @NamedQuery(name = "Horarios.findByIdnivel", query = "SELECT h FROM Horarios h WHERE h.idnivel = :idnivel"),
    @NamedQuery(name = "Horarios.findByIdcurso", query = "SELECT h FROM Horarios h WHERE h.idcurso = :idcurso"),
    @NamedQuery(name = "Horarios.findByDia", query = "SELECT h FROM Horarios h WHERE h.dia = :dia"),
    @NamedQuery(name = "Horarios.findByHoraini", query = "SELECT h FROM Horarios h WHERE h.horaini = :horaini"),
    @NamedQuery(name = "Horarios.findByHorafin", query = "SELECT h FROM Horarios h WHERE h.horafin = :horafin"),
    @NamedQuery(name = "Horarios.findByProfesor", query = "SELECT h FROM Horarios h WHERE h.profesor = :profesor"),
    @NamedQuery(name = "Horarios.findByIdhorario", query = "SELECT h FROM Horarios h WHERE h.idhorario = :idhorario")})
public class Horarios implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "idnivel")
    private Integer idnivel;
    @Basic(optional = false)
    @Column(name = "idcurso")
    private int idcurso;
    @Basic(optional = false)
    @Column(name = "dia")
    private String dia;
    @Basic(optional = false)
    @Column(name = "horaini")
    private String horaini;
    @Basic(optional = false)
    @Column(name = "horafin")
    private String horafin;
    @Basic(optional = false)
    @Column(name = "profesor")
    private String profesor;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhorario")
    private Integer idhorario;

    public Horarios() {
    }

    public Horarios(Integer idhorario) {
        this.idhorario = idhorario;
    }

    public Horarios(Integer idhorario,int idnivel, int idcurso, String dia, String horaini, String horafin, String profesor) {
        this.idhorario = idhorario;
        this.idcurso = idcurso;
        this.dia = dia;
        this.horaini = horaini;
        this.horafin = horafin;
        this.profesor = profesor;
    }

    public Integer getIdnivel() {
        return idnivel;
    }

    public void setIdnivel(Integer idnivel) {
        Integer oldIdnivel = this.idnivel;
        this.idnivel = idnivel;
        changeSupport.firePropertyChange("idnivel", oldIdnivel, idnivel);
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        int oldIdcurso = this.idcurso;
        this.idcurso = idcurso;
        changeSupport.firePropertyChange("idcurso", oldIdcurso, idcurso);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        String oldDia = this.dia;
        this.dia = dia;
        changeSupport.firePropertyChange("dia", oldDia, dia);
    }

    public String getHoraini() {
        return horaini;
    }

    public void setHoraini(String horaini) {
        String oldHoraini = this.horaini;
        this.horaini = horaini;
        changeSupport.firePropertyChange("horaini", oldHoraini, horaini);
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        String oldHorafin = this.horafin;
        this.horafin = horafin;
        changeSupport.firePropertyChange("horafin", oldHorafin, horafin);
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        String oldProfesor = this.profesor;
        this.profesor = profesor;
        changeSupport.firePropertyChange("profesor", oldProfesor, profesor);
    }

    public Integer getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(Integer idhorario) {
        Integer oldIdhorario = this.idhorario;
        this.idhorario = idhorario;
        changeSupport.firePropertyChange("idhorario", oldIdhorario, idhorario);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhorario != null ? idhorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horarios)) {
            return false;
        }
        Horarios other = (Horarios) object;
        if ((this.idhorario == null && other.idhorario != null) || (this.idhorario != null && !this.idhorario.equals(other.idhorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscolegio.Horarios[ idhorario=" + idhorario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
