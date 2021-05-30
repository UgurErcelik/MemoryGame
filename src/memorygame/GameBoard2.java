package memorygame;

import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static memorygame.GameOverBoard.timer2_label;


public class GameBoard2 extends javax.swing.JFrame {
    
    
    public GameBoard2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScoreScreenLabel = new javax.swing.JLabel();
        ScoreScreen = new javax.swing.JTextField();
        startGameButton = new javax.swing.JButton();
        Tile12 = new javax.swing.JButton();
        Tile13 = new javax.swing.JButton();
        Tile14 = new javax.swing.JButton();
        Tile15 = new javax.swing.JButton();
        Tile11 = new javax.swing.JButton();
        Tile22 = new javax.swing.JButton();
        Tile23 = new javax.swing.JButton();
        Tile24 = new javax.swing.JButton();
        Tile25 = new javax.swing.JButton();
        Tile21 = new javax.swing.JButton();
        Tile32 = new javax.swing.JButton();
        Tile33 = new javax.swing.JButton();
        Tile34 = new javax.swing.JButton();
        Tile35 = new javax.swing.JButton();
        Tile31 = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();
        DebugCheck = new javax.swing.JCheckBox();
        Tile41 = new javax.swing.JButton();
        Tile42 = new javax.swing.JButton();
        Tile43 = new javax.swing.JButton();
        Tile44 = new javax.swing.JButton();
        Tile45 = new javax.swing.JButton();
        menu_button = new javax.swing.JButton();
        timer3_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        QuitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        resetBoardMenuItem = new javax.swing.JMenuItem();
        enableDebug = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("4x5 Memory Game");
        setMinimumSize(new java.awt.Dimension(680, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(680, 650));
        getContentPane().setLayout(null);

        ScoreScreenLabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        ScoreScreenLabel.setText("SCORE:");
        getContentPane().add(ScoreScreenLabel);
        ScoreScreenLabel.setBounds(43, 34, 63, 41);

        ScoreScreen.setEditable(false);
        ScoreScreen.setBackground(new java.awt.Color(204, 204, 255));
        ScoreScreen.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ScoreScreen.setText("0");
        ScoreScreen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ScoreScreen.setEnabled(false);
        ScoreScreen.setFocusable(false);
        getContentPane().add(ScoreScreen);
        ScoreScreen.setBounds(111, 34, 181, 41);

        startGameButton.setBackground(new java.awt.Color(153, 0, 153));
        startGameButton.setText("START");
        startGameButton.setToolTipText("");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startGameButton);
        startGameButton.setBounds(348, 34, 73, 41);

