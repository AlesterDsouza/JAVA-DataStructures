public class chararray {
    public static void main(String[] args)
    {

        char[] a = { 'j', 'a', 'v', 'a'};
        char[] b= { 'C' , 'o', 'm','p'};
        int size=a.length+ b.length;

        char[] c=new char[size];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {

            c[a.length+i]=b[i];
        }
        for(int i=0;i<a.length+b.length;i++) {
            System.out.print(c[i]+" ");
        }

    }
}
