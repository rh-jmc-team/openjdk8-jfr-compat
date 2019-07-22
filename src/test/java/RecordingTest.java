import jdk.jfr.Recording;
import jdk.jfr.Configuration;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RecordingTest {
	   public static void main (String args[]) throws Exception {
		   Configuration c = Configuration.getConfiguration("default");
		   Recording r = new Recording(c);
		   r.start();
		   System.gc();
		   Thread.sleep(5000);
		   r.stop();
		   Path jfrFilePath = Paths.get(System.getProperty("user.home"), "jfr_temp.jfr");
		   r.dump(jfrFilePath);
	   }
}
