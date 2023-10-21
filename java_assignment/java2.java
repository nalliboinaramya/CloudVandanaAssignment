import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import java.util.Collection;
import java.util.Scanner;

class RomanToInteger {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a roman number: ");
        String numberString = scanner.nextLine();
        HashMap<Character,Integer> romanValues = new HashMap<>();
        romanValues.put('I',1);
        romanValues.put('V',5);
        romanValues.put('X',10);
        romanValues.put('L',50);
        romanValues.put('C',100);
        romanValues.put('D',500);
        romanValues.put('M',1000);
        // for(int i = 0;i<numberString.length();i++){
        //     System.out.println(numberString.charAt(i));
        // }
        int sumOfRomans = 0;
        int preValue = 0;
        for(int i = numberString.length()-1;i>=0;i--){
            int currValue = romanValues.get(numberString.charAt(i));
            if(currValue<preValue){
                sumOfRomans = sumOfRomans-currValue;

            }
            else
            {
                sumOfRomans = sumOfRomans+currValue;

            }
            preValue = currValue;
        }
        System.out.println(Math.abs(sumOfRomans));

         







    }
    
}
