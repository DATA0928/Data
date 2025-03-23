package simple.model;

/**
 * Model of the simple temperature calculator three.three2.full.general.model.
 * @author Mathias Ricken
 */
public class TempCalcModel {
    /**
         * Convert degrees Fahrenheit to degrees Celsius.
         *
         * @param degreesFahrenheit degrees Fahrenheit
         *
         * @return degrees Celsius
         */
    public double convertFtoC(double degreesFahrenheit) {
        return (degreesFahrenheit - 32.0) / 9.0 * 5.0;
    }

    /**
     * Convert degrees Celsius to degrees Fahrenheit.
     * @param degreesCelsius degrees Celsius
     * @return degrees Fahrenheit
     */
    public double convertCtoF(double degreesCelsius) {
        return degreesCelsius / 5.0 * 9.0 + 32.0;
    }
}
