package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
/**
 * 
 * @author Ashutosh
 *
 */


	public class ListImpClass implements ITestListener {
		
		public void onTestFailure(ITestResult result) {
			String failedTestName = result.getMethod().getMethodName();
			EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.driver);
			File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
			/*create new file inside the framework*/
			File dstFile=new File("./screenshot/"+failedTestName+".png");
			try {
				FileUtils.copyFile(srcFile,dstFile );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
			}
				
			}
			
			
		

		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		

		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

	}




