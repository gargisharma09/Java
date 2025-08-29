import java.util.*;
class  Array_op

{
    public static void main(String args[])
    {
        int ar[]=new int[10];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Array Values");
        for(int i=0;i<5;i++)
        {
            ar[i]=input.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("Array Values are "+ar[i]);
        }
        
    }
}