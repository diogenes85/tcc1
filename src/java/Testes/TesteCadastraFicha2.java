/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.dao.HDAO;
import model.dao.IDAO;
import model.persistense.Cliente;
import model.persistense.Ficha;
import model.persistense.Pessoa;

/**
 *
 * @author Kevim
 */
public class TesteCadastraFicha2 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Diogo Monte Reis");
        pessoa.setEmail("diogomrx@hotmail.com");
        pessoa.setDataNasc(new Date());

        Cliente cliente = new Cliente(pessoa);
        cliente.setAltura(100);
        cliente.setPersonal("Franco");

        List<Ficha> fichas = new ArrayList<Ficha>();

        Ficha ficha = new Ficha();
   //     ficha.setTipo("Aerobica");
        ficha.setAparelho("Musculação");
        ficha.setRepeticao(10);

        fichas.add(ficha);

        cliente.setFichas(fichas);

        System.out.println("-------------Dados Cliente-----------");
        System.out.println("Nome:" + cliente.getPessoa().getNome());
        System.out.println("Email:" + cliente.getPessoa().getEmail());
        System.out.println("Data Cadastro:" + cliente.getPessoa().getDataNasc());
        System.out.println("Personal:" + cliente.getPersonal());
        System.out.println("----------------Fichas---------------");
        for (int i = 0; i < cliente.getFichas().size(); i++) {
            System.out.println("Tipo:" + cliente.getFichas().get(i).getTipo());
  //          System.out.println("Exercicio:" + cliente.getFichas().get(i).getExercicio());
        }
        System.out.println("-------------------------------------");

        
        IDAO dao = new HDAO();

        if (dao.inserir(pessoa)) {
            if (dao.inserir(cliente)) {
                
                ficha.setCliente((Cliente)dao.validate(cliente));
                  System.out.println("OK");
                if (dao.inserir(ficha)) {
                System.out.println("OK");
            }}
            System.out.println("Gravou");
        } else {
            System.out.println("Não Gravou");

        }

    }
}