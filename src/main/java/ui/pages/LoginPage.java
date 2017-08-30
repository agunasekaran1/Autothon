package ui.pages;

import org.openqa.selenium.By;

/**
 * Created by rr on 8/30/2017.
 */
public class LoginPage extends PageObject{


    public boolean login(String user, String pwd ){

        try {
            enterUserName(user);
            enterPassword(pwd);
            driver.findElement(By.className("login.gh-btn.gh-btn-blue.gh-btn-block.gh-btn-icon.ember-view"));
        }catch (Exception ex){

            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean enterUserName(String usr){
        try{
            driver.findElement(By.name("identification")).sendKeys(usr);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean enterPassword(String pwd){
        try{
            driver.findElement(By.name("password")).sendKeys(pwd);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

}
