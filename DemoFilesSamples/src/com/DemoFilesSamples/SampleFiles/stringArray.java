package com.DemoFilesSamples.SampleFiles;

public class stringArray {
	
	public static void reverseaStringvalues(char[] ads, int length) {
		String as = "";
		for(int i = 0 ; i<length;i++) {
			as = ads[i]+as;
		}
		System.out.println("sdssdsdssd using forloop   "+as);
	}
	
	public static void removeduplicateValuesinString(char[] ads, int length, String ghs) {
		
		StringBuilder sas = new StringBuilder();
		sas.append(ghs.charAt(0));
		for(int i = 0 ; i<length;i++) {
			if(!sas.toString().toLowerCase().contains(String.valueOf(ghs.toLowerCase().charAt(i)))) {
				sas.append(ghs.charAt(i));
			}
		}
		System.out.println("removeduplicateValuesinString   "+ sas.toString());
	}
	
	public static void removeDuplicateEntryValues(String ghs, int len) {
		String jhj = String.valueOf(ghs.charAt(0));
		String ssa  = "";
		for(int i = 1; i<len;i++) {
			if(jhj.contains(String.valueOf(ghs.charAt(i)))) {
			   ssa = jhj.replace(String.valueOf(ghs.charAt(i)), "");
			   jhj = ssa;
			} else {
				jhj+=String.valueOf(ghs.charAt(i));
			}
		}
		System.out.println(jhj);
	}

	public static void main(String[] args) {
		
		String ghs = "ghjsashghh";
		
		char[] ads = ghs.toCharArray();
		
		reverseaStringvalues(ads,ads.length);
		
		removeduplicateValuesinString(ads,ads.length,ghs);
		
		removeDuplicateEntryValues(ghs,ghs.length());
		

	}

}
