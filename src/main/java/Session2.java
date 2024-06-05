public class Session2 {

    public static void main(String[] args) {
        long age = 27L;
        String fullname = "Fariba abbasi";
        final int mybirthdate = 1996;
        String str1 = "this is a test";
        String str2 = "Good morning";
        String str3="my name is Fariba,I'm learning java";

        System.out.println(str2.length());
        System.out.println(str1.charAt(5));
        System.out.println(str3.substring(4,9));
        System.out.println(str1.concat(str2));
        System.out.println( str3.indexOf("is"));
        System.out.println(fullname.indexOf("i",4));

    }
}
