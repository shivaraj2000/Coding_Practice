import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ninth_Day {

    public void CharCountFrequency()
    {
        String n1="Programming";

        int[] count=new int[256];

        for(int i=0;i<n1.length();i++)
        {
            count[n1.charAt(i)]++;
        }

        for(int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                System.out.println((char)i + " : " + count[i]);
            }
        }
    }

    public void removeDuplicateElements()
    {
        String n1="programming";
        Set<Character> set= new LinkedHashSet<>();
        String res="";

        for(char c: n1.toCharArray())
        {
            set.add(c);
        }

        for(char c:set)
        {
            res=res+c;
        }
        System.out.println(set);
        System.out.println(res);
    }

    public  void firstNonRepeatingChar()
    {
        String n1="pprogramming";
        int[] count= new int[256];

        for(int i=0;i<n1.length();i++)
        {
            count[n1.charAt(i)]++;
        }

        for(int i=0;i<n1.length();i++)
        {
            if(count[n1.charAt(i)]==1)
            {
                System.out.println(n1.charAt(i));
                break;
            }
        }
    }

    public  void firstNonRepeatingCharUsingHashMap()
    {
        String s1="pprogramming";
        LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();

        for(char c:s1.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for(char c:s1.toCharArray())
        {
            if(hm.get(c)==1)
            {
                System.out.println(c);
                break;
            }
        }

        for(char c:hm.keySet())
        {
            if(hm.get(c)==1)
            {
                System.out.println(c);
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        Ninth_Day nd= new Ninth_Day();
        //nd.CharCountFrequency();
        //nd.removeDuplicateElements();
        //nd.firstNonRepeatingChar();
        nd.firstNonRepeatingCharUsingHashMap();
    }
}
