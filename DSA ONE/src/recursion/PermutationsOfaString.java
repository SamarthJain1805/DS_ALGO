package recursion;

public class PermutationsOfaString {
	
	
	static void Permute(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			String ros = s.substring(0, i)+s.substring(i+1);
			
			Permute(ros,ans+ch);	
			}
	}

	public static void main(String[] args) {
	
    String s = "abc";
    Permute(s," ");
	}

}
