package calculator;
import java.util.Scanner;

public class Task {
   static int l = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        String []history = new String[10];
        while (true) {
            String x = in.nextLine();
            if (x.equalsIgnoreCase("tarix")){
                historiy(history);
                continue;
            }else if (x.equalsIgnoreCase("clear")){
                history = new String[10];
                l=0;
                continue;
            }
            if (l!=0){
            x = sum + x;}
            history[l]=(x+" = ");

            String[] s = x.split("[+*/-]");
            sum = Integer.parseInt(s[0]);
            for (int i = 1; i < s.length; i++) {
                x = x.replace(s[i - 1], "");
                switch (x.charAt(i-1)) {
                    case '+': { sum += Integer.parseInt(s[i]); } break;
                    case '-': { sum -= Integer.parseInt(s[i]); } break;
                    case '*': { sum *= Integer.parseInt(s[i]); } break;
                    case '/': { sum /= Integer.parseInt(s[i]); } break;
                }
            }
            System.out.print(sum);
            history[l++]+=(Integer.toString(sum));
        }
    }
    static void historiy(String[] h){
        for (int i = 0; i < l; i++) {
            System.out.println("-------------");
            System.out.println((i+1)+" amal");
            System.out.println(h[i]);
        }
    }
}
