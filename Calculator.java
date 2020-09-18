package exercice2;

public class Calculator extends Constants{

    int nb1 = 0;
    int nb2 = 0;
    int result = 0;

    public void welcome() {
        System.out.println(APP_TITLE);
    }

    public void calculate(int nb1,int nb2, String op){

        switch (op) {
            case "+":
                result = nb1 + nb2;
                break;
            case "-":
                result = nb1 - nb2;
                break;
            case "/":
                result = nb1 / nb2;
                break;
            case "*":
                result = nb1 * nb2;
                break;
            case "%":
                result = nb1 % nb2;
                break;
        }
        
        System.out.println("Résultat de ton opératon : " + result);
    }
}