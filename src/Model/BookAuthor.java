/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "BooksAuthors")
public class BookAuthor implements Serializable{
   
    @JoinColumn(name="Seq_No")
    private Integer seq_No;
    
    @Id
    @GeneratedValue
    @ManyToOne
    @JoinColumn(name="ISBN")
    private Books livro;    
        
    @Id
    @GeneratedValue
    @ManyToOne
    @JoinColumn(name="ISBN")
    private Authors autor;
    
    public BookAuthor() {
    }

    public Integer getSeq_No() {
        return seq_No;
    }

    public void setSeq_No(Integer seq_No) {
        this.seq_No = seq_No;
    }

     
}
