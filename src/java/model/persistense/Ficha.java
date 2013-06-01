/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persistense;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    private String tipo;
    private int repeticao;
    private String exercicio;
    
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(int repeticao) {
        this.repeticao = repeticao;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
