package assignmenttwo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class AssignmentTwo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	String A[] = null;
	int A1[] = null;
	ArrayList<String> A2 = null;
	String S1[] =null;
	ArrayList<String> list = null;
	ArrayList<String> list2 = null;
	
	//*******PLEASE COMMENT OTHERS IF EACH PROBLEM NEEDS TO BE TESTED INDIVIDUALLY*********
	//PROBLEM-01
	 stringOccurence(A,scan);
	  
	  //PROBLEM-02 
	  System.out.println(firstLetter(S1,scan));
	  
	  //PROBLEM-03 
	  System.out.println(arraytoSet(A1,scan));
	 
	
   //PROBLEM-04
    ArrayList<String> output =removeDuplicate(A2,scan);	
    System.out.println(output);
    
	
	  //PROBLEM-05 
    System.out.println(firstLast(list,scan));
	  
	  //PROBLEM-06 
    System.out.println(findKey(list2,scan));
}
	
	

	public static void stringOccurence (String A [],Scanner scan)
	{
		
		System.out.println("Please enter no of elements");
		int size = scan.nextInt();
		A= new String[size];
		System.out.println("Please enter elements");
		for (int i = 0; i < size; i++) {
			A[i] = scan.next();
		}
		Map<String,Integer> m1= new LinkedHashMap<String,Integer>();
		
		m1.put(A[0], 1);
		for(int i=1;i<A.length;i++)
		{
			if(m1.containsKey(A[i]))
			{
				m1.replace(A[i], m1.get(A[i])+1);
			}
			else
			{
				m1.put(A[i], 1);
			}
			
		}
		int i=0;
		 for (Map.Entry<String,Integer> entry : m1.entrySet()) {
			 if(i== m1.size()-1	) {
				 System.out.print(entry.getKey() +  "-" + entry.getValue());
			 }else {
				 System.out.print(entry.getKey() +  "-" + entry.getValue()+", ");
			 }
		 i++;
		 }
		
		
	}
	
	public static Map<String,String> firstLetter (String S1 [],Scanner scan)
	{    
		System.out.println("Please enter no of Strings");
		int size = scan.nextInt();
		S1= new String[size];
		System.out.println("Please enter strings");
		for (int i = 0; i < size; i++) {
			S1[i] = scan.next();
		}
		
		Map<String,String> MOut = new LinkedHashMap<String,String>();
		
		String str ="";
		
		for (String chr : S1) {
			String chr1 = chr.charAt(0)+"";
			if(MOut.get(chr1)==null)
				str = chr;
			else
				str=MOut.get(chr1);
			if(MOut.containsKey(chr1))
				str=str+chr;
			
			MOut.put(chr1,str);
			}
		
		return MOut;
	}
	
	public static Set<Integer> arraytoSet (int A1 [], Scanner scan)
	{
		
		System.out.println("Please enter no of elements");
		int size = scan.nextInt();
		A1= new int[size];
		System.out.println("Please enter elements");
		for (int i = 0; i < size; i++) {
			A1[i] = scan.nextInt();
		}
		Set<Integer> S= new LinkedHashSet<Integer>();
		
		int count =0;
		for(int i=0;i<size;i++)
		{
			count++;
			int num =-1;
			for(int j=0;j<count;j++)
			{
				
				if(A1[j]==A1[i])
				{
					num++;
					
				}
				
			}
			
			S.add(A1[i]+num);			
		}
		
		
		return S;
	}
	
	public static ArrayList<String> removeDuplicate(ArrayList<String> A2, Scanner scan)
	{
		System.out.println("Please enter no of Strings");
		int size = scan.nextInt();
		A2 = new ArrayList<String>();
		
		ArrayList<String> A3 = new ArrayList<String>();
		System.out.println("Please enter strings");
		for (int i = 0; i < size; i++) {
			A2.add(scan.next());
			
		}
		
		for (String string : A2) {
			StringBuilder sb = new StringBuilder();
			
			for(char c: string.toCharArray())
			{
				if(!sb.toString().contains(c+""))
				{
					sb.append(c);
				}
			}
			A3.add(sb.toString());
		}
		
		
		return A3;
		
		
	}
	
	public static Map<String,String> firstLast ( ArrayList<String> list, Scanner scan)
	{
		System.out.println("Enter the no of strings");
		int size = scan.nextInt();
		
        list = new ArrayList<String>();
		
		System.out.println("Please enter strings");
		for (int i = 0; i < size; i++) {
			list.add(scan.next());
			
		}
		
		
		Map<String,String> M2 = new LinkedHashMap<String,String>();
		
		for (String str : list) {
			
			M2.put(str.charAt(0)+"", str.charAt(str.length()-1)+"");
			
		}
		
		return M2;
	}
	
	public static Map <String,Boolean> findKey(ArrayList<String> list2,Scanner scan)
	{
		Map<String,Boolean> M2 = new LinkedHashMap<String,Boolean>();
		System.out.println("Enter the no of strings");
		int size = scan.nextInt();
		
        list2 = new ArrayList<String>();
		
		System.out.println("Please enter strings");
		for (int i = 0; i < size; i++) {
			list2.add(scan.next());
			
		}
		
		for (int j=0;j<size;j++) {
			if(M2.containsKey(list2.get(j)))
			M2.put(list2.get(j), true);
			else
				M2.put(list2.get(j), false);
				
		}
		
		return M2;
	}
	
	}
