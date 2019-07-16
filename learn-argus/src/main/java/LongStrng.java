import java.util.Arrays;

public class LongStrng {

    public static void main(String[] args) {
        String s1 = "avaavdsvsdvvsvsdvrgefsdf";
        String s2 = "vdsvsdvsvvdvvsvsdvasdvdv";
        longs(s1, s2);
    }

    private static void longs(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int indexa = 0;
        int indexb = 0;
        int len = indexb - indexa;
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if (chars1[i] == chars2[j]) {
                    indexa = i;
                    continue;
                } else {

                }
            }
        }

    }
}
