import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Groups newGroups = null;
        try {
                newGroups = new Groups();
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        for (LoadDocument doc : newGroups.documents)
        {
                Weka weka = new Weka(doc.entities,Integer.toString(newGroups.documents.indexOf(doc)));
        }
		//DataStore store =new DataStore(new LoadDocument(reader));
	}

}
