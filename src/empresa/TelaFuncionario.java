/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package empresa;

import Model.Cliente;
import Model.Funcionario;
import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author vini2
 */
public class TelaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form Funcionario
     */
    public TelaFuncionario() {
        initComponents(); 
         DefaultTableModel modelo =(DefaultTableModel) t1.getModel(); 

        modelo.setNumRows(0);
        
        
        
        try {
            java.sql.Connection conexao = (java.sql.Connection) DAO.Conexao.getConnection();
            String sql = "SELECT * FROM funcionario;";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
             ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome_completo");
            String cpf  = result.getString("cpf");
            int idade = result.getInt("idade");
            String endereco = result.getString("endereco");
            String telefone = result.getString("telefone");
            String sexo = result.getString("sexo");
            int salario = result.getInt("salario");
            String gerente  = result.getString("cpf_gerente");
            
           
            
            
            Funcionario func = new Funcionario(nome, cpf,endereco, idade,  telefone,sexo,salario,gerente);
           
            
            funcionarios.add(func);
           
            
        }
        
       
        int count = funcionarios.size();
        int i;
        for(i=0;i<count;i++){
            modelo.addRow(new Object[]{funcionarios.get(i).getNome(),funcionarios.get(i).getCpf(),
                funcionarios.get(i).getEndereco(),funcionarios.get(i).getIdade(),funcionarios.get(i).getTelefone(),funcionarios.get(i).getSexo(),
            funcionarios.get(i).getSalario(),funcionarios.get(i).getCpfGerente()});
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

        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        ende = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sexo = new javax.swing.JTextField();
        salario = new javax.swing.JTextField();
        gerente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funcionarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setBackground(new java.awt.Color(0, 0, 0));
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Endereço", "Idade", "Telefone", "Sexo", "Salario", "cpf_Gerente"
            }
        ));
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 630, 175));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Idade:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 263, -1));
        getContentPane().add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 145, -1));
        getContentPane().add(ende, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 251, -1));
        getContentPane().add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 90, -1));
        getContentPane().add(idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 27, -1));

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 84, -1));

        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        jButton3.setText("Cadastrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salario:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cpf_Gerente:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 73, -1));
        getContentPane().add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 92, -1));
        getContentPane().add(gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 127, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/empresa/imagens/Fundo.jpeg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 630, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
           
           
            java.sql.Connection conexao = (java.sql.Connection) DAO.Conexao.getConnection();
            String sql = "insert into funcionario values (?,?,?,?,?,?,?,?);";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,this.nome.getText());
            statement.setString(2,this.cpf.getText());
            statement.setInt(3,Integer.parseInt(this.idade.getText()));
            statement.setString(4,this.ende.getText());
            statement.setString(5,this.telefone.getText());
            statement.setString(6,this.sexo.getText());
            statement.setInt(7,Integer.parseInt(this.salario.getText()));
            statement.setString(8,this.gerente.getText());
            statement.execute(); 
         
            conexao.close();
       
        }catch (SQLException ex){
            System.out.println(ex);
        }
        DefaultTableModel modelo =(DefaultTableModel) t1.getModel(); 

        modelo.setNumRows(0);
        
        
        
        try {
            java.sql.Connection conexao = (java.sql.Connection) DAO.Conexao.getConnection();
            String sql = "SELECT * FROM funcionario;";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
             ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome_completo");
            String cpf  = result.getString("cpf");
            int idade = result.getInt("idade");
            String endereco = result.getString("endereco");
            String telefone = result.getString("telefone");
            String sexo = result.getString("sexo");
            int salario = result.getInt("salario");
            String gerente  = result.getString("cpf_gerente");
            
           
            
            
            Funcionario func = new Funcionario(nome, cpf,endereco, idade,  telefone,sexo,salario,gerente);
           
            
            funcionarios.add(func);
           
            
        }
        
       
        int count = funcionarios.size();
        int i;
        for(i=0;i<count;i++){
            modelo.addRow(new Object[]{funcionarios.get(i).getNome(),funcionarios.get(i).getCpf(),
                funcionarios.get(i).getEndereco(),funcionarios.get(i).getIdade(),funcionarios.get(i).getTelefone(),funcionarios.get(i).getSexo(),
            funcionarios.get(i).getSalario(),funcionarios.get(i).getCpfGerente()});
        }
         
          
            
        
        

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        Tela_Gerente telafunc = new Tela_Gerente();
       telafunc.setVisible(true);
       
       TelaFuncionario.this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{
           
           java.sql.Connection conexao = (java.sql.Connection) DAO.Conexao.getConnection();
            String sql = "DELETE FROM funcionario WHERE cpf like ?";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,this.cpf.getText());
             statement.execute();
            
         
            conexao.close();
       
        }catch (SQLException ex){
            System.out.println(ex);
        }    
 DefaultTableModel modelo =(DefaultTableModel) t1.getModel(); 

        modelo.setNumRows(0);
        
        
        
        try {
            java.sql.Connection conexao = (java.sql.Connection) DAO.Conexao.getConnection();
            String sql = "SELECT * FROM funcionario;";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
             ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome_completo");
            String cpf  = result.getString("cpf");
            int idade = result.getInt("idade");
            String endereco = result.getString("endereco");
            String telefone = result.getString("telefone");
            String sexo = result.getString("sexo");
            int salario = result.getInt("salario");
            String gerente  = result.getString("cpf_gerente");
            
           
            
            
            Funcionario func = new Funcionario(nome, cpf,endereco, idade,  telefone,sexo,salario,gerente);
           
            
            funcionarios.add(func);
           
            
        }
        
       
        int count = funcionarios.size();
        int i;
        for(i=0;i<count;i++){
            modelo.addRow(new Object[]{funcionarios.get(i).getNome(),funcionarios.get(i).getCpf(),
                funcionarios.get(i).getEndereco(),funcionarios.get(i).getIdade(),funcionarios.get(i).getTelefone(),funcionarios.get(i).getSexo(),
            funcionarios.get(i).getSalario(),funcionarios.get(i).getCpfGerente()});
        }
         
          
            
        
        

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
         cpf.setText(t1.getValueAt(t1.getSelectedRow(),1).toString());
         nome.setText(t1.getValueAt(t1.getSelectedRow(),0).toString());
         ende.setText(t1.getValueAt(t1.getSelectedRow(),2).toString());
         idade.setText(t1.getValueAt(t1.getSelectedRow(),3).toString());
         telefone.setText(t1.getValueAt(t1.getSelectedRow(),4).toString());
         gerente.setText(t1.getValueAt(t1.getSelectedRow(),7).toString());
         sexo.setText(t1.getValueAt(t1.getSelectedRow(),5).toString());
         salario.setText(t1.getValueAt(t1.getSelectedRow(),6).toString());
       
        
    }//GEN-LAST:event_t1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          try{
           
           
            java.sql.Connection conexao = (java.sql.Connection) DAO.Conexao.getConnection();
            String sql = "UPDATE funcionario SET nome_completo=?,idade =?,endereco=?,telefone=?,sexo=?,salario=?,cpf_gerente=? WHERE cpf like ?;";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,this.nome.getText());
            statement.setInt(2,Integer.parseInt(this.idade.getText()));
            statement.setString(3,this.ende.getText());
            statement.setString(4,this.telefone.getText());
            statement.setString(5,this.sexo.getText());
            statement.setInt(6,Integer.parseInt(this.salario.getText()));
            statement.setString(7,this.gerente.getText());
            statement.setString(8,this.cpf.getText());
            
            statement.execute(); 
         
            conexao.close();
       
        }catch (SQLException ex){
            System.out.println(ex);
        }
          
          DefaultTableModel modelo =(DefaultTableModel) t1.getModel(); 

        modelo.setNumRows(0);
        
        
        
        try {
            java.sql.Connection conexao = (java.sql.Connection) DAO.Conexao.getConnection();
            String sql = "SELECT * FROM funcionario;";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
             ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome_completo");
            String cpf  = result.getString("cpf");
            int idade = result.getInt("idade");
            String endereco = result.getString("endereco");
            String telefone = result.getString("telefone");
            String sexo = result.getString("sexo");
            int salario = result.getInt("salario");
            String gerente  = result.getString("cpf_gerente");
            
           
            
            
            Funcionario func = new Funcionario(nome, cpf,endereco, idade,  telefone,sexo,salario,gerente);
           
            
            funcionarios.add(func);
           
            
        }
        
       
        int count = funcionarios.size();
        int i;
        for(i=0;i<count;i++){
            modelo.addRow(new Object[]{funcionarios.get(i).getNome(),funcionarios.get(i).getCpf(),
                funcionarios.get(i).getEndereco(),funcionarios.get(i).getIdade(),funcionarios.get(i).getTelefone(),funcionarios.get(i).getSexo(),
            funcionarios.get(i).getSalario(),funcionarios.get(i).getCpfGerente()});
        }
         
          
            
        
        

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_jButton1ActionPerformed
     
        
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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField ende;
    private javax.swing.JTextField gerente;
    private javax.swing.JTextField idade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField sexo;
    private javax.swing.JTable t1;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables

    private static class Conexao {

        public Conexao() {
        }

        private Connection getConnection() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
