/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actions;

import java.util.ArrayList;
import java.util.List;
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
 * @author Tipografia
 */
public class ListaFichasAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        List<Ficha> listafichas = new ArrayList<Ficha>();
        IDAO dao = new HDAO();
        
        listafichas = (List<Ficha>) dao.buscarTodos(new Ficha());
        if(!listafichas.isEmpty())
        {
            request.setAttribute("fichas", listafichas);
            return mapping.findForward("lista");
        }
        else
        {
            return mapping.findForward("error");
        }
    
    
    }
}
