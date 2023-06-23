package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	
	public static void main(String[] args) {
		
		String path="\\Users\\sonali.gupta\\Desktop\\task\\abc.pdf";
		
		//1. Using file
		File file=new File(path);
		
		try {
			
			boolean newFile = file.createNewFile();
			if(newFile)
			{
				System.out.println("File is created!!");
			}
			else
			{
				System.out.println("File is already present....");
			}
			
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		//2. FileOutputStream along with Scanner
		
		try {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the file name with location path");
			String fileName = sc.nextLine();
			FileOutputStream fos=new FileOutputStream(fileName,true);
			System.out.println("Enter the file content");
			String content = sc.nextLine();
			byte b[]=content.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("File is saved for given location path");
			
			
		}catch(IOException e)
		{
			System.out.println("Some Exception is coming..");
			e.printStackTrace();
		}
		
	}

}
