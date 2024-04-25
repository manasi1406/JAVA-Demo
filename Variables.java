public class Variables {
    //static variable
    static int staticVariable=5;
    public void method(){
        //Local Variable
        int local=20;
        System.out.println("Static Variable:"+ staticVariable);
        System.out.print("Local Variable:"+ local);
    }
    public static void main(String[] args){
        Variables obj=new Variables();
        obj.method();
    }
}
