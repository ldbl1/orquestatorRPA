package lorodo.orquestatorRPA;

import lorodo.utils.UtilsFile;
/**
 * 
 * @author lorodo
 *
 */
public class TestMain {

	public static void main(String[] args) {
		try {
			System.out.print(UtilsFile.createFolder("c:\\temp", "lorodo"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
