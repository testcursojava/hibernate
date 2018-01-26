// Generated with g9.

package com.cursocuencajava.app.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="asistencia", indexes={@Index(name="asistenciaCurso", columnList="curso,alumno,dia")})
public class Asistencia implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(nullable=false)
    private Date dia;
    @Column(nullable=false, length=3)
    private boolean valor;
    @ManyToOne(optional=false)
    @JoinColumn(name="alumno", nullable=false)
    private Alumnos alumnos;
    @ManyToOne(optional=false)
    @JoinColumn(name="curso", nullable=false)
    private Cursos cursos;

    /** Default constructor. */
    public Asistencia() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for dia.
     *
     * @return the current value of dia
     */
    public Date getDia() {
        return dia;
    }

    /**
     * Setter method for dia.
     *
     * @param aDia the new value for dia
     */
    public void setDia(Date aDia) {
        dia = aDia;
    }

    /**
     * Access method for valor.
     *
     * @return true if and only if valor is currently true
     */
    public boolean getValor() {
        return valor;
    }

    /**
     * Setter method for valor.
     *
     * @param aValor the new value for valor
     */
    public void setValor(boolean aValor) {
        valor = aValor;
    }

    /**
     * Access method for alumnos.
     *
     * @return the current value of alumnos
     */
    public Alumnos getAlumnos() {
        return alumnos;
    }

    /**
     * Setter method for alumnos.
     *
     * @param aAlumnos the new value for alumnos
     */
    public void setAlumnos(Alumnos aAlumnos) {
        alumnos = aAlumnos;
    }

    /**
     * Access method for cursos.
     *
     * @return the current value of cursos
     */
    public Cursos getCursos() {
        return cursos;
    }

    /**
     * Setter method for cursos.
     *
     * @param aCursos the new value for cursos
     */
    public void setCursos(Cursos aCursos) {
        cursos = aCursos;
    }

    /**
     * Gets the group fragment id for member cursos.
     *
     * @return Current value of the group fragment
     * @see Cursos
     */
    public int getCursosId() {
        return (getCursos() == null ? null : getCursos().getId());
    }

    /**
     * Sets the group fragment id from member cursos.
     *
     * @param aId New value for the group fragment
     * @see Cursos
     */
    public void setCursosId(int aId) {
        if (getCursos() != null) {
            getCursos().setId(aId);
        }
    }

    /**
     * Gets the group fragment id for member alumnos.
     *
     * @return Current value of the group fragment
     * @see Alumnos
     */
    public int getAlumnosId() {
        return (getAlumnos() == null ? null : getAlumnos().getId());
    }

    /**
     * Sets the group fragment id from member alumnos.
     *
     * @param aId New value for the group fragment
     * @see Alumnos
     */
    public void setAlumnosId(int aId) {
        if (getAlumnos() != null) {
            getAlumnos().setId(aId);
        }
    }

    /**
     * Compares the key for this instance with another Asistencia.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Asistencia and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Asistencia)) {
            return false;
        }
        Asistencia that = (Asistencia) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Asistencia.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Asistencia)) return false;
        return this.equalKeys(other) && ((Asistencia)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Asistencia |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", new Integer(getId()));
        return ret;
    }

}
