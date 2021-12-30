public class BubbleSort
{
   public static void bubblesort(int arr[])
  {
    int n = arr.length;
    int temp = 0;
    for(int i=0;i<n;i++)
    {
      for(int j=1;j<(n-1);j++)
      {
        if(arr[j-1]>arr[j])
        {
          temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
      }
     }
   }
   public static void main(String args[])
   {
     int arr[] = {4,20,24,6,60,45,62,30,64};
     bubblesort(arr);
     System.out.println("After BubbleSort the array:");
     for(int i=0;i<arr.length;i++)
     {
       System.out.print(arr[i] + " ");
     }
   }
}
       