package memorygame;

public class MainMenuForm extends javax.swing.JFrame {

    
    public MainMenuForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Start2x5Button = new javax.swing.JButton();
        Start4x5Button = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        Start6x5Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kart Eşleştirme Oyunu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(850, 470));
        setMinimumSize(new java.awt.Dimension(850, 470));
        setPreferredSize(new java.awt.Dimension(850, 470));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 470));
        getContentPane().setLayout(null);

        Start2x5Button.setBackground(new java.awt.Color(153, 0, 153));
        Start2x5Button.setText("Start 2x5 Game");
        Start2x5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start2x5ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Start2x5Button);
        Start2x5Button.setBounds(670, 277, 146, 37);

        Start4x5Button.setBackground(new java.awt.Color(153, 0, 153));
        Start4x5Button.setText("Start 4x5 Game");
        Start4x5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start4x5ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Start4x5Button);
        Start4x5Button.setBounds(670, 327, 146, 38);

        ExitButton.setBackground(new java.awt.Color(153, 0, 153));
        ExitButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ExitButton.setText("Quit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton);
        ExitButton.setBounds(670, 33, 146, 37);

        Start6x5Button.setBackground(new java.awt.Color(153, 0, 153));
        Start6x5Button.setText("Start 6x5 Game");
        Start6x5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start6x5ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Start6x5Button);
        Start6x5Button.setBounds(670, 378, 146, 38);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ugure\\OneDrive\\Belgeler\\NetBeansProjects\\MemoryGame-master\\src\\memorygame\\MGshapes\\i-spy-collage-900x600.jpg")); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(850, 450));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 850, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Play the original 4x4 Tile game.
    private void Start2x5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start2x5ButtonActionPerformed
        setVisible(false);
        smallGame.setVisible(true);
    }//GEN-LAST:event_Start2x5ButtonActionPerformed

    //Quit the whole program
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.out.println("\nBye!");
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    //Play the new 6x6 Tile Game
    private void Start4x5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start4x5ButtonActionPerformed
        setVisible(false);
        mediumGame.setVisible(true);   
    }//GEN-LAST:event_Start4x5ButtonActionPerformed

    private void Start6x5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start6x5ButtonActionPerformed
        setVisible(false);
        largeGame.setVisible(true);
    }//GEN-LAST:event_Start6x5ButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton Start2x5Button;
    private javax.swing.JButton Start4x5Button;
    private javax.swing.JButton Start6x5Button;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    
    GameBoard smallGame = new GameBoard();
    GameBoard2 mediumGame = new GameBoard2();
    GameBoard3 largeGame = new GameBoard3();

}

