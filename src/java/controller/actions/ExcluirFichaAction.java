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
import model.persistense.Ficha;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Kevim
 */
public class ExcluirFichaAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
     CadastraFichaForm formulario = (CadastraFichaForm) form;
     
     Ficha ficha = new Ficha();
     ficha.setIdFicha(formulario.getIdFicha());
     
     IDAO dao = new HDAO();
     if(dao.apagar(ficha))
     {
         return mapping.findForward("sucesso");
     }   
     else
     {
         return mapping.findForward("erro");
     }
    }
    }
