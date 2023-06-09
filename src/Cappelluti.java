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
            for (int j = 2; j < 10; j++)
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

    public static void StampaZigZag()
    {
        int[] NumberArray = new int[ 20 ];
        for (int i = 0; i < NumberArray.length; i++)
        {
            NumberArray[ i ] = (int) (Math.random() * (10 - 0 + 1) + 0);
            if (i < NumberArray.length - 1)
                System.out.print(NumberArray[ i ] + ", ");
            else
                System.out.println(NumberArray[ i ] + ".");
        }
        System.out.println("--------------");
        for (int i = 0; i < NumberArray.length / 2; i++)
        {
            System.out.print(NumberArray[ i ] + " ");
            System.out.print(NumberArray[ NumberArray.length - 1 - i ] + " ");
        }
        if (NumberArray.length % 2 != 0)
        {
            System.out.print(NumberArray[ NumberArray.length / 2 ]);
        }
    }

    public static void LancioRisiko()
    {
        int[] NumberAttacker = new int[ 3 ];
        int[] NumberDefender = new int[ 3 ];
        for (int i = 0; i < 3; i++)
        {
            NumberAttacker[ i ] = (int) (Math.random() * (6 - 1 + 1) + 1);
            NumberDefender[ i ] = (int) (Math.random() * (6 - 1 + 1) + 1);
        }
        SortMethod(NumberAttacker);
        SortMethod(NumberDefender);
        int DestroyedTanks = 0;
        for (int i = 0; i < 3; i++)
        {
            if (NumberAttacker[ i ] > NumberDefender[ i ])
            {
                DestroyedTanks++;
            }
        }
        System.out.println("Carri distrutti: " + DestroyedTanks);
    }

    public static void UgualiConsecutivi()
    {
        int[] NumberArray = new int[ 20 ];
        for (int i = 0; i < NumberArray.length; i++)
        {
            NumberArray[ i ] = (int) (Math.random() * (3 - (-3) + 1) + (-3));
            if (i < NumberArray.length - 1)
                System.out.print(NumberArray[ i ] + ", ");
            else
                System.out.println(NumberArray[ i ] + ".");
        }
        System.out.println("--------------");
        boolean foundPair = false;
        for (int i = 1; i < NumberArray.length; i++)
        {
            if (NumberArray[ i ] == NumberArray[ i - 1 ])
            {
                System.out.println("Numero: " + NumberArray[ i ] + ", Posizione: " + i);
                foundPair = true;
            }
        }
        if (!foundPair)
        {
            System.out.println("No numeri consecutivi trovati.");
        }
    }

    // Accordino: ottimo lavoro come sempre!
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
                case 5:
                    System.out.println("--------------");
                    StampaZigZag();
                    ActiveBool = false;
                    break;
                case 6:
                    System.out.println("--------------");
                    LancioRisiko();
                    ActiveBool = false;
                    break;
                case 7:
                    System.out.println("--------------");
                    UgualiConsecutivi();
                    ActiveBool = false;
                    break;
                default:
                    System.out.println("Risposta errata. Riprovare.");
                    break;
            }
        }
    }

    public static void SortMethod(int ParamArray[])
    {
        int TemporaryNumber;
        for (int i = 0; i < ParamArray.length - 1; i++)
        {
            for (int j = 0; j < ParamArray.length - 1 - i; j++)
            {
                // I parametri in input vengono copiati, e quando il metodo termina i valori input vengono persi.
                if (ParamArray[ j + 1 ] < ParamArray[ j ])
                {
                    TemporaryNumber = ParamArray[ j + 1 ];
                    ParamArray[ j + 1 ] = ParamArray[ j ];
                    ParamArray[ j ] = TemporaryNumber;
                }
            }
        }
    }
}