public class TestingRecursions{
    public static int count8(int n) {
        if (n == 0) return 0;
        int digit = n % 10;
        int count = 0;
        if (digit == 8) {
            if ((n / 10) % 10 == 8) {
                count = 2;
            } else {
                count = 1;
            }
        }
        return count + count8(n / 10);
    }

    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }

    public static int countHi2(String str) {
        return countHi2Helper(str, false);
    }

    private static int countHi2Helper(String str, boolean prevIsX) {
        if (str.length() < 2) return 0;
        boolean isHi = str.charAt(0) == 'h' && str.charAt(1) == 'i';
        int count = 0;
        if (isHi && !prevIsX) {
            count = 1;
        }
        boolean newPrevIsX = str.charAt(0) == 'x';
        return count + countHi2Helper(str.substring(1), newPrevIsX);
    }

    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }

    public static String stringClean(String str) {
        if (str.length() <= 1) return str;
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }

    public static void main(String[] args) {
        // Test count8
        System.out.println("count8(8) = " + count8(8));
        System.out.println("count8(818) = " + count8(818));
        System.out.println("count8(8818) = " + count8(8818));

        // Test countHi
        System.out.println("countHi(\"xxhixx\") = " + countHi("xxhixx"));
        System.out.println("countHi(\"xhixhix\") = " + countHi("xhixhix"));
        System.out.println("countHi(\"hi\") = " + countHi("hi"));

        // Test countHi2
        System.out.println("countHi2(\"ahixhi\") = " + countHi2("ahixhi"));
        System.out.println("countHi2(\"ahibhi\") = " + countHi2("ahibhi"));
        System.out.println("countHi2(\"xhixhi\") = " + countHi2("xhixhi"));

        // Test strCount
        System.out.println("strCount(\"catcowcat\", \"cat\") = " + strCount("catcowcat", "cat"));
        System.out.println("strCount(\"catcowcat\", \"cow\") = " + strCount("catcowcat", "cow"));
        System.out.println("strCount(\"catcowcat\", \"dog\") = " + strCount("catcowcat", "dog"));

        // Test stringClean
        System.out.println("stringClean(\"yyzzza\") = " + stringClean("yyzzza"));
        System.out.println("stringClean(\"abbbcdd\") = " + stringClean("abbbcdd"));
        System.out.println("stringClean(\"Hello\") = " + stringClean("Hello"));
    }
}