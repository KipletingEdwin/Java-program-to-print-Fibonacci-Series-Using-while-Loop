//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         int totalTerms = 10;
         int firstNumber = 0;
         int secondNumber = 1;

         int count = 1;
         while (count <= totalTerms){
//             System.out.print(a + ",");

             int subsequent = firstNumber + secondNumber;
             System.out.println("sum, "+subsequent);
             firstNumber = secondNumber;
             secondNumber = subsequent;

             count ++;
         }
    }
}