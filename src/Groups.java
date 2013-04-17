import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import au.com.bytecode.opencsv.CSVReader;


public class Groups {
	public ArrayList<LoadDocument> documents;
	Groups () throws FileNotFoundException
	{
		 CSVReader reader = null;
		 documents = new ArrayList<>();
		 
		 reader = new CSVReader(new FileReader("train/Train_BL.csv"));
		 documents.add(new LoadDocument(reader, "BL"));
		 
		 reader = new CSVReader(new FileReader("train/Train_MG.csv"));
		 documents.add(new LoadDocument(reader, "MG"));
		 
		 reader = new CSVReader(new FileReader("train/Train_SSL.csv"));
		 documents.add(new LoadDocument(reader, "SSL"));
		 
		 reader = new CSVReader(new FileReader("train/Train_TEX.csv"));
		 documents.add(new LoadDocument(reader, "TEX"));
		 
		 reader = new CSVReader(new FileReader("train/Train_TTT.csv"));
		 documents.add(new LoadDocument(reader, "TTT"));
		 
		 reader = new CSVReader(new FileReader("train/Train_WL.csv"));
		 documents.add(new LoadDocument(reader, "WL"));
	}
}
