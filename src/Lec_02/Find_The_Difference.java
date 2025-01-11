package Lec_02;

public class Find_The_Difference {
	 public char findTheDifference(String s, String t) {
	        int [] freq=new int [26];
	        for( int i=0;i<s.length();i++){
	            freq[s.charAt(i)-'a']++;
	        }
	        for( int i=0;i<t.length();i++){
	            freq[t.charAt(i)-'a']--;
	        }
	        System.out.println(Arrays.toString(freq));
	        for(int i=0;i<freq.length;i++){
	            if(freq[i]!=0){
	                return (char)('a'+i);
	            }
	        }
	        return 'a';
	    }
}
