import java.util.*;
import java.util.stream.Collectors;

public class First_Day {

    public void MaxNumber(int a[]){
        //int a[]={34,56,87,234,34,67,89,987,65,46,56};
        int max=a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Max number is "+ max);
    }

    public void MinNumber(int a[]){
        //int a[]={34,56,87,234,9,34,67,89,987,65,46,56};
        int min=a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Min number is "+ min);
    }

    public  void Secondlargest(int a[])
    {
        int largest=a[0];
        int secondlargest=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                secondlargest=largest;
                largest=a[i];
            }
            else if(a[i]>secondlargest && a[i]!=largest)
            {
                secondlargest=a[i];
            }
        }
        System.out.println("Second largest number is "+ secondlargest);
    }

    public  void secondsmallestnumber(int a[])
    {
        int smallest=a[0];
        int secondsmallest=a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i]<smallest)
            {
                secondsmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]<secondsmallest && a[i]!=smallest)
            {
                secondsmallest=a[i];
            }
        }
        System.out.println("Second smallest Number is " +secondsmallest);
    }

    public void MaxMinNumberUsingsorting(int a[])
    {
        Arrays.sort(a);
        int max=a[a.length-1];
        int min=a[0];
        System.out.println("Max using sorting is "+ max);
        System.out.println("Min using sorting is "+ min);

        Set<Integer> set=new TreeSet<>();
        for(int num:a)
        {
            set.add(num);
        }
        List<Integer> list=new ArrayList<>(set);

        System.out.println("Second Max using sorting is "+ a[a.length-2]);
        System.out.println("Second Min using sorting is "+ a[1]);
    }

    public void MaxMinNumberUsingstream(int a[])
    {
        List<Integer> list=Arrays.stream(a).distinct().sorted().boxed().collect(Collectors.toList());
        System.out.println("Max using stream is "+ list.get(list.size()-1));
        System.out.println("Min using stream is "+ list.get(0));
        System.out.println("Second Max using stream is "+ list.get(list.size()-2) );
        System.out.println("Second Min using stream is "+ list.get(1));

        System.out.println("Max is " + Arrays.stream(a).max().getAsInt());
        System.out.println("Min is " + Arrays.stream(a).min().getAsInt());
        System.out.println("Second Max is " + Arrays.stream(a).distinct().sorted().
                skip(Arrays.stream(a).distinct().sorted().count()-2).findFirst().getAsInt());
        System.out.println("Second Min is " + Arrays.stream(a).distinct().sorted().skip(1).findFirst().getAsInt());


    }

    public void SumAvg(int a[])
    {
        double sum=0;
        double avg=0;

        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/2;
        System.out.println("Sum is +" +sum + " and there avg is "+ avg);
    }

    public static void main(String[] args)
    {
        First_Day fd=new First_Day();
        int a[]={34,56,87,234,9,35,67,89,987,65,1000,1001,5,46,56};

        fd.MaxNumber(a);
        fd.MinNumber(a);
        fd.Secondlargest(a);
        fd.secondsmallestnumber(a);
        fd.MaxMinNumberUsingsorting(a);
        fd.MaxMinNumberUsingstream(a);
        fd.SumAvg(a);

    }
}
