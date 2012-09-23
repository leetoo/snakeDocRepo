package com.aironman.core.pojos;
// Generated 16-abr-2012 11:00:31 by Hibernate Tools 3.2.1.GA


import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * ApuntesContables generated by hbm2java
 */
@Entity
@Table(name="ApuntesContables"
    ,catalog="Store"
)
public class ApuntesContables  implements java.io.Serializable {

     private static final Log log = LogFactory.getLog(ApuntesContables.class);
     //TODO generar adecuadamente este serial
     private static final long serialVersionUID = 1L;

     private Long id;
     private String legajo;
     private Timestamp fechaConfirmacion;
     private float cargo;

    public ApuntesContables()
    {
        if (log.isDebugEnabled()){
            log.info("Constructor Sin tipo ApuntesContables...");
        }
    }

    public ApuntesContables(String legajo, Timestamp fechaConfirmacion, float cargo)
    {
       if (log.isDebugEnabled()){
            log.info("Constructor Con tipo ApuntesContables...");
       }
       this.legajo = legajo;
       this.fechaConfirmacion = fechaConfirmacion;
       this.cargo = cargo;
    }
   
    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name="legajo", nullable=true, length=100)
    public String getLegajo() {
        return this.legajo;
    }
    
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    /**
     * 
     * @return
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fechaConfirmacion", nullable=false, length=10)
    public Date getFechaConfirmacion() {
        return this.fechaConfirmacion;
    }
    
    public void setFechaConfirmacion(Timestamp fechaConfirmacion) {
        this.fechaConfirmacion = fechaConfirmacion;
    }
    
    @Column(name="cargo", nullable=false, precision=12, scale=0)
    public float getCargo() {
        return this.cargo;
    }
    
    public void setCargo(float cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("id: ").append(id);
        sb.append(" legajo: ").append(legajo);
        sb.append(" fecha: ").append(fechaConfirmacion);
        sb.append(" cargo: ").append(cargo);
        return sb.toString();
    }
}
