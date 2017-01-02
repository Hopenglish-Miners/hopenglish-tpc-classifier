

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.classifiers.Classifier;
import weka.classifiers.AbstractClassifier;
import java.io.*;

public class Weka {
	
	public static void main(String args[]) {
	
		WekaWrapper ww = new WekaWrapper();
		String name = new String();
		System.out.println(name);
		try {
			Instances unlabeled = new Instances(new BufferedReader(new FileReader(name)));
			unlabeled.setClassIndex(unlabeled.numAttributes() - 1);
			for (int i = 0; i < unlabeled.numInstances(); i++) {
				double clsLabel = ww.classifyInstance(unlabeled.instance(i));
				System.out.println(clsLabel + " => " + unlabeled.classAttribute().value((int) clsLabel));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
}
