package Lec_02;

public class Valid_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public boolean isAnagram(String s, String t) {
	        if(s.length()!=t.length()){
	            return false;
	        }
	        char [] arr1=s.toCharArray();
	        char [] arr2=t.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        for(int i=0;i<arr1.length;i++){
	            if(arr1[i]!=arr2[i]){
	                return false;
	            }
	        }
	        return true;
	    }
	  

}
