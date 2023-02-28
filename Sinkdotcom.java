import java.util.ArrayList;
public class Sinkdotcom{
    ArrayList<Integer> arr = new ArrayList<Integer>();

    void getter(ArrayList<Integer> a){
        arr=a;
    }

    String check(int Guess){
        String result = "Miss";
        int index = arr.indexOf(Guess);
        if (index>=0){
            arr.remove(index);
            if (arr.isEmpty()){
                result="Kill";
            }
            else{
                result="Hit";
            }
        }
        return result;
    }
}