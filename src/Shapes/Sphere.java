package Shapes;


import Other.Util;
import ParseableObjects.Ray;

/**
 * Created by Jacob on 09/04/2016.
 */
public class Sphere extends Surface{
    private double[] center;
    private double radius;

    @Override
    public void setParams(String[] params) {
        center = Util.getArr(params, 0, 3);
        radius = Double.parseDouble(params[3]);
        material = Integer.parseInt(params[4]);
    }

    //TODO
    @Override
    public double hit(Ray ray) {
        return 0;
    }


    // getters and setters

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double[] getCenter() {

        return center;
    }

    public void setCenter(double[] center) {
        this.center = center;
    }
}
