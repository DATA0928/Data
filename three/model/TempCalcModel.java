package three.model;

/**
 * Model of the temperature calculator three2.full.general.model for C/F/K.
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
         *
         * @param degreesCelsius degrees Celsius
         *
         * @return degrees Fahrenheit
         */
    public double convertCtoF(double degreesCelsius) {
        return degreesCelsius / 5.0 * 9.0 + 32.0;
    }

    /**
         * Convert degrees Celsius to Kelvin.
         *
         * @param degreesCelsius degrees Celsius
         *
         * @return Kelvin
         */
    public double convertCtoK(double degreesCelsius) {
        return degreesCelsius + 273.2;
    }

    /**
     * Convert Kelvin to degrees Celsius.
     * @param kelvin Kelvin
     * @return degrees Celsius
     */
    public double convertKtoC(double kelvin) {
        return kelvin - 273.2;
    }
}
