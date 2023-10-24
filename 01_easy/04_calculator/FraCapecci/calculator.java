import java.util.Scanner;
class calculator {
    public static void main(String[] args) {

        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        int operatore = 0;
        do{
            System.out.println("Scegli un operatore:");
            System.out.println("1) somma");
            System.out.println("2) sottrazione");
            System.out.println("3) moltiplicazione");
            System.out.println("4) divisione");
            operatore = input.nextInt();
        }while(operatore <= 0 && operatore > 4);

        // ask users to enter numbers
        System.out.println("Inserisci il primo numero ");
        number1 = input.nextDouble();

        System.out.println("Inserisci il secondo numero ");
        number2 = input.nextDouble();

        switch (operatore) {
            case 1://somma
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case 2://sottrazione
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case 3://moltiplicazione
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case 4://divisione
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

    input.close();
    }
}