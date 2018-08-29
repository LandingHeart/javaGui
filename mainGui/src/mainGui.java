import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainGui {
    private JPanel panel1;
    private JPanel rootPanel;
    private JButton signUpButton;
    private JTextField userID;
    private JTextField userName;
    private String name;
    private String ID;


    public mainGui() {



        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int counter = 111;
                String nameArray[] = new String[999];
                String IDArray[] = new String[999];
               // System.out.print(name + "\n " + ID);
                   for (int i = 0; i< nameArray.length; i++) {
                       name = userName.getText();
                       ID = userID.getText();
                       if (name != null && ID != null) {
                           counter++;
                           nameArray[i] = name;
                           IDArray[i] = ID;
                           userName.setText("");
                           userID.setText("");
                           System.out.print( nameArray[i] + "\n" + IDArray[i]+"\n");
                           break;
                       }

                       else
                           break;
                   }






            }
        });

    }

    public static void main(String [] args){
        JFrame frame= new JFrame("press me");
        frame.setContentPane(new mainGui().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



   }

}
