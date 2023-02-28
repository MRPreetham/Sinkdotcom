import java.util.ArrayList;
public class Game{
    public static void main(String[] args){
        int NoGuess=0;
        Generator ran = new Generator();
        ArrayList<Integer> list = ran.comp();
        Helper h = new Helper();
        Sinkdotcom dot = new Sinkdotcom();
        dot.getter(list);
        while (true){
            NoGuess++;
            int Guess = h.setter();
            String ans=dot.check(Guess);
            if (ans=="Kill"){
                System.out.println("You Win:"+NoGuess);
                break;
            }
            else if(ans=="Hit"){
                System.out.println("Hit");
            }
            else{
                System.out.println("Miss");
            }
        }
    }
}