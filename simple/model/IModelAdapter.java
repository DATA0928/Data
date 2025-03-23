package simple.model;

/**
 * Adapter between three.three2.full.general.view and three.three2.full.general.model.
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
     * @param degreesCelsius degrees Celsius
     * @return degrees Fahrenheit
     */
    double convertCtoF(double degreesCelsius);
}
