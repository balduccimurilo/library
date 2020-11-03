/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Authors;
import dao.DaoAuthors;
import java.util.List;
import org.hibernate.HibernateException;

public class CtrManterAuthors {
    DaoAuthors acessohibernateauthors;

    public CtrManterAuthors() {
        acessohibernateauthors = new DaoAuthors();
    }
     public int gravarAuthors(Authors authors) {
        try{
            acessohibernateauthors.gravar(authors);
            return 1;
        }catch (HibernateException e){
            e.printStackTrace();
            return 2;
        }         
    }
    public List carregarAuthors() {
        try{
            return acessohibernateauthors.carregarTudoOrdenado(Authors.class, "name");
        }catch (HibernateException e){
            return null;
        }
    }
    public boolean excluirAuthors (Authors authors){
        try{
            acessohibernateauthors.excluir(authors);
            return true;
        }catch(HibernateException e){
            e.printStackTrace();
            return false;
        }        
    }
    public boolean alterarauthors(Authors authors){
        try {
            acessohibernateauthors.alterar(authors);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
