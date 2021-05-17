import java.util.*;
class fabonicstring{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

	//test cases or No of input
	int input1 = sc.nextInt();
       while(input1 > 0){
	      String str = sc.next();

	      int[] count = new int[256];//ASCII
	      int len = str.length();

	  
          
          //counting each character
          int arrlen = 0;
	      for(int i = 0 ; i < len ; i++ ){
		    if(count[str.charAt(i)] == 0){
			  arrlen++;
			  count[str.charAt(i)]++;
		    }
		    else{
		      count[str.charAt(i)]++;
		    }
		  
	      }

	      int[] arr = new int[arrlen];
    
        
          int j = 0;

	      
          
          //if count have some value then i put in array
	      for(int i = 0 ;i < 256;i++){
		     if(count[i] != 0){
			   arr[j] = count[i];
			   j++;
		     }
	      }

          //sort the array
	      Arrays.sort(arr);

	     
    
          int fibonacci = 0;
         
          //checking condition
	      for(int i = 2 ; i < arrlen ; i++){
		     if(arr[i] == arr[i-1] + arr[i-2]){
			   fibonacci++;
		     }
	      }

	      if(fibonacci != 0 || arrlen < 2){
		    System.out.println("Dynamic");
	      }
	      else{
		    System.out.println("Not");
	      }
	      input1--;
        }
}
}