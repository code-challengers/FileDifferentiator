import java.io.*;

public class differentiator
{
	
	private File  file1;
   	private File  file2;
  	private BufferedInputStream inputOrg;
   	private BufferedInputStream inputNew;

	private void OpenStreams() throws Exception{
		inputOrg = new BufferedInputStream(new FileInputStream(file1));
		inputNew = new BufferedInputStream(new FileInputStream(file2));

	}

	public differentiator(String f1,String f2){
		this.file1 = new File(f1);
		this.file2 = new File(f2);

	}

	public boolean compare(){
		OpenStreams();

		boolean areEqual = false;
		boolean completed = false;

		int flag1 = -1;
		int flag2 = -1;

		while(completed){
			flag1 = inputOrg.read();
			flag2 = inputNew.read();

			if(flag1!=-1 || flag2!=-2){
				completed = false;
			}
			if(flag1!=flag2){
				areEqual = false;
			}
			CloseStreams();
		}
		return areEqual;

	}

	private void CloseStreams() throws Exception{
		if(this.inputOrg!=null) inputOrg.close();
		if(this.inputNew!=null) inputNew.close();
	}


}