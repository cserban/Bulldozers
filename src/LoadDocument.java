import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import au.com.bytecode.opencsv.CSVReader;


public class LoadDocument {
	public int numberOfAtributes = 0;
	
	public ArrayList<Entities> entities;
	
	LoadDocument (CSVReader reader)
	{
		String [] nextLine;
		entities = new ArrayList<>();
		
	    try {
	    	nextLine = reader.readNext();
			for (int i = 0 ; i< nextLine.length; i++)
	    	{
	    		entities.add(new Entities(nextLine[i]));
	    	}
	    	
	    	while ((nextLine = reader.readNext()) != null) {
				for (int i = 0 ; i< nextLine.length; i++)
		    	{
					String s = new String(nextLine[i]);
					if (s.length() == 0)
						s = "?";
					entities.get(i).domain.add(s);
					entities.get(i).values.add(s);
		    	}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	    numberOfAtributes = entities.size();
	}
	
	void printToFile(String out)
	{
		try{
		 FileWriter fstream = new FileWriter(out);
		  BufferedWriter outFile = new BufferedWriter(fstream);
		    for (Entities entity:entities)
		    {	    
		    	//outFile.write("\n entitate: " + entity.name + " with:" + entity.values.size()+ "\n");
		    	entity.print(outFile);
		    }
		  outFile.close();
		  }catch (Exception e){//Catch exception if any
		  System.err.println("Error: " + e.getMessage());
		  }
	}
	
}
