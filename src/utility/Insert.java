package utility;

public class Insert {
	public static int index = 0;
	public static String[] insertElements(String original[], String element){
		
		String arr[] = new String[original.length + 1];
		if(index <= original.length){
			arr[index] = element;
			index++;
			System.out.println("index = " + index);
		}
		
		return arr;
	}
}
