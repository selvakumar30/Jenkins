package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	public static String parId;
	public static Select s;
	
	//1.launchBrowser
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	
	//2.loadUrl
	public static void loadUrl(String Url) {
		driver.get(Url);
	}
	
	//3.To Maximize
	public static void toMaximize() {
		driver.manage().window().maximize();

	}
	
	//4.To Get Title
	public static String togetTitle() {
		String title = driver.getTitle();
		return title;

	}
	
	//5.To get Url
	public static String togetUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	//6.TO Fill Text
	public static void toFillTxt(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	//7.To Click
	public static void toClick(WebElement element) {
		element.click();
	}
	
	//8.To Quite browser
	public static void toQuitBrowser() {
		driver.quit();
	}
	
	//9.To Close Tab
	public static void toCloseTab() {
		driver.close();
	}
	
	//10.To Get Text
	public static String toGetText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	//11.To Get Attribute
	public static String toGetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	//12.To Move to Element
	public static void toMovetoElement(WebElement element) {
		a= new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	//13.To Drag and Drop
	public static void toDragandDrop(WebElement src,WebElement dest) {
		a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	
	//14.To Key Up
	public static void toKeyUp(WebElement element,Keys value,String text) {
		a=new Actions(driver);
		a.keyUp(element, value).sendKeys(text).build().perform();
	}
	
	//15.To Key Down
	public static void toKeyDown(WebElement element,Keys value,String text) {
		a=new Actions(driver);
		a.keyDown(element, value).sendKeys(text).build().perform();
	}
	
	//16.To Double Click
	public static void toDoubleCLick(WebElement element) {
		a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	//17.To Context Click
	public static void toContextClick(WebElement element) {
		a=new Actions(driver);
		a.contextClick(element).perform();
	}
	
	//18.To Press Down
	public static void toPressDown() throws AWTException {
		r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	//19.To Press Up
	public static void toPressUp() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	
	//20.To Press Control
	public static void toPressCtrl() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	//21.To Press Shift
	public static void toPressShift() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);
	}
	
	//22.To Press Enter
	public static void toPressEnter() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	//23.To Press A
	public static void toPressA() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
	}
	
	//24.To Press C
	public static void toPressC() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
	}
	
	//25.To Press X
	public static void toPressX() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
	}
	
	//26.To Press V
	public static void toPressV() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
	}
	
	//27. To Press Tab
	public static void toPressTab() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	
	//28.To Press Z
	public static void toPressZ() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_Z);
		r.keyRelease(KeyEvent.VK_Z);
	}
	
	//29.To Accept Alert
	public static void toAcceptAlert(WebElement element) {
		al=driver.switchTo().alert();
		al.accept();
	}
	
	//30.To Dismiss Alert
	public static void toDismissAlert() {
		al=driver.switchTo().alert();
		al.dismiss();
	}
	
	//31.To Sendkeys Alert
	public static void toSendkeysAlert(String value) {
		al=driver.switchTo().alert();
		al.sendKeys(value);
	}
	
	//32.To Get Text Alert
	public static String toGetTextAlert() {
		al=driver.switchTo().alert();
		String text = al.getText();
		return text;
	}
	
	//33.To Snap------------->ScreenShots
	
	public static void toSnap(String name) throws IOException {
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\java\\Reworks\\Maven\\MavenProject\\Screenshot\\"+name+".png");
	FileUtils.copyFile(src, dest);
	}
	
	//34.To Set Attribute JSE
	public static void tosetAttribute(WebElement element,String value) {
		js=(JavascriptExecutor)driver;
		js.executeScript(value, element);
	}
	
	//35.To Click JSE
	public static void toClickJse(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);

	}
	
	//36.To.Get Attribute JSE
	public static String toGetAttributeJse(WebElement element) {
		js=(JavascriptExecutor)driver;
		Object txt = js.executeScript("arguments[0].getAttributes('value')", element);
		String s=(String)txt;
		return s;
	}
	
	//37.To Scroll Down
	public static void toScrollDown(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	//38.To Scroll Up
	public static void toScrollUp(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
	//39.To Scroll into View
	public static void toScrollIntoView(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	//40.To Get Window Handle
	public static String toGetWindowHandle() {
		parId = driver.getWindowHandle();
		return parId;
	}
	
	//41.To Get Window Handles
	public static void toGetWindowHandles() {
		Set<String> childId = driver.getWindowHandles();
		for (String newId : childId) {
			System.out.println(newId);
		}
	}
	
	//42.To Window Handles 
	public static void toWindowHandles() {
		Set<String> childId = driver.getWindowHandles();
		for (String newId : childId) {
			driver.switchTo().window(newId);
		}
	}
	
	//43.To Multiple Window
	public static void toMultipleWindow(int value) {
		Set<String> childId = driver.getWindowHandles();
		List<String> li=new LinkedList();
		li.addAll(childId);
		driver.switchTo().window(li.get(value));
	}
	
	//44.To Select by Value
	public static void toSelectByValue(WebElement element,String value) {
		s=new Select(element);
		s.selectByValue(value);
	}
	
	//45.To Select by Index
	public static void toSelectByIndex(WebElement element,int value) {
		s=new Select(element);
		s.selectByIndex(value);
	}
	
	//46.To Select by Visible text
	public static void toSelectByVisibletxt(WebElement element,String value) {
		s=new Select(element);
		s.selectByVisibleText(value);
	}
	
	//47.To Is Multiple
	public static boolean toIsMultiple(WebElement element) {
		s=new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}
	
	//48.To Get Option
	public static String toGetOption(WebElement element) {
		s=new Select(element);
		String text=null;
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			text = option.getText();
			System.out.println(text);
		}
		return text;
	}
	
	//49.To Get All Selected Options
	public static String toGetAllSelectedOptions(WebElement element) {
		s=new Select(element);
		String text=null;
		List<WebElement> options = s.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			text = option.getText();
			System.out.println(text);
		}
		return text;
	}
	
	//50.To Get First Selected option
	public static String toFrstSelectOption(WebElement element) {
		s=new Select(element);
		WebElement options = s.getFirstSelectedOption();
		String text = options.getText();
		return text;
	}
	
	//51.To Deselect by Index
	public static void toDeselectByIndex(WebElement element,int value) {
		s=new Select(element);
		s.deselectByIndex(value);
	}
	
	//52.To Deselect by Value
	public static void toDeSelectByValue(WebElement element,String name) {
		s=new Select(element);
		s.deselectByValue(name);
	}
	
	//53.To Deselect by Visible text
	public static void toDeselectByVisible(WebElement element,String name) {
		s=new Select(element);
		s.deselectByVisibleText(name);
	}
	
	//54.To Deselect by All
	public static void toDeselectByAll(WebElement element) {
		s=new Select(element);
		s.deselectAll();
	}
	
	//55.To Select All Option
	public static void toSelectAllOption(WebElement element) {
		s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			s.selectByIndex(i);
		}
	}
	
	//56.To Check Enable
	public static boolean toCheckEnable(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	//57.To Check Display
	public static boolean toCheckDisplay(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	
	//58.To Check Selected
	public static boolean toCheckSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	
	//59.To Navigate Url
	public static void toNavigateUrl(String Url) {
		driver.navigate().to(Url);
	}
	
	//60.To Forward
	public static void toForward() {
		driver.navigate().forward();
	}
	
	//61.To Back
	public static void toBack() {
		driver.navigate().back();
	}
	
	//62.To Refresh
	public static void toRefresh() {
		driver.navigate().refresh();
	}
	
	//63.To Cut
	public static void toCut() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}
	
	//64.To Paste
	public static void toPaste() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	
	//65.To Copy
	public static void toCopy() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	
	//66.To Create Excel
	public static void createExcel(String filename,String sname,int rowNo,int cellNo,String value) 
			throws IOException {
		File f=new File("D:\\java\\Reworks\\Maven\\MavenProject\\Excel\\"+filename+".xlsx");
		
		Workbook w=new XSSFWorkbook();
		
		Sheet s = w.createSheet(sname);
		
		Row row = s.createRow(rowNo);
		
		Cell cell = row.createCell(cellNo);
		
		cell.setCellValue(value);
		
		FileOutputStream output=new FileOutputStream(f);
		
		w.write(output);
	
	}
	
	//67.To Add Row
	public static void addRow(String filename,String sname,int rowNo,int cellNo,String value) 
			throws IOException {
		File f=new File("D:\\java\\Reworks\\Maven\\MavenProject\\Excel\\"+filename+".xlsx");
		
		FileInputStream input=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(input);
		
		Sheet s = w.getSheet(sname);
		
		Row r = s.createRow(rowNo);
		
		Cell c = r.createCell(cellNo);
		
		c.setCellValue(value);
		
		FileOutputStream output=new FileOutputStream(f);
		
		w.write(output);
	}
	
	//68.To Add Cell
	public static void addCell(String filename,String sname,int rowNo,int cellNo,String value) 
			throws IOException {
		File f=new File("D:\\java\\Reworks\\Maven\\MavenProject\\Excel\\"+filename+".xlsx");
		
		FileInputStream input=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(input);
		
		Sheet s = w.getSheet(sname);
		
		Row r = s.getRow(rowNo);
		
		Cell c = r.createCell(cellNo);
		
		c.setCellValue(value);
		
		FileOutputStream output=new FileOutputStream(f);
		
		w.write(output);
	}
	
	//69.To Update Excel
	public static void updateExcel(String filename,String sname,int rowNo,int cellNo,String oldValue,
			String newValue) throws IOException {
		File f=new File("D:\\java\\Reworks\\Maven\\MavenProject\\Excel\\"+filename+".xlsx");
		
		FileInputStream input=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(input);
		
		Sheet s = w.getSheet(sname);
		
		Row r = s.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		String value = c.getStringCellValue();
		
		if (value.contains(oldValue)) {
			c.setCellValue(newValue);
		}
		
		FileOutputStream output=new FileOutputStream(f);
		
		w.write(output);

	}
	
	//70.To Read Value
	public static String readValue(String filename,String sname,int rowNo,int cellNo) throws IOException {
		File f=new File("D:\\java\\Reworks\\Maven\\MavenProject\\Excel\\"+filename+".xlsx");
		
		FileInputStream input=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(input);
		
		Sheet s = w.getSheet(sname);
		
		Row r = s.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		int cell = c.getCellType();
		
		String value=null;
		if (cell==1) {
			value = c.getStringCellValue();
		}
		
			else if (DateUtil.isCellDateFormatted(c)) {
		
			Date d= c.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
			value = sim.format(d);
		}
		
		else {
			double d = c.getNumericCellValue();
			long l=(long)d;
			value = String.valueOf(l);
		}
		return value;
	}
	
	//71.To read All Value
	public static String readAllValue(String filename,String sname) throws IOException {
		File f=new File("D:\\java\\Reworks\\Maven\\MavenProject\\Excel\\"+filename+".xlsx");
		
		FileInputStream input=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(input);
		
		Sheet s = w.getSheet(sname);
		
		String value=null;
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				
				int cell = c.getCellType();
				if (cell==1) {
					value = c.getStringCellValue();
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
					value = sim.format(d);
				}
				else {
					double d = c.getNumericCellValue();
					long l=(long)d;
					value = String.valueOf(l);
				}
			}
		}
		return value;

	}
	
	//72.Implicit Waits
	public static void Implicitwaits() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
}
