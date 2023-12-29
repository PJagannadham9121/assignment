import java.util.*;

class Second{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
}
		int max=Integer.MIN_VALUE;
		for(int i:arr){
			max=Math.max(max,i);

}
		int max2=Integer.MIN_VALUE;
		for(int i:arr){
			if(i==max) continue;

			max2=Math.max(max2,i);
                       System.out.println(max2+" "+i);
}
		System.out.println("1st max "+max+" Second max "+max2);
}
}
