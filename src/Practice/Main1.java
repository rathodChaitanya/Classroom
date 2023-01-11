package Practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Outer {
    // Class 2
// Simple nested inner class
    class Inner {

        // show() method of inner class
        public void show()
        {
// Print statement
            System.out.println("In a nested class method");
        }
    }
    class Inner2{
        protected void hii(){
            System.out.println("protected class");
        }
        private void hii2(){
            System.out.println("private class");
        }
         void hii3(){
            System.out.println("default class");
        }
    }
}
// Class 2

// Main class
class Main1 {
    // Main driver method
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
// Note how inner class object is created inside
// main()
        Outer.Inner in = new Outer().new Inner();
// Calling show() method over above object created
        in.show();
        Outer.Inner2 in2 = new Outer().new Inner2();
        in2.hii();
        in2.hii3();
        //in2.hii2();
        Method m = Outer.Inner2.class
                .getDeclaredMethod("hii2");

        // Using setAccessible() method
        m.setAccessible(true);

        // Using invoke() method
        m.invoke(in2);
    }
}