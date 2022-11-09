package java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Split_String {
	
	public static void main(String args[]) {
	String str="Java,Selenium,C++";
	String[] st=str.split(",");
	
	for(String st1:st) 
	{
		System.out.println(st1);
	}
}
}
 