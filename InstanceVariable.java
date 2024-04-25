// Instance Variable
public class InstanceVariable {
    //Instance Variable
    int num;
    String name;
    //constructor
    public InstanceVariable(int n,String str){
    num=n;
    name =str;
    }
    //Method for display variables
    public void Display(){
        System.out.println("Number: "+ num);
        System.out.println("Name: "+ name);
    }
    public static void main(String[] args){
        InstanceVariable obj=new InstanceVariable(24,"Manasi");
        obj.Display();
    }
}
