public class UnicodeExample {
    public static void main(String[] args) throws Exception {
        String str1 = "\u0000";
        String str2 = "\uFFFF";
        byte[] arr = str1.getBytes("UTF-8");
        byte[] brr = str2.getBytes("UTF-8");
        System.out.println("UTF-8 for \\u0000");
        for (byte a : arr) {
            System.out.print(a);
        }
        System.out.println("\nUTF-8 for \\uffff");
        for (byte b : brr) {
            System.out.print(b);
        }
    }
}
