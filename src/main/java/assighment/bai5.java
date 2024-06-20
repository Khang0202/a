package assighment;

public class bai5 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        swapStringBufferWithout3rd(sb1, sb2);

        String aa = "hello";
        String bb = "world";
        swap(aa, bb);
    }

    /**
     * Swaps the contents of two StringBuffer objects without using a third temporary variable.
     * After the swap, StringBuffer stringBuffer1 will contain the initial content of stringBuffer2,
     * and stringBuffer2 will contain the initial content of stringBuffer1.
     *
     * @param stringBuffer1 the first StringBuffer object to be swapped
     * @param stringBuffer2 the second StringBuffer object to be swapped
     */
    public static void swapStringBufferWithout3rd(StringBuffer stringBuffer1, StringBuffer stringBuffer2) {
        System.out.println("StringBuffer 1 and StringBuffer 2 before swap\nStringBuffer 1: " + stringBuffer1);
        System.out.println("StringBuffer 2: " + stringBuffer2);
        stringBuffer1.append(stringBuffer2);
        stringBuffer2.replace(0, stringBuffer1.length(), stringBuffer1.substring(0, stringBuffer1.length() - stringBuffer2.length()));
        stringBuffer1.replace(0, stringBuffer1.length(), stringBuffer1.substring(stringBuffer2.length()));
        System.out.println("StringBuffer 1 and StringBuffer 2 before swap\nStringBuffer 1: " + stringBuffer1);
        System.out.println("StringBuffer 2: " + stringBuffer2);
    }

    /**
     * Swaps the contents of two String objects using a temporary variable.
     * Prints the strings before and after the swap.
     *
     * @param string1 the first String object to be swapped
     * @param string2 the second String object to be swapped
     */
    public static void swap(String string1, String string2) {
        System.out.println("String 1 and String 2 before swap\nString 1: " + string1);
        System.out.println("String 2: " + string2);
        string1 += string2;
        string2 = string1.substring(0, string1.length() - string2.length());
        string1 = string1.substring(string2.length());
        System.out.println("String 1 and String 2 after swap\nString 1: " + string1);
        System.out.println("String 2: " + string2);
    }
}
