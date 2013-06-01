/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actions;

import controller.forms.CadastraPessoaForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.HDAO;
import model.dao.IDAO;
import model.persistense.Pessoa;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Kevim
 */
public class CadastraPessoaAction extends Action {

    @Override
    public ActionForward execute (ActionMapping mapping,
                                    ActionForm form,
                                    HttpServletRequest request,
                                    HttpServletResponse response) throws Exception {
        boolean errosenha = false;
        CadastraPessoaForm formulario = (CadastraPessoaForm) form;
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(formulario.getNome());
        pessoa.setEmail(formulario.getEmail());
        pessoa.setDataNasc(formulario.getDataNasc());
        pessoa.setSenha(formulario.getSenha());
        
        IDAO dao = new HDAO();
        if(dao.inserir(pessoa))
        { return mapping.findForward("success");}
        else
        { return mapping.findForward("error");
        }

        
    }
}
