import java.util.Scanner;

public class SearchWidget {

	public static void main(String[] args) throws InterruptedException {
		// main class with menu to select Filter options
		Scanner in = new Scanner(System.in);
		try {
			int choice;
			
			while(true) {
				System.out.println("Welcome To Filter Widget API");
				System.out.println("****************************************");
				System.out.println("1. Filter Widgets by Device id as mobile");
				System.out.println("2. Filter Widgets by Device id as all");
				System.out.println("3. Filter Widgets by Site with value as perthnow");
				System.out.println("4. Filter Widgets by Site with value as all");
				System.out.println("5. Exit");
				System.out.println("Enter your option");
		
				choice = in.nextInt();
				switch (choice) {
				case 1:
					System.out.println ("Widgets with Device value Mobile are:" );
					WidgetByDeviceMobile widgetByDevice = new WidgetByDeviceMobile();
					widgetByDevice.searchWidgetByMobile();
					Thread.sleep(2000);
					break;
				case 2:
					System.out.println ("Widgets with Device value All are:" );
					WidgetByDeviceAll widgetByDeviceAll = new WidgetByDeviceAll();
					widgetByDeviceAll.searchWidgetByDeviceAll();
					Thread.sleep(2000);
					break;
				case 3:
					System.out.println ("Widgets with Site PerthNow are" );
					WidgetBySitePerth widgetBySitePerth = new WidgetBySitePerth();
					widgetBySitePerth.searchWidgetBySitePerth();
					Thread.sleep(2000);
					break;
				case 4:
					System.out.println ("Widgets with Site All are:" );
					WidgetBySiteAll widgetBySiteAll = new WidgetBySiteAll();
					widgetBySiteAll.searchWidgetBySiteAll();
					Thread.sleep(2000);
					break;
				case 5:
					System.out.println("Exiting Program...");
					System.exit(0);
					break;
				default:
					System.err.println ("Unrecognized option, please select again" );
					break;
				}
			}
		} 
		finally {
			in.close();
		}
	}
}
