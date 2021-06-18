/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex.src.view;
import pokedex.src.view.*;
import pokedex.src.conexao.GenericDAO;
import pokedex.src.model.Usuario;
import pokedex.src.model.PokemonUsuario;
import pokedex.src.model.Pokemon;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.xml.sax.Attributes;
/**
 *
 * @author Emanoel
 */
public class menu extends javax.swing.JFrame {
    private final GenericDAO<Usuario> usuarioDAO;
    private final GenericDAO<PokemonUsuario> pokemonUsuarioDAO;
    /** Creates new form menu */
    public menu() {
        initComponents();
        usuarioDAO = new GenericDAO<>();
        pokemonUsuarioDAO = new GenericDAO<>();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        btnConf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSquirtle = new javax.swing.JRadioButton();
        btnCharm = new javax.swing.JRadioButton();
        btnBulba = new javax.swing.JRadioButton();
        textRegiao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pokedex");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        textNome.setToolTipText("");
        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });
        getContentPane().add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 197, -1));

        btnConf.setText("Confirmar cadastro");
        btnConf.setToolTipText("");
        btnConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfActionPerformed(evt);
            }
        });
        getContentPane().add(btnConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, 19));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pokemon Inicial");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        btnSquirtle.setBackground(new java.awt.Color(0, 51, 255));
        buttonGroup1.add(btnSquirtle);
        btnSquirtle.setText("Squirtle");
        btnSquirtle.setFocusable(false);
        btnSquirtle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSquirtle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSquirtle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSquirtle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquirtleActionPerformed(evt);
            }
        });
        getContentPane().add(btnSquirtle, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 180, 60, -1));

        btnCharm.setBackground(new java.awt.Color(255, 102, 0));
        buttonGroup1.add(btnCharm);
        btnCharm.setText("Charmander");
        btnCharm.setFocusable(false);
        btnCharm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCharm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnCharm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        btnBulba.setBackground(new java.awt.Color(51, 204, 0));
        buttonGroup1.add(btnBulba);
        btnBulba.setText("Bulbassauro");
        btnBulba.setFocusable(false);
        btnBulba.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBulba.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnBulba, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        textRegiao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoenn", "Johto", "Kalos", "Kanto", "Orre", "Sinnoh", "Unova", " " }));
        getContentPane().add(textRegiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 197, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Região");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSquirtleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquirtleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSquirtleActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void btnConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfActionPerformed
       // TODO add your handling code here:
       
        Usuario user = new Usuario();
        Pokemon poke = new Pokemon();
        MenuPrincipal tela= new MenuPrincipal();
        String reg;
        PokemonUsuario inicial = new PokemonUsuario();
        user.setNome(textNome.getText());
        reg=(String)textRegiao.getSelectedItem();
        user.setRegiao(reg);
        if(btnCharm.isSelected()==true){
            poke.setId(3);
            inicial.setPokemonid(poke);
        }else if(btnBulba.isSelected()==true){
            poke.setId(1);
            inicial.setPokemonid(poke);
        }else if(btnSquirtle.isSelected()==true){
            poke.setId(7);
            inicial.setPokemonid(poke);
        }else{
           JOptionPane.showMessageDialog(this,"Selecione o pokemon inicial para concluir o cadastro!");  
        }
        if(textNome.getText().equals("")){
            JOptionPane.showMessageDialog(this,"O nome deve ser informado para concluir o cadastro");
            textNome.requestFocus();
        }
        if(usuarioDAO.saveOrUpdate(user)){
            JOptionPane.showMessageDialog(null, "Cadastro Realizado");
        }else 
            JOptionPane.showMessageDialog(null,"Cadastro não realizado!","Atenção", JOptionPane.WARNING_MESSAGE);

        inicial.setUsuarioId(user);
        pokemonUsuarioDAO.saveOrUpdate(inicial);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConfActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnBulba;
    private javax.swing.JRadioButton btnCharm;
    private javax.swing.JButton btnConf;
    private javax.swing.JRadioButton btnSquirtle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textNome;
    private javax.swing.JComboBox<String> textRegiao;
    // End of variables declaration//GEN-END:variables

}