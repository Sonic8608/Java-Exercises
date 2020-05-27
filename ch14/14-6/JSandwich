import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JSandwich extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
    JLabel companyName = new JLabel("Sublime Sandwich");
    String[] box1 = {"chicken","beef","tuna"};
    JComboBox mainBox = new JComboBox(box1);
    String[] box2 = {"white","rye","whole wheat"};
    JComboBox breadBox = new JComboBox(box2);
    JLabel sel = new JLabel("----------------------------------------------");
    JLabel mainList = new JLabel("Main ingredient");
double value = 0;
    JLabel breadList = new JLabel("Breads");
    JTextField totPrice = new JTextField(10);
    int mainNum, breadNum;

    double[] mainPrices = {6.99, 7.99, 8.99};
    double sumPrice = mainPrices[0];
    double breadPrice = 0;
    double mainPrice = mainPrices[0];
    double[] breadPrices = {0, 0, 0};
    String output;
    public JSandwich() {

        add(companyName);
        add(sel);
setLayout(flow);

        add(mainList); //name of ingredients
        add(mainBox);
        mainBox.addItemListener(this::itemStateChanged);

        add(sel);
        add(breadList); //name
        add(breadBox);




        add(totPrice);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] arguments) {
        JSandwich sandframe = new JSandwich();
        sandframe.setSize(240, 200);
        sandframe.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent list) {
        Object getitem = mainBox.getSelectedItem();
        if (getitem.equals(box1[0]))
        value = 6.99;
        else
            if (getitem.equals(box1[1]))
                value = 7.99;
            else
                if (getitem.equals(box1[2]))
                    value = 8.99;

                totPrice.setText("$" + value);

    }
}
