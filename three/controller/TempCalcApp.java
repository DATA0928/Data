package three.controller;

import three.model.IModelAdapter;
import three.model.TempCalcModel;
import three.view.TempCalcFrame;

/**
 * Main class for command-line use.
 *
 * @author Mathias Ricken
 */
public class TempCalcApp {
    /**
     * Entry point for Java VM.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        final TempCalcModel model = new TempCalcModel();
        (new TempCalcFrame(new IModelAdapter() {
            public double convertFtoC(double degreesFahrenheit) {
                return model.convertFtoC(degreesFahrenheit);
            }

            public double convertCtoF(double degreesCelsius) {
                return model.convertCtoF(degreesCelsius);
            }

            public double convertCtoK(double degreesCelsius) {
                return model.convertCtoK(degreesCelsius);
            }

            public double convertKtoC(double kelvin) {
                return model.convertKtoC(kelvin);
            }
        })).setVisible(true);
    }
}
