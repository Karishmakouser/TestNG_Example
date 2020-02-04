package com.testngpgrm;

import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterClass.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
			
	 @BeforeTest ()
	    public void beforeTest(){
	        System.out.println("From BeforeTest annotation in SampleTestngUsage class ..");
	    }

	    @BeforeSuite
	    public void beforeSuite(){
	        System.out.println("From BeforeSuite annotation in SampleTestngUsage class ..");
	    }
	    @Test
	    public void first ()
	    {
	       System.out.println("From first test annotated in AnnotationsTest....");
	    }

	    @BeforeMethod
	    public void beforeMethod()
	    {
	        System.out.println("From BeforeMethod annotation in AnnotationsTest....");
	    }

	    @org.testng.annotations.AfterMethod
	    public void AfterMethod()
	    {
	        System.out.println("From AfterMethod annotation in AnnotationsTest....");
	    }

	    @BeforeClass
	    public void beforeClass()
	    {
	        System.out.println("From BeforeClass annotation test in AnnotationsTest class....");
	    }

	    @AfterClass
	    public void afterClass()
	    {
	        System.out.println("From AfterClass annotation test in AnnotationsTest class....");
	    }

	    @AfterTest
	    public void afterTest()
	    {
	        System.out.println("From AfterTest annotation in AnnotationsTest class ....");
	    }

	    @AfterSuite
	    public void afterSuite()
	    {
	        System.out.println("From AfterSuite annotation in AnnotationsTest class ....");
	    }

}
	

