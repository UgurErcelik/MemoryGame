package memorygame;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import static memorygame.GameOverBoard.timer2_label;


public class GameBoard extends javax.swing.JFrame {

    
    public GameBoard() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tile11 = new javax.swing.JButton();
        Tile14 = new javax.swing.JButton();
        Tile12 = new javax.swing.JButton();
        Tile13 = new javax.swing.JButton();
        Tile22 = new javax.swing.JButton();
        Tile23 = new javax.swing.JButton();
        Tile21 = new javax.swing.JButton();
        Tile24 = new javax.swing.JButton();
        Tile31 = new javax.swing.JButton();
        Tile32 = new javax.swing.JButton();
        ScoreScreen = new javax.swing.JTextField();
        ScoreScreenLabel = new javax.swing.JLabel();
        startGameButton = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();
        DebugCheck = new javax.swing.JCheckBox();
        timer_label = new javax.swing.JLabel();
        menu_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        QuitMenuItem = new javax.swing.JMenuItem();
        GameMenu = new javax.swing.JMenu();
        resetBoardMenuItem = new javax.swing.JMenuItem();
        enableDebug = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2x5 Memory Game");
        setMaximumSize(new java.awt.Dimension(770, 430));
        setMinimumSize(new java.awt.Dimension(770, 430));
        setPreferredSize(new java.awt.Dimension(770, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(770, 430));
        getContentPane().setLayout(null);

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
        Tile11.setBounds(35, 102, 100, 100);

        Tile14.setEnabled(false);
        Tile14.setFocusable(false);
        Tile14.setName(""); // NOI18N
        Tile14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile14ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile14);
        Tile14.setBounds(356, 102, 100, 100);

