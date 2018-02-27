import java.util.*;
import java.util.stream.Stream;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.sql.Connection;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;



/* Plan for this class
 * 1. Download data from url
 * 2. Read data in java
 * 3. Insert data into KML
 */

public class LaunchingGoogle {


	public static void main(String[] args) throws IOException {
		
		try {
			String[] commands = new String[] {"C:\\Program Files\\Google\\Google Earth Pro\\client\\googleearth.exe", "C:\\Users\\PC\\Desktop\\kmlData.kml"};
			Runtime rt = Runtime.getRuntime();
			String filePath = "C:\\Users\\PC\\Desktop\\kmlData.kml";
			Process proc = rt.exec(commands);
		}
		catch (Exception e){
			System.out.println("gwno, nie udauo sie");
		}//catch

	        
	        String filePath = "C:\\Users\\PC\\Desktop\\kmlData.kml";


			//System.out.println(middleKML);
			System.out.println("Launching Google Earth...");


	}//main
}//class