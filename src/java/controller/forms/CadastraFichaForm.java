/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.forms;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author Kevim
 */
public class CadastraFichaForm extends ActionForm {

    private int idFicha;
    private String tipo;
    private int repeticao;
    private String aparelho;

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

    public String getAparelho() {
        return aparelho;
    }

    public void setAparelho(String aparelho) {
        this.aparelho = aparelho;
    }
}
