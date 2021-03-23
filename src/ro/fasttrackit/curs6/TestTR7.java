package ro.fasttrackit.curs6;

public class TestTR7 {
    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(50));

    }
    public static double fahrenheitToCelsius(double temperature) {

        double tempCelsius = ((temperature-32))*5/9;
        return tempCelsius;
    }
}
