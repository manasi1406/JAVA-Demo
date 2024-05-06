//Null pointer Exception


public class Nullpoinexcep {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.toUpperCase());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException not detected");
        }
    }
}
