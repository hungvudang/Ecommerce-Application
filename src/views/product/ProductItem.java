package views.product;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import views.constants.ComponentGenerator;
import views.constants.Constants;

public class ProductItem extends JPanel {

    private ComponentGenerator componentGenerator = ComponentGenerator.getCompomentGenerator();

    public ProductItem(String imagePath, String name, int price) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(componentGenerator.createImage(imagePath, Constants.PROD_ITEM_WIDTH, Constants.PROD_ITEM_HEIGHT));
        add(componentGenerator.createLabel(name));
        add(componentGenerator.createLabel(Integer.toString(price) + " vnd"));
    }

}