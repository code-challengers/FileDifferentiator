import java.io.*;

public class aboutFile{

	static final int Max_Line_Count = 2000;
	DataInputStream file;
	public int max_line;
	node symbol[];
	int other[];

	aboutFile(String filename){
		symbol = new node[Max_Line_Count + 2];
		other = null ;
		try{
			file = new DataInputStream(new FileInputStream(filename));
		}catch(IOException e){
			System.out.println("Error " +e);
		}
	}

}