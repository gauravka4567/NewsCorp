import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadWidgetDataFile {

	JSONParser parser = new JSONParser();
	
	public JSONObject readWidgetData() {
		try {
		//Parsing the JSON file and check for syntax issues.	
		Object readFileObject = parser.parse(new FileReader("C:\\Users\\egavkja\\Desktop\\java\\Widget.json"));
		JSONObject jsonReadObject = (JSONObject)readFileObject;
		return jsonReadObject;
		} 
		catch(FileNotFoundException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
		catch(ParseException e) {e.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
		return null;
	}
}
