public class Tenth_Day {

    public  void reverseWordInSentence()
    {
        String n1="I am Java Programmer";

        String[] words=n1.split(" ");

        for(int i=words.length-1;i>=0;i--)
        {
            if(i!=0) {
                System.out.print(words[i] + " ");
            }else{
                System.out.print(words[i]);
            }
        }
    }

    public void countVowelsConsonants()
    {
        String n1="I am Java Programmer";

        int constants=0;
        int vowels=0;

        for(int i=0;i<n1.length();i++)
        {
            char ch=n1.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    vowels++;
                else
                    constants++;
            }
        }
        System.out.println("Vowels count  is " +vowels);
        System.out.println("constants count  is " +constants);
    }

    public  void stringCompression()
    {
        String s="aaabbcccddd";

        StringBuilder sb= new StringBuilder();
        int count=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }else
            {
                sb.append(s.charAt(i)).append(count);
                count=1;
            }
        }
        sb.append(s.charAt(s.length()-1)).append(count);
        System.out.println(sb);
    }
    public static void main(String[] args)
    {
        Tenth_Day td= new Tenth_Day();
        //td.reverseWordInSentence();
        //td.countVowelsConsonants();
        td.stringCompression();
    }
}
