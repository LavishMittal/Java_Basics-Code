public class Primitive_Datatypes {
    public static void main(String args[]){
        byte b = 8;                     // byte can take values (-128 to 127) & contains 1 Byte in memory.
        System.out.println(b);
        
        short a = 12345;                // short can take values (-32768 to 32767) & contains 2 bytes in memory.
        System.out.println(a);

        char ch = '@';                  // char can take all types of characters and contain 2 bytes in memory.
        System.out.println(ch);

        boolean w = true;               // boolean takes 1 byte in memory.
        boolean y = false;
        System.out.println(w);
        System.out.println(y);
        
        int q = 234567890;              // int can take values (-2147483648 to 2147483647) and contains 4 bytes in memory.
        System.out.println(q);

        long l = -9223372036854775808l;  // long can take values (-9223372036854775808 to 9223372036854775808) and cantains 8 bytes in memory.
        System.out.println(l);

        float f = 1.9898762f;            // float can take 4 bytes in memory.
        System.out.println(f);

        double d = 78965.98765d;        // double takes 8 bytes in memory.
        System.out.println(d);
    }

}
