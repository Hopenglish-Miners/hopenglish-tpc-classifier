
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.classifiers.Classifier;
import weka.classifiers.AbstractClassifier;

class WekaClassifier {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WekaClassifier.N78f2500e0(i);
	    return p;
	  }
	  static double N78f2500e0(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 2;
	    } else if (((Double) i[2]).doubleValue() <= 0.0) {
	    p = WekaClassifier.Ncaaee5e1(i);
	    } else if (((Double) i[2]).doubleValue() > 0.0) {
	    p = WekaClassifier.N1197dabc15(i);
	    } 
	    return p;
	  }
	  static double Ncaaee5e1(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 0.87) {
	    p = WekaClassifier.N4ff8a162(i);
	    } else if (((Double) i[0]).doubleValue() > 0.87) {
	    p = WekaClassifier.N1df9843c9(i);
	    } 
	    return p;
	  }
	  static double N4ff8a162(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 4.59) {
	    p = WekaClassifier.N4812275d3(i);
	    } else if (((Double) i[3]).doubleValue() > 4.59) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4812275d3(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() <= 0.05) {
	    p = WekaClassifier.N220a7c714(i);
	    } else if (((Double) i[1]).doubleValue() > 0.05) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N220a7c714(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 1.68) {
	    p = WekaClassifier.N7989be705(i);
	    } else if (((Double) i[3]).doubleValue() > 1.68) {
	    p = WekaClassifier.N1de246d6(i);
	    } 
	    return p;
	  }
	  static double N7989be705(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 0.0) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 0.0) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N1de246d6(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 3.09) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() > 3.09) {
	    p = WekaClassifier.N582fd3c47(i);
	    } 
	    return p;
	  }
	  static double N582fd3c47(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 4.23) {
	    p = WekaClassifier.N29b7c5448(i);
	    } else if (((Double) i[3]).doubleValue() > 4.23) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N29b7c5448(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 3.84) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() > 3.84) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1df9843c9(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 9.89) {
	    p = WekaClassifier.N6d7436a210(i);
	    } else if (((Double) i[3]).doubleValue() > 9.89) {
	    p = WekaClassifier.N5ce908e612(i);
	    } 
	    return p;
	  }
	  static double N6d7436a210(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 5.01) {
	    p = WekaClassifier.N4be3793b11(i);
	    } else if (((Double) i[3]).doubleValue() > 5.01) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N4be3793b11(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 4.91) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() > 4.91) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N5ce908e612(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 2.43) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 2.43) {
	    p = WekaClassifier.Nde0af2313(i);
	    } 
	    return p;
	  }
	  static double Nde0af2313(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 19.7) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() > 19.7) {
	    p = WekaClassifier.N41ed491b14(i);
	    } 
	    return p;
	  }
	  static double N41ed491b14(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() <= 41.9) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() > 41.9) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N1197dabc15(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 3;
	    } else if (((Double) i[1]).doubleValue() <= 0.93) {
	    p = WekaClassifier.N5ad5e5016(i);
	    } else if (((Double) i[1]).doubleValue() > 0.93) {
	    p = WekaClassifier.N60585eb044(i);
	    } 
	    return p;
	  }
	  static double N5ad5e5016(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 5.54) {
	    p = WekaClassifier.Nd3c707117(i);
	    } else if (((Double) i[0]).doubleValue() > 5.54) {
	    p = WekaClassifier.N6d6c55a26(i);
	    } 
	    return p;
	  }
	  static double Nd3c707117(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() <= 0.78) {
	    p = WekaClassifier.N2632455c18(i);
	    } else if (((Double) i[2]).doubleValue() > 0.78) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N2632455c18(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 3;
	    } else if (((Double) i[1]).doubleValue() <= 0.68) {
	    p = WekaClassifier.N95f291c19(i);
	    } else if (((Double) i[1]).doubleValue() > 0.68) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N95f291c19(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 1.14) {
	    p = WekaClassifier.N666fb9b920(i);
	    } else if (((Double) i[0]).doubleValue() > 1.14) {
	    p = WekaClassifier.N83ee2fd21(i);
	    } 
	    return p;
	  }
	  static double N666fb9b920(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 0.51) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 0.51) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N83ee2fd21(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() <= 12.78) {
	    p = WekaClassifier.N3c125e0322(i);
	    } else if (((Double) i[3]).doubleValue() > 12.78) {
	    p = WekaClassifier.N4c75875423(i);
	    } 
	    return p;
	  }
	  static double N3c125e0322(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 1.79) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 1.79) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N4c75875423(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 19.89) {
	    p = WekaClassifier.N574c5d1224(i);
	    } else if (((Double) i[3]).doubleValue() > 19.89) {
	    p = WekaClassifier.N289a640c25(i);
	    } 
	    return p;
	  }
	  static double N574c5d1224(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 16.65) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 16.65) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N289a640c25(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 2.6) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 2.6) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N6d6c55a26(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 9.31) {
	    p = WekaClassifier.N6679bdf327(i);
	    } else if (((Double) i[3]).doubleValue() > 9.31) {
	    p = WekaClassifier.N3078c72c42(i);
	    } 
	    return p;
	  }
	  static double N6679bdf327(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 2;
	    } else if (((Double) i[2]).doubleValue() <= 1.88) {
	    p = WekaClassifier.N5368d8e328(i);
	    } else if (((Double) i[2]).doubleValue() > 1.88) {
	    p = WekaClassifier.N711b47dd34(i);
	    } 
	    return p;
	  }
	  static double N5368d8e328(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 4.97) {
	    p = WekaClassifier.N28297c8629(i);
	    } else if (((Double) i[3]).doubleValue() > 4.97) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N28297c8629(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 2.46) {
	    p = WekaClassifier.N18e590cc30(i);
	    } else if (((Double) i[3]).doubleValue() > 2.46) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N18e590cc30(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() <= 1.19) {
	    p = WekaClassifier.N33d8200631(i);
	    } else if (((Double) i[2]).doubleValue() > 1.19) {
	    p = WekaClassifier.N454cdc4833(i);
	    } 
	    return p;
	  }
	  static double N33d8200631(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 2;
	    } else if (((Double) i[2]).doubleValue() <= 0.93) {
	    p = WekaClassifier.N26e2595e32(i);
	    } else if (((Double) i[2]).doubleValue() > 0.93) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N26e2595e32(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 7.52) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > 7.52) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N454cdc4833(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 2.41) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() > 2.41) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N711b47dd34(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() <= 3.41) {
	    p = WekaClassifier.N3b181e835(i);
	    } else if (((Double) i[2]).doubleValue() > 3.41) {
	    p = WekaClassifier.N3faebcbe38(i);
	    } 
	    return p;
	  }
	  static double N3b181e835(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() <= 2.82) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() > 2.82) {
	    p = WekaClassifier.N37ad006936(i);
	    } 
	    return p;
	  }
	  static double N37ad006936(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 4.76) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 4.76) {
	    p = WekaClassifier.N1420344837(i);
	    } 
	    return p;
	  }
	  static double N1420344837(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() <= 2.92) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() > 2.92) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3faebcbe38(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 2;
	    } else if (((Double) i[2]).doubleValue() <= 4.54) {
	    p = WekaClassifier.N309fd46239(i);
	    } else if (((Double) i[2]).doubleValue() > 4.54) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N309fd46239(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 10.61) {
	    p = WekaClassifier.N6f6e345040(i);
	    } else if (((Double) i[0]).doubleValue() > 10.61) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N6f6e345040(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 6.75) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > 6.75) {
	    p = WekaClassifier.N7af9cf8141(i);
	    } 
	    return p;
	  }
	  static double N7af9cf8141(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 2;
	    } else if (((Double) i[2]).doubleValue() <= 3.7) {
	      p = 2;
	    } else if (((Double) i[2]).doubleValue() > 3.7) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N3078c72c42(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 2;
	    } else if (((Double) i[2]).doubleValue() <= 0.87) {
	    p = WekaClassifier.N7e8a298543(i);
	    } else if (((Double) i[2]).doubleValue() > 0.87) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N7e8a298543(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 0.5) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 0.5) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N60585eb044(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 76.96) {
	    p = WekaClassifier.N546910fd45(i);
	    } else if (((Double) i[1]).doubleValue() > 76.96) {
	    p = WekaClassifier.N4cd4c1d167(i);
	    } 
	    return p;
	  }
	  static double N546910fd45(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 4.64) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 4.64) {
	    p = WekaClassifier.N225eecfb46(i);
	    } 
	    return p;
	  }
	  static double N225eecfb46(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 11.97) {
	    p = WekaClassifier.Ndb73f3447(i);
	    } else if (((Double) i[0]).doubleValue() > 11.97) {
	    p = WekaClassifier.N5b6f6ea57(i);
	    } 
	    return p;
	  }
	  static double Ndb73f3447(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 3.62) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 3.62) {
	    p = WekaClassifier.N2fb85dec48(i);
	    } 
	    return p;
	  }
	  static double N2fb85dec48(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() <= 4.75) {
	    p = WekaClassifier.N33ca4e1e49(i);
	    } else if (((Double) i[3]).doubleValue() > 4.75) {
	    p = WekaClassifier.N34e2f60456(i);
	    } 
	    return p;
	  }
	  static double N33ca4e1e49(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 3;
	    } else if (((Double) i[1]).doubleValue() <= 27.86) {
	      p = 3;
	    } else if (((Double) i[1]).doubleValue() > 27.86) {
	    p = WekaClassifier.N66a655a850(i);
	    } 
	    return p;
	  }
	  static double N66a655a850(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() <= 5.76) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() > 5.76) {
	    p = WekaClassifier.N52dc98d751(i);
	    } 
	    return p;
	  }
	  static double N52dc98d751(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 61.31) {
	    p = WekaClassifier.N3f66e85d52(i);
	    } else if (((Double) i[1]).doubleValue() > 61.31) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N3f66e85d52(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() <= 40.57) {
	    p = WekaClassifier.N5e3deb1153(i);
	    } else if (((Double) i[1]).doubleValue() > 40.57) {
	    p = WekaClassifier.Nae2ee6b54(i);
	    } 
	    return p;
	  }
	  static double N5e3deb1153(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 6.28) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() > 6.28) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nae2ee6b54(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 3;
	    } else if (((Double) i[1]).doubleValue() <= 44.42) {
	      p = 3;
	    } else if (((Double) i[1]).doubleValue() > 44.42) {
	    p = WekaClassifier.N3cced5c055(i);
	    } 
	    return p;
	  }
	  static double N3cced5c055(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 4.59) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 4.59) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N34e2f60456(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 6.41) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 6.41) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N5b6f6ea57(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 15.58) {
	    p = WekaClassifier.N183ad18158(i);
	    } else if (((Double) i[2]).doubleValue() > 15.58) {
	    p = WekaClassifier.N7380bb9b65(i);
	    } 
	    return p;
	  }
	  static double N183ad18158(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 19.89) {
	    p = WekaClassifier.N5210679359(i);
	    } else if (((Double) i[3]).doubleValue() > 19.89) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5210679359(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 5.7) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 5.7) {
	    p = WekaClassifier.N7161e90360(i);
	    } 
	    return p;
	  }
	  static double N7161e90360(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 17.62) {
	    p = WekaClassifier.N43d2406361(i);
	    } else if (((Double) i[3]).doubleValue() > 17.62) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N43d2406361(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 33.03) {
	    p = WekaClassifier.Ndaa374162(i);
	    } else if (((Double) i[1]).doubleValue() > 33.03) {
	    p = WekaClassifier.N220026e064(i);
	    } 
	    return p;
	  }
	  static double Ndaa374162(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 10.25) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 10.25) {
	    p = WekaClassifier.N5c57e59863(i);
	    } 
	    return p;
	  }
	  static double N5c57e59863(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() <= 11.69) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() > 11.69) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N220026e064(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 2;
	    } else if (((Double) i[2]).doubleValue() <= 10.46) {
	      p = 2;
	    } else if (((Double) i[2]).doubleValue() > 10.46) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7380bb9b65(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() <= 37.09) {
	    p = WekaClassifier.N2fcc8a9566(i);
	    } else if (((Double) i[2]).doubleValue() > 37.09) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2fcc8a9566(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 41.2) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 41.2) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N4cd4c1d167(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 5.96) {
	    p = WekaClassifier.N6f40c98d68(i);
	    } else if (((Double) i[0]).doubleValue() > 5.96) {
	    p = WekaClassifier.N19eafb9d69(i);
	    } 
	    return p;
	  }
	  static double N6f40c98d68(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 2.33) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 2.33) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N19eafb9d69(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() <= 4.5) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() > 4.5) {
	    p = WekaClassifier.N52b9521770(i);
	    } 
	    return p;
	  }
	  static double N52b9521770(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() <= 85.66) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() > 85.66) {
	    p = WekaClassifier.N3809cbd871(i);
	    } 
	    return p;
	  }
	  static double N3809cbd871(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 3;
	    } else if (((Double) i[1]).doubleValue() <= 89.17) {
	      p = 3;
	    } else if (((Double) i[1]).doubleValue() > 89.17) {
	      p = 2;
	    } 
	    return p;
	  }
	}
