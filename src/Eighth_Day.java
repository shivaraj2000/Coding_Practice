import java.sql.Array;
import java.util.Arrays;

public class Eighth_Day {

    public void arrayPalindrome()
    {
        int a[]={1,2,3,3,2,1};
        boolean isPalindrome=true;
        for(int i=0;i<a.length/2;i++)
        {
            if(a[i]!=a[a.length-i-1])
            {
                isPalindrome=false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Palindorme");
        else
            System.out.println("Not Palindorme");

    }

    public void reverseString()
    {
        String name="Shivaraj";

        //Using String Builder
        StringBuilder sb=new StringBuilder(name);
        String reverseName=sb.reverse().toString();
        System.out.println("Reversed by String Builder : " + reverseName);

        //Using amother variable
        String rev="";
        for(int i=name.length()-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println("Reversed by anoter variable : " + rev);

        //Using by converting to array
        char[] ch=name.toCharArray();

        for(int i=0;i<ch.length/2;i++)
        {
            char tmp=ch[i];
            ch[i]=ch[ch.length-i-1];
            ch[ch.length-i-1]=tmp;
        }
        System.out.println("Reversed by converting to array : " + new String(ch));


    }

    public void stringPalindrome()
    {
        String name="gadaga";
        boolean isPalindrome=true;

        for(int i=0;i<name.length()/2;i++)
        {
            if(name.charAt(i)!=name.charAt(name.length()-i-1))
            {
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindorme");
    }

    public void anagramCheck()
    {
        String n1="listen";
        String n2="tetlis";

        //Using Sorting
        n1.toLowerCase();
        n2.toLowerCase();

        char[] ch1=n1.toCharArray();
        char[] ch2=n2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("Using sorting : Anagram");
        }else
            System.out.println("Using sorting : Not anagram");

        //Using for loop
        boolean isanagaram=true;
        if(n1.length()!=n2.length())
            System.out.println("Using loop : Not Anagarm");
        else
        {
            int count[]=new int[256];
            for(int i=0;i<n1.length();i++)
            {
                count[n1.charAt(i)]++;
                count[n2.charAt(i)]--;
            }
            for(int c:count)
            {
                System.out.print(c + " ");
            }
            System.out.println(" ");
            for(int x:count)
            {
                if(x!=0)
                {
                    isanagaram=false;
                    break;
                }
            }
            if(isanagaram)
                System.out.println("Using loop : Anagarm");
            else
                System.out.println("Using loop : Not Anagarm");

        }
    }

    public static void main(String[] args)
    {
        Eighth_Day ed=new Eighth_Day();

        //ed.arrayPalindrome();
        //ed.reverseString();
        //ed.stringPalindrome();
        ed.anagramCheck();
    }
}
