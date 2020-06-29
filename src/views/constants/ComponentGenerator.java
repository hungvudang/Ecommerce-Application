package views.constants;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 * @author Ngoc
 */

public class ComponentGenerator {
    private static ComponentGenerator componentGenerator;

    private ComponentGenerator() {

    }

    /**
     * Get component generator, which is only one in this software
     * 
     * @return componentGenerator
     */
    public static ComponentGenerator getCompomentGenerator() {
        if (componentGenerator == null) {
            componentGenerator = new ComponentGenerator();
        }
        return componentGenerator;
    }

    /**
     * Create new frame with given frame name
     * 
     * @param frameName
     * @param width
     * @param height
     * @return frame
     */
    public JFrame createFrame(String frameName, int width, int height) {
        JFrame frame = new JFrame(frameName);
        frame.setSize(width, height);
        return frame;
    }

    /**
     * Create new panel
     * 
     * @return panel
     */
    public JPanel createPanel() {
        return new JPanel();
    }

    /**
     * Create new text field
     * 
     * @param textFieldWidth
     * @return text field
     */
    public JTextField createTextField(int textFieldWidth) {
        return new JTextField(textFieldWidth);
    }

    /**
     * Create new password field
     * 
     * @param passwordFieldWidth
     * @return password field
     */
    public JPasswordField createPasswordField(int passwordFieldWidth) {
        return new JPasswordField(passwordFieldWidth);
    }

    /**
     * Create new label with given text
     * 
     * @param labelText
     * @return label
     */
    public JLabel createLabel(String labelText) {
        return new JLabel(labelText);
    }

    /**
     * Create new label with given text & icon
     * 
     * @param labelText
     * @param iconPath
     * @return label with icon
     */
    public JLabel createLabel(String labelText, String iconPath) {
        JLabel label = new JLabel(labelText);
        label.setIcon(new ImageIcon(iconPath));
        return label;
    }

    /**
     * Create new label contain image
     * 
     * @param imagePath
     * @param width
     * @param height
     * @return label contain image
     */
    public JLabel createImage(String imagePath, int width, int height) {
        JLabel label = new JLabel(new ImageIcon(getClass().getResource(imagePath)));
        label.setSize(width, height);
        return label;
    }

    /**
     * Create new scroll pane
     * 
     * @param width
     * @param height
     * @return scroll pane
     */
    public JScrollPane createScrollPane(int width, int height) {
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setSize(width, height);
        return scrollPane;
    }

    /**
     * Create new button with given text
     * 
     * @param text
     * @return button
     */
    public JButton createButton(String text) {
        return new JButton(text);
    }

    /**
     * Create new button with given text & icon
     * 
     * @param text
     * @param iconPath
     * @return button with icon
     */
    public JButton createButton(String text, String iconPath) {
        return new JButton(text, new ImageIcon(iconPath));
    }

}