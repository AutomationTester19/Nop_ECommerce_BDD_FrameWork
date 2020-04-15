package com.qa.eCommerce.MyRunner;




import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions (
		 features = "C:/Users/DIGVIJAY/workspace/Nop_ECommerce_Cucumber_FrameWork/Resources/Scenarios/productsPageValidations.Feature",
		 glue = {"com.qa.eCommerce.stepDefinations"},
		 plugin ="json:target/jsonReports/cucumber-report.json",
		 format = {"pretty","html:testoutput"},
		 monochrome = true,
		 dryRun = false,
		 strict = true
)
public class MyRunner {
	
	
	private TestNGCucumberRunner testNGCucumberRunner;
	 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }

	@DataProvider(name="fillData")
	public Object[][] dataEntry(){
		
		/*
	
		FileInputStream fis = null;
		XSSFWorkbook wb = null;
		XSSFSheet sheet =null;
		String filePath = System.getProperty("user.dir")+"\\empDetails.xlsx";
		
		File file = new File(filePath);
		try {
			 fis = new FileInputStream(file);
			 wb = new XSSFWorkbook(fis);
		    sheet = wb.getSheetAt(0);
		    wb.close();
		}	 catch(Exception e) {}	
		
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[rowCount][1];

		for(int i=0;i<rowCount;i++){
			Map<Object,Object> data = new HashMap<Object,Object>();
			for(int j =0;j<colCount;j++){
				data.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());		
			}
			
			obj[i][0]=data;	
		}
		return obj;
		*/
		
		return null;
	}

}
