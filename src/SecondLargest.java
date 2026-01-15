import java.util.Scanner;
public class SecondLargest {
    
        // TODO: Read N
        // TODO: Read array elements
        // TODO: Find and print the second largest element
        // Hint: You can do this in a single pass or two passes without sorting.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int idx=0;
            for(int i = 1;i<n;i++)
            {
                if (arr[idx]<=arr[i])
                {
                    idx=i;
                }
            }
            int idx2=0;
            while(idx2 < n && arr[idx2]==arr[idx])
            {
                idx2++;
            }
            for(int i = 0;i<n;i++)
            {
                if (arr[i]==arr[idx])
                {
                    continue;
                }
                if (arr[idx2]<=arr[i])
                {
                    idx2=i;
                }
            }
            System.out.print(arr[idx2]);
        
        }
}