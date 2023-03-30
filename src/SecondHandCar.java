public class SecondHandCar {
    public static void main(String[] args) {
        int[] carPrices = {12000, 34000, 56000, 15450, 45000};

        for (int i = 0; i < carPrices.length; i++) {
            System.out.println(carPrices[i]);
        }

        carPrices[0] = 12670;
        carPrices[4] = 42450;
        System.out.println("\nUpdated Prices:");
        for (int i = 0; i < carPrices.length; i++) {
            System.out.println(carPrices[i]);
        }
    }
}