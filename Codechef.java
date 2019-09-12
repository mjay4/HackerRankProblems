/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void sort(int a[]){
		int n=a.length;
		int b[]= new int[n];
		int c[]= new int[101];
		
		for(int i=0;i<101;++i){
			c[i]=0;
		}
		for(int i=0; i<n; i++){
			c[a[i]]++;
		}
		for(int i=1; i<101;i++){
			c[i]+=c[i-1];
		}import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the hexagonalGrid function below.
     */
    static String hexagonalGrid(String a, String b) {
       for(int i=0;i<a.length;i++){
           if(i>0){
               if((a.charAt(i)==b.charAt(i-1))&&(a.charAt(i)=='0')){

               }
           }
       }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = hexagonalGrid(a, b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}

		for(int i=(n-1);i>=0;i--){
			b[c[a[i]]-1]=a[i];
			c[a[i]]--;
		}
		for(int i=0;i<n;i++){
			a[i]=b[i];
		}
	}
	
	
	
	
	// insert count sort.
	public static void main (String[] args) throws java.lang.Exception
	{
	    int t;
		
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		while(t>0){
		int k,n,sum=0,sumcheck=0,count=0;
		n=sc.nextInt();
		k=sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
		/* To create a subsequence of length k*/
		sort(ar);
		for(int i=0;i<k;i++){
			sum+=ar[i];
		}
		int temp=sum-ar[k-1];
		for(int i=k-1;i<n;i++){
			sumcheck=ar[i]+temp;
			if(sumcheck==sum){
				count++;
			}else{
				break;
			}
		}
		System.out.println(count);
		t--;
		}
	}
}
