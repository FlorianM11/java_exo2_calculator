package exercice2;

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Calculator calculatrice = new Calculator();

        Scanner sc = new Scanner(System.in);

        String boolChange = "O";
        boolean testError = false;

        calculatrice.welcome();

        do{
            System.out.print("Ton opération : ");
            String calcul = sc.nextLine();

            String[] result = calcul.split("\\s+");

            while(testError == false){
                if (result.length > 3){
                    System.out.println("Navré mais je ne peux que faire des opérations à 2 entiers...");
                    break;
                } else if (result.length != 3){
                    System.out.println("Utilise les espaces sinon je ne peut pas faire le calcul");
                    break;
                }
    
                try {
                    Integer.parseInt(result[0]);
                    Integer.parseInt(result[2]);
                } catch (Exception e) {
                    System.out.println("Ton opération n'est pas logique !");
                    break;
                }

                calculatrice.calculate(Integer.parseInt(result[0]), Integer.parseInt(result[2]), result[1]);
                testError = true;
            }

            System.out.print("Veux-tu effectuer une nouvelle opération ? [O/N] : \n");
            boolChange = sc.nextLine();

        }while(boolChange.equals("O"));
        
        System.out.print("La calculatrice à bien été fermée ! ;)");
        sc.close();
    }
}
