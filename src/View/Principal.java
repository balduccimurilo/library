/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.CtrManterAuthors;
import Control.CtrManterPublisher;
import Model.Authors;
import Model.Publishers;
import dao.HibernateConfiguracao;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dneDa
 */
public class Principal extends javax.swing.JFrame {


    private IncluirEditora telaEditora;
    private OpenAuthor telaAutor;
    private CtrManterAuthors ctrManterAuthors;
    private CtrManterPublisher ctrManterEditora;
    private Authors authors;
    private Publishers editora;
    private final Color fundoCinza = new Color(35,35,35);
    private final Color corBotoes = new Color(102,102,102);
    /**
     * Creates new form Principal
     */
    
    
    

    public Principal() {
        ctrManterEditora = new CtrManterPublisher();
        ctrManterAuthors= new CtrManterAuthors();
        
        HibernateConfiguracao configuracao = new HibernateConfiguracao();
        configuracao.criaSessionFactory();
        initComponents();
        
        
        List<Authors> listaAuthors = new ArrayList();
        listaAuthors=ctrManterAuthors.carregarAuthors();
        
        List<Publishers> listaEditora = new ArrayList();
        listaEditora=ctrManterEditora.carregarEditora();
        
        this.popularTabelaEditoras(listaEditora);
        this.popularTabelaAutores(listaAuthors);
    }

    private void popularTabelaEditoras(List<Publishers> pListaDeEditora){
        DefaultTableModel modeloEditora = new DefaultTableModel(new Object[] {
            "Nome","Url", "Id" }, 0) {
            public boolean isCellEditable(int rowIndex, int mColIndex){  
            return false;  
            }
        };        
        jTableEditora.setModel(modeloEditora);
        

        for(Publishers editora: pListaDeEditora){
            modeloEditora.addRow(
                new Object[]{
                    editora.getName(),
                    editora.getUrl(),
                    editora.getPublisher_id()
                }
            );
        }
    }    
    
    
    private void popularTabelaAutores(List<Authors> pListaDeAuthors){
        DefaultTableModel modeloAuthors = new DefaultTableModel(new Object[] {
            "Nome", "Sobrenome", "Id" }, 0) {
            public boolean isCellEditable(int rowIndex, int mColIndex){  
            return false;  
            }
        };        
        jTableAutores.setModel(modeloAuthors);
        

        for(Authors authors: pListaDeAuthors){
            modeloAuthors.addRow(
                new Object[]{
                    authors.getName(),
                    authors.getFname(),
                    authors.getAuthor_id()
                }
            );
        }
    }
    private void popularTabelaEditoraComBusca(List<Publishers> pListaDeEditora){
        String nome=jTextFieldNomeEditora.getText();
        String url=jTextFieldUrlEditora.getText();
        
        DefaultTableModel modeloEditora = new DefaultTableModel(new Object[] {
            "Nome", "Url", "Id" }, 0) {
            public boolean isCellEditable(int rowIndex, int mColIndex){  
            return false;  
            }
        };        
        jTableEditora.setModel(modeloEditora);
        

        for(Publishers editora: pListaDeEditora){
            if(editora.getName().toUpperCase().contains(nome.toUpperCase())){
                if(editora.getUrl().toUpperCase().contains(url.toUpperCase())){
                    modeloEditora.addRow(
                        new Object[]{
                            editora.getName(),
                            editora.getUrl(),
                            editora.getPublisher_id()
                        }
                    );                    
                }                
            }

        }
    }    
    private void popularTabelaAutoresComBusca(List<Authors> pListaDeAuthors){
        DefaultTableModel modeloAuthors = new DefaultTableModel(new Object[] {
            "Nome", "Sobrenome", "Id" }, 0) {
            public boolean isCellEditable(int rowIndex, int mColIndex){  
            return false;  
            }
        };        
        jTableAutores.setModel(modeloAuthors);
        

        for(Authors authors: pListaDeAuthors){
            if(authors.getName().toUpperCase().contains(jTextFieldAuthorsName.getText().toUpperCase())){
                if(authors.getFname().toUpperCase().contains(jTextFieldAuthorsFname.getText().toUpperCase())){
                    modeloAuthors.addRow(
                        new Object[]{
                            authors.getName(),
                            authors.getFname(),
                            authors.getAuthor_id()
                        }
                    );                    
                }
                
            }

        }
    }
    public void AdicionarAutor(Authors authors){
        this.authors=authors;
        
        this.jTextFielAddAutor.setText(authors.getName()+" "+authors.getFname());

    }
    public void AdicionarEditora(Publishers editora){
        this.editora=editora;
        
        this.jTextFieldAddEditora.setText(editora.getName());

    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jPanelMenuLivro = new javax.swing.JPanel();
        jPanelMenuAutor = new javax.swing.JPanel();
        jPanelMenuEditora = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelGerLivros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAddEditora = new javax.swing.JTextField();
        jTextFieldTituloLivro = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextFielAddAutor = new javax.swing.JTextField();
        jButtonbuscarLivro = new javax.swing.JButton();
        jButtonIncluirLivro = new javax.swing.JButton();
        jButtonEditarLivro = new javax.swing.JButton();
        jButtonExclluirLivro = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanelGerEditora = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEditora = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNomeEditora = new javax.swing.JTextField();
        jTextFieldUrlEditora = new javax.swing.JTextField();
        jButtonBuscarPublishers = new javax.swing.JButton();
        jButtonIncluirEditora = new javax.swing.JButton();
        jButtonEditarPublishers = new javax.swing.JButton();
        jButtonExcluirPublishers = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanelGerAutores = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAutores = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldAuthorsName = new javax.swing.JTextField();
        jButtonBuscarAuthors = new javax.swing.JButton();
        jButtonIncluirAuthors = new javax.swing.JButton();
        jButtonEditarAuthors = new javax.swing.JButton();
        jButtonExcluirAuthors = new javax.swing.JButton();
        jTextFieldAuthorsFname = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIVRARIA AMAZONIA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(102, 102, 102));

