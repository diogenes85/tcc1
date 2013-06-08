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
import model.util.TipoExercicios;
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

        Ficha ficha = new Ficha();

        if (formulario.getTipo().equals("Supino")) {
            ficha.setTipo(TipoExercicios.Supino);
        }
        if (formulario.getTipo().equals("Rosca")) {
            ficha.setTipo(TipoExercicios.Rosca);
        }
        if (formulario.getTipo().equals("Triceps")) {
            ficha.setTipo(TipoExercicios.Triceps);
        }
        if (formulario.getTipo().equals("Abdominal")) {
            ficha.setTipo(TipoExercicios.Abdominal);
        }

        ficha.setRepeticao(formulario.getRepeticao());
        ficha.setAparelho(formulario.getAparelho());

        IDAO dao = new HDAO();
        if (dao.inserir(ficha))
        {return mapping.findForward("success");}
        else
        { return mapping.findForward("error");
    }
        
    }
}

