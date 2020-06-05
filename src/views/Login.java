package views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import views.constants.ComponentGenerator;
import views.constants.Constants;

/**
 * Login
 * 
 * @author Ngoc
 */
public class Login extends JFrame {

    private ComponentGenerator componentGenerator = ComponentGenerator.getCompomentGenerator();

    public Login() {
        initComponents();
        setSize(Constants.F_WIDTH, Constants.F_HEIGHT);
        setVisible(true);
    }

    /**
     * Initialize components of the frame
     */
    private void initComponents() {

        // Create main panel
        JPanel mainPanel = componentGenerator.createPanel();

        // Add components to panel
        mainPanel.add(componentGenerator.createLabel("Login"));
        mainPanel.add(componentGenerator.createLabel("Username"));
        mainPanel.add(componentGenerator.createPasswordField(Constants.FORM_TEXT_FIELD_WIDTH));
        mainPanel.add(componentGenerator.createTextField(Constants.FORM_TEXT_FIELD_WIDTH));
        mainPanel.add(componentGenerator.createButton("Login"));
        mainPanel.add(componentGenerator.createButton("Register"));
        mainPanel.add(componentGenerator.createButton("Cancel"));

        // Add main panel to frame
        getContentPane().add(mainPanel);
    }

    public static void main(String args[]) {
        new Login();
    }
}