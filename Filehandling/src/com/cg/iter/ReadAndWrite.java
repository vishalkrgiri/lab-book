package com.cg.iter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args)
	{
		File file1 = new File("read.txt");
		File file2 = new File("write.txt");
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try
		{
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			try {
			String line=null;
			while((line=br.readLine())!=null)
			{
				bw.write(line);
				bw.newLine();
				System.out.println(line);
				//bw.flush(); It will keep on flushing each line so we have used close() at the end.
			}
			
			}
			finally
			{
				br.close();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{	
			try
			{
				if(bw!=null)
					bw.close(); //bw.close(); close will first flush then close.
				if(br!=null)
					br.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}

}
