import java.util.Random;
public class MassRand {
    Random random = new Random();
    public static int[] array;
    public MassRand(int N){
        array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }
        System.out.println("Массив из 80 рандомных чисел с положительными и отрицательными числами:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public static int [] Getmas(){
        return array;
    }

}
