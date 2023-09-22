package Object_Up.Action;

public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest rT = new RecursionTest();
        System.out.println(rT.sum(100));
        System.out.println(rT.factorial(5));
        System.out.println(rT.f(2));
        System.out.println(rT.F(17));
        System.out.println(rT.Fibonacci(10));
    }

    //  输出1~num的和
    public int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sum(num - 1);
        }
    }

    //  递归求阶乘n！
    public int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //  求斐波那契数列
    public int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    //  求f0 = 1, f1 = 4, f(n+2) = 2*f(n+1) + f(n)
    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }

    public int F(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return F(n + 2) - 2 * F(n + 1);
        }
    }
}