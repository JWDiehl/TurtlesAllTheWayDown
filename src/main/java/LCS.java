public class LCS {

    public static String lcs (String x, String y) {
        int m = x.length();
        int n = y.length();
        return lcsFunction(x, y, m, n);
    }

    private static String lcsFunction(String x, String y, int m, int n) {
        if (m == 0 || n == 0) {
            return "";
        }
        // if last char match
        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return lcsFunction(x, y, m - 1, n - 1) + x.charAt(m - 1);
        } else {
            // if last char do not match
            String lcs1 = lcsFunction(x, y, m - 1, n);
            String lcs2 = lcsFunction(x, y, m, n -1);
            return lcs1.length() > lcs2.length() ? lcs1 : lcs2;
        }
    }

    public static void main (String[] args) {
        String x = "ABCDJSJS";
        String y = "JDJDSJSJSJ";
        System.out.println("LCS: " + lcs(x, y)); // out put JSJS
    }
}
