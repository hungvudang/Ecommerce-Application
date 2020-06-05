package views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import views.constants.ComponentGenerator;
import views.constants.Constants;

/**
 * Register
 */
public class Register extends JFrame {

    private ComponentGenerator componentGenerator = ComponentGenerator.getCompomentGenerator();

    public Register() {
        initComponents();
    }

    private void initComponents() {

        // Create main panel
        JPanel mainPanel = componentGenerator.createPanel();

        // Add components to panel
        mainPanel.add(componentGenerator.createLabel("Register"));
        mainPanel.add(componentGenerator.createLabel("username"));
        mainPanel.add(componentGenerator.createTextField(Constants.FORM_TEXT_FIELD_WIDTH));
        mainPanel.add(componentGenerator.createLabel("Password"));
        mainPanel.add(componentGenerator.createPasswordField(Constants.FORM_TEXT_FIELD_WIDTH));
        mainPanel.add(componentGenerator.createLabel("Confirm password"));
        mainPanel.add(componentGenerator.createPasswordField(Constants.FORM_TEXT_FIELD_WIDTH));
        mainPanel.add(componentGenerator.createButton("Register"));
        mainPanel.add(componentGenerator.createButton("Login"));
        mainPanel.add(componentGenerator.createButton("Cancel"));

        // Add main panel to frame
        getContentPane().add(mainPanel);
    }
}