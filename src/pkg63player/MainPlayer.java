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
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * This is the main program, where the user interacts with the player.
 * @author tala
 */
public class MainPlayer extends javax.swing.JFrame {

    /**
     * Creates new form Main menu
     */
    boolean a = false;
    DefaultListModel<String> listModel = new DefaultListModel<>();
    String defaultPath;
    
    /**
     * this constructor makes sure all variables are initialized from previous classes.
     * @param currentListModel contains lists of songs stored in user's home folder.
     * @param defaultPath this is default home directory of users
     */
    public MainPlayer(DefaultListModel<String> currentListModel, String defaultPath) {
        this.listModel = currentListModel;
        this.defaultPath = defaultPath;
        try
        {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                if("Windows".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        }catch(Exception ex){
            
        }
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        iconminmaxclose = new javax.swing.JPanel();
        Buttonclose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        Buttonmax = new javax.swing.JPanel();
        fullmax = new javax.swing.JLabel();
        ButtonMin = new javax.swing.JPanel();
        push = new javax.swing.JPanel();
        TitileBar = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        buttonhidemenu = new javax.swing.JLabel();
        linehidemenu = new javax.swing.JPanel();
        menuhide = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListPlaylist = new javax.swing.JList<>();
        ButtonAddMusic = new javax.swing.JButton();
        dashboardview = new javax.swing.JPanel();
        LabelSongName = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        VolumeSlider = new javax.swing.JSlider();
        Inset = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        IconPrev = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        IconPlayPause = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        IconNext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grooviza - Java Player");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setResizable(false);

        Header.setBackground(new java.awt.Color(203, 145, 192));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        iconminmaxclose.setBackground(new java.awt.Color(203, 145, 192));
        iconminmaxclose.setPreferredSize(new java.awt.Dimension(150, 50));
        iconminmaxclose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buttonclose.setBackground(new java.awt.Color(203, 145, 192));
        Buttonclose.setLayout(new java.awt.BorderLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg63player/img/Close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        Buttonclose.add(close, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(Buttonclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 50));

        Buttonmax.setBackground(new java.awt.Color(203, 145, 192));
        Buttonmax.setLayout(new java.awt.BorderLayout());

        fullmax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullmax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg63player/img/Maximize.png"))); // NOI18N
        fullmax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullmaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fullmaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fullmaxMouseExited(evt);
            }
        });
        Buttonmax.add(fullmax, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(Buttonmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        ButtonMin.setBackground(new java.awt.Color(203, 145, 192));
        ButtonMin.setLayout(new java.awt.BorderLayout());
        iconminmaxclose.add(ButtonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        Header.add(iconminmaxclose, java.awt.BorderLayout.LINE_END);

        push.setBackground(new java.awt.Color(203, 145, 192));
        push.setPreferredSize(new java.awt.Dimension(160, 50));

        javax.swing.GroupLayout pushLayout = new javax.swing.GroupLayout(push);
        push.setLayout(pushLayout);
        pushLayout.setHorizontalGroup(
            pushLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        pushLayout.setVerticalGroup(
            pushLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Header.add(push, java.awt.BorderLayout.LINE_START);

        TitileBar.setFont(new java.awt.Font("Source Code Pro", 1, 36)); // NOI18N
        TitileBar.setForeground(new java.awt.Color(255, 255, 255));
        TitileBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitileBar.setText("Grooviza");
        Header.add(TitileBar, java.awt.BorderLayout.CENTER);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        menu.setPreferredSize(new java.awt.Dimension(50, 450));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(203, 146, 192));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hidemenu.setBackground(new java.awt.Color(203, 146, 192));
        hidemenu.setLayout(new java.awt.BorderLayout());

        buttonhidemenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonhidemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg63player/img/menu_32px.png"))); // NOI18N
        buttonhidemenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonhidemenu.setMaximumSize(new java.awt.Dimension(50, 50));
        buttonhidemenu.setPreferredSize(new java.awt.Dimension(50, 50));
        buttonhidemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseExited(evt);
            }
        });
        hidemenu.add(buttonhidemenu, java.awt.BorderLayout.LINE_END);

        MenuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        linehidemenu.setBackground(new java.awt.Color(203, 146, 192));
        linehidemenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linehidemenuLayout = new javax.swing.GroupLayout(linehidemenu);
        linehidemenu.setLayout(linehidemenuLayout);
        linehidemenuLayout.setHorizontalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidemenuLayout.setVerticalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(linehidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 5));

        menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        menuhide.setBackground(new java.awt.Color(203, 146, 192));

        ListPlaylist.setBackground(new java.awt.Color(203, 146, 192));
        ListPlaylist.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ListPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        ListPlaylist.setModel(listModel);
        ListPlaylist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        ListPlaylist.setMaximumSize(new java.awt.Dimension(77, 74));
        ListPlaylist.setPreferredSize(new java.awt.Dimension(210, 74));
        jScrollPane1.setViewportView(ListPlaylist);

        menuhide.add(jScrollPane1);

        ButtonAddMusic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonAddMusic.setText("Add Music");
        ButtonAddMusic.setToolTipText("adds music to your list!");
        ButtonAddMusic.setPreferredSize(new java.awt.Dimension(150, 35));
        ButtonAddMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddMusicActionPerformed(evt);
            }
        });
        menuhide.add(ButtonAddMusic);

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        dashboardview.setBackground(new java.awt.Color(0, 0, 0));

        LabelSongName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelSongName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelSongName.setText(listModel.firstElement());

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg63player/img/JavaBackground800.png"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Background.setPreferredSize(new java.awt.Dimension(1860, 920));

        javax.swing.GroupLayout dashboardviewLayout = new javax.swing.GroupLayout(dashboardview);
        dashboardview.setLayout(dashboardviewLayout);
        dashboardviewLayout.setHorizontalGroup(
            dashboardviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardviewLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LabelSongName, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        dashboardviewLayout.setVerticalGroup(
            dashboardviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardviewLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(LabelSongName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        getContentPane().add(dashboardview, java.awt.BorderLayout.CENTER);

        Footer.setBackground(new java.awt.Color(234, 199, 206));
        Footer.setPreferredSize(new java.awt.Dimension(800, 81));
        Footer.setLayout(new java.awt.BorderLayout(2, 0));

        VolumeSlider.setBackground(new java.awt.Color(234, 199, 206));
        VolumeSlider.setForeground(new java.awt.Color(5, 5, 5));
        VolumeSlider.setPaintLabels(true);
        VolumeSlider.setPaintTicks(true);
        VolumeSlider.setSnapToTicks(true);
        VolumeSlider.setFocusable(false);
        Footer.add(VolumeSlider, java.awt.BorderLayout.LINE_END);

        Inset.setBackground(new java.awt.Color(234, 199, 206));
        Inset.setPreferredSize(new java.awt.Dimension(800, 160));

        jPanel3.setEnabled(false);
        jPanel3.setFocusable(false);
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 100));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Inset.add(jPanel3);

        IconPrev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg63player/img/64prev.png"))); // NOI18N
        Inset.add(IconPrev);

        jPanel2.setEnabled(false);
        jPanel2.setFocusable(false);
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 100));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Inset.add(jPanel2);

        IconPlayPause.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconPlayPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg63player/img/64pause.png"))); // NOI18N
        Inset.add(IconPlayPause);

        jPanel1.setBackground(new java.awt.Color(234, 199, 206));
        jPanel1.setEnabled(false);
        jPanel1.setFocusable(false);
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 10));
        jPanel1.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Inset.add(jPanel1);

        IconNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg63player/img/64next.png"))); // NOI18N
        Inset.add(IconNext);

        Footer.add(Inset, java.awt.BorderLayout.CENTER);

        getContentPane().add(Footer, java.awt.BorderLayout.PAGE_END);

        setSize(new java.awt.Dimension(800, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshList() {
        System.out.println("List refreshed!");
    }
    
    /**
     *
     * @param hover
     * @param rand
     */
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    /**
     *
     * @param h1
     * @param h2
     * @param numberbool
     */
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        if(numberbool == 1){
            h1.setBackground(new Color(25, 29, 74));
            h2.setBackground(new Color(5, 10, 46));
        }
        else{
            h1.setBackground(new Color(5, 10, 46));
            h2.setBackground(new Color(25, 29, 74));
        }
    }
    
    /**
     *
     * @param button
     * @param resourcheimg
     */
    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    
    /**
     *
     * @param menushowhide
     * @param dashboard
     * @param button
     */
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        if(dashboard == true){
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/pkg63player/img/menu_32px.png");
        }
        else{
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeimage(button, "/pkg63player/img/back_32px.png");
        }
        
    }
    
        private void showFileChooserAndMoveFiles() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Music Files", "mp3", "wav", "ogg");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            List<Path> selectedFiles = List.of(fileChooser.getSelectedFiles()).stream()
                    .map(File::toPath)
                    .toList();

            selectedFiles.forEach(file -> copyFile(file, Path.of(defaultPath, file.getFileName().toString())));

            System.out.println("Music files copied successfully.");
            RefreshList();
        }
    }


    private void copyFile(Path source, Path destination) {
        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
    
    
    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changecolor(Buttonclose, new Color(190, 135, 172));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changecolor(Buttonclose, new Color(203, 145, 192));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void fullmaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseEntered
        changecolor(Buttonmax, new Color(190, 135, 172));
    }//GEN-LAST:event_fullmaxMouseEntered

    private void fullmaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseExited
        changecolor(Buttonmax, new Color(203, 145, 192));
    }//GEN-LAST:event_fullmaxMouseExited

    private void fullmaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseClicked
        if(this.getExtendedState()!= MainPlayer.MAXIMIZED_BOTH){
          this.setExtendedState(MainPlayer.MAXIMIZED_BOTH);
          Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg63player/img/JavaBackgroundFS.png"))); // NOI18N
          Background.setPreferredSize(new java.awt.Dimension(1860,920));
          LabelSongName.setHorizontalAlignment(MAXIMIZED_HORIZ);

        }
        else{
            this.setExtendedState(MainPlayer.NORMAL);
            Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg63player/img/JavaBackground800.png"))); // NOI18N
            Background.setLayout(new java.awt.BorderLayout());
        }
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_fullmaxMouseClicked

    private void buttonhidemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseClicked
        if(a==true){
            hideshow(menu, a, buttonhidemenu);
            SwingUtilities.updateComponentTreeUI(this);
            //create methode change image

            a=false;
        }
        else{
            hideshow(menu, a, buttonhidemenu);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
        }

    }//GEN-LAST:event_buttonhidemenuMouseClicked

    private void buttonhidemenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseEntered
        changecolor(linehidemenu, new Color(247, 78, 105));
    }//GEN-LAST:event_buttonhidemenuMouseEntered

    private void buttonhidemenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseExited
        changecolor(linehidemenu, new Color(203, 146, 192));
    }//GEN-LAST:event_buttonhidemenuMouseExited

    private void ButtonAddMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddMusicActionPerformed

        showFileChooserAndMoveFiles();
        
    }//GEN-LAST:event_ButtonAddMusicActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPlayer(listModel, "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ButtonAddMusic;
    private javax.swing.JPanel ButtonMin;
    private javax.swing.JPanel Buttonclose;
    private javax.swing.JPanel Buttonmax;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel IconNext;
    private javax.swing.JLabel IconPlayPause;
    private javax.swing.JLabel IconPrev;
    private javax.swing.JPanel Inset;
    private javax.swing.JLabel LabelSongName;
    private javax.swing.JList<String> ListPlaylist;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JLabel TitileBar;
    private javax.swing.JSlider VolumeSlider;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashboardview;
    private javax.swing.JLabel fullmax;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconminmaxclose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel push;
    // End of variables declaration//GEN-END:variables



}
