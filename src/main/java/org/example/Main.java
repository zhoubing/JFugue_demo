package org.example;

import org.jfugue.player.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.play("C D E F G A B");
        player.play("V0 I[Piano] C6majW");
    }
}