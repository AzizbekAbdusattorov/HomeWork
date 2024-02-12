package calculator;

public class Calculator {
    double x;
    char sign;
    double y;

     void result(){
        double counter = 0;
        switch (sign){
            case '+':
                counter = x + y;
                break;
            case '-':
                counter = x - y;
                break;
            case '*':
                counter = x * y;
                break;
            case '/':
                if (y != 0){
                    counter = x / y;
                } else {
                    System.out.println("Nolga bo'lish mumkin emas: ");
                    return;
                }
                break;
            default:
                System.out.println("Noto'g'ri amalni tanladingiz");
                return;
        }

         System.out.println("Natija: " + counter);
    }
}
