/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package empresa;

import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vini2
 */
public class Consultar_Cliente extends javax.swing.JFrame {

    
    /**
     * Creates new form Consultar_Cliente
     */
    public Consultar_Cliente() {
        initComponents();
        
         DefaultTableModel modelo =(DefaultTableModel) tabelaclientes.getModel(); 

        modelo.setNumRows(0);
        
        
        
        try {
            Connection conexao = (Connection) Conexao.getConnection();
            String sql = "SELECT * FROM cliente;";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
             ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome_completo");
            String cpf  = result.getString("cpf");
            String endereco = result.getString("endereco");
            String telefone = result.getString("telefone");
           
            
            
            Cliente func = new Cliente(nome, cpf, endereco, telefone);
           
            
            clientes.add(func);
           
            
        }
        
       
        int count = clientes.size();
        int i;
        for(i=0;i<count;i++){
            modelo.addRow(new Object[]{clientes.get(i).getNome(),clientes.get(i).getCpf(),clientes.get(i).getEndereco(),clientes.get(i).getTelefone()});
        }
         
          
            
        
        

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaclientes = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CPF: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 90, -1));
        getContentPane().add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 172, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista Dos Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jButton2.setText("Novo Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        tabelaclientes.setBackground(new java.awt.Color(0, 0, 0));
        tabelaclientes.setForeground(new java.awt.Color(255, 255, 255));
        tabelaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Endereço", "Telefone"
            }
        ));
        tabelaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaclientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 630, 180));

        jButton4.setText("Visualizar Todos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/empresa/imagens/Fundo.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          
       Tela_Funcionario telafunc = new Tela_Funcionario();
       telafunc.setVisible(true);
       
       Consultar_Cliente.this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        DefaultTableModel modelo =(DefaultTableModel) tabelaclientes.getModel(); 

        modelo.setNumRows(0);
        
        
        
        try {
            Connection conexao = (Connection) Conexao.getConnection();
            String sql = "SELECT * FROM cliente WHERE cpf like ?;";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,this.cpf.getText());
             ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome_completo");
            String cpf  = result.getString("cpf");
            String endereco = result.getString("endereco");
            String telefone = result.getString("telefone");
           
            
            
            Cliente func = new Cliente(nome, cpf, endereco, telefone);
           
            
            clientes.add(func);
           
            
        }
        
       
        int count = clientes.size();
        int i;
        for(i=0;i<count;i++){
            modelo.addRow(new Object[]{clientes.get(i).getNome(),clientes.get(i).getCpf(),clientes.get(i).getEndereco(),clientes.get(i).getTelefone()});
        }
         
          
            
        
        

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaclientesMouseClicked
   
        cpf.setText(tabelaclientes.getValueAt(tabelaclientes.getSelectedRow(),1).toString());
        
    }//GEN-LAST:event_tabelaclientesMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel modelo =(DefaultTableModel) tabelaclientes.getModel(); 

        modelo.setNumRows(0);
        
        
        
        try {
            Connection conexao = (Connection) Conexao.getConnection();
            String sql = "SELECT * FROM cliente;";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
             ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome_completo");
            String cpf  = result.getString("cpf");
            String endereco = result.getString("endereco");
            String telefone = result.getString("telefone");
           
            
            
            Cliente func = new Cliente(nome, cpf, endereco, telefone);
           
            
            clientes.add(func);
           
            
        }
        
       
        int count = clientes.size();
        int i;
        for(i=0;i<count;i++){
            modelo.addRow(new Object[]{clientes.get(i).getNome(),clientes.get(i).getCpf(),clientes.get(i).getEndereco(),clientes.get(i).getTelefone()});
        }
         
          
            
        
        

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         Cadastrar_Cliente cad_client = new Cadastrar_Cliente();
       cad_client.setVisible(true);
       
        Consultar_Cliente.this.setVisible(false); 
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Consultar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaclientes;
    // End of variables declaration//GEN-END:variables
}