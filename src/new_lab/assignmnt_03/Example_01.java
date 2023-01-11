package new_lab.assignmnt_03;

public class Example_01 {

    static  int x = 0;
    public static void input(int a,int b){
        int c =a;
        int d =b;
        x = calculate(c,d);
    }

    public static int calculate(int e ,int f){
        int res = e + f;
        return res;
    }

    public static void output(int k){
        System.out.println("result :"+k);
    }



    public static void main(String[] args) {
        input(4,6);
        output(x);
    }
}
