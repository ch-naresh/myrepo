package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport{

	@Test
	public void extentdemo() {

		// create an object to initiate Extent report engine

		ExtentReports ex = new ExtentReports();

		// give the path of the folder in which extent report has to be created
		// right click on project-->propetries-->go to resources on left-->copy the path
		// of project


		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(
				"C:\\Users\\ASUS\\eclipse-workspace\\SeleniumWorkspace\\framework\\test-output\\Myreport1.html");

		ex.attachReporter(sparkreporter);

		ex.flush();

	}

	@Test
	public void extentDemo2() throws IOException {

		ExtentReports ex = new ExtentReports();
		File file = new File("Myreport1.html");

		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		ex.attachReporter(sparkreporter);
		ex.flush();

		Desktop.getDesktop().browse(new File("Myreport1.html").toURI());

	}

}