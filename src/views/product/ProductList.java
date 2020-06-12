package views.product;

import javax.swing.JFrame;
import javax.swing.JPanel;

import views.constants.ComponentGenerator;
import views.constants.Constants;

/**
 * ProductList
 */
public class ProductList extends JFrame {

    private ComponentGenerator componentGenerator = ComponentGenerator.getCompomentGenerator();

    public ProductList() {
        initComponents();
        setSize(Constants.F_WIDTH, Constants.F_HEIGHT);
        setVisible(true);
    }

    private void initComponents() {

        // Create main panel
        JPanel mainPanel = componentGenerator.createPanel();

        // Add components to panel
        for (int i = 0; i < 10; i++) {
            mainPanel.add(new ProductItem("/res/product_images/phone.jpg", "V-smart phone", 5000000));
        }

        // Add main panel to frame
        getContentPane().add(mainPanel);
    }

//    public static void main(String[] args) {
//        new ProductList();
//    }

}