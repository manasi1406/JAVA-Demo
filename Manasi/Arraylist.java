package Manasi;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> primenos = findprimenos(1,1000);
        System.out.println("The prime numbers from1 to 1000 are: ");
        System.out.println(primenos);
    }
    public static ArrayList<Integer> findprimenos(int i, int n) {
                ArrayList<Integer> primenos = new ArrayList<>();
                for(int list=1;list<=n;list++) {
                    if(isPrime(list)) {
                        primenos.add(list);
                    }
                }
                return primenos;
            }
            public static boolean isPrime(int list) {
                if(list <= 1) {
                    return false;
                }
                for(int i=2;i<list;i++) {
                    if(list % i == 0) {
                        return false;
                    }
                }
                return true;
            }

        }
