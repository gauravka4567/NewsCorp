import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WidgetBySitePerth extends ReadWidgetDataFile {

	public void searchWidgetBySitePerth() {
		ReadWidgetDataFile read = new ReadWidgetDataFile();
		JSONObject searchWidget = read.readWidgetData();
		for (Object key : searchWidget.keySet()) {
	        //Filter Widget based on Site values
	        String keyStr = (String)key;
	        Object keyvalue = searchWidget.get(keyStr);
	        JSONObject jsonChildObject = (JSONObject)keyvalue;
	        if(jsonChildObject.get("site") instanceof JSONArray) {
	        	JSONArray siteArray = (JSONArray) jsonChildObject.get("site");
	        	@SuppressWarnings("unchecked")
				Iterator<String> iterate = siteArray.iterator();
	        	while(iterate.hasNext()) {
	        		if(iterate.next().equals("perthnow")) {
	        			System.out.println(keyStr);
	        		}
	        	}
	        } else {
	        	String singlesite = (String)jsonChildObject.get("site");
	        	if(singlesite.equals("perthnow")) {
	        		System.out.println(keyStr);
	        	}
	         }
		}
	}
}
