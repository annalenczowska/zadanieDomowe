public class zad4 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("-----------------");

        System.out.println("Binarnie:");
        System.out.println(String.format("%8s", Integer.toBinaryString(x)).replace(' ','0'));
        System.out.println(String.format("%8s", Integer.toBinaryString(y)).replace(' ','0'));
        System.out.println("--------");
        System.out.println(String.format("%8s", Integer.toBinaryString(x + y)).replace(' ','0'));
        System.out.println("-----------------");

        System.out.println("Ósemkowo: ");
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toOctalString(y));
        System.out.println("--------");
        System.out.println(Integer.toOctalString(x + y));
        System.out.println("-----------------");

        System.out.println("Szesnastkowo: ");
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toHexString(y));
        System.out.println("--------");
        System.out.println(Integer.toHexString(x + y));

    }
}
