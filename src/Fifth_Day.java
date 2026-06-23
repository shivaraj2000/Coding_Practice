import java.util.HashSet;
import java.util.Set;

public class Fifth_Day {

    public  void maxSumArray()
    {
        int a[]={-2,3,1,-3,4,-2,5,-1,-8,2,3,-3};

        int currsum=a[0];
        int maxsum=a[0];
        int start=0;
        int end=0;
        int tmpstatrt=0;

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>currsum+a[i])
            {
                currsum=a[i];
                tmpstatrt=i;
            }else {
                currsum=currsum+a[i];
            }

            if(currsum>maxsum)
            {
                maxsum=currsum;
                start=tmpstatrt;
                end=i;
            }
           // currsum=Math.max(a[i],currsum+a[i]);
            //maxsum=Math.max(currsum,maxsum);
        }
        System.out.println("Max sum is " +maxsum);
        System.out.println("Index for max sum is "+ start +" and " + end);
    }

    public void uniqueElements()
    {
        int a[]={2,3,1,3,4,2,5,1,8,2,3,-3};
        Set<Integer> set=new HashSet<Integer>();
        Set<Integer> duplicates=new HashSet<Integer>();

        for(int n:a)
        {
            if(!set.add(n))
            {
                duplicates.add(n);
            }
        }

        Set<Integer> unique=new HashSet<Integer>(set);
        unique.removeAll(duplicates);

        for(int n : unique)
        {
            System.out.println(n);
        }

    }

    public void firstRepetatingElement()
    {
        int a[]={2,3,1,2,3,4,2,5,1,8,2,3,-3};

        Set<Integer> set= new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(set.contains(a[i]))
            {
                int rpeat=a[i];
                System.out.println(rpeat + " is repeatimg multiple times and the pther index is "+ i);
                break;
            }
            set.add(a[i]);
        }
    }

    public static void main(String[] args)
    {
        Fifth_Day fd=new Fifth_Day();
        fd.maxSumArray();
        //fd.uniqueElements();
        //fd.firstRepetatingElement();
    }
}
