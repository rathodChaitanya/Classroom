package Practice;

import java.util.Scanner;
class CountDigit {
    int dig, r = 0;

    int getCount(int pinNo) {
        while (r < 0) {
            r = pinNo % 10;
            pinNo = pinNo / 10;
            dig++;
        }
        return dig;
    }
}
    class CheckPinNo {
        public boolean verify(int pinNo) {
            return switch(pinNo)
                    {
                        case 1111 : yield true;
                        case 2222 : yield true;
                        case 3333 : yield true;
                        default : yield false;
                    };

        }
    }

    class DemoClass1 {
        public static void main(String[] args) {
            int bal = 2000;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the PIN No. :");
            int pinNo = s.nextInt();
            CountDigit cd = new CountDigit();
            int n = cd.getCount(cd.dig);
            if (n == 4) {
                CheckPinNo cp = new CheckPinNo();
                boolean k = cp.verify(pinNo); ;
                if (k) {
                    System.out.println("Enter Amount");
                    int x = s.nextInt();
                    if (x > 0 && x % 100 == 0) {
                        if (x <= bal) {
                            System.out.println("***Take your Cash***");
                            bal = bal - x;
                        } else {
                            System.out.println("Exceeded balance");
                        }
                    } else {
                        System.out.println("Invalid Input");
                    }
                } else {
                    System.out.println("Wrong Pin");
                }
            } else {
                System.out.println("Enter 4 digit Pin");
            }
        }
    }