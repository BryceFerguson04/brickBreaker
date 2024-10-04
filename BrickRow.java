/**+
 * Bryce Ferguson
 * 10/4/2024
 * COMP 167 Section 3
 * This code is the BrickRow class.
 */
package edu.ncat.brickbreakerbackend;

import javafx.scene.paint.Color;

public class BrickRow {
    private int pointValue;
    private Color color;
    private boolean [] brickMask;

    /**+
     * no-argument constructor
     */
    public BrickRow() {
        this.pointValue = 0;
        this.color =Color.BLACK;
        setBrickMask(new boolean[20]);
    }

    public BrickRow(int ptVal, Color clr, String bMask) {
        this.setPointValue(ptVal);
        this.setColor(clr);
        setBrickMask(new boolean[bMask.length()]);
        for (int i = 0; i < bMask.length(); i++) {
            if (bMask.charAt(i) == '1') {
                this.brickMask[i] = true;
            }
            else {
                this.brickMask[i] = false;
            }
        }
    }

    public boolean getBrickMaskValue(int index) {
        return this.getBrickMask()[index];
    }

    public void setBrickMaskValue(int index, boolean value) {
        this.getBrickMask()[index] = value;
    }

    public int getBrickMaskLength() {
        return this.getBrickMask().length;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean[] getBrickMask() {
        return brickMask;
    }

    public void setBrickMask(boolean[] brickMask) {
        this.brickMask = brickMask;
    }

    @Override
    public String toString() {
        int red = (int) (color.getRed() * 255);
        int green = (int) (color.getGreen() * 255);
        int blue = (int) (color.getBlue() * 255);
        String string1 = '\n'+ "" + pointValue + '\n' + (int) (color.getRed() * 255) +" " + (int) (color.getGreen() * 255) + " " + (int) (color.getBlue() * 255) + '\n';
        String string2 = "";
        for (int i = 0; i < brickMask.length; i++) {
            if (brickMask[i]) {
                string2 += '1';
            }
            else{
                string2 += '0';
            }
        }
        return  string1  + string2;
    }
}
