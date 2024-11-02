import java.util.Scanner;

public class Pattern8
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of Rows");
        int iRow = sobj.nextInt();

        System.out.println("Enter size of columns");
        int iCol=sobj.nextInt();

        PatternX pobj = new PatternX();

        pobj.pattern(iRow, iCol);

    }    
}

class PatternX
{
    public void pattern(int iRow, int iCol)
    {
        for(int i = 1; i<=iRow;i++)
        {
            for(int j =1; j<=iCol;j++)
            {
                if((j==1) || (j==iCol) || (i==1 || (i==iRow)))
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}