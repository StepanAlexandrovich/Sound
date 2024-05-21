package org.example;

public class Main {
    private static Sound sound = new Sound();
    private static EqualTemperament equalTemperament = new EqualTemperament();

    public static void main(String[] args) {
        sound.open();

        //////////////////////////////////////////////////////
        sound.setVolume(5);
        sound.setDuration(1000);

        for (int note = 0; note <= 24; note++) {
            sound.process( equalTemperament.gammaInt(note));
        }

        for (int i = 0; i < 4; i++) {
            sound.process( equalTemperament.gammaInt(0));
            sound.process( equalTemperament.gammaInt(12));
            sound.process( equalTemperament.gammaInt(24));
        }
        ///////////////////////////////////////////////////////

        sound.close();
    }
}