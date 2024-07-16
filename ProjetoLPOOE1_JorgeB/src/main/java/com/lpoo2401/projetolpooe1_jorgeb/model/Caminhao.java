package com.lpoo2401.projetolpooe1_jorgeb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 20181pf.cc0221
 */
@Entity
@Table(name = "tb_caminhao")
public class Caminhao implements Serializable{
    @Id
    @Column(nullable = false, length = 7)
    private String placa; 
    
    @Column(nullable = false, length = 6)
    private Integer km;
    
    @OneToMany(mappedBy = "caminhao")
    private List<Motoristas> motoristas;
    
    @ManyToOne
    @JoinColumn(name = "obra_id")
    private Obra obra;
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public List<Motoristas> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(List<Motoristas> motoristas) {
        this.motoristas = motoristas;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }
    
}
