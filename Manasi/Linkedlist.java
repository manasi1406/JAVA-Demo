package Manasi;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list: ");
        String input;
        do{
            input = scanner.nextLine();
            if(!input.equalsIgnoreCase("yes")){
                list.addFirst(input);
            }
        }while (!input.equalsIgnoreCase("yes"));
        System.out.println("Linked list: "+ list);
        for(String str : list){
            System.out.println(str);
        }


    }

}
