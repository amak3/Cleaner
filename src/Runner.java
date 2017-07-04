import java.io.File;

public class Runner
{

	public static void main(String[] args)
	{
		 File directory = new File ("C:/Users/Ola/Filmy");
		 
		 for (File file : directory.listFiles())
		 {
			 for (File child: file.listFiles())
			 {
				 if (child.length()>1000000)
				 {
					 break;
				 }
				 else
				 {
					 delete(file);					 
				 }
			 }
		 }
		 
	}

	private static void delete(File directory)
	{
		 if (directory.isDirectory())
		 {
			 File[] fileList = directory.listFiles();
			 for (File file : fileList)
			 {
				 if (file.length()<1000000)
				 {
					 delete(file);
					 System.out.println(file.getName() + " has been deleted.");
				 }
			 }				    
		 }
		 directory.delete();
	}
}
