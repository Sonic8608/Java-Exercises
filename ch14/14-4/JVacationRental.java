import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JVacationRental extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    String companyName = new String("Lambert's Vacation Rentals");
    Font bigFont = new Font("Arial", Font.PLAIN, 24);

    final int PARKPRICE = 600, POOLPRICE = 750, LAKEPRICE = 825;
    int totalPrice = 0;
    int value = 0;
    int value2 =0;
    int value3 = 0;
    ButtonGroup locationGrp = new ButtonGroup();
    JCheckBox parkBox = new JCheckBox("Parkside", false);
    JCheckBox poolBox = new JCheckBox("Poolside", false);
    JCheckBox lakeBox = new JCheckBox("Lakeside", false);

    final int ONEPRICE = 0, TWOPRICE = 75, THREEPRICE = 150;
    ButtonGroup bdrmGrp = new ButtonGroup();
    JCheckBox oneBox = new JCheckBox("1 bedroom", false);
    JCheckBox twoBox = new JCheckBox("2 bedrooms", false);
    JCheckBox threeBox = new JCheckBox("3 bedrooms", false);

    final int NOMEALSPRICE = 0, MEALSPRICE = 200;
    ButtonGroup mealGrp = new ButtonGroup();
    JCheckBox noMealsBox = new JCheckBox("No meals", false);
    JCheckBox mealsBox = new JCheckBox("Meals included", false);

    JTextField totPrice = new JTextField(10);
    String output;
    public JVacationRental() {
        setTitle(companyName);
        setLayout(flow);
       locationGrp.add(parkBox);
       locationGrp.add(poolBox);
       locationGrp.add(lakeBox);
       add(parkBox);
       add(poolBox);
       add(lakeBox);
       parkBox.addItemListener(this::itemStateChanged);
       poolBox.addItemListener(this::itemStateChanged);
       lakeBox.addItemListener(this::itemStateChanged);

       bdrmGrp.add(oneBox);
       bdrmGrp.add(twoBox);
       bdrmGrp.add(threeBox);
       add(oneBox);
       add(twoBox);
       add(threeBox);
       oneBox.addItemListener(this::itemStateChanged);
       twoBox.addItemListener(this::itemStateChanged);
       threeBox.addItemListener(this::itemStateChanged);

       mealGrp.add(noMealsBox);
       mealGrp.add(mealsBox);
       add(noMealsBox);
       add(mealsBox);
       mealsBox.addItemListener(this::itemStateChanged);
       noMealsBox.addItemListener(this::itemStateChanged);

        add(totPrice);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] arguments) {
        JVacationRental aFrame = new JVacationRental();
        aFrame.setSize(320, 200);
        aFrame.setVisible(true);

    }
    @Override
    public void itemStateChanged(ItemEvent check) {

        Object source = check.getItem();
        if(source == parkBox)
            value = 600;
        else
            if (source == poolBox)
                value = 750;
            else
                if (source == lakeBox)
                    value = 825;
                else
                    if (source == oneBox)
                        value2 = 0;
                    else
                        if (source == twoBox)
                            value2 = 75;
                        else
                            if (source == threeBox)
                                value2 = 150;
                            else
                                if (source == mealsBox)
                                    value3 = 200;
                                else
                                    if (source == noMealsBox)
                                        value3 = 0;

totalPrice = (value+value2+value3);

        totPrice.setText(String.valueOf(totalPrice));
    }
}