        Tile12.setEnabled(false);
        Tile12.setFocusable(false);
        Tile12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile12ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile12);
        Tile12.setBounds(142, 102, 100, 100);

        Tile13.setEnabled(false);
        Tile13.setFocusable(false);
        Tile13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile13ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile13);
        Tile13.setBounds(249, 102, 100, 100);

        Tile22.setEnabled(false);
        Tile22.setFocusable(false);
        Tile22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile22ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile22);
        Tile22.setBounds(35, 209, 100, 100);

        Tile23.setEnabled(false);
        Tile23.setFocusable(false);
        Tile23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile23ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile23);
        Tile23.setBounds(142, 209, 100, 100);

        Tile21.setEnabled(false);
        Tile21.setFocusable(false);
        Tile21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile21ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile21);
        Tile21.setBounds(463, 102, 100, 100);

        Tile24.setEnabled(false);
        Tile24.setFocusable(false);
        Tile24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile24ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile24);
        Tile24.setBounds(249, 209, 99, 100);

        Tile31.setEnabled(false);
        Tile31.setFocusable(false);
        Tile31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile31ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile31);
        Tile31.setBounds(355, 209, 100, 100);

        Tile32.setEnabled(false);
        Tile32.setFocusable(false);
        Tile32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile32ActionPerformed(evt);
            }
        });
        getContentPane().add(Tile32);
        Tile32.setBounds(463, 209, 100, 100);

        ScoreScreen.setEditable(false);
        ScoreScreen.setBackground(new java.awt.Color(204, 204, 255));
        ScoreScreen.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ScoreScreen.setText("0");
        ScoreScreen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ScoreScreen.setEnabled(false);
        ScoreScreen.setFocusable(false);
        getContentPane().add(ScoreScreen);
        ScoreScreen.setBounds(103, 29, 181, 38);

        ScoreScreenLabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        ScoreScreenLabel.setText("SCORE:");
        getContentPane().add(ScoreScreenLabel);
        ScoreScreenLabel.setBounds(35, 13, 63, 76);

        startGameButton.setBackground(new java.awt.Color(153, 0, 153));
        startGameButton.setText("START");
        startGameButton.setToolTipText("");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startGameButton);
        startGameButton.setBounds(356, 33, 73, 38);

        QuitButton.setBackground(new java.awt.Color(153, 0, 153));
        QuitButton.setText("QUIT");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(QuitButton);
        QuitButton.setBounds(463, 32, 80, 40);

        DebugCheck.setText("Debug");
        DebugCheck.setToolTipText("");
        DebugCheck.setEnabled(false);
        getContentPane().add(DebugCheck);
        DebugCheck.setBounds(35, 379, 65, 25);

        timer_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timer_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(timer_label);
        timer_label.setBounds(575, 102, 100, 74);

        menu_button.setBackground(new java.awt.Color(153, 0, 153));
        menu_button.setText("MENU");
        menu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(menu_button);
        menu_button.setBounds(585, 34, 79, 36);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ugure\\OneDrive\\Belgeler\\NetBeansProjects\\MemoryGame-master\\src\\memorygame\\MGshapes\\1610897432_37-p-bledno-goluboi-odnotonnii-fon-41.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 430);

        FileMenu.setText("File");

        QuitMenuItem.setText("Quit");
        QuitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(QuitMenuItem);

        jMenuBar1.add(FileMenu);

        GameMenu.setText("Game");

        resetBoardMenuItem.setText("Reset Board");
        resetBoardMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBoardMenuItemActionPerformed(evt);
            }
        });
        GameMenu.add(resetBoardMenuItem);

        enableDebug.setText("Enable debugging");
        enableDebug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableDebugActionPerformed(evt);
            }
        });
        GameMenu.add(enableDebug);

        jMenuBar1.add(GameMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        
        Timer();
        running = false;
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
        totalPairs = 0;
        correctPairs = 0;
        
        ScoreScreen.setText(Integer.toString(score));
        
        
        Tile11.setEnabled(true);
        Tile12.setEnabled(true);
        Tile13.setEnabled(true);
        Tile14.setEnabled(true);
        Tile21.setEnabled(true);
        Tile22.setEnabled(true);
        Tile23.setEnabled(true);
        Tile24.setEnabled(true);
        Tile31.setEnabled(true);
        Tile32.setEnabled(true);
        
        
        
        wipeBoard();
        
        
        
        tileControl.initShuffle2x5Tiles();
        for (int i = 0; i<= 9; i++){
            System.out.print(i + ": ");
            int type = tileControl.get2x5TileType(i);
            
            
            if (DebugCheck.isSelected()){
                showTileShape(i, type);
            }
        }
        
        System.out.println();
        
        
        flashShapes();
        
        running = true;
        
    }//GEN-LAST:event_startGameButtonActionPerformed

    
    private void Tile11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile11ActionPerformed
        int ID = 0;
        int type;
        
        //System.out.print("1,1 -- ");
        type = tileControl.get2x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile11ActionPerformed

    
    private void Tile12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile12ActionPerformed
        int ID = 1;
        int type;
        
        //System.out.print("1,2 -- ");
        type = tileControl.get2x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile12ActionPerformed

    
    private void Tile13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile13ActionPerformed
        int ID = 2;
        int type;
         
        
        type = tileControl.get2x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile13ActionPerformed

    
    private void Tile14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile14ActionPerformed
        int ID = 3;
        int type;
         
        
        type = tileControl.get2x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile14ActionPerformed

    
    private void Tile21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile21ActionPerformed
        int ID = 4;
        int type;
        
        
        type = tileControl.get2x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile21ActionPerformed

    
    private void Tile22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile22ActionPerformed
        int ID = 5;
        int type;
        
        
        type = tileControl.get2x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile22ActionPerformed

    
    private void Tile23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile23ActionPerformed
        int ID = 6;
        int type;
       
        
        type = tileControl.get2x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile23ActionPerformed

    
    private void Tile24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile24ActionPerformed
        int ID = 7;
        int type;
             
        
        type = tileControl.get2x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile24ActionPerformed

    
    private void Tile31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile31ActionPerformed
        int ID = 8;
        int type;
        
        
        type = tileControl.get2x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile31ActionPerformed

    
    private void Tile32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile32ActionPerformed
        int ID = 9;
        int type;   
        
        
        type = tileControl.get2x5TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile32ActionPerformed

    
    private void QuitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitMenuItemActionPerformed
        System.out.println("========================\n"
                 + "*** 2 x 5  C L O S E ***\n"
                 + "========================");
        resetBoardMenuItemActionPerformed(evt);
        System.exit(0);
    }//GEN-LAST:event_QuitMenuItemActionPerformed
    
   
    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed
        
        System.out.println("========================\n"
                         + "*** 2 x 5  C L O S E ***\n"
                         + "========================");
        System.out.println("\nBye!");
        System.exit(0);
    }//GEN-LAST:event_QuitButtonActionPerformed

    
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
        
        
        DebugCheck.setEnabled(false);
    }//GEN-LAST:event_resetBoardMenuItemActionPerformed

    
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

    private void menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buttonActionPerformed
         
        MainMenuForm menu = new MainMenuForm();
        setVisible(false);
        menu.setVisible(true);
        
        timer.cancel();
                 
    }//GEN-LAST:event_menu_buttonActionPerformed

   
    private void showTileShape(int ID, int type){
        
        ArrayList<ImageIcon> shapes = new ArrayList();
        shapes.add(Circle);
        shapes.add(Cross);
        shapes.add(Diamond);
        shapes.add(Donut);
        shapes.add(Eclipse);
        shapes.add(Square);
        shapes.add(Star);
        shapes.add(X);

        
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
                Tile21.setIcon(shapes.get(type));
                break;
            case 5:
                Tile22.setIcon(shapes.get(type));
                break;
            case 6:
                Tile23.setIcon(shapes.get(type));
                break;
            case 7:
                Tile24.setIcon(shapes.get(type));
                break;
            case 8:
                Tile31.setIcon(shapes.get(type));
                break;
            case 9:
                Tile32.setIcon(shapes.get(type));
                break;
               
        }
    }
    
    
    private void wipeBoard(){
        Tile11.setIcon(Blank);
        Tile12.setIcon(Blank);
        Tile13.setIcon(Blank);
        Tile14.setIcon(Blank);
        Tile21.setIcon(Blank);
        Tile22.setIcon(Blank);
        Tile23.setIcon(Blank);
        Tile24.setIcon(Blank);
        Tile31.setIcon(Blank);
        Tile32.setIcon(Blank);
        
    }
    
    
    private boolean testMatch(int type1, int type2){
        boolean match = false;
        
        if (type1 == type2){
            match = true;
        }
        
        return match;
    }
    
    
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
                Tile21.setIcon(Blank);
                break;
            case 5:
                Tile22.setIcon(Blank);
                break;
            case 6:
                Tile23.setIcon(Blank);
                break;
            case 7:
                Tile24.setIcon(Blank);
                break;
            case 8:
                Tile31.setIcon(Blank);
                break;
            case 9:
                Tile32.setIcon(Blank);
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
                Tile21.setEnabled(state);
                break;
            case 5:
                Tile22.setEnabled(state);
                break;
            case 6:
                Tile23.setEnabled(state);
                break;
            case 7:
                Tile24.setEnabled(state);
                break;
            case 8:
                Tile31.setEnabled(state);
                break;
            case 9:
                Tile32.setEnabled(state);
                break;
                
        }                
    }
    
    
    private void checkEndGame(){
        
             
        if (!Tile11.isEnabled() && !Tile12.isEnabled() && !Tile13.isEnabled() && !Tile14.isEnabled() && 
                !Tile21.isEnabled() && !Tile22.isEnabled() && !Tile23.isEnabled() && !Tile24.isEnabled() &&
                !Tile31.isEnabled() && !Tile32.isEnabled())  {
        
            accuracy = correctPairs / totalPairs * 100;
            accuracy = Math.round (accuracy * 10.0) / 10.0; 
            System.out.println("============GAME=OVER===========\n"
                        + "Total Pairs: " + totalPairs + " Correct Pairs: " + correctPairs + "\n"
                        + "Accuracy: " + accuracy + "%\n"
                        + "Score: " + score);
            
            ct.cancel();
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
    
    
    private void buttonPress(int ID, int type){
        if (count == 0){
            System.out.println("(0)COUNT: " + count);
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
            System.out.println("(1)COUNT: " + count);
            showTileShape(ID, type);
            ID_Guess2 = ID;
            type_Guess2 = type;
            PrevID_Guess1 = ID_Guess1;
            PrevID_Guess2 = ID_Guess2;
            
            System.out.println("GUESS 2 ** Location2: " + ID + ", Shape_Code: " + type);
            
            
            if (ID_Guess1 == ID_Guess2){
                JOptionPane.showMessageDialog(
                    rootPane,
                    "You cannot pick the same tile twice.\n" + 
                    "That's considered cheating. Pick 2 distinct tiles.", 
                    "Invalid Move", WIDTH, null
                );
                hideSelectedTile(ID_Guess1);
                ID_Guess1 = 100;
                ID_Guess2 = 100;
                PrevID_Guess1 = 100;
                PrevID_Guess2 = 100;
                buttonEnabledSwitch(true,ID_Guess1);
            }
            else {
                match = testMatch(type_Guess1, type_Guess2);

                if (!match){
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
                    for (int i = 0; i<= 9; i++){
                        int type = tileControl.get2x5TileType(i);
                        showTileShape(i, type);
                    }
                    Thread.sleep(800);
                    if (!DebugCheck.isSelected()){
                        wipeBoard();
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(GameBoard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        thread.start(); 
    }
    
    public void Timer() {
        ct = new TimerTask() {
            int time = 1 * 30;

            @Override
            public void run() {
                if (running != false) {
                    String a = Integer.toString(time);
                    timer_label.setText(a);
                    time -= 1;
                    

                    if (time == 0) {
                        timer.cancel();
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
        timer.schedule(ct, 0, 1000);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox DebugCheck;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu GameMenu;
    private javax.swing.JButton QuitButton;
    private javax.swing.JMenuItem QuitMenuItem;
    private javax.swing.JTextField ScoreScreen;
    private javax.swing.JLabel ScoreScreenLabel;
    private javax.swing.JButton Tile11;
    private javax.swing.JButton Tile12;
    private javax.swing.JButton Tile13;
    private javax.swing.JButton Tile14;
    private javax.swing.JButton Tile21;
    private javax.swing.JButton Tile22;
    private javax.swing.JButton Tile23;
    private javax.swing.JButton Tile24;
    private javax.swing.JButton Tile31;
    private javax.swing.JButton Tile32;
    private javax.swing.JMenuItem enableDebug;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton menu_button;
    private javax.swing.JMenuItem resetBoardMenuItem;
    private javax.swing.JButton startGameButton;
    public static javax.swing.JLabel timer_label;
    // End of variables declaration//GEN-END:variables

    //GLOBALS
    TileControl tileControl = new TileControl();
   
    ImageIcon Circle    = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Circle.png"));
    ImageIcon Cross     = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Cross.png"));
    ImageIcon Diamond   = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Diamond.png"));
    ImageIcon Donut     = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Donut.png"));
    ImageIcon Eclipse   = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Eclipse.png"));
    ImageIcon Square    = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Square.png"));
    ImageIcon Star      = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Star.png"));
    ImageIcon X         = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/X.png"));
    ImageIcon Blank     = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/blankTile.png"));
    ImageIcon WIN       = new javax.swing.ImageIcon(getClass().getResource("/memorygame/win-loss/WIN.png"));
    ImageIcon LOSS      = new javax.swing.ImageIcon(getClass().getResource("/memorygame/win-loss/LOSS.png"));
    
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
    
    public Timer timer = new Timer();
    public TimerTask ct = null;
    public static boolean running = false;
    
}
