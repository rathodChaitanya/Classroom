package Practice;

class Outer3 {

    // Method
    private static void outerMethod()
    {

// Print statement
        System.out.println("inside outerMethod");
    }

    // Class 2
// Static inner class
    static class Inner {

        public static void display()
        {

// Print statement
            System.out.println("inside inner class Method");

// Calling method inside main() method
            outerMethod();
        }

    }
}

// Class 3
// Main class
class Main2 {

    // Main driver method
    public static void main(String args[])
    {

        Outer3.Inner obj = new Outer3.Inner();


// Calling method via above instance created
        obj.display();
    }
}
