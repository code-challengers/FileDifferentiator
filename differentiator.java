import java.io.*;

public class differentiator
{
	
	private File  file1;
   	private File  file2;
  	private BufferedReader inputOrg;
   	private BufferedReader inputNew;

	private void OpenStreams() throws Exception{
		inputOrg = new BufferedReader(new FileReader(file1));
		inputNew = new BufferedReader(new FileReader(file2));

	}

	public differentiator(String f1,String f2){
		this.file1 = new File(f1);
		this.file2 = new File(f2);

	}

	public boolean compare() throws Exception{
		//OpenStreams();
		inputOrg = new BufferedReader(new FileReader(file1));
		inputNew = new BufferedReader(new FileReader(file2));
		//System.out.println(file1.toString() + file2.toString());

		String text1 = null;
		String text2 = null;

		boolean areEqual = true;
		boolean completed = true;

		while ((completed==true) &&((text1 = inputOrg.readLine()) != null)&&((text2 = inputNew.readLine()) != null)) 
			{
			    if (!text1.equalsIgnoreCase(text2))  
			        areEqual=false;
			    else 
			        areEqual=true;   
			}

		/*
		int flag1 = -1;
		int flag2 = -1;
		while(completed){
			flag1 = inputOrg.read();
			flag2 = inputNew.read();
			System.out.println(flag1.toString() + flag2.toString());

			if(flag1!=-1 || flag2!=-2){
				completed = false;
			}
			if(flag1!=flag2){
				areEqual = false;
			}
			
		//CloseStreams();
		if(this.inputOrg!=null) inputOrg.close();
		if(this.inputNew!=null) inputNew.close();
		}
		*/
		return areEqual;

	}

	private void CloseStreams() throws Exception{
		if(this.inputOrg!=null) inputOrg.close();
		if(this.inputNew!=null) inputNew.close();
	}


}