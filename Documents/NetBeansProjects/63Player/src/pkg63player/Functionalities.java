/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg63player;

/**
 *
 * @author Hp
 */
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Functionalities {
    
    private Player localPlayer;
    
    Functionalities(Player player){
        this.localPlayer = player;
    }
    
    class Song {
        String pathName;
        String title;
        String artist;

        public Song(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }
    }

    class Node {
        Song song;
        Node next;
        Node prev;
        Node currentSong;

        public Node(Song song) {
            this.song = song;
            this.next = null;
            this.prev = null;
        }

        // Play song
        public void play() {
            if (this != null) {
                String pathname = "music/" + this.song.title + ".mp3";
                File file = new File(pathname);
                System.out.println("Found " + file.getAbsolutePath());

                try {
                    InputStream stream = new FileInputStream(file);
                    Player player = new Player(stream);
                    player.play();
                    player.close();
                    System.out.println("Now playing: " + this.song);
                } catch (FileNotFoundException | JavaLayerException e) {
                    System.out.println("Error playing the song: " + e.getMessage());
                }
            } else {
                System.out.println("Playlist is empty.");
            }
        }

        // Next Song
        public void next() {
           
            if (this != null && this.next != null) {
                this.currentSong = this.next;
                System.out.println("Playing next: " + this.song);
            } else {
                System.out.println("End of playlist.");
            }
        }

        // Previous song
        public void previous() {
            if (this != null && this.prev != null) {
                this.currentSong = this.prev;
                System.out.println("Playing previous: " + this.song);
            } else {
                System.out.println("Beginning of playlist.");
            }
        }
    }
}


    

