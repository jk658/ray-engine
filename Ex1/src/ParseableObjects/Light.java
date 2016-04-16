package ParseableObjects;

import Other.Util;

/**
 * Created by Jacob on 09/04/2016.
 */
public class Light extends Parseable{
    private double[] pos;
    private double[] color;
    private double spec;
    private double shadow;
    private double radius;


    @Override
    public void setParams(String[] params) {
        pos = Util.getArr(params, 0, 3);
        color = Util.getArr(params, 3, 3);
        spec = Double.parseDouble(params[6]);
        shadow = Double.parseDouble(params[7]);
        radius = Double.parseDouble(params[8]);
    }

    // getters and setters

    public double[] getPos() {
        return pos;
    }

    public void setPos(double[] pos) {
        this.pos = pos;
    }

    public double[] getColor() {
        return color;
    }

    public void setColor(double[] color) {
        this.color = color;
    }

    public double getSpec() {
        return spec;
    }

    public void setSpec(double spec) {
        this.spec = spec;
    }

    public double getShadow() {
        return shadow;
    }

    public void setShadow(double shadow) {
        this.shadow = shadow;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
