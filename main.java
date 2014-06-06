
public class main{

	public static void main(String[] args) throws Exception
	{
		System.out.println("\n************************************************************");
		System.out.println("\n* 	Welcome to file differentiator 		           *");
		System.out.println("* Use this program to view differences among two files     *");
		System.out.println("* Author : Ashish Belwase ( www.geeknepal.com)	           *\n");
		System.out.println("************************************************************\n");
		String file1 = args[0];
		String file2 = args[1];

		//System.out.println(file1 + file2);
		differentiator diff = new differentiator(file1,file2);
		if(diff.compare()){
			System.out.println("\nThe files are equal \n");
		}
		else
			System.out.println("\nFiles are not equal \n");
		
	}
	
}
