package project1;
import java.io.*;
import java.util.*;
import utility.Insert;
public class Project1 {
	public static void main(String[] args){
		ArrayList<String> strs1 = new ArrayList();		
		ArrayList<String> strs2 = new ArrayList();
		readtxt(strs1,strs2);
		HashMap<String, ArrayList<String>> hashmap = new HashMap<String, ArrayList<String>>();
		hashmap = Solution1.createHashMap(strs2);
		
		writetxt(Solution1.groupAnagrams(strs1, hashmap));
		/**
		 * print
		 */
		for(List<String> str: Solution1.groupAnagrams(strs1, hashmap)){
			for(int i = 0; i < str.size();i++){
				System.out.println(str.get(i));
			}
			System.out.println("--------------");
		}
}	
		
		/**
		 * read sample
		 */
		static void readtxt(ArrayList<String> strs1, ArrayList<String> strs2){
			try{
				Scanner scan = new Scanner(new File("src\\Input\\sample1.txt"));
				File file=new File("src\\Output\\Output.txt");
		        if(file.exists()&&file.isFile())
		             file.delete();
		        int flag = 0;
		        int index = 0;
				while(scan.hasNextLine()){
					String string = scan.nextLine();
					if(flag == 0){
						strs1.add(string);
						if(string.equals("-----")){
							strs1.remove(string);
							flag = 1;
						}
				
					}else if(flag == 1){
							strs2.add(string);
							if(string.equals("-----")){
								strs2.remove(string);
							}
					}			
				}
				scan.close();
				}catch(FileNotFoundException e){
					e.printStackTrace();
				}
			//test whether the txtfile has been divided into two arrrayList				
//			for(int i = 0; i < strs1.size();i++){
//				System.out.println(strs1.get(i));
//			}
//			System.out.println("--------------------------");
//			for(int i = 0; i < strs2.size();i++){
//				System.out.println(strs2.get(i));
//			}
			
					
		}
	
		/**
		 * write result
		 * @param n n is the result of the number of repeat_once string for each string.
		 */
		static void writetxt(ArrayList<List<String>> arrayList){
			try{
				FileWriter fw = new FileWriter("src\\Output\\Output.txt",true);
				for(List<String> str: arrayList){
					for(int i = 0; i < str.size();i++){
						fw.write(str.get(i) + "\r\n");
					}
					fw.write("--------------"+ "\r\n");
				}
				
				
				//fw.write(Long.toString(n) + "\r\n");
				fw.flush();
				fw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	
}
