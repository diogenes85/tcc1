/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import java.util.List;

/**
 *
 * @author Prof. Leandro Vaguetti
 */
public interface IDAO {
 public boolean inserir(Object obj);
 public boolean apagar(Object obj);
 public boolean alterar(Object obj);
 public List buscarTodos(Object obj);
   //      buscar("nome",formulario.getNome(), true, new Pessoa())
 public List buscar(String filtro, Object value, boolean ifvalueString ,Object obj);
 public Object buscar(Object obj, int id);
 public Object validate(Object obj);
}
