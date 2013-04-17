import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import au.com.bytecode.opencsv.CSVReader;


public class LoadDocument {
	public int numberOfAtributes = 0;
	
	public ArrayList<Entities> entities;
	
	LoadDocument (CSVReader reader, String classStr, String []constant)
	{
		String [] nextLine;
		entities = new ArrayList<>();
		
	    try {
	    	nextLine = reader.readNext();
			for (int i = 0 ; i< nextLine.length; i++)
	    	{
				if (Arrays.asList(constant).contains(Integer.toString(i+1)))
				{
					entities.add(new Entities(nextLine[i]));
				}
	    	}
	    	
	    	while ((nextLine = reader.readNext()) != null) {
	    		int j = 0;
				for (int i = 0 ; i< nextLine.length; i++)
		    	{
					if (Arrays.asList(constant).contains(Integer.toString(i+1)))
					{
					String s = new String(nextLine[i]);
					if (s.length() == 0)
						s = "?";
					entities.get(j).domain.add(s);
					entities.get(j).values.add(s);
					j++;
					}
		    	}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	    decodeEntities(classStr);
	    numberOfAtributes = entities.size();
	    

	    for (Entities entitie : entities)
	    {
	    	if (entitie.name.equals("YearMade"))
	    	{
	    		new PreprocessOutliers(entitie);
	    	}
	    }
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

	private void decodeEntities(String classStr) {
		if(classStr.equals("BL")) {
			for(int i = 0; i < entities.size(); i++) {
				entities.set(i, PreprocessStrings.replaceMissingValuesBL(entities.get(i)));
			}
		} else if (classStr.equals("MG")) {
			for(int i = 0; i < entities.size(); i++) {
				entities.set(i, PreprocessStrings.replaceMissingValuesMG(entities.get(i)));
			}
		} else if (classStr.equals("SSL")) {
			for(int i = 0; i < entities.size(); i++) {
				entities.set(i, PreprocessStrings.replaceMissingValuesSSL(entities.get(i)));
			}
		} else if (classStr.equals("TEX")) {
			for(int i = 0; i < entities.size(); i++) {
				entities.set(i, PreprocessStrings.replaceMissingValuesTEX(entities.get(i)));
			}
		} else if (classStr.equals("TTT")) {
			for(int i = 0; i < entities.size(); i++) {
				entities.set(i, PreprocessStrings.replaceMissingValuesTTT(entities.get(i)));
			}
		} else if (classStr.equals("WL")) {
			for(int i = 0; i < entities.size(); i++) {
				entities.set(i, PreprocessStrings.replaceMissingValuesWL(entities.get(i)));
			}
		}
	}
}
