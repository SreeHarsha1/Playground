import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
    
  int flag=0,count=0;
  if(n<0){
     flag=1;
    n=n*(-1);}
  int n1=n;
  while(n1!=0)
  {
    n1=n1/10;
    count++;}
  char arr[] = new char[count];
  int c=0;
  while(n!=0)
  {
    int t=n%10;
   
  //  System.out.println(t);
    arr[c]=(char)(t+'0');
   
   n=n/10;
  c++;}
    
  if(flag==1)
    System.out.print("-");
    for(int i=count-1;i>=0;i--)
    {System.out.print(arr[i]);
    }

}
   // System.out.print(arr2[i]);
  }



//System.out.println(s2);  

    
