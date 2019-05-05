package org.jfg.drills.dsandalgorithmsgoodrich.ch03.dsaj.arrays;

public class GameBoard {

    int numberOfEntries;
    GameEntry [] gameEntries;

    public GameBoard(int boardCapacity) {
        this.gameEntries = new GameEntry[boardCapacity];
    }

    public void add(GameEntry gameEntry) {

        int newScore = gameEntry.getScore();

        if (this.numberOfEntries < this.gameEntries.length
                || newScore > this.gameEntries[this.numberOfEntries-1].getScore()) {
            if (this.numberOfEntries < this.gameEntries.length)
                this.numberOfEntries++;


            int j = numberOfEntries - 1;
            while (j > 0 && this.gameEntries[j - 1].getScore() < newScore) {
                this.gameEntries[j] = this.gameEntries[j - 1];
                j--;
            }
            this.gameEntries[j] = gameEntry;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(GameEntry ge: this.gameEntries){
            sb.append(ge.getScore())
                    .append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // write your code here

        GameBoard gb = new GameBoard(4);

        GameEntry ge1 = new GameEntry(3);
        GameEntry ge2 = new GameEntry(10);
        GameEntry ge3 = new GameEntry(16);
        GameEntry ge4 = new GameEntry(1);
        GameEntry ge5 = new GameEntry(5);
        GameEntry ge6 = new GameEntry(6);
        GameEntry ge7 = new GameEntry(1);

        gb.add(ge1);
        gb.add(ge2);
        gb.add(ge3);
        gb.add(ge4);
        gb.add(ge5);
        gb.add(ge6);
        gb.add(ge7);

        System.out.println(gb.toString());
    }
}
