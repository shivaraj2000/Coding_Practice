import java.util.HashSet;
import java.util.Set;

public class Fourth_day {

    public void FindFrequmcyofGivemNumber()
    {
        int a[]={2,3,4,3,3,5,6,7,3,5,7,0,8,5,3};
        int target=3;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                count++;
            }
        }
        System.out.print("targetted number " +target + " is present in array for "+count + " times");
    }

    public void moveZeroToEnd()
    {
        int a[]={1,0,2,3,0,4,5,0,6,7,0};
        int index=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[index++]=a[i];
            }
        }

        while(index<a.length)
        {
            a[index++]=0;
        }

        for(int n:a)
        {
            System.out.print(n + " ");
        }
    }

    public  void moveZeroBeginning()
    {
        int a[]={1,0,2,3,0,4,5,0,6,7,0};
        int index=a.length-1;

        for(int i=index;i>=0;i--)
        {
            if(a[i]!=0)
                a[index--]=a[i];
        }

        while(index>=0)
        {
            a[index--]=0;
        }

        for(int n:a)
        {
            System.out.print(n + " ");
        }
    }


    public void findPairWithGivenSum()
    {
        int a[]={1,2,4,5,2,3,4,5,2,1,5,0,2,3,0,6};
        int sum=8;

        Set<String> set=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                int min=Math.min(a[i],a[j]);
                int max=Math.max(a[i],a[j]);

                if(min+max==sum) {
                    String pair = min + "," + max;
                    set.add(pair);
                }

//                if(a[i]+a[j]==sum)
//                {
//                    System.out.println("Sum is present with these two as "+ a[i] + "," + a[j]);
//                }
            }
        }

        for(String n:set)
        {
             System.out.println("Sum is present with these two as "+ n);
        }
    }

    public void SubarryforGivenSUm()
    {
        int a[]={1,2,3,4,2,3,4,50,6,0,3,2};
        int sum=6;

        for(int i=0;i<a.length;i++)
        {
            int sums=0;
            for(int j=i;j<a.length;j++)
            {
                sums=sums+a[j];
                if(sum==sums)
                {
                    System.out.println("Sum " +sum + " is present in the given range in the array "+ i + "," + j);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Fourth_day fd=new Fourth_day();
        //fd.FindFrequmcyofGivemNumber();
        //fd.moveZeroToEnd();
        //fd.moveZeroBeginning();
        //fd.findPairWithGivenSum();
        fd.SubarryforGivenSUm();
    }
}
