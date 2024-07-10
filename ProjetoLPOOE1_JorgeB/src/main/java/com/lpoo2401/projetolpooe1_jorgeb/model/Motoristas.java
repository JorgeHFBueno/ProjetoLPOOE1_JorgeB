
package com.lpoo2401.projetolpooe1_jorgeb.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author JRG
 */

@Entity
@Table(name = "tb_motoristas")
public abstract class Motoristas implements Serializable {
    
    @Id
    private Integer cpf; 
    
    @Column(nullable = false, length = 100)
    private String nome;
    
    @Column(nullable = true, length = 11)
    private String numero_celular;
    
        
    public Motoristas(){
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the numero_celular
     */
    public String getNumero_celular() {
        return numero_celular;
    }

    /**
     * @param numero_celular the numero_celular to set
     */
    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }


    public Integer getCPF() {
        return cpf;
    }

    public void setCPF(Integer cpf) {
        this.cpf = cpf;
    }
    
}
