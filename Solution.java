package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
	private static String string;	
	private static int array[][];
	
	public static void main(String[] args) throws IOException  {
		int result;
		try{
			Scanner scan = new Scanner(new File("src/Input/SampleInput1.txt"));
			File file=new File("src/Output/Output.txt");
			if(file.exists()&&file.isFile()){
	             file.delete();
			}
			FileWriter fw = new FileWriter("src/Output/Output.txt",true);
			
			long startTime = System.currentTimeMillis();
			
	        while(scan.hasNextLine()){
	        	string = scan.nextLine();
	        	int n = string.length();
				array = new int[n][n];
				init(string);
				result = dynamicSweep(string);
				
				fw.write(result + "\r\n");
	        }

        	long endTime = System.currentTimeMillis();
            System.out.println("Running time is : " + (endTime - startTime) + " ms");
            
	        scan.close();
	        fw.flush();
			fw.close();
		}catch(FileNotFoundException e){
			System.out.println("cannot find the input file");
			e.printStackTrace();
		}	
	}
	
	//dymaic programming method
	public static int dynamicSweep(String s){
		int n = string.length();
		int result = 0;

		for(int k = 2; k <= n; k++){//k = the length of substring
			for(int j = k - 1;j < n; j++){
				int i = j - k + 1;	
				
				if(s.charAt(i) == s.charAt(j)){
					array[i][j] = Math.min(array[i][i+k-2], array[j-k+2][j]);
				}else{
					for(int m = i ; m < n - 1; m++){
						array[i][j] = Math.min(array[i][j], array[i][m] + array[m+1][j]);
					}
				}
				
			}
			
//			for(int x = 0; x < n ;x++){
//				for(int y =0 ;y <n ;y++){
//					System.out.print(array[x][y] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
		}	
		
		
		result = array[0][n-1];
//		System.out.println("array["+i+"]["+ j+"] = " + result);	
//		System.out.println("k= " + k);
//		System.out.println("j= " + j);
//		System.out.println("i= " + i);
//		System.out.println();
		
		return result;

	}
		
	private static void init(String s){
		for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++)
            	array[i][j] = Integer.MAX_VALUE;//avoid distrubing
        }
        for (int i = 0; i < s.length(); i++){ 
        	array[i][i] = 1;
        }
	}


}