        jPanelMenuLivro.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenuLivro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanelMenuLivroLayout = new javax.swing.GroupLayout(jPanelMenuLivro);
        jPanelMenuLivro.setLayout(jPanelMenuLivroLayout);
        jPanelMenuLivroLayout.setHorizontalGroup(
            jPanelMenuLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelMenuLivroLayout.setVerticalGroup(
            jPanelMenuLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanelMenuAutor.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenuAutor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanelMenuAutorLayout = new javax.swing.GroupLayout(jPanelMenuAutor);
        jPanelMenuAutor.setLayout(jPanelMenuAutorLayout);
        jPanelMenuAutorLayout.setHorizontalGroup(
            jPanelMenuAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelMenuAutorLayout.setVerticalGroup(
            jPanelMenuAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanelMenuEditora.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenuEditora.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GERENCIAR AUTORES");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuEditoraLayout = new javax.swing.GroupLayout(jPanelMenuEditora);
        jPanelMenuEditora.setLayout(jPanelMenuEditoraLayout);
        jPanelMenuEditoraLayout.setHorizontalGroup(
            jPanelMenuEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuEditoraLayout.setVerticalGroup(
            jPanelMenuEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/bookshelf.png"))); // NOI18N
        jLabel12.setText("LIVRARIA AMAZONIA");

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GERENCIAR EDITORAS");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GERENCIAR LIVROS");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMenuAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanelMenuLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanelMenuAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanelMenuEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Isbn", "Autor", "Editora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel4.setText("Editora:");

        jLabel5.setText("Titulo:");

        jLabel6.setText("Isbn:");

        jLabel7.setText("Autor:");

        jTextFieldAddEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldAddEditoraMouseClicked(evt);
            }
        });
        jTextFieldAddEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddEditoraActionPerformed(evt);
            }
        });

        jTextFielAddAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFielAddAutorMouseClicked(evt);
            }
        });

        jButtonbuscarLivro.setText("Buscar");

        jButtonIncluirLivro.setText("Incluir");
        jButtonIncluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirLivroActionPerformed(evt);
            }
        });

        jButtonEditarLivro.setText("Editar");
        jButtonEditarLivro.setEnabled(false);

        jButtonExclluirLivro.setText("Excluir");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("GERENCIAR LIVROS");

        jLabel11.setText("Seq. N:");

        javax.swing.GroupLayout jPanelGerLivrosLayout = new javax.swing.GroupLayout(jPanelGerLivros);
        jPanelGerLivros.setLayout(jPanelGerLivrosLayout);
        jPanelGerLivrosLayout.setHorizontalGroup(
            jPanelGerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGerLivrosLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanelGerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelGerLivrosLayout.createSequentialGroup()
                        .addGroup(jPanelGerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelGerLivrosLayout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFielAddAutor)
                            .addComponent(jTextFieldAddEditora)))
                    .addGroup(jPanelGerLivrosLayout.createSequentialGroup()
                        .addComponent(jButtonbuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(jButtonIncluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExclluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGerLivrosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelGerLivrosLayout.setVerticalGroup(
            jPanelGerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGerLivrosLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelGerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonbuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIncluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExclluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanelGerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFielAddAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelGerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanelGerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldAddEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanelGerLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 0, 820, 540));

        jTableEditora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Id", "Url"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEditoraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEditora);
        if (jTableEditora.getColumnModel().getColumnCount() > 0) {
            jTableEditora.getColumnModel().getColumn(0).setResizable(false);
            jTableEditora.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel9.setText("Nome:");

        jLabel10.setText("Url");

        jButtonBuscarPublishers.setText("Buscar");
        jButtonBuscarPublishers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPublishersActionPerformed(evt);
            }
        });

        jButtonIncluirEditora.setText("Incluir");
        jButtonIncluirEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirEditoraActionPerformed(evt);
            }
        });

        jButtonEditarPublishers.setText("Editar");
        jButtonEditarPublishers.setEnabled(false);
        jButtonEditarPublishers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarPublishersActionPerformed(evt);
            }
        });

        jButtonExcluirPublishers.setText("Excluir");
        jButtonExcluirPublishers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirPublishersActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("GERENCIAR EDITORAS");

        javax.swing.GroupLayout jPanelGerEditoraLayout = new javax.swing.GroupLayout(jPanelGerEditora);
        jPanelGerEditora.setLayout(jPanelGerEditoraLayout);
        jPanelGerEditoraLayout.setHorizontalGroup(
            jPanelGerEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGerEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGerEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGerEditoraLayout.createSequentialGroup()
                        .addGroup(jPanelGerEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGerEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNomeEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(jTextFieldUrlEditora))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGerEditoraLayout.createSequentialGroup()
                        .addComponent(jButtonBuscarPublishers, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addComponent(jButtonIncluirEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditarPublishers, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluirPublishers, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelGerEditoraLayout.setVerticalGroup(
            jPanelGerEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGerEditoraLayout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelGerEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscarPublishers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIncluirEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarPublishers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirPublishers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanelGerEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelGerEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldUrlEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanelGerEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 0, 820, 540));

        jTableAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAutoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableAutores);
        if (jTableAutores.getColumnModel().getColumnCount() > 0) {
            jTableAutores.getColumnModel().getColumn(0).setResizable(false);
            jTableAutores.getColumnModel().getColumn(1).setResizable(false);
            jTableAutores.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel13.setText("Nome:");

        jLabel15.setText("Sobrenome:");

        jButtonBuscarAuthors.setText("Buscar");
        jButtonBuscarAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAuthorsActionPerformed(evt);
            }
        });

        jButtonIncluirAuthors.setText("Incluir");
        jButtonIncluirAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirAuthorsActionPerformed(evt);
            }
        });

        jButtonEditarAuthors.setText("Editar");
        jButtonEditarAuthors.setEnabled(false);
        jButtonEditarAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarAuthorsActionPerformed(evt);
            }
        });

        jButtonExcluirAuthors.setText("Excluir");
        jButtonExcluirAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirAuthorsActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("GERENCIAR AUTORES");

        javax.swing.GroupLayout jPanelGerAutoresLayout = new javax.swing.GroupLayout(jPanelGerAutores);
        jPanelGerAutores.setLayout(jPanelGerAutoresLayout);
        jPanelGerAutoresLayout.setHorizontalGroup(
            jPanelGerAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGerAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGerAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanelGerAutoresLayout.createSequentialGroup()
                        .addComponent(jButtonBuscarAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addComponent(jButtonIncluirAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditarAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluirAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGerAutoresLayout.createSequentialGroup()
                        .addGroup(jPanelGerAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGerAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAuthorsFname, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(jTextFieldAuthorsName))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelGerAutoresLayout.setVerticalGroup(
            jPanelGerAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGerAutoresLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelGerAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscarAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIncluirAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanelGerAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldAuthorsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelGerAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldAuthorsFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanelGerAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 0, 820, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
 
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButtonIncluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirLivroActionPerformed
        System.out.println(" autor classe"+this.authors.getAuthor_id());   
    }//GEN-LAST:event_jButtonIncluirLivroActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       jPanelMenuLivro.setBackground(fundoCinza);
        jPanelMenuAutor.setBackground(corBotoes);
        jPanelMenuEditora.setBackground(corBotoes);
        
        jPanelGerLivros.setVisible(true);
        jPanelGerEditora.setVisible(false);
        jPanelGerAutores.setVisible(false);

        
        jTextFieldAddEditora.setEditable(false);
        jTextFielAddAutor.setEditable(false);
        
      // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButtonExcluirAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirAuthorsActionPerformed
        DefaultTableModel modeloTabelaAuthors = (DefaultTableModel) this.jTableAutores.getModel();
        int linha = this.jTableAutores.getSelectedRow();
        int idauthors = Integer.parseInt(String.valueOf(modeloTabelaAuthors.getValueAt(linha, 2)));

        authors = new Authors();
        authors.setAuthor_id(idauthors);

        boolean resultado = ctrManterAuthors.excluirAuthors(authors);
        if(resultado == true){
            modeloTabelaAuthors.removeRow(linha);
            JOptionPane.showMessageDialog(this, "Autor removido");
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir autor");
        }
    }//GEN-LAST:event_jButtonExcluirAuthorsActionPerformed

    private void jButtonEditarAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarAuthorsActionPerformed
        authors= new Authors();

        DefaultTableModel modeloTabelaAuthors = (DefaultTableModel) this.jTableAutores.getModel();
        int linha = this.jTableAutores.getSelectedRow();

        authors.setAuthor_id(Integer.parseInt(String.valueOf(modeloTabelaAuthors.getValueAt(linha, 2))));
        authors.setName(jTextFieldAuthorsName.getText());
        authors.setFname(jTextFieldAuthorsFname.getText());
             
        boolean resultado = ctrManterAuthors.alterarauthors(authors);
        if(resultado == true){

            JOptionPane.showMessageDialog(this, "Autor Alterado");
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao alterar autor");
        }
        
        List<Authors> ListaDeAutores = ctrManterAuthors.carregarAuthors();
        popularTabelaAutores(ListaDeAutores);

    }//GEN-LAST:event_jButtonEditarAuthorsActionPerformed

    private void jButtonIncluirAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirAuthorsActionPerformed
        authors = new Authors();
        
        authors.setName(jTextFieldAuthorsName.getText());
        authors.setFname(jTextFieldAuthorsFname.getText());
        
        if(ctrManterAuthors.gravarAuthors(authors)==1){
            JOptionPane.showMessageDialog(null,"Autor incluido");
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao incluir Autor");
        }
        List<Authors> listaAuthors = new ArrayList();
        listaAuthors=ctrManterAuthors.carregarAuthors();
        
        this.popularTabelaAutores(listaAuthors);
    }//GEN-LAST:event_jButtonIncluirAuthorsActionPerformed

    private void jTableAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAutoresMouseClicked

        DefaultTableModel modeloTabelaAuthors = (DefaultTableModel) this.jTableAutores.getModel();
        int linha = this.jTableAutores.getSelectedRow();


        jTextFieldAuthorsName.setText(String.valueOf(modeloTabelaAuthors.getValueAt(linha, 0)));
        jTextFieldAuthorsFname.setText(String.valueOf(modeloTabelaAuthors.getValueAt(linha, 1)));
        jButtonEditarAuthors.setEnabled(true);

    }//GEN-LAST:event_jTableAutoresMouseClicked

    private void jButtonIncluirEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirEditoraActionPerformed
        editora = new Publishers();
        
        editora.setName(jTextFieldNomeEditora.getText());
        editora.setUrl(jTextFieldUrlEditora.getText());
        
        if(ctrManterEditora.gravarEditora(editora)==1){
            JOptionPane.showMessageDialog(null, "Editora incuida");
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao incuir editora");
        }
        
        

        List<Publishers> listaEditoras = new ArrayList();
        
        listaEditoras=ctrManterEditora.carregarEditora();
        
        this.popularTabelaEditoras(listaEditoras);
        
    }//GEN-LAST:event_jButtonIncluirEditoraActionPerformed

    private void jButtonBuscarAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAuthorsActionPerformed
        List<Authors> listaAuthors = new ArrayList();
        listaAuthors=ctrManterAuthors.carregarAuthors();
        popularTabelaAutoresComBusca(listaAuthors);
    }//GEN-LAST:event_jButtonBuscarAuthorsActionPerformed

    private void jTableEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEditoraMouseClicked

        DefaultTableModel modeloTabelaEditora = (DefaultTableModel) this.jTableEditora.getModel();
        int linha = this.jTableEditora.getSelectedRow();


        jTextFieldNomeEditora.setText(String.valueOf(modeloTabelaEditora.getValueAt(linha, 0)));
        jTextFieldUrlEditora.setText(String.valueOf(modeloTabelaEditora.getValueAt(linha, 1)));
        
        jButtonEditarPublishers.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableEditoraMouseClicked

    private void jButtonEditarPublishersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarPublishersActionPerformed
        editora = new Publishers();

        DefaultTableModel modeloTabelaEditora = (DefaultTableModel) this.jTableEditora.getModel();
        int linha = this.jTableEditora.getSelectedRow();

        editora.setPublisher_id(Integer.parseInt(String.valueOf(modeloTabelaEditora.getValueAt(linha, 2))));
        editora.setName(jTextFieldNomeEditora.getText());
        editora.setUrl(jTextFieldUrlEditora.getText());
             
        boolean resultado = ctrManterEditora.alterarEditora(editora);
        if(resultado == true){

            JOptionPane.showMessageDialog(this, "Editora Alterada");
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao alterar autor");
        }
        
        List<Publishers> ListaDeEditoras = ctrManterEditora.carregarEditora();
        popularTabelaEditoras(ListaDeEditoras);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarPublishersActionPerformed

    private void jButtonExcluirPublishersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirPublishersActionPerformed
        DefaultTableModel modeloTabelaEditora = (DefaultTableModel) this.jTableEditora.getModel();
        int linha = this.jTableEditora.getSelectedRow();
        int idEditora = Integer.parseInt(String.valueOf(modeloTabelaEditora.getValueAt(linha, 2)));

        editora = new Publishers();
        editora.setPublisher_id(idEditora);

        boolean resultado = ctrManterEditora.excluirEditora(editora);
        if(resultado == true){
            modeloTabelaEditora.removeRow(linha);
            JOptionPane.showMessageDialog(this, "Editora removida");
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir editora");
        }      
    }//GEN-LAST:event_jButtonExcluirPublishersActionPerformed

    private void jButtonBuscarPublishersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPublishersActionPerformed
        List<Publishers> listaEditoras = new ArrayList();
        listaEditoras=ctrManterEditora.carregarEditora();
        popularTabelaEditoraComBusca(listaEditoras); 
    }//GEN-LAST:event_jButtonBuscarPublishersActionPerformed

    private void jTextFieldAddEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddEditoraActionPerformed

    private void jTextFielAddAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFielAddAutorMouseClicked
        telaAutor = new OpenAuthor();
        telaAutor.setDefaultCloseOperation(HIDE_ON_CLOSE );
        telaAutor.setVisible(true);
        telaAutor.setLocationRelativeTo(this);
        telaAutor.telaPrincipal(this);
        
                
    }//GEN-LAST:event_jTextFielAddAutorMouseClicked

    private void jTextFieldAddEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAddEditoraMouseClicked
        telaEditora = new IncluirEditora();
        telaEditora.setDefaultCloseOperation(HIDE_ON_CLOSE );
        telaEditora.setVisible(true);
        telaEditora.setLocationRelativeTo(this);
        telaEditora.telaPrincipal(this);
        
    }//GEN-LAST:event_jTextFieldAddEditoraMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jPanelMenuLivro.setBackground(corBotoes);
        jPanelMenuAutor.setBackground(corBotoes);
        jPanelMenuEditora.setBackground(fundoCinza);

        jPanelGerLivros.setVisible(false);
        jPanelGerEditora.setVisible(false);
        jPanelGerAutores.setVisible(true);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jPanelMenuLivro.setBackground(corBotoes);
        jPanelMenuAutor.setBackground(fundoCinza);
        jPanelMenuEditora.setBackground(corBotoes);

        jPanelGerLivros.setVisible(false);
        jPanelGerEditora.setVisible(true);
        jPanelGerAutores.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jPanelMenuLivro.setBackground(fundoCinza);
        jPanelMenuAutor.setBackground(corBotoes);
        jPanelMenuEditora.setBackground(corBotoes);

        jPanelGerLivros.setVisible(true);
        jPanelGerEditora.setVisible(false);
        jPanelGerAutores.setVisible(false);

    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarAuthors;
    private javax.swing.JButton jButtonBuscarPublishers;
    private javax.swing.JButton jButtonEditarAuthors;
    private javax.swing.JButton jButtonEditarLivro;
    private javax.swing.JButton jButtonEditarPublishers;
    private javax.swing.JButton jButtonExclluirLivro;
    private javax.swing.JButton jButtonExcluirAuthors;
    private javax.swing.JButton jButtonExcluirPublishers;
    private javax.swing.JButton jButtonIncluirAuthors;
    private javax.swing.JButton jButtonIncluirEditora;
    private javax.swing.JButton jButtonIncluirLivro;
    private javax.swing.JButton jButtonbuscarLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelGerAutores;
    private javax.swing.JPanel jPanelGerEditora;
    private javax.swing.JPanel jPanelGerLivros;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelMenuAutor;
    private javax.swing.JPanel jPanelMenuEditora;
    private javax.swing.JPanel jPanelMenuLivro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableAutores;
    private javax.swing.JTable jTableEditora;
    private javax.swing.JTextField jTextFielAddAutor;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldAddEditora;
    private javax.swing.JTextField jTextFieldAuthorsFname;
    private javax.swing.JTextField jTextFieldAuthorsName;
    private javax.swing.JTextField jTextFieldNomeEditora;
    private javax.swing.JTextField jTextFieldTituloLivro;
    private javax.swing.JTextField jTextFieldUrlEditora;
    // End of variables declaration//GEN-END:variables
}
