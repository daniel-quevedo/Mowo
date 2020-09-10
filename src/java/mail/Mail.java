/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import EncodeDecode.EncodeDecode;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Daniel
 */
public class Mail {
    
    private String mailEmi;
    private String passEmi;
    private String mailRec;
    private String subject;
    private String message;
    
    private boolean result = false;
    
    public Mail(String mailRec){
        
        
        this.mailRec = mailRec;
        this.mailEmi = "mowoaplication@gmail.com";
        this.passEmi = "mow0_oX12*M_correo";
        this.subject = "Registro de Usuario Mowo_o";
        
    }
    
    public boolean sendMail(){
        
        //codificar el correo**********
        
        EncodeDecode encoDe = new EncodeDecode(this.mailRec);

        String mailEncode = encoDe.encode();
        String mowo_o = "http://localhost:8084/Mowo/pages/validUser/Validate.jsp?m41r=";
        //******************************
        
        
        
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(props);
        
        MimeMessage mail = new MimeMessage(session);
        
        try {
            
            mail.setFrom(new InternetAddress (this.mailEmi));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(this.mailRec));
            mail.setSubject(this.subject);
            mail.setText(mowo_o+mailEncode+"" , "UTF-8");
            
            Transport transport = session.getTransport("smtp");
            transport.connect(this.mailEmi, this.passEmi);
            transport.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transport.close();
            
            this.result = true;
            
            return this.result; 
            
            
        } catch (MessagingException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return this.result; 
    
    }
    
}
