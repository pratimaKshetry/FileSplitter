/*********Original Author: Pratima Kshetry
This java code splits file as specified by the user. 
The user specifies the number of lines that the command prompt takes in as input and
splits the file as per the number of lines specified. For example, if users enters "10", 
the program will extract only 10 lines from the given input file as specified
********************************************************************************************/

import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;



public class FileSplitter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		int i,j;
		int k=3;//No of lines to split and save in output line
		BufferedReader br=null;
		try{
		try
		{
			br=new BufferedReader(new FileReader("E:\\txtFILES\\test.txt"));
			
			/*for(i=1;i<=5;i++)
			{
				//Destination File location
				FileWriter file=new FileWriter("E:\\txtFILES\\"+i+".txt");
				BufferedWriter out=new BufferedWriter(file);
				for(j=1;j<=5;j++)
				{
					s1=br.readLine();
					if(s1!=null)
					{
						out.write(s1);
						if(i!=k)
						{
							out.newLine();
						}
					}
				}
				out.close();
			}*/
			int count=0;
			while((s1=br.readLine())!=null)
			{
				count++;
				FileWriter file=new FileWriter("E:\\txtFILES\\"+count+".txt");
				BufferedWriter out=new BufferedWriter(file);
				try
				{				
					out.write(s1);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				finally
				{
					if(out!=null)
					out.close();
				}				
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		finally
		{
			if(br!=null)
			 br.close();
		}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}

	}

}
