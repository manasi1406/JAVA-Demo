package day13;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
//Using Filter
public class Even {
    public static void main(String[] args) {
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);*/
            List<Integer> list = Arrays.asList(10, 20, 30, 40, 7, 55,44);
            List<Integer> evenlist = new ArrayList<Integer>();
        /*without using stream
        for(int n:list){
            if(n%2==0) {
                evenlist.add(n);
            }

            }
        System.out.println(evenlist);*/


            //Using Stream

            evenlist = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
            System.out.println(evenlist);



        }

    }

