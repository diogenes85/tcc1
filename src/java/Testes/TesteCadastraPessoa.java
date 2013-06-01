/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;
import java.util.Date;
import model.dao.HDAO;
import model.dao.IDAO;
import model.persistense.Pessoa;

/**
 *
 * @author Kevim
 */
public class TesteCadastraPessoa {
    
    public static void main(String[] args)
    {
    
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lucas");
        pessoa.setEmail("lucas@uol.com.br");
        pessoa.setDataNasc(new Date());
        pessoa.setSenha(123);
        
        IDAO dao = new HDAO();
        
        if(dao.inserir(pessoa))
            System.out.println("Gravou");
        else
            System.out.println("Não Gravou");

    } 
}
