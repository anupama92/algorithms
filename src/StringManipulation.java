/**
 * Created by arao10 on 2/18/18.
 */
public class StringManipulation {

    public int getMatchingSubstring(char[] str1, char[] str2) {

        int n = 0;
        int i;
        System.out.println("method call");

        if (str1.equals(null) && str2.equals(null)) {

            return 0;
        }

        for (i = 0; i < str1.length; i++) {

            if (str1[i] == str2[n]) {
                int p1 = i;
                if (str1[p1] == str2[n] && n < str2.length) {
                    n++;
                    if (n == str2.length) {

                        break;
                    }

                    p1++;
                }
            }
        }

        return i;
    }
}
