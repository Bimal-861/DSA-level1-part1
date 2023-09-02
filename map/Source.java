import java.util.*;
public class Source{
	//Method to check if two strings are anagram of each other or not
	public static boolean check(String str1, String str2){
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		//Write your code here
		if(arrange(ch1).equals(arrange(ch2))){
		    return true;
		}
		return false;
	}
	//Method to sort the character array
	public static void arrange(char[] ch){
		//Write your code here
		Arrays.sort(ch);
	}
	
	public static void main(String[] x){
		Map<String,String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String key;
		String value;
		for(int i = 1; i <= num; i++){
			key = sc.next();
			value = sc.next();
			map.put(key,value);
		}
		int c=0;
		for (String k : map.keySet()){
		    boolean ch=(k,map.get(key));
		    if(ch==true){
		        System.out.println(k+":"+map.get(key));
		        c++;
		    }
		}
		if(c==0){
		    System.out.println(false);
		}
	}
}
