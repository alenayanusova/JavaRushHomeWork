import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by yanusovaaa on 11/3/2015.
 */
public class New
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> one = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> three = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++){
            num.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < num.size(); i++){
            if ((num.get(i)%3 == 0) && (num.get(i)%2 == 0)){
                one.add(num.get(i));
                two.add(num.get(i));
            } else if (num.get(i)%3 == 0){
                one.add(num.get(i));
            } else if (num.get(i)%2 == 0) {
                two.add(num.get(i));
            } else three.add(num.get(i));
        }

        for (int i = 0; i < one.size(); i++){
            System.out.println(one.get(i));
        }

        for (int i = 0; i < two.size(); i++){
            System.out.println(two.get(i));
        }

        for (int i = 0; i < three.size(); i++){
            System.out.println(three.get(i));
        }





    }


}


