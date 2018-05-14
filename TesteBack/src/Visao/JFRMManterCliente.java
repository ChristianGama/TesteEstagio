package Visao;

import RegraNegocio.ClienteRN;
import ValorObjeto.ClienteVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Gama
 */
public class JFRMManterCliente extends JFRMTemplateManter {

    private static JFRMManterCliente INSTANCIA = null;
    
    ClienteVO clienteVO = null;
    private List<ClienteVO> clientes = new ArrayList();
    
    
    public static JFRMManterCliente getJFRMManterCliente() {
        
        if(INSTANCIA == null)
            INSTANCIA = new JFRMManterCliente();
        
        return INSTANCIA;
    }
            
    /**
     * Creates new form jFRMManterCliente
     */
    public JFRMManterCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        iniciarComponentes();  
        bloquearComponentes();
        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPNL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFTNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFTCPF_CNPJ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFTSaldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCBXAtivo = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBClientesFiltro = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBTNCalcular = new javax.swing.JButton();
        jLBLMedia = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel8.setText("CPF/CNPJ");

        jTFTCPF_CNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTCPF_CNPJActionPerformed(evt);
            }
        });

        jLabel3.setText("Saldo");

        jLabel7.setText("Está Ativo?");

        jCBXAtivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));

        jTBClientesFiltro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTBClientesFiltro);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Média");

        jBTNCalcular.setText("Calcular");
        jBTNCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNCalcularActionPerformed(evt);
            }
        });

        jLBLMedia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLBLMedia.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Clientes com id entre 1500 e 2700 que têm Saldo maior que 560");

        javax.swing.GroupLayout jPNLLayout = new javax.swing.GroupLayout(jPNL);
        jPNL.setLayout(jPNLLayout);
        jPNLLayout.setHorizontalGroup(
            jPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPNLLayout.createSequentialGroup()
                        .addGroup(jPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPNLLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTFTNome))
                            .addGroup(jPNLLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTFTCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTFTSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jCBXAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNLLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLBLMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTNCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(164, 164, 164))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(298, 298, 298))
            .addGroup(jPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNLLayout.createSequentialGroup()
                    .addContainerGap(155, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(107, 107, 107)))
        );
        jPNLLayout.setVerticalGroup(
            jPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jTFTCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jCBXAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jLBLMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTNCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPNLLayout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(jLabel4)
                    .addContainerGap(220, Short.MAX_VALUE)))
        );

        getContentPane().add(jPNL, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void jBTNBuscarActionPerformed(java.awt.event.ActionEvent evt) { 
        
        atualizarTabela();
        
//        
//        Iterator it = clientes.iterator();
//        
//        while(it.hasNext())
//        {
//           clienteVO = (ClienteVO) it.next();
//            System.out.println("ID: "+clienteVO.getId_customer()+" Nome: "+clienteVO.getNm_custumer()+" CPF/CNPJ: "+clienteVO.getCpf_cnpj()+" Ativo: "+clienteVO.isIs_active()+" Valor Total: "+clienteVO.getVl_total());
//        }
    }
    
    @Override
    protected void jBTCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        super.jBTCadastrarActionPerformed(evt);
        
        liberarComponentes();
    }                                            

    @Override
    protected void jBTConfirmarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        super.jBTConfirmarActionPerformed(evt);
        
        try {

            ClienteVO clienteVO = new ClienteVO();
            
            clienteVO.setNm_custumer(this.jTFTNome.getText());  
            clienteVO.setCpf_cnpj(this.jTFTCPF_CNPJ.getText());                  
            clienteVO.setVl_total(Float.parseFloat(this.jTFTSaldo.getText()));            
            if(String.valueOf(this.jCBXAtivo.getSelectedItem().toString()) == "Sim")
                clienteVO.setIs_active(true);
            else if (String.valueOf(this.jCBXAtivo.getSelectedItem().toString()) == "Não")
                clienteVO.setIs_active(false);
            
            ClienteRN clienteRN = new ClienteRN(clienteVO);
            
            if (clienteRN.cadastrar()) 
            { 
                System.out.println("Cliente Cadastrado com Sucesso!");
            }             
            else 
            {
                System.out.println("Erro ao Cadastrar Cliente!");
            }
                

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Cadastro Produto", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(JFRMManterCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparCampos();
        bloquearComponentes();
        atualizarTabela();

    }                                            

    @Override
    protected void jBTAlterarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        super.jBTAlterarActionPerformed(evt);
        
        int row = jTBBuscaRapida.getSelectedRow();
        clienteVO = (ClienteVO) clientes.get(row);
        

        this.jTFTCPF_CNPJ.setText(clienteVO.getCpf_cnpj());
        this.jTFTNome.setText(String.valueOf(clienteVO.getNm_custumer()));
        
        if(clienteVO.isIs_active())            
            this.jCBXAtivo.setSelectedIndex(0);
        else
            this.jCBXAtivo.setSelectedIndex(1);
        
        this.jTFTSaldo.setText(String.valueOf(clienteVO.getVl_total()));
        
        
        liberarComponentes();
    }                                          

    @Override
    protected void jBTSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        super.jBTSalvarActionPerformed(evt);
        
        bloquearComponentes();
        
        try {

            clienteVO.setNm_custumer(this.jTFTNome.getText());  
            clienteVO.setCpf_cnpj(this.jTFTCPF_CNPJ.getText());                  
            clienteVO.setVl_total(Float.parseFloat(this.jTFTSaldo.getText()));            
            if(this.jCBXAtivo.getSelectedItem().toString() == "Sim")
                clienteVO.setIs_active(true);
            else if (this.jCBXAtivo.getSelectedItem().toString() == "Não")
                clienteVO.setIs_active(false);
            
            ClienteRN clienteRN = new ClienteRN(clienteVO);
            
            if (clienteRN.alterar()) 
            { 
                System.out.println("Cliente Alterado com Sucesso!");
            }             
            else 
            {
                System.out.println("Erro ao Alterar Cliente!");
            }         
              

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Alteração Cliente", JOptionPane.ERROR_MESSAGE);
            System.out.println(nfe);
        } catch (Exception ex) {
            Logger.getLogger(JFRMManterCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparCampos();
        bloquearComponentes();
        atualizarTabela();

    }                                         

    @Override
    protected void jBTExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        super.jBTExcluirActionPerformed(evt);
        
        bloquearComponentes();
        
        try {

            int row = jTBBuscaRapida.getSelectedRow();   
            
            clienteVO = (ClienteVO) clientes.get(row);
            
            ClienteRN clienteRN = new ClienteRN(clienteVO);
            clienteRN.excluir();
            

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Alteração Cliente", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(JFRMManterCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
    @Override
    protected void jTBBuscaRapidaMouseClicked(java.awt.event.MouseEvent evt) {  
        super.jTBBuscaRapidaMouseClicked(evt);        
        
    }                                           

    @Override
    protected void jBTCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        super.jBTCancelarActionPerformed(evt);
        
        limparCampos();
        bloquearComponentes();   
    }     
    
    protected void jBTNBuscarKeyReleased(java.awt.event.KeyEvent evt) 
    {
        
        
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void jTFTCPF_CNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTCPF_CNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTCPF_CNPJActionPerformed

    private void jBTNCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNCalcularActionPerformed
        ClienteRN clienteRN = new ClienteRN(clienteVO);
        List<ClienteVO> clientes = new ArrayList();
        
        try {
            clientes = clienteRN.buscarCalculo();
        } catch (Exception ex) {
            Logger.getLogger(JFRMManterCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        popularTabelaCalculo(clientes);
    }//GEN-LAST:event_jBTNCalcularActionPerformed
  
        
    public void limparCampos()
    {
        jTFTNome.setText("");
        jTFTSaldo.setText("");
        jTFTCPF_CNPJ.setText("");
//        jTFTSenha.setText("");
//        jTFTTurno.setText("");

    }
    
    public void bloquearComponentes()
    {
        this.jTFTSaldo.setEnabled(false);
        this.jTFTCPF_CNPJ.setEnabled(false);
        this.jCBXAtivo.setEnabled(false);
        this.jTFTNome.setEnabled(false);
//        this.jTFTTurno.setEnabled(false);

    }
    
    public void liberarComponentes()
    {
        this.jTFTSaldo.setEnabled(true);
        this.jTFTCPF_CNPJ.setEnabled(true);
        this.jCBXAtivo.setEnabled(true);
        this.jTFTNome.setEnabled(true);
//        this.jTFTTurno.setEnabled(true);

    }
    
    private void popularTabela(List <ClienteVO> clientes) {
        
        DefaultTableModel dtmAlunos = (DefaultTableModel) this.jTBBuscaRapida.getModel();  
        dtmAlunos.setRowCount(0);
        
        for (ClienteVO clienteVO : clientes) {

            dtmAlunos.addRow(new Object[]{
                clienteVO.getId_customer(), clienteVO.getCpf_cnpj(), clienteVO.getNm_custumer(), clienteVO.isIs_active(), clienteVO.getVl_total()
            });  
        }      
    }
    
    public void atualizarTabela()
    {
        ClienteRN clienteRN = new ClienteRN();

        try {
            clientes = clienteRN.buscar("%");
            
        } catch (Exception ex) {
            Logger.getLogger(JFRMManterCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        popularTabela(clientes);
    }
    
    private void popularTabelaCalculo(List <ClienteVO> clientes) {
        
        float total = 0;
        
        DefaultTableModel dtmAlunos = (DefaultTableModel) this.jTBClientesFiltro.getModel();  
        dtmAlunos.setRowCount(0);
        
        for (ClienteVO clienteVO : clientes) {

            dtmAlunos.addRow(new Object[]{
                clienteVO.getId_customer(), clienteVO.getCpf_cnpj(), clienteVO.getNm_custumer(), clienteVO.isIs_active(), clienteVO.getVl_total()
            }); 
            total += clienteVO.getVl_total();
        }      
        jLBLMedia.setText(String.valueOf(total/(clientes.size())));
        System.out.println(clientes.size());
        System.out.println(total);
    }    
    
    
    public void iniciarComponentes()
    {
            jTBBuscaRapida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
//                {null, null, null, null, null, null, null, null},
//                {null, null, null, null, null, null, null, null},
//                {null, null, null, null, null, null, null, null},
//                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CPF/CNPJ", "Nome", "Ativo", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
            
            jTBClientesFiltro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
//                {null, null, null, null, null, null, null, null},
//                {null, null, null, null, null, null, null, null},
//                {null, null, null, null, null, null, null, null},
//                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CPF/CNPJ", "Nome", "Ativo", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
            
            
            
            
            
        jScrollPane2.setViewportView(jTBBuscaRapida);
        
        jTBBuscaRapida.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBBuscaRapidaMouseClicked(evt);
            }
        });
        
        jBTNBuscar.setText("Atualizar Clientes");
        jBTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNBuscarActionPerformed(evt);
            }
        });
        
        jBTAlterar.setText("Alterar");
        jBTAlterar.setEnabled(false);
        jBTAlterar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAlterarActionPerformed(evt);
            }
        });

        jBTSalvar.setText("Salvar");
        jBTSalvar.setEnabled(false);
        jBTSalvar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalvarActionPerformed(evt);
            }
        });

        jBTExcluir.setText("Excluir");
        jBTExcluir.setEnabled(false);
        jBTExcluir.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTExcluirActionPerformed(evt);
            }
        });

        jBTCadastrar.setText("Cadastrar");
        jBTCadastrar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCadastrarActionPerformed(evt);
            }
        });

        jBTConfirmar.setText("Confirmar");
        jBTConfirmar.setEnabled(false);
        jBTConfirmar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTConfirmarActionPerformed(evt);
            }
        });

        jBTCancelar.setText("Cancelar");
        jBTCancelar.setEnabled(false);
        jBTCancelar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCancelarActionPerformed(evt);
            }
        });     
        

    }
    
    
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
            java.util.logging.Logger.getLogger(JFRMManterCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRMManterCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRMManterCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRMManterCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRMManterCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTNCalcular;
    private javax.swing.JComboBox jCBXAtivo;
    private javax.swing.JLabel jLBLMedia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPNL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTBClientesFiltro;
    private javax.swing.JTextField jTFTCPF_CNPJ;
    private javax.swing.JTextField jTFTNome;
    private javax.swing.JTextField jTFTSaldo;
    // End of variables declaration//GEN-END:variables

    public void addClientes (ClienteVO cliente)
    {
        this.clientes.add(cliente);
    }
            
    public void setClientes (List<ClienteVO> clientes)
    {
        this.clientes = clientes;
    }

}