package lorodo.utils;

import java.io.File;

/**
 * 
 * @author lorodo
 *
 */

public class FileUtils {

	/**
	 * This function returns true if folder has been created
	 * 
	 * @author lorodo
	 * 
	 * @param parentFolder
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public static boolean createFolder(String parentFolder,String name) throws Exception{
		String path = parentFolder + "\\" + name;
		File file = new File(path);
		boolean resultado = file.mkdir(); 
		return resultado;
	}

}
	