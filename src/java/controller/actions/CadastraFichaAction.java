/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actions;

import controller.forms.CadastraFichaForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.HDAO;
import model.dao.IDAO;
import model.persistense.Exercicio;
import model.persistense.Ficha;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Kevim
 */
public class CadastraFichaAction extends Action {
    
    @Override
    public ActionForward execute(ActionMapping mapping,
                                     ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response) throws Exception {
        CadastraFichaForm formulario = (CadastraFichaForm) form;
        
        Ficha ficha1 = new Ficha();
        Exercicio exercicio1 = new Exercicio();
        
        ficha1.setTipo(formulario.getTipo());
        ficha1.setRepeticao(formulario.getRepeticao());
        exercicio1.setExercicio(formulario.getExercicio());
        
        IDAO dao = new HDAO();
        
        if(dao.inserir(exercicio1))
        { return mapping.findForward("Success");}
        else
        { return mapping.findForward("Error");
        }
            
        }
        
        
}
