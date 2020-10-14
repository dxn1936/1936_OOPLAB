package files;
import java.io.File;
import java.util.Scanner;
	
public class MainApp {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		String fileName;
		String pathName;
		char choose;
		
		System.out.println("Enter the filename");
		fileName = scan.nextLine();
		
		System.out.println("Enter the directory path");
		pathName = scan.nextLine();
		
		if((checkFileName(fileName)==true) && (checkPath(pathName)==true))
		{
			System.out.println("Do you want to create file or directory? f/d");
			choose = scan.next().charAt(0);
			
			if(choose=='f')
			{
				createFile(fileName,pathName);
			}
			else
			{
				createDir(fileName,pathName);
			}
		}	
				
		scan.close();
	}
	
	
	public static Boolean checkFileName(String fileName)		// check if file name follows the rules
	{
		String reservedNames[] = {"CON","PRN","AUX","NUL","COM1","COM2","COM3","COM4","COM5","COM6","COM7","COM8","COM9","LPT1","LPT2","LPT3","LPT4","LPT5","LPT6","LPT7","LPT8","LPT9"};
		
		if(fileName.charAt(fileName.length()-1) == ' '||fileName.charAt(fileName.length()-1) == '.')  // checking if the file name ends with '.' or ' '
		{
			System.out.println("Filename is invalid");
			return false;
		}
		
		
		for(int i=0;i<fileName.length();i++)	//check if name has reserved characters
		{
			if('<'==fileName.charAt(i)||'>'==fileName.charAt(i)||':'==fileName.charAt(i)||'"'==fileName.charAt(i)||'/'==fileName.charAt(i)||'\\'==fileName.charAt(i)||'|'==fileName.charAt(i)||'?'==fileName.charAt(i)||'*'==fileName.charAt(i)||'\0'==fileName.charAt(i))
			{
				System.out.println("Filename is invalid");
				return false;
			}
		}
		
		for(String i:reservedNames)					//check if name is reserved name
		{
			if(fileName.compareToIgnoreCase(i)==0)
			{	
				System.out.println("Filename is invalid");
				return false;
			}	
			
		}	
		
		return true;
	}
	
	
	public static Boolean checkPath(String pathName)   //check if directory path is valid
	{
		try
		{
			File pathOfDirectory = new File(pathName);
			if(pathOfDirectory.isDirectory()) 
			{
				System.out.println("Path is Valid");
				return true;
			}
			else
			{
				System.out.println("Path is Invalid");
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	} 
		
		

	
	public static void createFile(String fileName,String pathName)		//function to create a file
	{
		try 
		{
			File file = new File(pathName+fileName+".txt");
			
			if (file.createNewFile()) 
			{
				System.out.println("The File is created");
			} 
			else 
			{
			    System.out.println("The File already exists");
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Error occurred");
			e.printStackTrace();
		}
	}
	
	
	public static void createDir(String fileName,String pathName)		//function to create a directory
	{
		try 
		{
	     	File directory = new File(pathName+fileName);
	     	if (directory.mkdir()) 
	     	{
	     		System.out.println("Directory is created");
	     	} 
	     	else 
	     	{
	     		System.out.println("Directory already exists");
	     	}
	    } 
		catch (Exception e) 
		{
			System.out.println("Error occurred");
			e.printStackTrace();
	    }
	}
}
