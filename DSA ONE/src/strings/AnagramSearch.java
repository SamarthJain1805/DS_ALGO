package strings;

public class AnagramSearch {

	static final int CHAR = 256;
	
	public static void main(String[] args) {
		
		String txt = "geeksforgeeks";
		String pat = "frog";
		
		System.out.println(isPresent(txt,pat));
	}
//	static boolean areAnagram(String pat,String txt,int i) {
//		int count[] = new int[CHAR];
//		for(int j=0;j<pat.length();j++) {
//			count[pat.charAt(j)]++;
//			count[txt.charAt(i+j)]--;
//		}
//		for(int j=0;j<CHAR;j++) {
//			if(count[j]!=0)return false;
//		}
//		return true;                                                //naive approach : O((n-m+1)*m)
//	}
//	
//	static boolean isPresent(String txt,String pat) {
//		int n = txt.length();
//		int m = pat.length();
//		for(int i=0;i<n-m;i++) {
//			if(areAnagram(pat,txt,i))return true;
//	    }
//		return false;
//	}

	static boolean areSame(int CT[],int CP[]) {
		for(int i=0;i<CHAR;i++) {
			if(CT[i]!=CP[i])return false;
	}
		return true;
	}
	
	static boolean isPresent(String txt, String pat) {
		int[] CP = new int[CHAR];
		int[] CT = new int[CHAR];
		for(int i=0;i<pat.length();i++) {
			CT[txt.charAt(i)]++;
			CP[pat.charAt(i)]++;
		}
		for(int i=pat.length();i<txt.length();i++) {
			if(areSame(CT,CP))return true;
			CT[txt.charAt(i)]++;
			CT[txt.charAt(i-pat.length())]--;
		}
		return false;
	}
}
