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
 * This class contains the main method and serves as the entry point for the application.
 * @author tala
 */
public class Main {

    private static void printHelpMessage() {
    System.out.println("Usage: java Main [options]");
    System.out.println("Options:");
    System.out.println("-h, --help\tDisplay this help message");
    // Add any other options and descriptions as needed
}
    
    /**
     * Creates folder in user's home directory where it will store all added music!
     */
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
                //Folder already exists.
            } else {
                System.out.println("Folder already exists at: " + appDataPath);
            }
            //Throws error it folder creations fails
        } catch (IOException e) {
            System.err.println("Error creating folder: " + e.getMessage());
        }
    }
        
    /**
     * This will always be the starting point of the program, no other class with main method can run the program normally.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length > 0 && (args[0].equals("-h") || args[0].equals("--help"))) {
        printHelpMessage();
        return; // exit the program
    }
        
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
