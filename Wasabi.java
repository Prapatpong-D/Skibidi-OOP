import java.util.*;
public class Wasabi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int odd = 0;
        int even = 0;
        while (true){
            x = sc.nextInt();
        if (x==-1){
            break;
            }else if (x%2 == 0){
                even += 1;
            }else
                odd += 1;
        }
        System.out.println("Odd number = "+odd+" and Even number = "+even);
    }
}
