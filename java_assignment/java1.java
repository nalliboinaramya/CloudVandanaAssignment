import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ShuffelArray{
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        for(int i = 1;i<=7;i++){
            arr.add(i);
        }
        Collections.shuffle(arr);
        System.out.println(arr);
    }
}