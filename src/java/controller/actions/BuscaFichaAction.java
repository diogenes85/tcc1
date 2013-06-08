/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actions;

import controller.forms.BuscaFichaForm;
import controller.forms.CadastraFichaForm;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.HDAO;
import model.dao.IDAO;
import model.persistense.Ficha;
import model.util.ListaTipoExercicios;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Kevim
 */
public class BuscaFichaAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        CadastraFichaForm formulario = (CadastraFichaForm) form;

        IDAO dao = new HDAO();
        Ficha ficha = new Ficha();
        ficha = (Ficha ) dao.buscar(ficha ,formulario.getIdFicha ());
        List tipoexercicio = (List) ListaTipoExercicios.getListar();

        if(ficha != null)
        {
           
            
         request.getSession().setAttribute("tipos", tipoexercicio);
           
         request.getSession().setAttribute("funcion", ficha);
         return mapping.findForward("sucesso");
        }else
        {
         return mapping.findForward("error");
        }

      }}