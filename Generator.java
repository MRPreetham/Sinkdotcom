import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class Generator{
    Random rand = new Random();
    ArrayList<Integer> list = new ArrayList<Integer>();

    ArrayList<Integer> comp(){
        int r = rand.nextInt(5);
        list.add(r);
        for (int i=1;i<3;i++){
            list.add(r+i);
        }
        return list;
    }
        

}