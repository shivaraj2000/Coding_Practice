import java.sql.Array;

public class Seventh_Day {

    public void rotateArrayByRight()
    {
        int a[]={1,2,3,4,5,6};
        int d=3;

        int end=a.length;
        int k=d%end;

        reverse(a,0,end-1);
        reverse(a,0,k-1);
        reverse(a,d,end-1);

        for(int i:a)
        {
            System.out.print(i + " ");
        }
    }

    public void reverse(int[] a, int strat, int end)
    {
        while(strat<end){
            int tmp=a[strat];
            a[strat]=a[end];
            a[end]=tmp;

            strat++;
            end--;

        }
    }

    public void checkWhetherArraySorted()
    {
        int a[]={1,2,3,4,5,6,7,9,8};
        boolean flag=true;

        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                flag=false;
                break;
            }
        }

        if(flag)
            System.out.print("It is in sorted order");
        else
            System.out.print("It is not in sorted order");
    }

    public void findingMaxDif()
    {
        int[] a={1,2,3,4,0,5,6,7,8};
        int min=a[0];
        int maxDiff=0;

        for(int i=1;i<a.length;i++)
        {
            if(a[i]-min >maxDiff)
            {
                maxDiff=a[i]-min ;
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.print("Max dif is " + maxDiff);
    }

    public static  void main(String[] args)
    {
        Seventh_Day sd= new Seventh_Day();

        //sd.rotateArrayByRight();
        //sd.checkWhetherArraySorted();
        sd.findingMaxDif();
    }
}
