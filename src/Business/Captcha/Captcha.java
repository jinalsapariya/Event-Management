/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Captcha;

import java.util.Random;

/**
 *
 * @author sapar
 */
public class Captcha {
    public static String generateCaptcha(){
        Random random = new Random();
        int length = 5;
        StringBuffer captchaStringBuffer = new StringBuffer();
        for(int i=0; i< length; i++){
            int cNumber = Math.abs(random.nextInt()) %50;
            int charNumber = 0;
            if(cNumber <24) {
                charNumber = 65 + cNumber;
            }
            else if(cNumber < 54) {
                charNumber = 94 + (cNumber - 23);
            }
            else{
                charNumber = 44 + (cNumber - 56);
            }
            captchaStringBuffer.append((char) charNumber);
            
        }
        return captchaStringBuffer.toString();
    }
    
}
