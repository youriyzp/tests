package test_2_18_Core_Java_Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
    public static void main(String[] args) {


        //Properties properties =new Properties();
        try (
                FileInputStream in = new FileInputStream("config.properties")) {
            Properties pp = new Properties();

            pp.load(in);
            String host = pp.getProperty("dbhost");
            String login = pp.getProperty("dblogin");
            String password = pp.getProperty("dbpassword");
            System.out.println("Host" + host + ",Login" + login + ",Password" + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}