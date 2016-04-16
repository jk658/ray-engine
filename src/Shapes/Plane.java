package Shapes;

import Other.Util;
import ParseableObjects.Ray;

/**
 * Created by Jacob on 09/04/2016.
 */
public class Plane extends Surface {
    private double[] normal;
    private double offset;


    @Override
    public void setParams(String[] params) {
        normal = Util.getArr(params, 0, 3);
        offset = Double.parseDouble(params[3]);
        material = Integer.parseInt(params[4]);
    }

    //TODO
    @Override
    public double hit(Ray ray) {
        return 0;
    }

    // getters and setters

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public double[] getNormal() {
        return normal;
    }

    public void setNormal(double[] normal) {
        this.normal = normal;
    }

    public double getOffset() {
        return offset;
    }

    public void setOffset(double offset) {
        this.offset = offset;
    }

}
