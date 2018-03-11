package io.eisgroup._05_string;

public class BuilderBuffer {

    public static void main(String[] args) {
        int N = 77777777;
        {
            long j = System.currentTimeMillis();
            StringBuffer stringBuffer = new StringBuffer();
            for (int k = N; k-- > 0; ) {
                stringBuffer.append("a");
            }
            System.out.println("StringBuffer with 'b': " + (System.currentTimeMillis() - j));

        }

        {
            long t = System.currentTimeMillis();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = N; i-- > 0; ) {
                stringBuilder.append("a");
            }
            System.out.println("StringBuilder with 'a': " + (System.currentTimeMillis() - t));
        }


    }

}
