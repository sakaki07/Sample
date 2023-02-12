
public class MethodOverLoadSample {

    public static void main(String[] args) {
        // add1(int num1, int num2)の呼び出し
        add1(20, 30);
        
        // add2(int num1, int num2, int num3)の呼び出し
        add2(10, 50, 40);
        
        // add3(double num1, double num2)の呼び出し
        add3(10.2, 6.8);
        

    }
    
    // int型変数2つを受け取り、加算結果を表示するaddメソッド
    public static void add1(int num1, int num2) {
        System.out.println("int型2つの加算結果：" + (num1 + num2));
        
    }
    
    // int型変数3つを受け取り、加算結果を表示するaddメソッド
    public static void add2(int num1, int num2, int num3) {
        System.out.println("int型3つの加算結果：" + (num1 + num2 + num3));
        
    }
    
    // double型変数2つを受け取り、加算結果を表示するaddメソッド
    public static void add3(double num1, double num2) {
        System.out.println("double型2つの加算結果：" + (num1 + num2));
    }

}
