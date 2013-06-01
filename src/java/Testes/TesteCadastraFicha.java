/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import model.dao.HDAO;
import model.dao.IDAO;
import model.persistense.Ficha;

/**
 *
 * @author Kevim
 */
public class TesteCadastraFicha {
    
        public static void main(String[] args)
    {
    
        Ficha ficha = new Ficha();
        ficha.setTipo("Musculacao");
        ficha.setRepeticao(3);
        ficha.setExercicio("Barra Peitoral");
        
        IDAO dao = new HDAO();
        
        if(dao.inserir(ficha))
            System.out.println("Gravou");
        else
            System.out.println("Não Gravou");

    } 
    
}
