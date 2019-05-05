package org.jfg.drills.dsandalgorithmsgoodrich.ch03.dsaj.arrays;

public class GameEntry {

    private String name;
    private int score;


    public GameEntry(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
