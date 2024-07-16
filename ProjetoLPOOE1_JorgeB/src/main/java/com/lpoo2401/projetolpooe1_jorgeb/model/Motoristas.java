
package com.lpoo2401.projetolpooe1_jorgeb.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author JRGB
 */

@Entity
@Table(name = "tb_motoristas")
public class Motoristas implements Serializable {
    
    @Id
    @Column(nullable = false, length = 11)
    private Integer cpf; 
    
    @Column(nullable = false, length = 100)
    private String nome;
    
    @Column(nullable = true, length = 12)
    private String numero_celular;
    
    @ManyToOne
    @JoinColumn(name = "caminhao_id")
    private Caminhao caminhao;
    
        
    public Motoristas(){
        
    }
    
    public Integer getCPF() {
        return cpf;
    }

    public void setCPF(Integer cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }
    
}
