/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevim
 */


import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.cfg.AnnotationConfiguration;

public class GeraTabelas {
public static void main(String[] args) {
// Cria uma configuração para a classe Produto
 AnnotationConfiguration cfg = new AnnotationConfiguration();

 cfg.addAnnotatedClass(model.persistense.Pessoa.class);
 cfg.addAnnotatedClass(model.persistense.Ficha.class);
 cfg.addAnnotatedClass(model.persistense.Cliente.class);

 new SchemaExport(cfg).create(true, true);

}
}