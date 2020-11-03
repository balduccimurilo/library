/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Publishers ;
import dao.DaoEditora;
import java.util.List;
import org.hibernate.HibernateException;

public class CtrManterPublisher {
    DaoEditora  acessoHibernateEditora;

    public CtrManterPublisher() {
        acessoHibernateEditora = new DaoEditora();
    }
     public int gravarEditora(Publishers editora) {
        try{
            acessoHibernateEditora.gravar(editora);
            return 1;
        }catch (HibernateException e){
            e.printStackTrace();
            return 2;
        }         
    }
    public List carregarEditora() {
        try{
            return acessoHibernateEditora.carregarTudoOrdenado(Publishers.class, "name");
        }catch (HibernateException e){
            return null;
        }
    }
    public boolean excluirEditora (Publishers editora){
        try{
            acessoHibernateEditora.excluir(editora);
            return true;
        }catch(HibernateException e){
            e.printStackTrace();
            return false;
        }        
    }
    public boolean alterarEditora(Publishers editora){
        try {
            acessoHibernateEditora.alterar(editora);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}