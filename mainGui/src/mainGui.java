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
                summit();

                //System.out.print(name + "\n " + ID);



            }
        });
    }
    void print(String []userName, String []ID){
        for (int i = 0; i< ID.length; i++){

            if (ID[i] != null && userName[i] != null){
                System.out.println(userName[i]);
                System.out.println(ID[i]);
            }
        }


    }
    void summit(){
        String nameArray[] = new String[999];
        String IDArray[] = new String[999];
        int counter = 111;
        name = userName.getText();
        ID = userID.getText();
        int i = 0;
        if (name != null && ID != null) {
            counter++;
            nameArray[i] = name;
            IDArray[i] = ID;
            userName.setText("");
            userID.setText("");
            i++;

        }
        print(nameArray, IDArray);

    }

    public static void main(String [] args){
        JFrame frame= new JFrame("press me");
        frame.setContentPane(new mainGui().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

}
