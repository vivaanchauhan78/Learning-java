public class Math_class {
    public static void main(String[] args){
        
        //Pythagoras theorem
        int a = 6;
        int b = 5;
        double c;
        double a_squared = Math.pow(a,2);
        double b_squared = Math.pow(b,2);
        double c_squared = a + b;
        c = Math.sqrt(c_squared);
        System.out.println(c);
    } 
}
