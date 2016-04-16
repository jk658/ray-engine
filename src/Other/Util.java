package Other;

/**
 * Created by Jacob on 09/04/2016.
 */
public class Util {

    public static final int V_SIZE= 3;


    /**
     *
     * @param v a vector
     * @return a normalized vector
     */
    public static double[] normalize(double []v){
        double magnitude = Math.sqrt(v[0]*v[0] + v[1]*v[1] + v[2]*v[2]);
        if(magnitude == 0.0)
            return v;
        for (int i = 0; i < V_SIZE; i++) {
            v[i] /= magnitude;
        }
        return v;
    }

    /**
     * dot product of 2 vectors
     * @param a first vector
     * @param b second vector
     * @return the dot product
     */
    public static double dot(double[] a, double[] b){
        double c = 0;
        for (int i = 0; i < V_SIZE; i++) {
            c += a[i]*b[i];
        }
        return c;
    }


    public static double[] dCopy(double[] v){
        double[] res = new double[3];
        for (int i = 0; i < V_SIZE; i++) {
            res[i] = v[i];
        }
        return res;
    }


    /**
     *
     * @param params String arr read from the .txt file
     * @param startIndex the starting index
     * @param numOfElems total num of elems to parse
     * @return a double arr that holds the necessary values
     */
    public static double[] getArr(String[] params, int startIndex, int numOfElems){
        double[] ret = new double[numOfElems];
        for (int i = 0; i < numOfElems; i++) {
            ret[i] = Double.parseDouble(params[startIndex + i]);
        }
        return ret;
    }


}
