import java.util.Scanner;

public class Cappelluti
{
    static Scanner sc = new Scanner(System.in);

    public static void MinimoDiArray()
    {
        int[] NumberArray = new int[ 10 ];
        for (int i = 0; i < NumberArray.length; i++)
        {
            NumberArray[ i ] = (int) (Math.random() * (5 - (-5) + 1) + (-5));
            if (i < NumberArray.length - 1)
                System.out.print(NumberArray[ i ] + ", ");
            else
                System.out.println(NumberArray[ i ] + ".");
        }
        System.out.print("--------------\nNumero più piccolo: ");
        int TempMin = NumberArray[ 0 ];
        int Position = 0;
        for (int i = 0; i < NumberArray.length; i++)
            if (NumberArray[ i ] < TempMin)
            {
                TempMin = NumberArray[ i ];
                Position = i;
            }
        System.out.println(TempMin + ", cui posizione è: " + Position);
    }

    public static void ParoleMisteriose()
    {
        String[] MysteriousWords = {"Pietro", "Fisco", "Finanza", "UCannizzà", "Nineteen-Eighty-Nine"};
        for (int i = 3; i > 0; i--)
        {
            System.out.println("Inserire parola per indovinare!");
            String InputWord = sc.nextLine();
            for (int j = 0; j < MysteriousWords.length; j++)
            {
                if (InputWord.equalsIgnoreCase(MysteriousWords[ j ]))
                {
                    System.out.println("Trovato una parola! " + MysteriousWords[ j ]);
                    return;
                }
            }
            System.out.println("Risposta errata. Riprova. Ti rimangono: " + (i - 1) + " tentativi");
        }
    }

    public static void StampaPari()
    {
        int[] NumberArray = new int[ 20 ];
        for (int i = 0; i < NumberArray.length; i++)
        {
            NumberArray[ i ] = (int) (Math.random() * (100 - 1 + 1) + 1);
            if (i < NumberArray.length - 1)
                System.out.print(NumberArray[ i ] + ", ");
            else
                System.out.println(NumberArray[ i ] + ".");
        }
        System.out.println("--------------");
        int TemporaryNumber;
        for (int i = 0; i < NumberArray.length - 1; i++)
        {
            for (int j = 0; j < NumberArray.length - 1 - i; j++)
            {
                // I parametri in input vengono copiati, e quando il metodo termina i valori input vengono persi.
                if (NumberArray[ j + 1 ] < NumberArray[ j ])
                {
                    TemporaryNumber = NumberArray[ j + 1 ];
                    NumberArray[ j + 1 ] = NumberArray[ j ];
                    NumberArray[ j ] = TemporaryNumber;
                }
            }
        }
        for (int i = 0; i < NumberArray.length; i++)
        {
            if (NumberArray[ i ] % 2 == 0)
            {
                System.out.print(NumberArray[ i ] + ", ");
            }
        }
    }

    public static void ArrayDivisori()
    {
        int[] NumberArray = new int[ 50 ];
        int[] NumberCount = new int[ 8 ];
        for (int i = 0; i < NumberArray.length; i++)
        {
            NumberArray[ i ] = (int) (Math.random() * (100 - 1 + 1) + 1);
            if (i < NumberArray.length - 1)
                System.out.print(NumberArray[ i ] + ", ");
            else
                System.out.println(NumberArray[ i ] + ".");
        }
        System.out.println("--------------");
        for (int i = 0; i < NumberArray.length; i++)
        {
            for (int j = 2; j <= 10; j++)
            {
                if (NumberArray[ i ] % j == 0)
                {
                    NumberCount[ j - 2 ]++;
                }
            }
        }
        for (int i = 0; i < NumberCount.length; i++)
        {
            System.out.println("Numeri divisibili per " + (i + 2) + ": " + NumberCount[ i ]);
        }
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
                case 2:
                    System.out.println("--------------");
                    ParoleMisteriose();
                    ActiveBool = false;
                    break;
                case 3:
                    System.out.println("--------------");
                    StampaPari();
                    ActiveBool = false;
                    break;
                case 4:
                    System.out.println("--------------");
                    ArrayDivisori();
                    ActiveBool = false;
                    break;
                default:
                    System.out.println("Risposta errata. Riprovare.");
                    break;
            }
        }
    }
}