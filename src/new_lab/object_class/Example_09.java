package new_lab.object_class;
//Print the sum, difference and product of two complex numbers by
//creating a class named 'Complex' with separate methods for each operation
//whose real and imaginary parts are entered by user.

class Complex{
    static int resI;
    static int resR;
    static int realNo(int a,int b){
      resR = a + b;
      return resR;
    }
    static int imaginaryNo(int a,int b){
        resI = a + b;
        return resI;
    }


}
public class Example_09 {
    public static void main(String[] args) {
        int realNo_1 = 2;
        int realNo_2 = 6;
        int imaginaryNo_1 = 4;
        int imaginaryNo_2 = 4;
        Complex.realNo(realNo_1,realNo_2);
        Complex.imaginaryNo(imaginaryNo_1,imaginaryNo_2);
        System.out.println("********* addition of real and imagenary no ********");
        System.out.println();
        System.out.println("( "+realNo_1+" + "+imaginaryNo_1+"i ) + ( "+realNo_2+" + "+imaginaryNo_2+"i )");
        System.out.println("result :- "+ Complex.resR +" + "+Complex.resI+"i");
    }
}
