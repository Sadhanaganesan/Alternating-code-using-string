import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner th=new Scanner(System.in);
        String s=th.nextLine();
        int c=0;
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++)
        {
            if(i%2==0)
            //if(s.charAt(i) == s.charAt(i+2))
            {
                if(str[0]-str[i]==0)
                {
                    c++;
                }
                else{
                    break;
                }
            }
            else if(i%2!=0)
            {
                if(str[1]-str[i]==0)
                {
                    c++;
                }
                else{
                    break;
                }
            }
        }
        if(c==str.length)
            {
                System.out.println("Yes");
            }
         else
            {
                System.out.println("No");
            }
    }
}
