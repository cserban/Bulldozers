import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;

public class Weka {
	ArrayList<Entities> entities;

	Weka(ArrayList<Entities> entities) {
		this.entities = new ArrayList<>(entities);

		FastVector fvWekaAttributes = new FastVector(this.entities.size()-1);
		for (Entities feature : this.entities) {
			FastVector fvNominalVal = new FastVector(feature.domain.size());
			for (String dom : feature.domain) {
				fvNominalVal.addElement(dom);
			}
			System.out.print(feature.name + " ");
			Attribute attribute = new Attribute(feature.name, fvNominalVal);
			fvWekaAttributes.addElement(attribute);
		}
		System.out.println();
		Instances isTrainingSet = new Instances("Rel", fvWekaAttributes,
				this.entities.get(0).values.size());

		for (int i = 0; i < this.entities.get(0).values.size(); i++) {
			Instance iExample = new Instance(this.entities.size());
			for (int j = 0; j < this.entities.size(); j++) {
				iExample.setValue((Attribute) fvWekaAttributes.elementAt(j),
						this.entities.get(j).values.get(i));
			}
			isTrainingSet.add(iExample);
		}
		isTrainingSet.setClassIndex(1);
		Classifier cModel = (Classifier) new NaiveBayes();
		try {
			cModel.buildClassifier(isTrainingSet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Evaluation eTest;
		try {
			eTest = new Evaluation(isTrainingSet);

			eTest.evaluateModel(cModel, isTrainingSet);

			// Print the result à la Weka explorer:
			String strSummary = eTest.toSummaryString();
			System.out.println(strSummary);

			// Get the confusion matrix
			
			try{
				 FileWriter fstream = new FileWriter("test.txt");
				  BufferedWriter outFile = new BufferedWriter(fstream);


			
			double[][] cmMatrix = eTest.confusionMatrix();
			for (int row_i = 0; row_i < cmMatrix.length; row_i++) {
				for (int col_i = 0; col_i < cmMatrix.length; col_i++) {
					outFile.write(String.valueOf(cmMatrix[row_i][col_i]));
					outFile.write("|");
				}
				outFile.write("\n");
			}
			  outFile.close();
			  }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
