package io.eisgroup._05_string;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class TestStringAndBuilder {
    public static void main(String[] args) {

        int n = 999999;
        long t;

        {
            t = System.currentTimeMillis();
            String basicString = new String();
            for (int i = 1; i <= n; i++) {
                basicString = basicString + "a";
                printProgress(t, n, i);
            }
            System.out.println("\nTime with String: " + (System.currentTimeMillis() - t));
        }


        {
            t = System.currentTimeMillis();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = n; i <= n; i++) {
                stringBuffer.append("a");
                printProgress(t, n, i);
            }
            System.out.println("\nTime with StringBuffer: " + (System.currentTimeMillis() - t));
        }

        {
            t = System.currentTimeMillis();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                stringBuilder.append("a");
                printProgress(t, n, i);
            }
            System.out.println("\nTime with StringBuilder: " + (System.currentTimeMillis() - t));
        }
    }

    private static void printProgress(long startTime, long total, long current) {
        long eta = current == 0 ? 0 :
                (total - current) * (System.currentTimeMillis() - startTime) / current;

        String etaHms = current == 0 ? "N/A" :
                String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(eta),
                        TimeUnit.MILLISECONDS.toMinutes(eta) % TimeUnit.HOURS.toMinutes(1),
                        TimeUnit.MILLISECONDS.toSeconds(eta) % TimeUnit.MINUTES.toSeconds(1));

        StringBuilder string = new StringBuilder(140);
        int percent = (int) (current * 100 / total);
        string
                .append('\r')
                .append(String.join("", Collections.nCopies(percent == 0 ? 2 : 2 - (int) (Math.log10(percent)), " ")))
                .append(String.format(" %d%% [", percent))
                .append(String.join("", Collections.nCopies(percent, "=")))
                .append('>')
                .append(String.join("", Collections.nCopies(100 - percent, " ")))
                .append(']')
                .append(String.join("", Collections.nCopies((int) (Math.log10(total)) - (int) (Math.log10(current)), " ")))
                .append(String.format(" %d/%d, ETA: %s", current, total, etaHms));

        System.out.print(string);

    }

}
