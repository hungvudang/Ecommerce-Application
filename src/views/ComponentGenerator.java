package views;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ComponentGenerator {
    private ComponentGenerator componentGenerator;

    private ComponentGenerator() {

    }

    /**
     * Get component generator, which is only one in this software
     * 
     * @return componentGenerator
     */
    public ComponentGenerator getCompomentGenerator() {
        if (componentGenerator == null) {
            componentGenerator = new ComponentGenerator();
        }
        return componentGenerator;
    }

    /**
     * Create new frame with given frame name
     * 
     * @param frameName
     * @return frame
     */
    public JFrame createFrame(String frameName) {
        return new JFrame(frameName);
    }

    /**
     * Create new text field
     * 
     * @return text field
     */
    public JTextField createTextField() {
        return new JTextField();
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
     * @param icon
     * @return label with icon
     */
    public JLabel createLabel(String labelText, Icon icon) {
        JLabel label = new JLabel(labelText);
        label.setIcon(icon);
        return label;
    }

    /**
     * Create new label contain image
     * 
     * @param imagePath
     * @return label contain image
     */
    public JLabel createImage(String imagePath) {
        return new JLabel(new ImageIcon(imagePath));
    }

    /**
     * Create new scroll pane
     * 
     * @return scroll pane
     */
    public JScrollPane createScrollPane() {
        return new JScrollPane();
    }

}