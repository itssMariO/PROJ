import java.io.*;
import java.util.Scanner;
Public class Demo
{
    Public static String generateOTP()
    {
        int randomno=(int)(Math.random()*9000)+1000;
        String OTP=String.valueOf(randomno);
        return OTP;
    }
    Public static void main(String[]args){
        String OTPstr=generateOTP();
        System.Out.println("OTP:"+OTPstr);
    }
}
