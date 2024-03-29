/*
 * Copyright (C) 2024 tala
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pkg63player;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.Timer;

/**
 * this splash screen is unnecessary but I still made it, and spent most of the time on this rather than the MainPlayer class, 
 * still pretty proud of it. it gives 3 second initial delay.
 * 
 * Displays important informations like what song it has found in home folder and stuff.
 * 
 * @author tala
 */
public final class Splashscreen extends javax.swing.JFrame {
    private Timer loadingTimer;
    private Timer transitionTimer;
    DefaultListModel<String> currentListModel;
    private int loaded = 0;
    private final String[] allowedExtensions;
    private final Random random;

    String defaultPath = System.getProperty("user.home") + "\\AppData\\Roaming\\63Player\\Music\\";


    /**
     * Creates new form Splash screen
     */
     public Splashscreen() {
        this.random = new Random();
        this.allowedExtensions = new String[]{"mp3", "wav"};
        this.currentListModel = new DefaultListModel<>();
        initComponents();
        currentListModel = loadFilesAndUpdatePlaylist(defaultPath);
        LoadingBar();
        TransitionTimer(this);
    }
    


    private int loader() {
        int randomIncrement = random.nextInt(5) + 1;
        return loaded += randomIncrement;
    }
        private Color getRandomColor() {
        int red = random.nextInt(175); 
        int green = random.nextInt(255); 
        int blue = random.nextInt(255); 

        return new Color(red, green, blue);
    }
    
    /**
     *  Cool animated loading bar at mini splash screen
     */
    public void LoadingBar() {
        System.out.println("LoadingBar Entered!");

        loadingTimer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (loaded <= 100) {
                    loadingBar.setValue(loader());
                    loadingBar.setForeground(getRandomColor());
                    
                    loadingBar.updateUI();
                    if(loaded >= 97)
                    {
                    } else {
                        LoadingText.setText(loaded + "%");
                        LoadingText.updateUI();}
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                    }
                } else {
                    loadingTimer.stop();
                    System.out.println("Loading complete!");
                }
            }
        });

        loadingTimer.setRepeats(true);
        loadingTimer.start();
    }
    
    /**
     *  3 second delay, just to show what songs have been loaded!
     * @param hehe
     */
    public void TransitionTimer(Splashscreen hehe) {
        transitionTimer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Loading~ Please wait...");
                hehe.dispose();
                System.out.println("Exited Splashscreen!");
                new MainPlayer(currentListModel, defaultPath).setVisible(true);
                transitionTimer.stop();
            }
        });

        transitionTimer.setRepeats(false);
        transitionTimer.start();
    }
    
    private DefaultListModel<String> loadFilesAndUpdatePlaylist(String folderPath) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        
        // Get a reference to the folder
        File folder = new File(folderPath);
        System.out.println("Folder is at " + folder.getAbsolutePath());
        
        // List all files in the folder
        File[] files = folder.listFiles();
        
        // Check each file for allowed extensions
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && hasAllowedExtension(file.getName())) {
                    listModel.addElement(file.getName());
                }
            }
        }
        
        // Update the JList with the new model
        LoadedSongs.setModel(listModel);
        return listModel;
    }
    
    // Method to check if a file has an allowed extension
    private boolean hasAllowedExtension(String fileName) {
        for (String extension : allowedExtensions) {
            if (fileName.toLowerCase().endsWith("." + extension)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SplashText = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        LoadingText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LoadedSongs = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(720, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SplashText.setFont(new java.awt.Font("Amazon Ember Heavy", 1, 48)); // NOI18N
        SplashText.setForeground(new java.awt.Color(141, 115, 128));
        SplashText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SplashText.setText("Grooviza");
        jPanel1.add(SplashText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 720, -1));
        jPanel1.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 540, 10));

        LoadingText.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        LoadingText.setText(loaded+"%");
        jPanel1.add(LoadingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 90, 40));

        jScrollPane1.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setRequestFocusEnabled(false);

        LoadedSongs.setBackground(new java.awt.Color(255, 0, 0));
        LoadedSongs.setBorder(null);
        LoadedSongs.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Music folder is empty!" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LoadedSongs.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        LoadedSongs.setAutoscrolls(false);
        LoadedSongs.setDoubleBuffered(true);
        LoadedSongs.setDropMode(javax.swing.DropMode.ON);
        LoadedSongs.setEnabled(false);
        LoadedSongs.setFixedCellWidth(1);
        LoadedSongs.setFocusable(false);
        LoadedSongs.setOpaque(false);
        LoadedSongs.setRequestFocusEnabled(false);
        LoadedSongs.setBackground(new Color(255, 255, 255, 0));
        jScrollPane1.setViewportView(LoadedSongs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 360));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Found:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg63player/img/JavaBackground.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JList<String> LoadedSongs;
    private javax.swing.JLabel LoadingText;
    private javax.swing.JLabel SplashText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar loadingBar;
    // End of variables declaration//GEN-END:variables
}
