/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persistense;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import model.util.TipoExercicios;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;

import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Kevim
 */
@Entity
public class Ficha implements Serializable {

    @Id
    @GeneratedValue
    private int idFicha;
    @Enumerated(EnumType.STRING)
    private TipoExercicios tipo;
    private int repeticao;
    private String aparelho;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_cliente")
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.ALL)
    private Cliente cliente;

    public Ficha() {
    }

    public Ficha(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public TipoExercicios getTipo() {
        return tipo;
    }

    public void setTipo(TipoExercicios tipo) {
        this.tipo = tipo;
    }

  

    public int getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(int repeticao) {
        this.repeticao = repeticao;
    }

    public String getAparelho() {
        return aparelho;
    }

    public void setAparelho(String aparelho) {
        this.aparelho = aparelho;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
