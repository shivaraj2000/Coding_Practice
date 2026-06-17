import java.util.*;
import java.util.stream.Collectors;

public class Third_Day {

    public void FindMissingNo()
    {
        int a[]={5,6,7,9};

        int min=a[0];
        int max=a[a.length-1];

        int totalsum=0;
        for(int i=min;i<=max;i++)
        {
            totalsum=totalsum+i;
        }

        int actualsum=0;
        for(int n:a)
        {
            actualsum=actualsum+n;
        }

        System.out.println("Missing No is " + (totalsum-actualsum));
    }

    public  void commonElements()
    {
        int a[]={1,2,3,4,5,6,7};
        int b[]={5,6,7,8,9,10,1};

        Set<Integer> set1=new HashSet<>();
        for(int n:a)
        {
            set1.add(n);
        }

        Set<Integer> set2=new HashSet<>();
        for(int m:b)
        {
            set2.add(m);
        }

        System.out.println("Common elemnets");
        Set<Integer> commonElements=new HashSet<>(set1);
        commonElements.retainAll(set2);

        for(int i:commonElements)
        {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println("Distinct Elements");
        Set<Integer> union=new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> Distinct=new HashSet<>(union);
        Distinct.removeAll(commonElements);

        for(int i:Distinct)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public void mergeTwoArrays(){
        int a[]={3,4,5,6,7,1,3};
        int b[]={2,12,3,5,34};

        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for(int j=0;j<b.length;j++)
        {
            c[a.length+j]=b[j];
        }

        for(int n:c)
        {
            System.out.print(n + " ");
        }

        System.out.println("Merging without dupliactes");
        Set<Integer> merge=new TreeSet<>();
        for(int x:a)
        {
            merge.add(x);
        }
        for(int y:b)
        {
            merge.add(y);
        }

        for(int z:merge)
        {
            System.out.print(z +" ");
        }
    }

    public  void SortWithoutInBuilt(int a[])
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

        for(int x:a)
        {
            System.out.print(x + " ");
        }

    }

    public  void countOccuranceofEachElement()
    {
        int a[]={1,2,3,4,2,3,5,3};
        HashMap<Integer,Integer> hm=new HashMap<>();

//        for(int i=0;i<a.length;i++)
//        {
//            int key=a[i];
//            int count=hm.getOrDefault(key,0)+1;
//            hm.put(key,count);
//        }

        for(int i=0;i<a.length;i++)
        {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }

        for(int key:hm.keySet())
        {
            System.out.println(key + " --> " + hm.get(key));
        }
    }
    public static void main(String[] args)
    {
        Third_Day fd=new Third_Day();
        int a[]={34,56,87,234,9,35,67,89,987,65,1000,1001,5,46,56};

        //fd.FindMissingNo();
        //fd.commonElements();
        //fd.mergeTwoArrays();
        //fd.SortWithoutInBuilt(a);
        fd.countOccuranceofEachElement();


    }
}
