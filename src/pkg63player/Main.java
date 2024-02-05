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

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author tala
 */
public class Main {

    public void createEmptyFolderInAppData() {
        try {
            // Obtain the user's home directory
            Path userHome = Paths.get(System.getProperty("user.home"));

            // Construct the path to the AppData\Roaming\YourAppName\YourFolder
            Path appDataPath = userHome.resolve("AppData").resolve("Roaming").resolve("63Player").resolve("Music");

            // Check if the folder doesn't exist, and then create it
            if (!Files.exists(appDataPath)) {
                System.out.println("================FIRST TIME=============");
                Files.createDirectories(appDataPath);
                System.out.println("Empty folder created at: " + appDataPath);
                
                // Display a dialogue for the user
                JOptionPane.showMessageDialog(null, 
                        "Looks like it's your first time running this program.\n"
                        + "Your folder is either empty or doesn't exist.\n"
                        + "Place some music files in that folder.");
            } else {
                System.out.println("Folder already exists at: " + appDataPath);
            }
        } catch (IOException e) {
            System.err.println("Error creating folder: " + e.getMessage());
        }
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().createEmptyFolderInAppData();
        Splashscreen hehe = new Splashscreen();
        hehe.setVisible(true);
        System.out.println("hello.");
        Timer delayTimer = new Timer(500, (ActionEvent e) -> {
            hehe.TransitionTimer(hehe);
        });
        delayTimer.setRepeats(false);
        delayTimer.start();
    }
    
}
