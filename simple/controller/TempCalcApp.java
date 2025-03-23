package simple.controller;

import simple.model.IModelAdapter;
import simple.model.TempCalcModel;
import simple.view.TempCalcFrame;

/**
 * Main class for command-line use.
 * *
 * @author Mathias Ricken
 * @dependency model.TempCalcModel instantiates
 * @dependency view.TempCalcView instantiates
 * @dependency model.IModelAdapter instantiates
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
        })).setVisible(true);
    }
}
