import java.util.*;
import java.util.stream.Collectors;

public class Second_Day {


    public void OddEvenNoCount(int a[])
    {
        int even=0;
        int odd=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Even No Count is "+ even + " Odd No count is " + odd);
    }

    public  void ReverseArray(int a[])
    {
//        for(int i=0;i<a.length/2;i++)
//        {
//            int tmp=a[i];
//            a[i]=a[a.length-1-i];
//            a[a.length-1-i]=tmp;
//        }
//
//        for(int n:a)
//        {
//            System.out.println(n);
//        }

        int start=0;
        int end=a.length-1;

        while(start<end)
        {
                int tmp=a[start];
                a[start]=a[end];
                a[end]=tmp;
                start++;
                end--;
        }
        for(int n:a)
        {
            System.out.println(n);
        }
    }

    public void ReverseArrayInDescnding(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for(int n:a)
        {
            System.out.println(n);
        }
    }

    public void ReverseArrayInAcscnding(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for(int n:a)
        {
            System.out.println(n);
        }
    }

    public void ReverseArrayInDescndingusingSorting(int a[])
    {
        Arrays.sort(a);

        System.out.println("Ascending order");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Descending order");
        for(int j=a.length-1;j>=0;j--)
        {
            System.out.println(a[j]);
        }
    }

    public void FindDuplicate(int a[])
    {
        Set<Integer> Original=new TreeSet<>();
        Set<Integer> Duplicate=new TreeSet<>();

        for(int n:a)
        {
            if(!(Original.add(n)))
            {
                Duplicate.add(n);
            }
        }

        System.out.println("Duplicate Elements are");
        for(int i:Duplicate)
        {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("Original Elements are");
        for(int i:Original)
        {
            System.out.print(i + " ");
        }

    }


    public static void main(String[] args)
    {
        Second_Day sd=new Second_Day();
        int a[]={34,56,87,234,9,56,234};

        //sd.OddEvenNoCount(a);
        //sd.ReverseArray(a);
        //sd.ReverseArrayInDescnding(a);
        //sd.ReverseArrayInAcscnding(a);
        //sd.ReverseArrayInDescndingusingSorting(a);
        sd.FindDuplicate(a);
    }
}
