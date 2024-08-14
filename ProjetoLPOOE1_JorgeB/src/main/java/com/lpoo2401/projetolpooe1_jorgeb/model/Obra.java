package com.lpoo2401.projetolpooe1_jorgeb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author JRGB
 */
@Entity
@Table(name = "tb_obras")
public class Obra implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_obr", sequenceName = "seq_obr_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_obr", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String local;

    @OneToMany(mappedBy = "obra")
    private List<Caminhao> caminhao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Caminhao> getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(List<Caminhao> caminhao) {
        this.caminhao = caminhao;
    }

    @Override
    public String toString() {
        return this.local;
    }

}
