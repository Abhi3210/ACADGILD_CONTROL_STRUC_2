
public class Assignment2 {
    public static void main(String args[]){
    	String a="abcdefghijklmnopqrstuvwxyz";
    	char arr[]=a.toCharArray();
    	int n=5;
    	int mid=(n-1)/2;
    	for(int i=0;i<=mid;i++){
    	    int count=0;
    	    for(int j=0;j<mid-i;j++)
    	    	System.out.print(" ");
    	    for(int j=mid-i;j<=mid+i;j++){
    	    	if(j<mid)
    	    		System.out.print(arr[count++]);
    	    	
    	    	else
    	    		System.out.print(arr[count--]);
    	    	
    	    }
    	    System.out.println();
    	}
    	   for(int i=mid-1;i>=0;i--){
    		   int count=0;
    		   for(int j=0;j<mid-i;j++)
    			   System.out.print(" ");
    		   for(int j=mid-i;j<=mid+i;j++){
    			   if(j<mid)
    				   System.out.print(arr[count++]);
    			   else
    				   System.out.print(arr[count--]);
    		   }
    		   System.out.println();
    	   }
    }
}
