package ParseableObjects;

import Other.Util;

import static Other.Util.dCopy;

/**
 * Created by Jacob on 09/04/2016.
 */
public class Camera extends Parseable {

    private double[] position;
    private double[] lookAtPos;
    private double[] upVector;
    private double screenDist;
    private double screenWidth;


    public Ray createRay(double[] dirOfRay){
        Ray ray = new Ray(dCopy(position), dCopy(dirOfRay));
        return ray;
    }


    @Override
    public void setParams(String[] params) {
        position = Util.getArr(params, 0, 3);
        lookAtPos = Util.getArr(params,3, 3);
        upVector = Util.getArr(params,6, 3);
        screenDist = Double.parseDouble(params[9]);
        screenWidth = Double.parseDouble(params[10]);
    }


    // setters and getters

    public double getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(double screenWidth) {
        this.screenWidth = screenWidth;
    }

    public double getScreenDist() {
        return screenDist;
    }

    public void setScreenDist(double screenDist) {
        this.screenDist = screenDist;
    }

    public double[] getUpVector() {
        return upVector;
    }

    public void setUpVector(double[] upVector) {
        this.upVector = upVector;
    }

    public double[] getLookAtPos() {
        return lookAtPos;
    }

    public void setLookAtPos(double[] lookAtPos) {
        this.lookAtPos = lookAtPos;
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }


}
