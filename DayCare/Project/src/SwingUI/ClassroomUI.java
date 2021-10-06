package SwingUI;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

import edu.neu.csye6200.DaycareSingleton;
import edu.neu.csye6200.Immunization;
import edu.neu.csye6200.Person;
import edu.neu.csye6200.Student;
import edu.neu.csye6200.Teacher;
import edu.neu.csye6200.DaycareSingleton.UserType;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ClassroomUI {

	public static JFrame jf = new JFrame("Classroom Situation");

	public static Integer yearOfSelected = 2018;

	public ClassroomUI() {

		DaycareSingleton.getInstance().initializeData();

		//JFrame jf = new JFrame("Classroom Situation");

		jf.setBounds(100, 100, 800, 500);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		Person person = DaycareSingleton.getInstance().getCurrentUserData();


		Map<Integer,Integer> GC = new HashMap<>();
		GC.put(1, 1);
		GC.put(2, 1);
		GC.put(3, 1);
		GC.put(4, 2);
		GC.put(5, 2);
		GC.put(6, 3);
		GC.put(7, 3);

		JLabel l3 = new JLabel("Classroom ID: " + GC.get(DaycareSingleton.getInstance().getGroupID()));
		l3.setBounds(30, 20, 150, 20);



		//JLabel l3 = new JLabel("Classroom ID: " + DaycareSingleton.getInstance().getClassroomID());
		//l3.setBounds(30, 20, 150, 20);

		JLabel l4 = new JLabel("User Name: " + person.getFirstName() + " " + person.getLastName());
		l4.setBounds(170, 20, 200, 20);

		JLabel lab01 = new JLabel("Year of Record: ");
		lab01.setBounds(400, 20, 130, 20);

		String[] listYear = new String[] { "2018", "2019", "2020", "2021" };

		//SelectYear
		for (int i = 0; i < listYear.length; i++){
			String stryeat = listYear[i];
			if(stryeat.equals(String.valueOf(yearOfSelected))){
				String temp = listYear[0];
				listYear[0] = stryeat;
				listYear[i] = temp;
			}
		}

		final JComboBox<String> comboBox = new JComboBox<String>(listYear);
		comboBox.setBounds(505, 20, 100, 20);

		JButton btn06 = new JButton("Refresh");
		btn06.setBounds(650, 20, 100, 15);


		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == ItemEvent.SELECTED) {
					String yearString = (String) comboBox.getSelectedItem();
					DaycareSingleton.getInstance().setSelectYear(Integer.valueOf(yearString));
					yearOfSelected = Integer.valueOf(yearString);

				}
			}
		});

		//jf.add(ImmunizationSituationUI);
		//panel.add(ImmunizationSituationUI.frame);

		btn06.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				//ImmunizationSituationUI.showDetaiStatus();
				ImmunizationSituationUI.updateTableData(false);
				ClassroomUI homepage = new ClassroomUI();
			}
		});
		JButton Back = new JButton("Back");
		Back.setBounds(650, 40, 100, 15);
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				//LogInUI.initializeLoginView();
//				MyLoginGUI.initializeLoginView();
                               new MyLoginGUI().setVisible(true);
			}
		});
		panel.add(Back);
		panel.add(lab01);
		panel.add(comboBox);
		panel.add(l3);
		panel.add(l4);
		panel.add(btn06);

		jf.setContentPane(panel);
		jf.setVisible(true);
		ImmunizationSituationUI.showDetaiStatus();
		DaycareSingleton.getInstance().setClassroomUIFrame(jf);
	}
}
