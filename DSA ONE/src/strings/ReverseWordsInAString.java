package strings;
public class ReverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is my practice program for strings";
		int n = s.length();
		char[] str = s.toCharArray();
		
		System.out.println("After reversing the words the string becomes : ");
		reverseWords(str,n);
		System.out.println(str);
	}
	
	static void reverseWords(char str[], int n) {
		n = str.length;
		int start = 0;
		for(int end=0;end<n;end++) {
			if(str[end]==' ') {
			   reverse(str,start,end-1);
			   start = end+1;
			}
		}
	reverse(str,start,n-1);
	reverse(str,0,n-1);
	}
	
	static void reverse(char[] str,int low, int high) {
		while(low<=high) {
			char temp = str[low];
			str[low] = str[high];
			str[high] = temp;
			low++;
			high--;
		}
	}

}
