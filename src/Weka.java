import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
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

	Weka(ArrayList<Entities> entities, String tmp) {
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

		Evaluation eval;
		try {
			eval = new Evaluation(isTrainingSet);

			//eval.evaluateModel(cModel, isTrainingSet);
			
			  System.out.print("Evaluating testing set...");
			  System.out.println("Writing predictions to predictions.txt");
			  File f = new File("predictions_"+ tmp+ ".txt");
			  BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
			  bos.write(("inst#" + "\t" + "actual" + "\t" + "predicted" + "\t" + "error\n").getBytes());
			   for (int i = 0; i < isTrainingSet.numInstances(); i++) {
			     double pred =  eval.evaluateModelOnce(cModel, isTrainingSet.instance(i));
			     double val =  isTrainingSet.instance(i).classValue();
			     double error = pred - val;
			     bos.write((i + "\t" + val + "\t" + pred + "\t" + error + "\n").getBytes());
			    }
			   bos.close();
			   System.out.println("done.\n");
			  System.out.println(eval.toSummaryString("\nResults\n======\n", true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
