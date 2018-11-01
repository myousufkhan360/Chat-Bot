/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author One Click
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class bot extends JFrame {
    
    //typing area
    private JTextField txtEnter = new JTextField();
    
    //chat area
    private JTextArea txtChat = new JTextArea();
    
    JScrollPane scroll = new JScrollPane (txtChat);
    
    public bot(){
        //frame attributes
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("My ChatBot");
        
         scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
          scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        //txtEnter Attributes
        txtEnter.setLocation(2,240);
        txtEnter.setSize(290,30);
        
        //txtEnter Action Event:
         txtEnter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                String uText = txtEnter.getText();
                txtChat.append("You : " + uText + "\n");
                
                if(uText.contains("hii")){
                    
                    botSay("Hello There !!!");
                }
                else if(uText.contains("how are you"))
                {
                    int decider = (int) (Math.random()*2+1);
                    if(decider == 1){
                       botSay("I am Fine Thanx... :D ");
                    }
                    else if(decider == 2){
                        botSay("Not Too bad.. just talking with you...");
                    }
                }
                
                else {
                    int decider = (int) (Math.random()*3+1);
                    if(decider == 1){
                       botSay("I did'nt Understand...");
                    }
                    else if(decider == 2){
                        botSay("Ooops.. what??");
                    }
                    else if(decider == 3){
                        botSay("Can I help you....");
                    }
                }
                txtEnter.setText("");
            }
         });
        //txtchat attributes
        txtChat.setLocation(7,8);
        txtChat.setSize(280,220);
        txtChat.setEditable(false);
        
       
        
        
        //add items to frame 
       
        this.add(txtEnter);
        this.add(txtChat);
        this.add(scroll);
        this.setVisible(true);
}
    
    public void botSay(String s) {
        txtChat.append("Chatty : " + s + "\n");
        
        
    }
    
    
public static void main(String ags[])
{
new bot();

}

   



}
