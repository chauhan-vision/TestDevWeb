package com.TestDevWeb;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       TestWeb web = new TestWeb();
       web.setDriverPath("C:\\Users\\chauh\\eclipse-workspace\\UpdateProfile\\driver\\chromedriver.exe");
       TestWeb.setBrowser("chrome");
       web.openPage("https://monster.com");
       web.click("xpath", "//*[@id=\"seekerLoginBtn\"]/a/span[2]");
       
    }
}
