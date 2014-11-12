import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;




public class buttons extends JPanel {
	
	  static JFrame frame;
	    static String first = new String("Small");
	    static String second = new String("Medium");
	    static String third = new String("Large");

	    public buttons() {
		super(true);
		
		JRadioButton firstButton = new JRadioButton(first);
	        firstButton.setKeyAccelerator('1'); 
		firstButton.setActionCommand(first);
		firstButton.setSelected(true);

		JRadioButton secondButton = new JRadioButton(second);
	        secondButton.setKeyAccelerator('2'); 
		secondButton.setActionCommand(second);
		
		JRadioButton thirdButton = new JRadioButton(third);
        thirdButton.setKeyAccelerator('3'); 
        thirdButton.setActionCommand(third);

		
		javax.swing.ButtonGroup group = new ButtonGroup();
		group.add(firstButton);
		group.add(secondButton);
		group.add(thirdButton);

	    
		RadioListener myListener = new RadioListener();
		firstButton.addActionListener(myListener);
		firstButton.addChangeListener(myListener);
		firstButton.addItemListener(myListener);
		secondButton.addActionListener(myListener);
		secondButton.addChangeListener(myListener);
		secondButton.addItemListener(myListener);
		thirdButton.addActionListener(myListener);
		thirdButton.addChangeListener(myListener);
		thirdButton.addItemListener(myListener);

		add(firstButton);
		add(secondButton);
		add(thirdButton);
	    }
}


