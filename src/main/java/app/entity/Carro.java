
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela CAROO
* @generated
*/
@Entity
@Table(name = "\"CAROO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Carro")
public class Carro implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "placa", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String placa;


    /**
    * @generated
    */
    @Column(name = "marca", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String marca;


    /**
    * Construtor
    * @generated
    */
    public Carro(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Carro setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém placa
    * return placa
    * @generated
    */
    public java.lang.String getPlaca() {
        return this.placa;
    }

    /**
    * Define placa
    * @param placa placa
    * @generated
    */
    public Carro setPlaca(java.lang.String placa) {
        this.placa = placa;
        return this;
    }
    /**
    * Obtém marca
    * return marca
    * @generated
    */
    public java.lang.String getMarca() {
        return this.marca;
    }

    /**
    * Define marca
    * @param marca marca
    * @generated
    */
    public Carro setMarca(java.lang.String marca) {
        this.marca = marca;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Carro object = (Carro)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}