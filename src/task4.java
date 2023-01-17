import java.util.ArrayList;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        ArrayList<Integer> massiv = new ArrayList<>();
        int exit = 0;
        while (exit != -1) {
        exit = in.nextInt();
            massiv.add(exit);       }
        massiv.remove(massiv.size()-1);
        for (Integer mas : massiv) {
            sum += mas;
        }
        int srZnach = sum / massiv.size();
        for (int i = 0; i < massiv.size(); i++) {
            while (massiv.get(i) != srZnach) {
                if (massiv.get(i) < srZnach) {
                    massiv.set(i, massiv.get(i)+1);
                } else if (massiv.get(i) > srZnach) {
                    massiv.set(i, massiv.get(i)-1);
                }
                count++;
            }
        }
        System.out.println(count);
    }
}