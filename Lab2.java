import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Lab2{
 public static void main(String[] args) throws FileNotFoundException{

String inputFileName="input.text";
String outputFileName="Output.text";

File inputFile=new File(inputFileName);
Scanner scanner=new Scanner(inputFile);
PrintWriter writer=new PrintWriter(outputFileName);

   while(scanner.hasNextInt())
     {
         int n=scanner.nextInt();
         int sum=(n*(n+1))/2;
         writer.print(sum+" ");
     }
   scanner.close();
   writer.close();

System.out.println("Results written to "+outputFileName);
  }
}
