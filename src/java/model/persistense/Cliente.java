/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persistense;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Kevim
 */

@Entity
public class Cliente implements Serializable {
   
    @Id
    @GeneratedValue
    @Column(name="id_cliente")
    private int idCliente;
    private int peso; 
    private int altura; 
    private int gordura; 
    private String personal; 
    private int academia; 
    private int avaliacao;
    
    @OneToOne
    private Pessoa pessoa;
    
    @OneToMany(mappedBy="cliente", fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    private List<Ficha> fichas = new ArrayList<Ficha>();

    public Cliente() {
    }

    public Cliente(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getGordura() {
        return gordura;
    }
    public void setGordura(int gordura) {
        this.gordura = gordura;
    }
    public String getPersonal() {
        return personal;
    }
    public void setPersonal(String personal) {
        this.personal = personal;
    }
    public int getAcademia() {
        return academia;
    }
    public void setAcademia(int academia) {
        this.academia = academia;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public List<Ficha> getFichas() {
        return fichas;
    }
    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
}
