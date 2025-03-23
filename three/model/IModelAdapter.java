package three.model;

/**
 * Adapter between three2.full.general.view and three2.full.general.model.
 *
 * @author Mathias Ricken
 */
public interface IModelAdapter {
    /**
         * Convert degrees Fahrenheit to degrees Celsius.
         *
         * @param degreesFahrenheit degrees Fahrenheit
         *
         * @return degrees Celsius
         */
    double convertFtoC(double degreesFahrenheit);

    /**
         * Convert degrees Celsius to degrees Fahrenheit.
         *
         * @param degreesCelsius degrees Celsius
         *
         * @return degrees Fahrenheit
         */
    double convertCtoF(double degreesCelsius);

    /**
         * Convert degrees Celsius to Kelvin.
         *
         * @param degreesCelsius degrees Celsius
         *
         * @return Kelvin
         */
    double convertCtoK(double degreesCelsius);

    /**
     * Convert Kelvin to degrees Celsius.
     * @param kelvin Kelvin
     * @return degrees Celsius
     */
    double convertKtoC(double kelvin);
}
