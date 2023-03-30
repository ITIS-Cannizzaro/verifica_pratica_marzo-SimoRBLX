import java.util.Scanner;

public class Cappelluti
{
    static Scanner sc = new Scanner(System.in);
    public static void MinimoDiArray()
    {
        int[] NumberArray = new int[ 10 ];
        for (int i = 0; i < NumberArray.length; i++)
        {
            NumberArray[ i ] = (int)(Math.random() * (5 - (-5) + 1) + (-5));
            if (i < NumberArray.length-1)
                System.out.print(NumberArray[i]+", ");
            else
                System.out.println(NumberArray[i]+".");
        }
        System.out.print("--------------\nNumero più piccolo: ");
        int TempMin = NumberArray[0];
        int Position = 0;
        for (int i = 0; i < NumberArray.length; i++)
            if (NumberArray[i] < TempMin)
            {
                TempMin = NumberArray[i];
                Position = i;
            }
        System.out.println(TempMin+", cui posizione è: "+Position);
    }

    public static void main(String[] args)
    {
        int ExerciseChoice;
        boolean ActiveBool = true;
        while (ActiveBool)
        {
            System.out.println("Inserire esercizio da test-are.");
            ExerciseChoice = Integer.parseInt(sc.nextLine());
            switch (ExerciseChoice)
            {
                case 1:
                    System.out.println("--------------");
                    MinimoDiArray();
                    ActiveBool = false;
                    break;
                default:
                    System.out.println("Risposta errata. Riprovare.");
                    break;
            }
        }
    }
}