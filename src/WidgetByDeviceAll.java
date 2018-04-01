import org.json.simple.JSONObject;

public class WidgetByDeviceAll extends ReadWidgetDataFile {

	public void searchWidgetByDeviceAll() {
		ReadWidgetDataFile read = new ReadWidgetDataFile();
		JSONObject searchWidget = read.readWidgetData();
		for (Object key : searchWidget.keySet()) {
	        //Filter Widget based on all Devices
	        String keyStr = (String)key;
	        Object keyvalue = searchWidget.get(keyStr);
	        JSONObject jsonChildObject = (JSONObject)keyvalue;
	        String device = (String)jsonChildObject.get("device");
	        if(device.equals("all")) {
	        	System.out.println(keyStr);
	        }
		}
	}
}
