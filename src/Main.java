import java.util.Random;
import java.util.Scanner;
public class Main {
    public static double Factorial(double Num){
        int result = 1;
        for (int i = 1; i <= Num; ++i){
            result *= i;
        }
        if (Num < 0 && Num % 2 !=0)
            result = result * -1;
        return result;
    }
    public static void Task3(){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите m ");
        double M = in.nextDouble();
        System.out.print("Введите n ");
        double N = in.nextDouble();
        in.close();
        Double C = Factorial(M)/(Factorial(N)*Factorial(M-N));
        System.out.println(C);

    }
    //Задание 8
    public static void Task8(){
        MassRand mass = new MassRand(80);
        int [] array = mass.Getmas();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] % 2 != 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println("\nСумма отрицательных нечетных элементов массива: " + sum);
        System.out.println("Количество отрицательных нечетных элементов массива: " + count);
    }
    public static void  Task13(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x:");
        double X = in.nextDouble();
        in.close();
        double S = 0;
        for (double i = 1; i <= 5; ++i){
            S += (-1)*i*(X/Factorial(i));
        }
        System.out.println(S);
    }

    public static void Task23(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите напряжение U = ");
        double U = scan.nextDouble();
        System.out.println("Введити сопротивление R = ");
        double R = scan.nextDouble();
        scan.close();
        double I = U/R;
        System.out.printf("Сила тока = %.3f Ампер%n", I);
    }

    public static void main(String[] args) {
        //Task3();
        //Task8();
        //Task13();
        //Task23();
    }
}