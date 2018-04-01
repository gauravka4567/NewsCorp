import org.json.simple.JSONObject;

public class WidgetByDeviceMobile extends ReadWidgetDataFile {
	
	public void searchWidgetByMobile() {
		ReadWidgetDataFile read = new ReadWidgetDataFile();
		JSONObject searchWidget = read.readWidgetData();
		for (Object key : searchWidget.keySet()) {
	        //Filter Widget based on Device type Mobile
	        String keyStr = (String)key;
	        Object keyvalue = searchWidget.get(keyStr);
	        JSONObject jsonChildObject = (JSONObject)keyvalue;
	        String device = (String)jsonChildObject.get("device");
	        if(device.equals("mobile")) {
	        	System.out.println(keyStr);
	        }
		}
	}
}
