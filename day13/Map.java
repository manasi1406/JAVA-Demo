package day13;
import java.util.*;
import java.util.stream.Collectors;
//Map
public class Map {
    public static void main(String[] args) {
        List<String> Food = Arrays.asList("pizza","cake","burger","dosa");
        List<String> FoodlistinUpperCase =new ArrayList<String>();
        //without using Stream
        /*for (String food : Food) {
            FoodlistinUpperCase.add(food.toUpperCase());
        }*/
        //Using Stream
       FoodlistinUpperCase= Food.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(FoodlistinUpperCase);
    }
}
