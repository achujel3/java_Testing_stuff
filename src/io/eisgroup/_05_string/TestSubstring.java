package io.eisgroup._05_string;

public class TestSubstring {

    public static void main(String[] args) {

        String a = "aftermath";
        System.out.println(a.substring(4, 6));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("aftermath");
        System.out.println(stringBuilder.replace(2, 4, "aa"));

    }

}
