package Shapes;

import Other.Util;
import ParseableObjects.Ray;

/**
 * Created by Jacob on 09/04/2016.
 */
public class Cylinder extends Surface{
    private double[] center;
    private double length;
    private double radius;
    private double[] rotation;


    @Override
    public void setParams(String[] params) {
        center = Util.getArr(params, 0, 3);
        length = Double.parseDouble(params[3]);
        radius = Double.parseDouble(params[4]);
        rotation = Util.getArr(params, 5, 3);
        material = Integer.parseInt(params[8]);
    }

    //TODO
    @Override
    public double hit(Ray ray) {
        return 0;
    }

    // getters and setters

    public double[] getRotation() {
        return rotation;
    }

    public void setRotation(double[] rotation) {
        this.rotation = rotation;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLenfth() {
        return length;
    }

    public void setLenfth(double lenfth) {
        this.length = lenfth;
    }

    public double[] getCenter() {
        return center;
    }

    public void setCenter(double[] center) {
        this.center = center;
    }

}
