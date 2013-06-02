/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Kevim
 */
public class ListaTipoExercicios {
    
    public static List getListar()
    {
    List tipoexercicio = new ArrayList();
    tipoexercicio.addAll(Arrays.asList(TipoExercicios.values()));
    return tipoexercicio;
    }
    
    
}
