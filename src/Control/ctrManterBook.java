/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Books;
import dao.DaoLivros;
import java.util.List;
import org.hibernate.HibernateException;


public class ctrManterBook {
       DaoLivros  acessoHibernateLivros;

    public ctrManterBook() {
        acessoHibernateLivros = new DaoLivros();
    }
     public int gravarLivros(Books livros ) {
        try{
            acessoHibernateLivros.gravar(livros);
            return 1;
        }catch (HibernateException e){
            e.printStackTrace();
            return 2;
        }         
    }
    public List carregarLivros() {
        try{
            return acessoHibernateLivros.carregarTudoOrdenado(Books.class, "name");
        }catch (HibernateException e){
            return null;
        }
    }
    public boolean excluirLivros (Books livros){
        try{
            acessoHibernateLivros.excluir(livros);
            return true;
        }catch(HibernateException e){
            e.printStackTrace();
            return false;
        }        
    }
    public boolean alterarEditora(Books livros){
        try {
            acessoHibernateLivros.alterar(livros);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    } 
}
