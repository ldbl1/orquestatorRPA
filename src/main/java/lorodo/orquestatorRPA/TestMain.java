package lorodo.orquestatorRPA;

import lorodo.utils.FileUtils;
/**
 * 
 * @author lorodo
 *
 */
public class TestMain {

	public static void main(String[] args) {
		try {
			System.out.print(FileUtils.createFolder("c:\\temp", "lorodo"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
