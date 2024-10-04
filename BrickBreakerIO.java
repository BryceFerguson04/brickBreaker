package edu.ncat.brickbreakerbackend;

import javafx.scene.paint.Color;

import java.io.File;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BrickBreakerIO {

    public static Level[] readConfigFile(String cFileName) {
        try {
            File file = new File(cFileName);
            Scanner read = new Scanner(file);
            Level[] newLevel = new Level[read.nextInt()];

            for (int i = 0; i < newLevel.length; i++) {
                int levelCount = read.nextInt();
                int brickRowLength = read.nextInt();
                Level level = new Level(levelCount, brickRowLength);

                for (int j = 0; j < brickRowLength; j++) {
                    int brickRowNum = read.nextInt();
                    Color clr = Color.rgb(read.nextInt(), read.nextInt(), read.nextInt());
                    int points = read.nextInt();
                    read.next();
                    String brickMask = read.nextLine();
                    BrickRow bricks = new BrickRow(points, clr, brickMask);
                    level.setBrickRow(brickRowNum, bricks);
                }
                newLevel[i] = level;
            }
            read.close();
            return newLevel;
        }

        catch (FileNotFoundException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(-1);
            return null;
        }
    }

    public static void readProfiles(GameProfiles gmProf, String pFileName) {
        try {
            File file = new File(pFileName);
            Scanner read = new Scanner (file);
            PlayerProfile profile = new PlayerProfile(read.nextLine());
            while(read.hasNextLine()) {
                String name = read.nextLine();
                int gamesPlayed = read.nextInt();
                int highScore = read.nextInt();
                int savedGame = read.nextInt();
                read.nextLine();

                PlayerProfile pfile = new PlayerProfile(name);
                pfile.setNumGamesPlayed(gamesPlayed);
                pfile.setHighScore(highScore);

                gmProf.addPlayerProfile(profile);
            }
            read.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("Error reading the profile: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Input does not match:" + e.getMessage());
        }
    }

    public static void writeProfiles(GameProfiles gmProf, String pFileName) {
        try {
            PrintWriter write = new PrintWriter(pFileName);

            for (int i = 0; i < gmProf.getNumPlayerProfiles(); i++) {
                PlayerProfile profile = gmProf.getPlayerProfile(i);

                write.println(profile.getName());
                write.println(profile.getHighScore());
                write.println(profile.getNumGamesPlayed());
            }
            write.close();
        }

        catch(IOException e) {
            System.err.println("Can't write the profiles:" + e.getMessage());
        }
    }

}
