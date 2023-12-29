import java.util.*;

class Occurance{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Map<Character,Integer>m=new HashMap<>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(m.get(c)==null) m.put(c,1);
			else m.put(c,m.get(c)+1);
}
		for(char c:m.keySet()){
			System.out.println(c+" "+m.get(c));
}

}
}
