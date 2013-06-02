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
public class CadastraFichaForm extends ActionForm{
    
    
private String tipo;
private int repeticao;
private String exercicio;    

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

}
