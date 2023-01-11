package Practice;

class Outer1 {

    // Method inside outer class
    void outerMethod()
    {

// Print statement
        System.out.println("inside outerMethod");

// Class 2
// Inner class
// It is local to outerMethod()
        class Inner {

            // Method defined inside inner class
            void innerMethod()
            {

// Print statement whenever inner class is
// called

                System.out.println("inside innerMethod");

                class inter{
                    public void chaitanya(){
                        System.out.println("Chaitanya Rathod");
                    }

                }
                inter i = new inter();
                i.chaitanya();
            }

        }

// Creating object of inner class
        Inner y = new Inner();

// Calling over method defined inside it
        y.innerMethod();
    }
}

// Class 3
// Main class
class Main3 {

    // Main driver method
    public static void main(String[] args)
    {

// Creating object of outer class inside main()
// method
        Outer1 x = new Outer1 ();

// Calling over the same method

// as we did for inner class above
        x.outerMethod();
    }
}
