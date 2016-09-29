package project1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution1 {
	 public static ArrayList<List<String>> groupAnagrams(ArrayList<String> strs1, HashMap<String,ArrayList<String>> hm){
		 
		 ArrayList<List<String>> result = new ArrayList<List<String>>();
		 HashMap<String, ArrayList<String>> map2 = new HashMap<String, ArrayList<String>>();
		 //把数组中的字符串和hashmap中的相匹配	
		 String flag = "flag";
		 for(String str : strs1){
			 char[] arr = new char[26];
			 for(int i = 0; i < str.length(); i++){
				 arr[str.charAt(i) - 'a'] ++;//该出现第几位上的次数。
			 }		 
			 String arr2 = new String(arr);//生成以出现次数为数组的key；
			 
			 if(hm.containsKey(arr2)){
				 hm.get(arr2).add(flag);
				 if(map2.containsKey(arr2)){				 	
					map2.get(arr2).add(str);
				 }else{
					// map2.put(str, null);//现在"no answer found 还不知道怎么存储"
					
					 ArrayList<String> al = new ArrayList<String>();
					 al.add(str);
					 map2.put(arr2, al);
				 } 
//				 if(hm.containsKey(arr2)&& !map2.containsKey(arr2)){
//					 ArrayList<String> al = new ArrayList<String>();
//					 al.add("No Answer Found");
//					 map2.put(arr2, al);
//				 }
			 }
			 
		 }
		 
//		 //遍历hashmap  hm
//		 Iterator it = hm.keySet().iterator();
//		 while(it.hasNext()){
//			 if(!hm.get(it).contains(flag)){
//				 ArrayList<String> al = new ArrayList<String>();
//				 al.add("No Answer Found");
//				 map2.put(it.toString(), al);
//			 }
//		 }
	 
		 result.addAll(map2.values());
		 return result;
	 }
	 
	 /**
	  * create a HashMap<String, ArrayList<String>>
	  */
	 public static HashMap<String,ArrayList<String>> createHashMap(ArrayList<String> strs2){
		 HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		 for(String str : strs2){
			 char[] arr = new char[26];
			 for(int i = 0; i < str.length(); i++){
				 arr[str.charAt(i) - 'a'] ++;//该出现第几位上的次数。
			 }
			 
			 String arr2 = new String(arr);//arr内容copy到arr2，将有包含出现次数的数组作为hashmap的key；string作为value
			 
			 if(map.containsKey(arr2)){
				 map.get(arr2).add(str);
			 }else{
				 ArrayList<String> al = new ArrayList<String>();
				 al.add(str);
				 map.put(arr2, al);
			 } 
		 }
		 return map;
	 }
	 
}
