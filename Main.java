package edu.ncat.brickbreakerbackend;

import javafx.scene.paint.Color;

public class Main {
    public static void main(String[] args) {

        String conFigFile = "brickbreaker.txt";

        Level[] levels = BrickBreakerIO.readConfigFile(conFigFile);

        for (int i = 0; i < levels.length; i++) {
            System.out.println(levels[i].toString());
        }

        //GameProfiles profile = new GameProfiles();
        //BrickBreakerIO.readProfiles(profile, "brickbreakerprofiles.txt");

        //System.out.println(profile);

        BrickRow brickRow1 = new BrickRow(10, Color.RED, "111111");
        BrickRow brickRow2 = new BrickRow(20, Color.GREEN, "000000");
        BrickRow brickRow3 = new BrickRow(30, Color.BLUE, "111111");
        System.out.println(brickRow1.toString());
        System.out.println(brickRow2.toString());
        System.out.println(brickRow3.toString());
        System.out.println();

        Level level1 = new Level(0, 3);
        level1.setBrickRow(0, brickRow1);
        level1.setBrickRow(1, brickRow2);
        level1.setBrickRow(2, brickRow3);
        System.out.println(level1.toString());
        System.out.println();

        PlayerProfile player1 = new PlayerProfile("Bryce");
        player1.setNumGamesPlayed(13);
        player1.setHighScore(1200);
        //System.out.println(player1.toString());

        PlayerProfile player2 = new PlayerProfile("Sarah");
        player2.setNumGamesPlayed(20);
        player2.setHighScore(1500);
        //System.out.println();
        //System.out.println(player2.toString());
        //System.out.println();

        GameProfiles profile1 = new GameProfiles();
        profile1.addPlayerProfile(player1);
        //System.out.println();

    }

}