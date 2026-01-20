package rrcScoutsandGuides;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RRCLocatorsSecunderabad {

	WebDriver driver;
	
	String URL= "https://iroams.com/rrc_scr_scout2025_testd/index.php";
	
	@FindBy(partialLinkText="User Registration") WebElement registration;
	@FindBy(xpath="//input[@placeholder='Name must be entered same as in matric certificate']") WebElement cname;
	@FindBy(xpath="//input[@name='fathername']") WebElement fName;
	@FindBy(xpath="//input[@name='mname']") WebElement mName;
	@FindBy(xpath="//input[@name='identity_marks']") WebElement idenOne;
	@FindBy(css="input[name='identity_marks2']") WebElement idenTwo;
	@FindBy(xpath="//textarea[@name='address']") WebElement addressP;
	@FindBy(id="po") WebElement po;
	@FindBy(id="ps") WebElement ps;
	@FindBy(id="landmark") WebElement landMark;
	@FindBy(xpath="//input[@name='pincode']") WebElement pinCode;
	@FindBy(id="inlineRadio1") WebElement addressradio;
	@FindBy(xpath="//input[@placeholder='Please enter 10 digit mobile number']") WebElement mobileno;
	@FindBy(xpath="//input[@placeholder='Please Enter Aadhaar Card Number']") WebElement aadharno;
	@FindBy(id="valid_email") WebElement emailid;
	@FindBy(xpath="//input[@id='datepicker']") WebElement dob;
	@FindBy(xpath="//input[@value='Male']") WebElement gender;
	@FindBy(css="input[value='1'][name='marital']") WebElement marital;
	@FindBy(css="input[value='0'][name='ebc_status']") WebElement ebc;
	@FindBy(css="input[value='0'][name='minority_status']") WebElement minority;
	@FindBy(css="input[value='0'][name='pwd_status']") WebElement pwd;
	@FindBy(css="input[value='1'][name='exserv_status']") WebElement exservicemen;
	@FindBy(id="ppno") WebElement ppno;
	@FindBy(id="dateofjoining") WebElement attestation;
	@FindBy(id="dateofdichagred") WebElement discharge;
	
	
	@FindBy(css="input[value='0'][name='is_railway_employee']") WebElement railway;
	@FindBy(css="input[value='0'][name='is_domicile']") WebElement jk;
	@FindBy(css="input[value='0'][name='is_apprentice_iti']") WebElement iti;
	@FindBy(css="input[value='0'][name='is_apprentice']") WebElement ccaa;
	@FindBy(css="input[value='0'][name='is_quasi_staff']") WebElement quasi;
	@FindBy(xpath="//input[@id='near_rail']") WebElement railwaystation;
	@FindBy(id="vehicle1") WebElement nationalcert;
	@FindBy(id="ssc_board") WebElement board;
	@FindBy(id="ob_marks") WebElement marks;
	@FindBy(id="tot_marks") WebElement markstotal;
	@FindBy(id="iti_board")WebElement boarditi;
	@FindBy(id="iti_percent")WebElement percentiti;
	@FindBy(id="cul_ins") WebElement certificatehwb;
	@FindBy(id="cul_recon") WebElement datehwb;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/table[3]/tbody[1]/tr[2]/td[2]/input[2]") WebElement member;
	@FindBy(xpath="	(//input[@placeholder='Warrant No'])[1]") WebElement scoutwarrant;
	@FindBy(xpath="(//input[@placeholder='Enter Event Name'])[1]")WebElement eventname;
	@FindBy(xpath="(//input[@placeholder='Certificate No'])[11]")WebElement eventdate;
	@FindBy(xpath="(//input[@placeholder='Enter Event Place'])[1]")WebElement eventplace;
	@FindBy(xpath="(//input[@placeholder='Enter Event Name'])[2]")WebElement eventname2;
	@FindBy(xpath="(//input[@placeholder='Certificate No'])[12]")WebElement eventdate2;
	@FindBy(xpath="(//input[@placeholder='Enter Event Place'])[2]")WebElement eventplace2;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/table[5]/tbody[1]/tr[2]/td[2]/input[2]")WebElement stateevent;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/table[5]/tbody[1]/tr[2]/td[3]/input[1]")WebElement stateeventdate;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/table[5]/tbody[1]/tr[2]/td[4]/input[1]")WebElement stateeventplace;
	@FindBy(xpath="(//input[@placeholder='Enter Event Name'])[8]")WebElement stateevent2;
	@FindBy(xpath="(//input[@placeholder='Certificate No'])[18]")WebElement stateeventdate2;
	@FindBy(xpath="(//input[@placeholder='Enter Event Place'])[8]")WebElement stateeventplace2;
	@FindBy(xpath="	//input[@placeholder='Please enter Bank name ']") WebElement bankname;
	@FindBy(xpath="//input[contains(@placeholder,'Please enter Bank Address')]") WebElement bankaddress;
	@FindBy(xpath="//input[@placeholder='Please enter Account name ']") WebElement acname;
	@FindBy(id="aacountd") WebElement acno;
	@FindBy(id="reaccnodd") WebElement reacno;
	@FindBy(xpath="//input[@placeholder='Please enter Your IFSC Code ']") WebElement codeifsc;
	
	
	
	
	
	


	
	

	
	public RRCLocatorsSecunderabad(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
}
	 public void openURL() {
	        driver.get(URL);
	    }
	public void registerClick() 
	{
		registration.click();
	}
	

	public void cNameinput(String candidateName) 
	{
		cname.sendKeys(candidateName);
	}
	
	public void fatherNameinput(String nameFather) 
	{
		fName.sendKeys(nameFather);
	}
	
	public void motherNameinput(String nameMother) 
	{
		mName.sendKeys(nameMother);
	}
	public void idenOneInput(String idenMarksone) 
	{
		idenOne.sendKeys(idenMarksone);
	}
	public void idenTwoInput(String idenMarkstwo) 
	{
		idenTwo.sendKeys(idenMarkstwo);
	}

	public void addressInput(String address) 
	{
		addressP.sendKeys(address);
	}

	public void poInput(String postoffice) 
	{
		po.sendKeys(postoffice);
	}
	
	public void psInput(String policestation) 
	{
		ps.sendKeys(policestation);
	}
	public void landMarkInput(String landmark) 
	{
		landMark.sendKeys(landmark);
	}
	public void pinCodeInput(String pincode) 
	{
		pinCode.sendKeys(pincode);
	}
	public void addressRadio()
	{
		addressradio.click();
	}
	public void mobileNumber(String mobile)
	{
		mobileno.sendKeys(mobile);
	}
	public void aadharNumber(String aadhar)
	{
		aadharno.sendKeys(aadhar);
	}
	public void emailIdInput(String email)
	{
		emailid.sendKeys(email);
	}
	
	public void dobInput(String DOB)
	{
		dob.sendKeys(DOB);
	}
	
	public void genderRadio()
	{
		gender.click();
	}
	public void maritalRadio()
	{
		marital.click();
	}
	
	public void ebcRadio()
	{
		ebc.click();
	}
	
	public void minorityRadio()
	{
		minority.click();
	}
	public void pwdRadio()
	{
		pwd.click();
	}
	public void exservicemenRadio()
	{
		exservicemen.click();
	}
	public void exservicemenPpo(String Ppno)
	{
		ppno.sendKeys(Ppno);
	}
	
	public void exservicemenAttestation(String attest)
	{
		attestation.sendKeys(attest);
	}
	public void exservicemenDischarge(String disc)
	{
		discharge.sendKeys(disc);
	}
	public void railwayRadio()
	{
		railway.click();
	}
	
	public void jkRadio()
	{
		jk.click();
	}
	
	public void itiRadio()
	{
		iti.click();
	}
	public void ccaaRadio()
	{
		ccaa.click();
	}
	public void quasiRadio()
	{
		quasi.click();
	}
	public void stationInput(String station)
	{
		railwaystation.sendKeys(station);
	}
	public void nationalCertificate()
	{
		nationalcert.click();
	}
	public void matricBoardInput(String matric)
	{
		board.sendKeys(matric);
	}

	public void marksInput(String Marks)
	{
		marks.sendKeys(Marks);
	}
	public void marksTotalInput(String totalmarks)
	{
		markstotal.sendKeys(totalmarks);
	}
	public void itiBoardInput(String itiboard)
	{
		boarditi.sendKeys(itiboard);
	}
	public void itiPercentInput(String itipercent)
	{
		percentiti.sendKeys(itipercent);
	}
	public void hwbCertInput(String certhwb)
	{
		certificatehwb.sendKeys(certhwb);
	}
	
	public void hwbDate(String hwdate)
	{
		datehwb.sendKeys(hwdate);
	}
	
	public void scoutMember(String scoutmember)
	{
		member.sendKeys(scoutmember);
	}
	

	public void scoutWarrant(String warrant)
	{
		scoutwarrant.sendKeys(warrant);
	}
	

	public void nationalEvent(String nationalevent)
	{
		eventname.sendKeys(nationalevent);
	}
	public void nationalEventdate(String dateevent)
	{
		eventdate.sendKeys(dateevent);
	}
	public void nationalEventplace(String placeevent)
	{
		eventplace.sendKeys(placeevent);
		
	}
	public void nationalEvent2(String nationalevent2)
	{
		eventname2.sendKeys(nationalevent2);
	}
	public void nationalEventdate2(String dateevent2)
	{
		eventdate2.sendKeys(dateevent2);
	}
	public void nationalEventplace2(String placeevent2)
	{
		eventplace2.sendKeys(placeevent2);
	}
	public void stateEvent(String eventstate)
	{
		stateevent.sendKeys(eventstate);
	}
	public void stateEventDate(String eventstatedate)
	{
		stateeventdate.sendKeys(eventstatedate);
	}
	public void stateEventplace(String eventstateplace)
	{
		stateeventplace.sendKeys(eventstateplace);
	}
	public void stateEvent2(String eventstate2)
	{
		stateevent2.sendKeys(eventstate2);
	}
	public void stateEventDate2(String eventstatedate2)
	{
		stateeventdate2.sendKeys(eventstatedate2);
	}
	public void stateEventplace2(String eventstateplace2)
	{
		stateeventplace2.sendKeys(eventstateplace2);
	}
	public void bankName(String namebank)
	{
		bankname.sendKeys(namebank);
	}
	public void bankAddress(String addressbank)
	{
		bankaddress.sendKeys(addressbank);
	}
	public void bankAc(String nameac)
	{
		acname.sendKeys(nameac);
	}
	
	public void bankAcno(String noac)
	{
		acno.sendKeys(noac);
	}
	
	public void bankAcnore(String renoac)
	{
		reacno.sendKeys(renoac);
	}
	
	public void ifscCode(String ifsc)
	{
		codeifsc.sendKeys(ifsc);
	}
	
}	
	


	


	
	
	
	
	
	
	
	
	
	
	
	