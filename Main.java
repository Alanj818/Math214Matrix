import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //this is where we take input form user and output the matrix
        Scanner rows = new Scanner(System.in);
        Scanner column = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);
      
        /*
            I have a feeling like this should be a loop until user says they are done using the "Calculator"
        */

        //here we get input for matrix data
        System.out.println("Choose your matrix size: ");
        System.out.print("Rows: "); 
        int x = rows.nextInt();
        System.out.print("Columns: ");
        int y = rows.nextInt();
        int matrix[][] = new int[x][y]; 
       
        
        System.out.println("Great! Now going left to right, row to row, input the first number starting from a_ij where i = 0 and j = 0: "); 
        
        
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    int input = userInput.nextInt();
                    matrix[i][j] = input;
                    
                }
            }
        


        //here we will output the matrix 

        System.out.print("Here is your matrix: ");      
        for (int i = 0; i < x; i++) {
            System.out.println(""); 
            for (int j = 0; j < y; j++) {
                System.out.print(matrix[i][j] + " ");
                
            }
        }
        
    }
}