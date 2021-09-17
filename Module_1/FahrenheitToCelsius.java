public class FahrenheitToCelsius {
    public static void main(String[] args) {
        int saturdayF;
        int sundayF;
        saturdayF = 78;
        sundayF = 81;
        double saturdayC = (5.0/9) * (saturdayF - 32);
        double sundayC = (5.0/9) * (sundayF - 32);
        System.out.println("Weekend Averages");
        System.out.println("Saturday: " + saturdayC);
        System.out.println("Sunday: " + sundayC);
    }
}
