// Lab15avst.java
// 02-28-15 by Leon Schram
// The "Odd Magic Square" Program
// This is the student, starting version of the Lab15 assignment.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab15av110
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the odd# size of the Magic Square -->  ");
        int size = input.nextInt();
        MagicSquare magic;
        if(size%2 !=0){
            magic = new MagicSquare(size);
            magic.computeMagicSquare();
            magic.displayMagicSquare();

            magic.checkRows();          // for 100 & 110 Point Version Only
            magic.checkColumns();        // for 100 & 110 Point Version Only
            magic.checkDiagonals();      // for 100 & 110 Point Version Only
        }
        else{System.out.println("Invalid input.");}
    }
}

class MagicSquare
{
    private int size;
    private int magic[][];
    private DecimalFormat output;

    public MagicSquare(int s)
    {
        size = s;
        magic = new int[size][size];
        output = new DecimalFormat("000");
    }

    public void computeMagicSquare()
    {   

        int row = 0;
        int column = size/2;
        magic[row][column] = 1;
        for(int i = 2; i<=size*size; i++){
            row--;
            column++;

            if(row==-1 && column == size){
                row=size-1;
                column = 0;
            }
            else if(row==-1 && !(column == size))
                row = size-1;
            else if(!(row==-1) && (column == size))
                column = 0;

            if(magic[row][column] == 0)
                magic[row][column] = i;
            else{
                row+=2;
                column--;
                magic[row][column] = i;
            }

            if(i%size == 0){
                row+=2;
                column--;
            }
        }
    }

    public void displayMagicSquare()
    {
        String printed = "";
        System.out.println();
        System.out.println(size + "x" + size + " Magic Square");
        System.out.println("==================");
        for(int i = 0; i < size; i++){
            for(int j = 0; j<size; j++){
                printed = output.format(magic[i][j]);
                if(j%(size-1)==0 && j>0){
                    System.out.print(printed + "\n");
                }
                else{
                    System.out.print(printed + " ");
                }
            }
        }
        System.out.println();
    }

    public void checkRows()
    {

        String printed = "";
        int sum = 0;

        System.out.println();
        System.out.println("Checking Rows");
        System.out.println("=============");
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                printed = ""+output.format(magic[i][j]);
                printed += (j<size-1)?" + ":" = ";
                System.out.print(printed);
                sum+=magic[i][j];
            }
            System.out.print(output.format(sum) + "\n");
            sum = 0;
        }

        System.out.println();
    }

    public void checkColumns()
    {
        String printed = "";
        int sum = 0;

        System.out.println();
        System.out.println("Checking Columns");
        System.out.println("================");
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                printed = ""+output.format(magic[j][i]);
                printed += (j<size-1)?" + ":" = ";
                System.out.print(printed);
                sum+=magic[i][j];
            }
            System.out.print(output.format(sum) + "\n");
            sum = 0;
        }
        System.out.println();
    }

    public void checkDiagonals()
    {
        String printed = "";
        int sum = 0;

        System.out.println();
        System.out.println("Checking Diagonals");
        System.out.println("==================");
        for(int i = 0; i < size; i++){
            printed = "" + output.format(magic[i][i]);
            printed += (i<size-1)?" + ":" = ";
            System.out.print(printed);
            sum+=magic[i][i];
            if(i==size-1)
                System.out.print(output.format(sum) + "\n");
        }
        sum = 0;
        printed = "";
        int row = 0;
        for(int column = size-1; column>=0; column--){
            printed = "" + output.format(magic[row][column]);
            printed += (column>0)?" + ":" = ";
            System.out.print(printed);
            sum+=magic[row][column];
            if(row==size-1){
                System.out.print(output.format(sum));
            }
            row++;
        }
        System.out.println();
    }

}

