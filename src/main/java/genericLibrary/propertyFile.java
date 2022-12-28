package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyFile {
	public String getPropertydata(String Key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyfilePath);
		p.load(fis);
		return p.getProperty(Key);
	}

}
