package test_2_18_Core_Java_Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public class A {
    public static void main(String[] args) {
//        long number =12_000__000L;
//        Locale loc=Locale.UA;
//        NumberFormat numberFormat=NumberFormat.getInstance(loc);
////        System.out.println("Format:"+ numberFormat);
//        BigDecimal  currencyAmount= new BigDecimal("1000.55");
//        Currency cur= Currency.getInstance(new Locale("uk","UA"));
//        NumberFormat numberFormat=NumberFormat.getCurrencyInstance(new Locale("uk","UA"));
//        System.out.println(cur.getDisplayName()+":"+numberFormat.format(currencyAmount));
//        BigInteger numb1=BigInteger.ONE;
//        BigInteger numb2=BigInteger.TWO;
//        System.out.println(numb1.compareTo(numb2));
////        long number =12_000_000L;
//        Locale loc=new Locale("uk","UA");
//        NumberFormat numFmt=NumberFormat.getInstance(loc);
//      //  NumberFormat numberFormat=NumberFormat.getInstance(loc);
//        System.out.println("Format:"+ numFmt.format(number));
//Map<String,String> params=System.getenv();
//        System.out.println("System Drive->"+ params.get("SystemDrive"));
//        BigDecimal  numb1= new BigDecimal(1);
//        BigDecimal numb2=new BigDecimal(5);
//        System.out.println(numb1.divide(numb2));
//        Map<String,String> env=System.getenv();
//        for(String envName:env.keySet()){
//         //   System.out.format("%s=%s%n",envName,env.get(envName));
//
//        }
//        System.out.println(System.getenv(" PATH"));
//        System.out.println(System.getenv("TEMP"));
//        System.out.println(System.getenv("USERNAME="));
//        Properties properties =new Properties();
//        try (FileInputStream fis =new FileInputStream("config.properties")){
//            properties.load(fis);
//            String host= properties.getProperty("dbhost");
//            String login = properties.getProperty("dblogin");
//            String password = properties.getProperty("dbpassword");
//            System.out.println("Host"+host+",Login"+login+",Password"+password);
////        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System ss=new System;
//        String params=ss.getenv("SystemDrive");
//        System.out.println("System Drive->"+ params);
//        double x=90;
//        System.out.println(Math.sin(x));
//        BigDecimal  numb1= new BigDecimal(1);
//        BigDecimal  numb2= new BigDecimal(3);
//        System.out.println(numb1.divide(numb2));
//        double x=-10.77;
//        System.out.println(Math.round(x));
        long number =12_000_000_000L;
        Locale loc=new Locale("uk","UA");
        NumberFormat curFmt=NumberFormat.getCurrencyInstance(loc);
      //  NumberFormat numberFormat=NumberFormat.getInstance(loc);
        System.out.println("Currency:"+ curFmt.format(number));

    }
}
