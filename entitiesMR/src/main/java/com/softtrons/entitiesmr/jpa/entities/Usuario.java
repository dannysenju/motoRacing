/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtrons.entitiesmr.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danny
 */
@MappedSuperclass
@Table(name = "Usuario", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "userEmp")
    private String userEmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 333)
    @Column(name = "passEmp")
    private String passEmp;
    @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Empleado idEmpleado;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String userEmp, String passEmp) {
        this.idUsuario = idUsuario;
        this.userEmp = userEmp;
        this.passEmp = passEmp;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserEmp() {
        return userEmp;
    }

    public void setUserEmp(String userEmp) {
        this.userEmp = userEmp;
    }

    public String getPassEmp() {
        return passEmp;
    }

    public void setPassEmp(String passEmp) {
        this.passEmp = passEmp;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
