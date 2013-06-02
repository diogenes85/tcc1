/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actions;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import model.util.ListaTipoExercicios;

/**
 *
 * @author Kevim
 */
public class ListaTipoExercicioAction extends Action{

    @Override
    public ActionForward execute(ActionMapping mapping,
                                     ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response) throws Exception {

         List tipoexercicios = ListaTipoExercicios.getListar();
         
         if(!tipoexercicios.isEmpty())
         {
             request.getSession().setAttribute("tipos", tipoexercicios);
             return mapping.findForward("sucesso");
         }
         else
         {
             return mapping.findForward("error");
         }
    }        
}
