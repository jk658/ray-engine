package ParseableObjects;

import Other.Util;

/**
 * Created by Jacob on 09/04/2016.
 *
 * this class holds all relevant info received from the .txt file
 */
public class Set extends Parseable {

    private double[] background;
    private int numOfRays;
    private int maxRecursionDepth;


    //setters and getters

    public int getMaxRecursionDepth() {
        return maxRecursionDepth;
    }

    public void setMaxRecursionDepth(int maxRecursionDepth) {
        this.maxRecursionDepth = maxRecursionDepth;
    }

    public int getNumOfRays() {
        return numOfRays;
    }

    public void setNumOfRays(int numOfRays) {
        this.numOfRays = numOfRays;
    }

    public double[] getBackground() {
        return background;
    }

    public void setBackground(double[] background) {
        this.background = background;
    }

    @Override
    public void setParams(String[] params) {
        background = Util.getArr(params, 0, 3);
        numOfRays = Integer.parseInt(params[3]);
        maxRecursionDepth = Integer.parseInt(params[4]);
    }
}