        Tile12.setEnabled(false);
        Tile12.setFocusable(false);
        Tile12.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile12.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile12.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile12ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile12);
        Tile12.setBounds(134, 115, 100, 100);

        Tile13.setEnabled(false);
        Tile13.setFocusable(false);
        Tile13.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile13.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile13.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile13ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile13);
        Tile13.setBounds(241, 115, 100, 100);

        Tile14.setEnabled(false);
        Tile14.setFocusable(false);
        Tile14.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile14.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile14.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile14ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile14);
        Tile14.setBounds(348, 115, 100, 100);

        Tile15.setEnabled(false);
        Tile15.setFocusable(false);
        Tile15.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile15.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile15.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile15ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile15);
        Tile15.setBounds(455, 115, 100, 100);

        Tile11.setEnabled(false);
        Tile11.setFocusable(false);
        Tile11.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile11.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile11.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile11ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile11);
        Tile11.setBounds(27, 115, 100, 100);

        Tile22.setEnabled(false);
        Tile22.setFocusable(false);
        Tile22.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile22.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile22.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile22ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile22);
        Tile22.setBounds(134, 222, 100, 100);

        Tile23.setEnabled(false);
        Tile23.setFocusable(false);
        Tile23.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile23.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile23.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile23ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile23);
        Tile23.setBounds(241, 222, 100, 100);

        Tile24.setEnabled(false);
        Tile24.setFocusable(false);
        Tile24.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile24.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile24.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile24ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile24);
        Tile24.setBounds(348, 222, 100, 100);

        Tile25.setEnabled(false);
        Tile25.setFocusable(false);
        Tile25.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile25.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile25.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile25ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile25);
        Tile25.setBounds(455, 222, 100, 100);

        Tile21.setEnabled(false);
        Tile21.setFocusable(false);
        Tile21.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile21.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile21.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile21ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile21);
        Tile21.setBounds(27, 222, 100, 100);

        Tile32.setEnabled(false);
        Tile32.setFocusable(false);
        Tile32.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile32.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile32.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile32ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile32);
        Tile32.setBounds(134, 329, 100, 100);

        Tile33.setEnabled(false);
        Tile33.setFocusable(false);
        Tile33.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile33.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile33.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile33ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile33);
        Tile33.setBounds(241, 329, 100, 100);

        Tile34.setEnabled(false);
        Tile34.setFocusable(false);
        Tile34.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile34.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile34.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile34ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile34);
        Tile34.setBounds(348, 329, 100, 100);

        Tile35.setEnabled(false);
        Tile35.setFocusable(false);
        Tile35.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile35.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile35.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile35ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile35);
        Tile35.setBounds(455, 329, 100, 100);

        Tile31.setEnabled(false);
        Tile31.setFocusable(false);
        Tile31.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile31.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile31.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile31ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile31);
        Tile31.setBounds(27, 329, 100, 100);

        QuitButton.setBackground(new java.awt.Color(153, 0, 153));
        QuitButton.setText("QUIT");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(QuitButton);
        QuitButton.setBounds(455, 34, 68, 41);

        DebugCheck.setText("Debug");
        DebugCheck.setToolTipText("");
        DebugCheck.setEnabled(false);
        getContentPane().add(DebugCheck);
        DebugCheck.setBounds(27, 549, 65, 25);

        Tile41.setEnabled(false);
        Tile41.setFocusable(false);
        Tile41.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile41.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile41.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile41ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile41);
        Tile41.setBounds(27, 436, 100, 100);

        Tile42.setEnabled(false);
        Tile42.setFocusable(false);
        Tile42.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile42.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile42.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile42ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile42);
        Tile42.setBounds(134, 436, 100, 100);

        Tile43.setEnabled(false);
        Tile43.setFocusable(false);
        Tile43.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile43.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile43.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile43ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile43);
        Tile43.setBounds(241, 436, 100, 100);

        Tile44.setEnabled(false);
        Tile44.setFocusable(false);
        Tile44.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile44.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile44.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile44ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile44);
        Tile44.setBounds(348, 436, 100, 100);

        Tile45.setEnabled(false);
        Tile45.setFocusable(false);
        Tile45.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile45.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile45.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile45ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile45);
        Tile45.setBounds(455, 436, 100, 100);

        menu_button.setBackground(new java.awt.Color(153, 0, 153));
        menu_button.setText("MENU");
        menu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(menu_button);
        menu_button.setBounds(134, 549, 77, 36);

        timer3_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timer3_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(timer3_label);
        timer3_label.setBounds(564, 34, 100, 74);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ugure\\OneDrive\\Belgeler\\NetBeansProjects\\MemoryGame-master\\src\\memorygame\\MGshapes\\1610897432_37-p-bledno-goluboi-odnotonnii-fon-41.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 600);

        jMenu1.setText("File");

        QuitMenuItem.setText("Quit");
        QuitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(QuitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Game");

        resetBoardMenuItem.setText("Reset Board");
        resetBoardMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBoardMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(resetBoardMenuItem);

        enableDebug.setText("Enable debugging");
        enableDebug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableDebugActionPerformed(evt);
            }
        });
        jMenu2.add(enableDebug);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //start the game
    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        
        Timer();
        running2=false;
        startGameButton.setEnabled(false);
        System.out.println("============NEW=GAME============");

        
        PrevID_Guess1 = 100;
        PrevID_Guess2 = 100;
        ID_Guess1 = 100;
        ID_Guess2 = 100;
        match = false;
        count = 0;
        score = 0;
        accuracy = 0;
        correctPairs = 0;
        totalPairs = 0;

        ScoreScreen.setText(Integer.toString(score));

        
        Tile11.setEnabled(true);
        Tile12.setEnabled(true);
        Tile13.setEnabled(true);
        Tile14.setEnabled(true);
        Tile15.setEnabled(true);
        
        Tile21.setEnabled(true);
        Tile22.setEnabled(true);
        Tile23.setEnabled(true);
        Tile24.setEnabled(true);
        Tile25.setEnabled(true);
        
        Tile31.setEnabled(true);
        Tile32.setEnabled(true);
        Tile33.setEnabled(true);
        Tile34.setEnabled(true);
        Tile35.setEnabled(true);
        
        Tile41.setEnabled(true);
        Tile42.setEnabled(true);
        Tile43.setEnabled(true);
        Tile44.setEnabled(true);
        Tile45.setEnabled(true);
        

        
        wipeBoard();

        
        tileControl.initShuffle4x5Tiles();
        for (int i = 0; i<= 19; i++){
            System.out.print(i + ": ");
            int type = tileControl.get4x5TileType(i);
            
            
            if (DebugCheck.isSelected()){
                showTileShape(i, type);
            }
        }
        
        System.out.println();
        
        
        flashShapes();
        running2=true;
        
    }//GEN-LAST:event_startGameButtonActionPerformed

    
    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed
        
        System.out.println("========================\n"
                         + "*** 4 x 5  C L O S E ***\n"
                         + "========================");
        
        System.out.println("\nBye!");
        System.exit(0);
    }//GEN-LAST:event_QuitButtonActionPerformed

    
    private void Tile11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile11ActionPerformed
        int ID = 0;
        int type;
                
        //System.out.print("1,1 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile11ActionPerformed
    
    
    private void Tile12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile12ActionPerformed
        int ID = 1;
        int type;
                
        //System.out.print("1,2 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile12ActionPerformed

    
    private void Tile13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile13ActionPerformed
        int ID = 2;
        int type;
                
        //System.out.print("1,3 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile13ActionPerformed

    
    private void Tile14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile14ActionPerformed
        int ID = 3;
        int type;
                
        //System.out.print("1,6 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile14ActionPerformed

    
    private void Tile15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile15ActionPerformed
        int ID = 4;
        int type;
                
        //System.out.print("1,5 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile15ActionPerformed

    
    private void Tile21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile21ActionPerformed
        int ID = 5;
        int type;
                
        //System.out.print("2,1 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile21ActionPerformed

    
    private void Tile22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile22ActionPerformed
        int ID = 6;
        int type;
                
        //System.out.print("2,2 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile22ActionPerformed

    //Tile 2,3 | ID 8 - Press
    private void Tile23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile23ActionPerformed
        int ID = 7;
        int type;
                
        //System.out.print("2,3 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile23ActionPerformed

    
    private void Tile24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile24ActionPerformed
        int ID = 8;
        int type;
                
        //System.out.print("2,4 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile24ActionPerformed

    
    private void Tile25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile25ActionPerformed
        int ID = 9;
        int type;
                
        //System.out.print("2,5 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile25ActionPerformed

    
    private void Tile31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile31ActionPerformed
        int ID = 10;
        int type;
                
        //System.out.print("3,1 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile31ActionPerformed

    
    private void Tile32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile32ActionPerformed
        int ID = 11;
        int type;
                
        //System.out.print("3,2 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile32ActionPerformed

    
    private void Tile33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile33ActionPerformed
        int ID = 12;
        int type;
                
        
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile33ActionPerformed

    
    private void Tile34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile34ActionPerformed
        int ID = 13;
        int type;
                
        //System.out.print("3,4 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile34ActionPerformed

    
    private void Tile35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile35ActionPerformed
        int ID = 14;
        int type;
                
        //System.out.print("3,5 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile35ActionPerformed

   
    
    private void enableDebugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableDebugActionPerformed
        try{
            String passphrase = JOptionPane.showInputDialog(rootPane, null, "enter passphrase");
            if (passphrase.equals("rzqxx5gv")){
                DebugCheck.setEnabled(true);
            }
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
        }
        
    }//GEN-LAST:event_enableDebugActionPerformed

    
    private void resetBoardMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBoardMenuItemActionPerformed
        wipeBoard();
        PrevID_Guess1 = 100;
        PrevID_Guess2 = 100;
        ID_Guess1 = 100;
        ID_Guess2 = 100;
        match = false;
        count = 0;
        score = 0;
        sScore = "0";
        ScoreScreen.setText(sScore);
        accuracy = 0;
        correctPairs = 0;
        totalPairs = 0;
        
        buttonEnabledSwitch(false, 0);
        buttonEnabledSwitch(false, 1);
        buttonEnabledSwitch(false, 2);
        buttonEnabledSwitch(false, 3);
        buttonEnabledSwitch(false, 4);
        buttonEnabledSwitch(false, 5);
        buttonEnabledSwitch(false, 6);
        buttonEnabledSwitch(false, 7);
        buttonEnabledSwitch(false, 8);
        buttonEnabledSwitch(false, 9);
        buttonEnabledSwitch(false, 10);
        buttonEnabledSwitch(false, 11);
        buttonEnabledSwitch(false, 12);
        buttonEnabledSwitch(false, 13);
        buttonEnabledSwitch(false, 14);
        buttonEnabledSwitch(false, 15);
        buttonEnabledSwitch(false, 16);
        buttonEnabledSwitch(false, 17);
        buttonEnabledSwitch(false, 18);
        buttonEnabledSwitch(false, 19);
        
        
        DebugCheck.setEnabled(false);
    }//GEN-LAST:event_resetBoardMenuItemActionPerformed

    
    private void QuitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitMenuItemActionPerformed
        System.out.println("========================\n"
                 + "*** 4 x 5  C L O S E ***\n"
                 + "========================");
        resetBoardMenuItemActionPerformed(evt);
        System.exit(0);
    }//GEN-LAST:event_QuitMenuItemActionPerformed

    private void Tile41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile41ActionPerformed
        int ID = 15;
        int type;
                
        //System.out.print("3,4 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile41ActionPerformed

    private void Tile42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile42ActionPerformed
        int ID = 16;
        int type;
                
        //System.out.print("3,4 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile42ActionPerformed

    private void Tile43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile43ActionPerformed
        int ID = 17;
        int type;
                
        //System.out.print("3,4 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile43ActionPerformed

    private void Tile44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile44ActionPerformed
        int ID = 18;
        int type;
                
        //System.out.print("3,4 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile44ActionPerformed

    private void Tile45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile45ActionPerformed
        int ID = 19;
        int type;
                
        //System.out.print("3,4 -- ");
        type = tileControl.get4x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile45ActionPerformed

    private void menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buttonActionPerformed

        MainMenuForm menu = new MainMenuForm();
        setVisible(false);
        menu.setVisible(true);
        
        timer2.cancel();

    }//GEN-LAST:event_menu_buttonActionPerformed
    
    
    private void showTileShape(int ID, int type){
        ImageIcon shape = new javax.swing.ImageIcon();
        
        ArrayList<ImageIcon> shapes = new ArrayList();
        
        
        shapes.add(audioCard);
        shapes.add(headPhones);
        shapes.add(Computer);
        shapes.add(Laptop);
        shapes.add(Cpu);
        shapes.add(Gaming);
        shapes.add(Keyboard);
        shapes.add(Mouse);
        shapes.add(Wireless);
        shapes.add(Smartphone);
        
        
        
        
        switch(ID){      
            case 0:
                Tile11.setIcon(shapes.get(type));
                break;
            case 1:
                Tile12.setIcon(shapes.get(type));
                break;
            case 2:
                Tile13.setIcon(shapes.get(type));
                break;
            case 3:
                Tile14.setIcon(shapes.get(type));
                break;
            case 4:
                Tile15.setIcon(shapes.get(type));
                break;
            
            case 5:
                Tile21.setIcon(shapes.get(type));
                break;
            case 6:
                Tile22.setIcon(shapes.get(type));
                break;
            case 7:
                Tile23.setIcon(shapes.get(type));
                break;
            case 8:
                Tile24.setIcon(shapes.get(type));
                break;
            case 9:
                Tile25.setIcon(shapes.get(type));
                break;
            
            case 10:
                Tile31.setIcon(shapes.get(type));
                break;
            case 11:
                Tile32.setIcon(shapes.get(type));
                break;
            case 12:
                Tile33.setIcon(shapes.get(type));
                break;
            case 13:
                Tile34.setIcon(shapes.get(type));
                break;
            case 14:
                Tile35.setIcon(shapes.get(type));
                break;
                
           
            case 15:
                Tile41.setIcon(shapes.get(type));
                break;
            case 16:
                Tile42.setIcon(shapes.get(type));
                break;
            case 17:
                Tile43.setIcon(shapes.get(type));
                break;
            case 18:
                Tile44.setIcon(shapes.get(type));
                break;
            case 19:
                Tile45.setIcon(shapes.get(type));
                break;
                
        } 
    }
    
    
    private void wipeBoard(){
        Tile11.setIcon(Blank);
        Tile12.setIcon(Blank);
        Tile13.setIcon(Blank);
        Tile14.setIcon(Blank);
        Tile15.setIcon(Blank);
        
        Tile21.setIcon(Blank);
        Tile22.setIcon(Blank);
        Tile23.setIcon(Blank);
        Tile24.setIcon(Blank);
        Tile25.setIcon(Blank);
        
        Tile31.setIcon(Blank);
        Tile32.setIcon(Blank);
        Tile33.setIcon(Blank);
        Tile34.setIcon(Blank);
        Tile35.setIcon(Blank);
        
        
        Tile41.setIcon(Blank);
        Tile42.setIcon(Blank);
        Tile43.setIcon(Blank);
        Tile44.setIcon(Blank);
        Tile45.setIcon(Blank);
        
    }
    
    
    private boolean testMatch(int type1, int type2){
        boolean match = false;
        
        if (type1 == type2){
            match = true;
        }
        
        return match;
    }
    
    
    private void checkEndGame(){
        if (    !Tile11.isEnabled() && !Tile12.isEnabled() && !Tile13.isEnabled() && !Tile14.isEnabled() && !Tile15.isEnabled() && 
                !Tile21.isEnabled() && !Tile22.isEnabled() && !Tile23.isEnabled() && !Tile24.isEnabled() && !Tile25.isEnabled() &&
                !Tile31.isEnabled() && !Tile32.isEnabled() && !Tile33.isEnabled() && !Tile34.isEnabled() && !Tile35.isEnabled() &&
                !Tile41.isEnabled() && !Tile42.isEnabled() && !Tile43.isEnabled() && !Tile44.isEnabled() && !Tile45.isEnabled()){
        
            accuracy = correctPairs / totalPairs * 100;
            accuracy = Math.round (accuracy * 10.0) / 10.0; 
            
            System.out.println("============GAME=OVER===========\n"
                + "Total Pairs: " + totalPairs + " Correct Pairs: " + correctPairs + "\n"
                + "Accuracy: " + accuracy + "%\n"
                + "Score: " + score);
            
            ct2.cancel();
            if (score > 0){
                
                try {

                    String soundName = "C:\\Users\\ugure\\Downloads\\Clapping Sound Effects (online-audio-converter.com).wav";
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();

                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                
                JOptionPane.showMessageDialog(rootPane,
                "                        Congratulations!        \n"
                + "You finished the game successfully with " + accuracy  + "% accuracy, \n"
                + "And a final score of " + score + "!\n", 
                "You Win!", 
                WIDTH, WIN);
                startGameButton.setEnabled(true);
            }
            else{
                
                try {

                    String soundName = "C:\\Users\\ugure\\Downloads\\Fail 2 Sound Effect (download) (online-audio-converter.com).wav";
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();

                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                
                JOptionPane.showMessageDialog(rootPane,
                "                               Nice Try!\n"
                + "you finished the game with " + accuracy + "% accuracy.\n"
                + "However your score is " + score + ".\n"
                + "You need a score greater than 0 to win.  Try again!", 
                "You Lose!", 
                WIDTH, LOSS);
                startGameButton.setEnabled(true);
            }
        }
    }
    
    //Hide the shape and set icon to blank a particular button/Tile.
    private void hideSelectedTile(int ID){
        switch(ID){
            case 0:
                Tile11.setIcon(Blank);
                break;
            case 1:
                Tile12.setIcon(Blank);
                break;
            case 2:
                Tile13.setIcon(Blank);
                break;
            case 3: 
                Tile14.setIcon(Blank);
                break;
            case 4:
                Tile15.setIcon(Blank);
                break;
            
            case 5:
                Tile21.setIcon(Blank);
                break;
            case 6: 
                Tile22.setIcon(Blank);
                break;
            case 7:
                Tile23.setIcon(Blank);
                break;
            case 8:
                Tile24.setIcon(Blank);
                break;
            case 9:
                Tile25.setIcon(Blank);
                break;
            
            case 10:
                Tile31.setIcon(Blank);
                break;
            case 11:
                Tile32.setIcon(Blank);
                break;
            case 12:
                Tile33.setIcon(Blank);
                break;
            case 13:
                Tile34.setIcon(Blank);
                break;
            case 14:
                Tile35.setIcon(Blank);
                break;
                
            
            case 15:
                Tile41.setIcon(Blank);
                break;
            case 16:
                Tile42.setIcon(Blank);
                break;
            case 17:
                Tile43.setIcon(Blank);
                break;
            case 18:
                Tile44.setIcon(Blank);
                break;
            case 19:
                Tile45.setIcon(Blank);
                break;
               
        }
    }
    
   
    private void buttonEnabledSwitch(boolean state, int ID){
        
        switch(ID){
            case 0:
                Tile11.setEnabled(state);
                break;
            case 1:
                Tile12.setEnabled(state);
                break;
            case 2:
                Tile13.setEnabled(state);
                break;
            case 3:
                Tile14.setEnabled(state);
                break;
            case 4:
                Tile15.setEnabled(state);
                break;
            
            case 5:
                Tile21.setEnabled(state);
                break;
            case 6:
                Tile22.setEnabled(state);
                break;
            case 7:
                Tile23.setEnabled(state);
                break;
            case 8:
                Tile24.setEnabled(state);
                break;
            case 9:
                Tile25.setEnabled(state);
                break;
            
            case 10:
                Tile31.setEnabled(state);
                break;
            case 11:
                Tile32.setEnabled(state);
                break;
            case 12:
                Tile33.setEnabled(state);
                break;
            case 13:
                Tile34.setEnabled(state);
                break;
            case 14:
                Tile35.setEnabled(state);
                break;
                
            
            case 15:
                Tile41.setEnabled(state);
                break;
            case 16:
                Tile42.setEnabled(state);
                break;
            case 17:
                Tile43.setEnabled(state);
                break;
            case 18:
                Tile44.setEnabled(state);
                break;
            case 19:
                Tile45.setEnabled(state);
                break;
               
        }  
    }
    
    
    private void buttonPress(int ID, int type){
        if (count == 0){
            showTileShape(ID, type);
            ID_Guess1 = ID;
            type_Guess1 = type;
            System.out.println("GUESS 1 ** Location1: " + ID + ", Shape_Code: " + type);
            count++;
            
            
            if (!match){
                hideSelectedTile(PrevID_Guess1);
                hideSelectedTile(PrevID_Guess2);
            }
        }
        else if (count == 1){
            showTileShape(ID, type);
            ID_Guess2 = ID;
            type_Guess2 = type;
            System.out.println("GUESS 2 ** Location1: " + ID + ", Shape_Code: " + type);
            PrevID_Guess1 = ID_Guess1;
            PrevID_Guess2 = ID_Guess2;
            
            //before matching test if the same tile was pressed twice.  that's cheating.
            if (ID_Guess1 == ID_Guess2){
                JOptionPane.showMessageDialog(
                    rootPane,
                    "You cannot pick the same tile twice.\n" + 
                    "That's considered cheating. Pick 2 distinct tiles.", 
                    "Invalid Move", WIDTH, null
                );
                hideSelectedTile(ID_Guess1);
                buttonEnabledSwitch(true,ID_Guess1);
                ID_Guess1 = 100;
                ID_Guess2 = 100;
                PrevID_Guess1 = 100;
                PrevID_Guess2 = 100;
                
            }
            else {
                match = testMatch(type_Guess1, type_Guess2);

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                    totalPairs++;
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                    
                    correctPairs++;
                    totalPairs++;
                    
                    checkEndGame();
                }
            }
            count = 0;
        }        
    }
    
    
    private void flashShapes(){
        Thread thread = new Thread() {
            public void run() {
                try {
                    for (int i = 0; i<= 19; i++){
                        int type = tileControl.get4x5TileType(i);
                        showTileShape(i, type);
                    }
                    Thread.sleep(1200);
                    if (!DebugCheck.isSelected()){
                        wipeBoard();
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(GameBoard2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        thread.start(); 
    }
    
    public void Timer() {
        ct2 = new TimerTask() {
            int time = 1 * 60;

            @Override
            public void run() {
                if (running2 != false) {
                    String a = Integer.toString(time);
                    timer3_label.setText(a);
                    time -= 1;
                    

                    if (time == 0) {
                        timer2.cancel();
                        GameOverBoard goboard = new GameOverBoard();
                        setVisible(false);
                        goboard.setVisible(true);
                        String b = Integer.toString(time);
                        timer2_label.setText(b);

                        try {

                            String soundName = "C:\\Users\\ugure\\Downloads\\Clapping Sound Effects (online-audio-converter.com).wav";
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();

                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    } 

                }
            }
        };
        timer2.schedule(ct2, 0, 1000);
    }
    //===============================================================================================

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox DebugCheck;
    private javax.swing.JButton QuitButton;
    private javax.swing.JMenuItem QuitMenuItem;
    private javax.swing.JTextField ScoreScreen;
    private javax.swing.JLabel ScoreScreenLabel;
    private javax.swing.JButton Tile11;
    private javax.swing.JButton Tile12;
    private javax.swing.JButton Tile13;
    private javax.swing.JButton Tile14;
    private javax.swing.JButton Tile15;
    private javax.swing.JButton Tile21;
    private javax.swing.JButton Tile22;
    private javax.swing.JButton Tile23;
    private javax.swing.JButton Tile24;
    private javax.swing.JButton Tile25;
    private javax.swing.JButton Tile31;
    private javax.swing.JButton Tile32;
    private javax.swing.JButton Tile33;
    private javax.swing.JButton Tile34;
    private javax.swing.JButton Tile35;
    private javax.swing.JButton Tile41;
    private javax.swing.JButton Tile42;
    private javax.swing.JButton Tile43;
    private javax.swing.JButton Tile44;
    private javax.swing.JButton Tile45;
    private javax.swing.JMenuItem enableDebug;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton menu_button;
    private javax.swing.JMenuItem resetBoardMenuItem;
    private javax.swing.JButton startGameButton;
    public static javax.swing.JLabel timer3_label;
    // End of variables declaration//GEN-END:variables
    
    //GLOBALS
    TileControl tileControl = new TileControl();

    ImageIcon Blank     = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/blankTile.png"));
    ImageIcon Circle    = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Circle.png"));
    ImageIcon Cross     = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Cross.png"));
    ImageIcon Diamond   = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Diamond.png"));
    ImageIcon Dice      = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Dice.png"));
    ImageIcon Donut     = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Donut.png"));
    ImageIcon Eclipse   = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Eclipse.png"));
    ImageIcon Eclipse2  = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Eclipse2.png"));
    ImageIcon Grapes    = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Grapes.png"));
    ImageIcon Heart     = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Heart.png"));
    ImageIcon L         = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/L.png"));
    ImageIcon Rectangle = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Rectangle.png"));
    ImageIcon Snowflake = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Snowflake.png"));
    ImageIcon SqDonut   = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/SqDonut.png"));
    ImageIcon Square    = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Square.png"));
    ImageIcon Star      = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Star.png"));
    ImageIcon Tear      = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Tear.png"));
    ImageIcon Triangle  = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Triangle.png"));
    ImageIcon X         = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/X.png"));
    ImageIcon WIN       = new javax.swing.ImageIcon(getClass().getResource("/memorygame/win-loss/WIN.png"));
    ImageIcon LOSS      = new javax.swing.ImageIcon(getClass().getResource("/memorygame/win-loss/LOSS.png"));
    
    
    ImageIcon audioCard = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/audio-card-icon.png"));
    ImageIcon headPhones = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/audio-headphones-icon.png"));
    ImageIcon Computer   = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/computer-icon.png"));
    ImageIcon Laptop    = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/computer-laptop-icon.png"));
    ImageIcon Cpu      = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/cpu-icon.png"));
    ImageIcon Gaming      = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/input-gaming-icon.png"));
    ImageIcon Keyboard  = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/input-keyboard-icon.png"));
    ImageIcon Mouse         = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/input-mouse-icon.png"));
    ImageIcon Wireless       = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/network-wireless-icon.png"));
    ImageIcon Smartphone      = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/smartphone-icon.png"));
    
    
    
    int count = 0;                              
    int ID_Guess1 = 100, ID_Guess2 = 100;       
    int type_Guess1, type_Guess2;              
    boolean match;                              
    int score;                                  
    String sScore;                              
    int PrevID_Guess1;                          
    int PrevID_Guess2;                          
    double totalPairs;                          
    double correctPairs;                        
    double accuracy;                            
    
    public Timer timer2 = new Timer();
    public TimerTask ct2 = null;
    public static boolean running2 = false;
}
