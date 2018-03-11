package io.eisgroup._06_arrays;

public class Main {

    public static void main(String[] args) {

        double[] doubles = {1.2, 3.4, 4.5, 6.7, 33.3, 12.4, 53.2, 11.2};

        // printing all the doubles:
        for (int i = 0; i < doubles.length - 1; i++) {
            System.out.println(doubles[i]);
        }

        // summing all the doubles
        double sum = 0d;
        for (int i = 0; i < doubles.length - 1; i++) {
            sum += doubles[i];
        }
        System.out.println(sum);

        // finding greatest one
        double greatest = 0d;
        for (int i = 0; i < doubles.length - 1; i++) {
            if (greatest < doubles[i]) {
                greatest = doubles[i];
            }
        }
        System.out.println(greatest);

        for (double d : doubles) {
            System.out.println(d);
        }
    }

}
