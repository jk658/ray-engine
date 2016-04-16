package ParseableObjects;

import static Other.Util.dCopy;

/**
 * Created by Jacob on 09/04/2016.
 */
public class Ray {
    private double[] source;
    private double[] direction;


    public Ray(double[] src, double[] dir){
        this.source = dCopy(src);
        this.direction = dCopy(dir);
    }

    public double[] getDirection() {
        return direction;
    }

    public void setDirection(double[] direction) {
        this.direction = dCopy(direction);
    }

    public double[] getSource() {
        return source;
    }

    public void setSource(double[] source) {
        this.source = dCopy(source);
    }


}
