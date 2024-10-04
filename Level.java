/**+
 *
 */
package edu.ncat.brickbreakerbackend;

public class Level {
    //Fields
    private int levelNum;
    private BrickRow[] brickRows;

    //Default Constructor
    public Level() {
        this.levelNum = 0;
        this.brickRows = new BrickRow[0];
    }

    //The parameterized Constructor
    public Level(int levelNum, int numBrickRows) {
        this.levelNum = levelNum;
        this.brickRows = new BrickRow[numBrickRows]; //Initializes the brickRows array with numBrickRows
    }

    public int getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(int levelNum) {
        this.levelNum = levelNum;
    }

    public BrickRow getBrickRow(int index) {
        return brickRows[index];
    }

    public void setBrickRow(int index, BrickRow bkRow) {
        this.brickRows[index] = bkRow;
    }

    public int getBricksPerRow() {
        return brickRows[0].getBrickMaskLength();
    }

    public int getNumBrickRows(){
        return brickRows.length;
    }

    @Override
    public String toString() {
       String string3 = "" + levelNum + '\n' + brickRows.length + '\n';
       for (int i = 0; i < brickRows.length; i++) {
           string3 += i + brickRows[i].toString();
       }

       return string3 + '\n';
    }

}
