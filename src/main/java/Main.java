
import static spark.Spark.*;
import java.io.*;
import weka.core.Instances;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        
        post("/processJson", "application/json", (req, res) ->{
       	String input = req.body();
        System.out.println("Before try");
        System.out.println("RELATION interaction");
        String str = new String("");
        str += "@RELATION interaction\n";
        str += "\n";
        str += "@ATTRIBUTE C0 NUMERIC\n";
        str += "@ATTRIBUTE C1 NUMERIC\n";
        str += "@ATTRIBUTE C2 NUMERIC\n";
        str += "@ATTRIBUTE C3 NUMERIC\n";
        str += "@ATTRIBUTE TP {C0, C1, C2, C3}\n";
        str += "\n";
        str += "\n";
        str += "@DATA\n";
        JSONObject jsonObj = new JSONObject(input);
        System.out.println(str);
        Iterator<?> keys = jsonObj.keys();

        while( keys.hasNext() ) {
        	System.out.println("has key");
            String key = (String)keys.next();
            String value = jsonObj.get(key).toString();
            str += value.toString() +",";
        }
        str += "?";
        		
        System.out.println(str);		
    	/*Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("classify.arff"), "utf-8"));
    	
    	try {
    		System.out.println("Iside try");
    		writer.write("@RELATION interaction");
    		writer.write("\n");
    		writer.write("@ATTRIBUTE C0 NUMERIC");
    		writer.write("@ATTRIBUTE C1 NUMERIC");
    		writer.write("@ATTRIBUTE C2 NUMERIC");
    		writer.write("@ATTRIBUTE C3 NUMERIC");
    		writer.write("@ATTRIBUTE TP {C0, C1, C2, C3}");
    		writer.write("\n");
    		writer.write("\n");
    		writer.write("@DATA");
    		System.out.println("before loop");
        		
      }catch (Exception e) {
			writer.close();
			e.printStackTrace();
		}finally{
			writer.close();
		}*/
	
     
        
        	WekaWrapper ww = new WekaWrapper();
    		String name = new String("weka");
    		System.out.println(name);
    		String result = "";
    		// WekaWrapper ww = new WekaWrapper();
    		try {
    			// convert String into InputStream
    			InputStream is = new ByteArrayInputStream(str.getBytes());

    			// read it with BufferedReader
    			BufferedReader br = new BufferedReader(new InputStreamReader(is));
    			Instances unlabeled = new Instances(br);
    			unlabeled.setClassIndex(unlabeled.numAttributes() - 1);
    			System.out.println("Before iteration");
    			for (int i = 0; i < unlabeled.numInstances(); i++) {
    				double clsLabel = ww.classifyInstance(unlabeled.instance(i));
    				System.out.println(clsLabel + " => " + unlabeled.classAttribute().value((int) clsLabel));
    				result = unlabeled.classAttribute().value((int) clsLabel);
    			}
    		} catch (Exception e) {
    			
    			e.printStackTrace();
    		}
        	return result;
        });
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }

}
