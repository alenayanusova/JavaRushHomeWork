import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by yanusovaaa on 11/2/2015.
 */
public class Solution
{

    //???????? ??? ??? ???
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            list.add(br.readLine());
        }

        for (int i = 0; i < 13; i++)
        {
            String s = list.get(4);
            list.remove(4);
            list.add(0,s);
        }

        for (int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }








    }
}
