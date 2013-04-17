import java.util.ArrayList;


public class PreprocessOutliers {
	int number = 0;
	int sum = 0;
	int max = 0;
	int min = 5000;
	int range = 0;
	
	PreprocessOutliers(Entities list)
	{
		computeAvarege(list);
		range = (max - min)/2 * 3 / 2;
		
		for (String value : list.values)
		{
			if (!value.equals("?"))
			{
					int tmp = Integer.parseInt(value);
					int dif = Math.abs(tmp-(sum/number));
					
					if ( dif >  range)
					{
						list.values.set(list.values.indexOf(value), "?");
					}
					
			}
		}
		
		number = 0;
		sum = 0;
		
		computeAvarege(list);
		
		for (String value : list.values)
		{
			if (value.equals("?"))
			{
				list.values.set(list.values.indexOf(value), Integer.toString(sum/number));	
			}
		}

		
	}
	
	void computeAvarege(Entities list)
	{
		for (String value : list.values)
		{
			if (!value.equals("?"))
			{
				int tmp = Integer.parseInt(value); 
				sum += tmp;
				number ++;
				if (tmp > max)
					max = tmp;
				if (tmp < min)
					min = tmp;
			}
		}
	}
	
	
}
