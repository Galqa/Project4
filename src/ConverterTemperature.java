/* Напишіть на ConverterTemperature клас для конвертації з градусів за Цельсієм в Кельвіни, Фаренгейти.
У класу має бути метод convert, який робить конвертацію.
 */
public class ConverterTemperature {
    double celsius;
    public ConverterTemperature(double celsius) {
        this.celsius = celsius;
    }

    public double convertToKelvin() {
        return celsius + 273.15;
    }

    public double convertToFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public void convert() {
        System.out.println(" Градусів Цельсія: " + celsius);
        System.out.println(" Кельвіни " + convertToKelvin());
        System.out.println(" Фаренгейти " + convertToFahrenheit());
    }
}

class NewConverterTemperature {
    public static void main(String[] args) {
        ConverterTemperature converter = new ConverterTemperature(222);
        converter.convert();
    }
}


    
