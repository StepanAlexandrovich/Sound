package org.example;

public class EqualTemperament {
//    private final double down = 1/Math.pow(2,1.0/12.0);
//    public double semitoneDown(double note){
//        return note * Math.pow(2,1.0/12.0);
//    }

    private double[] gamma = new double[36];
    private int[] gammaInt = new int[gamma.length];

    private final int downNote = 100;
    private final double up = Math.pow(2,1.0/12.0);

    public EqualTemperament() {

        int c = downNote;
        for (int i = 0; i < gamma.length; i+=12) {
            gamma[i] = c;
            for (int j = i + 1; j < i + 12; j++) {
                gamma[j] = gamma[j - 1]*up;
            }
            c*=2;
        }

        for (int i = 0; i < gamma.length; i++) {
            gammaInt[i] = (int)gamma[i];
        }
    }

    public double gamma(int note){ return gamma[note]; }
    public int gammaInt(int note){ return gammaInt[note]; }

}
