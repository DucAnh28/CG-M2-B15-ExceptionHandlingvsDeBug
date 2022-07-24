import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        IllegalTriangle triangle = new IllegalTriangle();
        try {
            triangle.triangle();
        } catch (InputMismatchException e) {
            System.out.println("Xay ra ngoai le ! Ban da nhap sai du lieu");
        }
    }

    private void triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap canh a: ");
        int a = scanner.nextInt();
        System.out.println("Hay nhap canh b: ");
        int b = scanner.nextInt();
        System.out.println("Hay nhap canh c: ");
        int c = scanner.nextInt();
        if (a < 0 || b < 0 || c < 0) {
            throw new InputMismatchException();
        }
        cal(a,b,c);
    }

    private void cal(int a, int b, int c) {
        try {
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Xay ra ngoai le ! Ban da nhap sai du lieu ");
        }
    }
}
