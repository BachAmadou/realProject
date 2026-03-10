package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromProperty {
	
	public static Properties getDataFromProperty() throws IOException {
		
		FileReader reader = new FileReader(ConstantsData.ConstantData.Prop_File_Path);
		
		Properties prop = new Properties();
		
		prop.load(reader);
		
		return prop;
		
	}

}
