import java.security.Key;
import java.util.HashMap;

public class Sixth_Day {


    public  void firstNonRepeatingElement()
    {
        int a[]={1,2,3,4,5,1,2,3,4,6,7};

        HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();

        for(int n:a)
        {
            hm.put(n, hm.getOrDefault(n,0)+1);
        }

//        for(int n:a)
//        {
//            if(hm.get(n)==1)
//                    {
//                        System.out.println("First non repetaing element " + n);
//                        break;
//                    }
//        }

        for(int key:hm.keySet())
        {
            if(hm.get(key)==1)
            {
                System.out.println("First non repetaing element " + key);
                  break;
            }
        }
    }


    public  void rotateArrayByLeftusingonemorearray()
    {
        int a[]={1,2,3,4,5,6};
        int k=2;
        int index=a.length;

        int rotated[]=new int[index];

        for(int i=0;i<index-k;i++)
        {
            rotated[i]=a[i+k];
        }

        for(int i=0;i<k;i++)
        {
            rotated[index-k+i]=a[i];
        }

        for(int n:rotated)
        {
            System.out.print(n + " ");
        }
    }
    public void rotateArrayByLeftusingReverse()
    {
        int a[]={1,2,3,4,5,6};
        int k=2;
        int n=a.length;

        k=k%n;

        reverse(a,0,k-1);
        reverse(a,k,n-1);
        reverse(a,0,n-1);

        for(int j:a)
        {
            System.out.print(j + " ");
        }

    }

    public void reverse(int a[],int start, int end)
    {
        while(start<end)
        {
            int tmp=a[start];
            a[start]=a[end];
            a[end]=tmp;

            start++;
            end--;
        }
    }

    public static void main (String[] args)
    {
        Sixth_Day sd= new Sixth_Day();
        //sd.firstNonRepeatingElement();
        //sd.rotateArrayByLeftusingonemorearray();
        sd.rotateArrayByLeftusingReverse();
    }
}
