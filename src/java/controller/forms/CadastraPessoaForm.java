/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.forms;

import java.util.Date;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author Kevim
 */
public class CadastraPessoaForm extends ActionForm {
    
    private int idPessoa;
    private String nome;
    private String email;
    private Date dataNasc;
    private int senha;
    private int confsenha;
    private int id;

    public int getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getConfsenha() {
        return confsenha;
    }
    public void setConfsenha(int confsenha) {
        this.confsenha = confsenha;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
        
}
