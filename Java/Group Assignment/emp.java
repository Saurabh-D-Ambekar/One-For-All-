import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class GFG {

	
	private static String method(String file_path)
	{

		
		String str = "";

		
		try {

			str = new String(
				Files.readAllBytes(Paths.get(file_path)));
		}

		
		catch (IOException e) {

			
			e.printStackTrace();
		}

		return str;
	}
/** 
	// Method 2
	// Main driver method
	public static void main(String[] args)
	{

		// Path is passed from local directory of machine
		// and stored in a string
		String filePath = "C:\\Users\\HP\\Desktop\\gfg.txt";

		// Now call Method1 to
		// read the content in above directory
		System.out.println(method(filePath));
	}*/
} {
    
}
