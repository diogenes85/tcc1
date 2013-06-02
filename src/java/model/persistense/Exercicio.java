/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persistense;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Kevim
 */
@Entity
public class Exercicio extends Ficha{
    
    @Id
    @GeneratedValue
    private int idExercicio;
    
    
    
    
    
}
