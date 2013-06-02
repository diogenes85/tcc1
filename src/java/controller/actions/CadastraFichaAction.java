/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actions;

import controller.forms.CadastraFichaForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Kevim
 */
public class CadastraFichaAction {
    
    @Override
    public ActionForward execute(ActionMapping mapping,
                                     ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response) throws Exception {
        boolean senhaincorreta = false;
        CadastraFichaForm formulario = (CadastraFichaForm) form;
        
        
        
}
