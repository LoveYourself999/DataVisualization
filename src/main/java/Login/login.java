package Login;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login extends JFrame {
    private static final String info_address = "src/main/resources/Login_info.xml";
    private static login instance;

    public static login getInstance() {
        if (instance == null)
            instance = new login();
        return instance;
    }
    login()
    {

        JPanel login_panel = new JPanel();
        JFrame login_frame = new JFrame();
        login_frame.setSize(300,150);
        login_frame.setDefaultCloseOperation(login_frame.EXIT_ON_CLOSE);
        login_frame.add(login_panel);

        login_panel.setLayout(null);

        JLabel user_label = new JLabel("Username:");
        user_label.setBounds(10,20,80,25);
        login_panel.add(user_label);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        login_panel.add(userText);

        JLabel pw_label = new JLabel("Password:");
        pw_label.setBounds(10,50,80,25);
        login_panel.add(pw_label);

        JTextField pwText = new JPasswordField(25);
        pwText.setBounds(100,50,165,25);
        login_panel.add(pwText);

        JButton login_button = new JButton("Login");
        login_button.setBounds(120,80,80,25);
        login_panel.add(login_button);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        login_frame.setVisible(true);

        login_button.addActionListener(new ActionListener() {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            @Override
            public void actionPerformed(ActionEvent e) {
                String pwT = pwText.getText();
                String urT = userText.getText();
                boolean User_Not_Found = true;

                LoginRepository loginRepository = new ProxyLoginRepository();
                if(loginRepository.check(urT,pwT)){

                        login_frame.dispose();
                        JFrame frame = MainUI.getInstance();
                        frame.setSize(900, 600);
                        frame.pack();
                        frame.setVisible(true);
                        User_Not_Found = false;
                }

//                for (LoginIterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
//                    User usr = (User) iter.next();
//                    if (pwT.equals(usr.getPw()) && urT.equals(usr.getUsername())) {
//                        login_frame.dispose();
//                        JFrame frame = MainUI.getInstance();
//                        frame.setSize(900, 600);
//                        frame.pack();
//                        frame.setVisible(true);
//                        User_Not_Found = false;
//                        break;
//                    }
//                }
                if(User_Not_Found) {
                    JOptionPane.showMessageDialog(null, "There is an error with the provided credentials and the application will terminate!");
                    System.exit(0);
                }
            }
        });
    }
    public static void main(String[] args)
    {
        login login = Login.login.getInstance();
    }

}