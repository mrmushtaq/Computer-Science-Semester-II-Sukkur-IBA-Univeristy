class Task_7_Fibonnacc_sequence
{
    public static void main(String args[])
    {
        int n1=-1, n2=1, a=0;
        for(int i=1; i<=10; i++)
        {
            a=n1+n2;
            n1=n2;
            n2=a;
            System.out.print("\t" + a);       
        }
    }
}


