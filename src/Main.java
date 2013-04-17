import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CSVReader reader = null;
		try {
			reader = new CSVReader(new FileReader("Train.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//new LoadDocument(reader);
		Weka weka = new Weka(new LoadDocument(reader, "").entities);
		//DataStore store =new DataStore(new LoadDocument(reader));
	}

}
