import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


public class Entities {
	String name;
	public ArrayList<String> values;
	public Set<String> domain;
	
	Entities(String name)
	{
		this.name = name;
		values = new ArrayList<>();
		domain=new TreeSet<String>();
	}
	
	public void print(BufferedWriter outFile) throws IOException
	{
		outFile.write("\n"+name+" ");
		for (String value:values)
		{
			 outFile.write(value+" ");
		}
	}
}
