package Shapes;

import ParseableObjects.Parseable;
import ParseableObjects.Ray;

/**
 * Created by Jacob on 09/04/2016.
 *
 * parent class for all shapes (sphere, plane, cylinder)
 *
 */
public abstract class Surface extends Parseable {
    protected int material;

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }


    public abstract void setParams(String[] params);

    public abstract double hit(Ray ray);
}
