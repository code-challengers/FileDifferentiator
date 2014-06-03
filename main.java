
public class main{

	public static void main(String[] args) throws Exception
	{

		System.out.println("Welcome to file differentiator \n");
		String file1 = args[0];
		String file2 = args[1];

		//System.out.println(file1 + file2);
		differentiator diff = new differentiator(file1,file2);
		if(diff.compare()){
			System.out.println("The files are equal \n");
		}
		else
			System.out.println("Files are not equal \n");
		
	}
	
}