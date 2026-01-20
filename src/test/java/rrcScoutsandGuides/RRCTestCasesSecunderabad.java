package rrcScoutsandGuides;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RRCTestCasesSecunderabad {

	WebDriver driver;
	RRCLocatorsSecunderabad rrc;

	@BeforeMethod
	public void setUp() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		rrc = new RRCLocatorsSecunderabad(driver);

	}

	@Test
	public void testLogin() throws InterruptedException {
		rrc.openURL();
		rrc.registerClick();
		rrc.cNameinput("timing candidate name");
		rrc.fatherNameinput("timing father name ");
		rrc.motherNameinput("timing mother name");
		rrc.idenOneInput("test identification marks one");
		rrc.idenTwoInput("test identification marks two");
		rrc.addressInput("test address");
		state();
		sleepThread();
		district();
		rrc.poInput("timing po");
		rrc.psInput("timing ps");
		rrc.landMarkInput("timing landmark");
		rrc.pinCodeInput("111111");
		rrc.addressRadio();
		postLevel();
		rrc.mobileNumber("0000000093"); //
		rrc.aadharNumber("000000000093"); //
		rrc.emailIdInput("taee93@yopmail.com"); //
		rrc.dobInput("01-01-1981");//
		rrc.genderRadio();
		rrc.maritalRadio();
	//	maritalDropdown();
		community();
		rrc.ebcRadio();
		rrc.minorityRadio();
		rrc.pwdRadio();
		rrc.exservicemenRadio();
		rrc.exservicemenPpo("1234");
//		rrc.exservicemenAttestation("01-01-2020");
//		rrc.exservicemenDischarge("01-01-2024");
		rrc.railwayRadio();
		rrc.jkRadio();
		rrc.itiRadio();
		//apprenticeDropdown();
		rrc.ccaaRadio();
		rrc.quasiRadio();
		//quasiDropdown();
		rrc.stationInput("test station");
		languageDropdown();
		rrc.nationalCertificate();
		educationDropdown();
		rrc.matricBoardInput("test matric");
		yearDropdown();
		gradeDropdown();
		rrc.marksInput("9");
		rrc.marksTotalInput("10");
	
		rrc.itiBoardInput("test iti board");
	    rrc.itiPercentInput("90");
		yearitiDropdown();
	
		rrc.hwbCertInput("testcert");
		hwbyear();
		rrc.hwbDate("01-10-2010");
		rrc.scoutMember("test member");
		rrc.scoutWarrant("test warrant");
		rrc.nationalEvent("test event");
		rrc.nationalEventdate("01-01-2020");
		rrc.nationalEventplace("test place1");
		rrc.nationalEvent2("test event2");
		rrc.nationalEventdate2("01-01-2021");
		rrc.nationalEventplace2("test place2");
		rrc.stateEvent("test state event");
		rrc.stateEventDate("01-01-2020");
		rrc.stateEventplace("state event place");
		rrc.stateEvent2("test state event2");
		rrc.stateEventDate2("01-01-2021");
		rrc.stateEventplace2("state event place2");
		rrc.bankName("test bank");
		rrc.bankAddress("test address");
		rrc.bankAc("test name");
		rrc.bankAcno("1111111111");
		rrc.bankAcnore("1111111111");
		rrc.ifscCode("11111");

	}

	public void state() {
		Select selectState = new Select(driver.findElement(By.id("state")));
		selectState.selectByIndex(1);
	}

	public void district() {
		Select selectDistrict = new Select(driver.findElement(By.id("statebox")));
		selectDistrict.selectByIndex(1);
		
		
	}
//----------------------------------
	public void postLevel() {
		Select selectLevel = new Select(driver.findElement(By.id("cultural_discipline")));
		selectLevel.selectByIndex(2);
	}
//------------------------------------------------------
	public void community() {
		Select selectCommunity = new Select(driver.findElement(By.xpath("//select[@id='community']")));
		selectCommunity.selectByIndex(3);
	}

	
	
	
	public void languageDropdown() {
		Select selectlanguage = new Select(driver.findElement(By.xpath("//select[@id='exma_lag']")));
		selectlanguage.selectByIndex(1);
	}
//--------------------------
	
	public void educationDropdown() {
		Select selectEducation = new Select(driver.findElement(By.xpath("//select[@name='edu_qual']")));
		selectEducation.selectByIndex(4);
	}

	public void yearDropdown() {
		Select selectyear = new Select(driver.findElement(By.id("ssc_year")));
		selectyear.selectByIndex(1);
	}

	public void gradeDropdown() {
		Select selectGrade = new Select(driver.findElement(By.id("ssc_grade")));
		selectGrade.selectByIndex(1);
	}


    public void quasiDropdown() {
	Select selectyquasi = new Select(driver.findElement(By.xpath("//select[@id='Staffquasi_year']")));
	selectyquasi.selectByIndex(6);
    }
    
    public void apprenticeDropdown() {
    	Select selectiti= new Select(driver.findElement(By.id("apprentice_year")));
    	selectiti.selectByIndex(5);
        }
    
    public void yearitiDropdown() {
    	Select selectyeariti = new Select(driver.findElement(By.id("iti_year")));
    	selectyeariti.selectByIndex(1);
        }
//    public void maritalDropdown() {
//    	Select selectwidow = new Select(driver.findElement(By.xpath("//select[@id='marital_sts']")));
//    	selectwidow.selectByIndex(1);
//        }
	public void hwbyear() {
		Select selectHwbyear = new Select(driver.findElement(By.id("cul_year")));
		selectHwbyear.selectByVisibleText("2010");
	}

	public void sleepThread() throws InterruptedException {
		Thread.sleep(1000);
	}

}