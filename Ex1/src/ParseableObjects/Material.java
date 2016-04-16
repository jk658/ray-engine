package ParseableObjects;

import Other.Util;

/**
 * Created by Jacob on 09/04/2016.
 */
public class Material extends Parseable {
    private double[] difColor;
    private double[] specColor;
    private double[] reflColor;
    private double phong;
    private double trans;


    @Override
    public void setParams(String[] params) {
        difColor = Util.getArr(params, 0, 3);
        specColor = Util.getArr(params, 3, 3);
        reflColor = Util.getArr(params, 6, 3);
        phong = Double.parseDouble(params[9]);
        trans = Double.parseDouble(params[10]);
    }

    //setters and getters

    public double[] getDifColor() {
        return difColor;
    }

    public void setDifColor(double[] difColor) {
        this.difColor = difColor;
    }

    public double[] getSpecColor() {
        return specColor;
    }

    public void setSpecColor(double[] specColor) {
        this.specColor = specColor;
    }

    public double[] getReflColor() {
        return reflColor;
    }

    public void setReflColor(double[] reflColor) {
        this.reflColor = reflColor;
    }

    public double getPhong() {
        return phong;
    }

    public void setPhong(double phong) {
        this.phong = phong;
    }

    public double getTrans() {
        return trans;
    }

    public void setTrans(double trans) {
        this.trans = trans;
    }


}
