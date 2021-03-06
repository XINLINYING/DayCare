package SwingUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import edu.neu.csye6200.CSVdata;
import edu.neu.csye6200.DaycareSingleton;
import edu.neu.csye6200.Person;
import edu.neu.csye6200.Teacher;

public class ModifyPwdView extends JFrame {

	public static ModifyPwdView showPWDView(ModifyPwdController pwdController) {

		ModifyPwdView modifyPwdView = new ModifyPwdView();
		modifyPwdView.controller = pwdController;
		modifyPwdView.setBackground(Color.BLUE);
		modifyPwdView.setBounds(100, 100, 800, 500);
		modifyPwdView.setVisible(true);
		return modifyPwdView;
	}

	public ModifyPwdView() throws HeadlessException {
		super();
		setupView();
	}

	private void setupView() {

		JPanel mainJPanel = new JPanel();
		mainJPanel.setLayout(null);
		this.add(mainJPanel);

		String reminderText = "";
		String reminderTeacher = "Teacher should be reviewed. \n";
		if(ImmunizationSituationUI.falseVaccineStatusList.size() == 0){
			List<Teacher> teachers = CSVdata.readTeacherData();
			int i  = DaycareSingleton.getInstance().getUserID();
			//System.out.println(person);
			//int i =person.getPersonID();
			System.out.println(i);
			int a= teachers.get(i-1).getHireddate();
			System.out.println(a);
			if (20200817-a>10000){
				System.out.println("ssssss");
		        JLabel labelTeacherRemnider = new JLabel(reminderTeacher);
		        labelTeacherRemnider.setBounds(10, 10, 800, 100);
		        labelTeacherRemnider.setFont(new Font("Serif", Font.ITALIC, 20));
		        mainJPanel.add(labelTeacherRemnider);		        
				reminderText = "Students' vaccination Records are good!";
			}else {
				reminderText = "Students' vaccination Records are good!";
			}
		}else{

			List<Teacher> teachers = CSVdata.readTeacherData();
			Person person = DaycareSingleton.getInstance().getCurrentUserData();
			int i =person.getPersonID();
			//int i=0;
			int a= teachers.get(i).getHireddate();
			if (20200817-a>10000){
		        JLabel labelTeacherRemnider = new JLabel(reminderTeacher);
		        labelTeacherRemnider.setBounds(10, 10, 800, 100);
		        labelTeacherRemnider.setFont(new Font("Serif", Font.ITALIC, 20));
		        mainJPanel.add(labelTeacherRemnider);
		        
				reminderText = "There are " + ImmunizationSituationUI.falseVaccineStatusList.size() +
						" student/students need to get vaccinated, student id: "+"\n";
			}else {
				reminderText = "There are " + ImmunizationSituationUI.falseVaccineStatusList.size() +
						" student/students need to get vaccinated, student id: ";
			}
			for(String str :  ImmunizationSituationUI.falseVaccineStatusList){
				reminderText += str + " ";
			}				
		}

        JLabel labelRemnider = new JLabel(reminderText);
        labelRemnider.setBounds(10, 10, 800, 300);
        labelRemnider.setFont(new Font("Serif", Font.ITALIC, 20));
        mainJPanel.add(labelRemnider);
		
//		JTextArea titleJTextArea = new JTextArea(reminderText);
//		titleJTextArea.setBounds(300, 80, 200, 200);
//		titleJTextArea.setFont(new Font("Serif", Font.ROMAN_BASELINE, 20));
//		titleJTextArea.setLineWrap(true);
//		titleJTextArea.setWrapStyleWord(true);
//		mainJPanel.add(titleJTextArea);

//		JTextField pwd1 = new JTextField("New PWD");
//		pwd1.setBounds(300, 100, 200, 50);
//		mainJPanel.add(pwd1);
//
//		JTextField pwd2 = new JTextField("Confirm PWD");
//		pwd2.setBounds(300, 150, 200, 50);
//		mainJPanel.add(pwd2);

		JButton confirmButton = new JButton("Back");
		confirmButton.setBounds(300, 300, 200, 50);
		mainJPanel.add(confirmButton);

		confirmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

//				if (!pwd1.getText().equals(pwd2.getText())) {
//					Object[] options = { "OK" };
//					JOptionPane.showOptionDialog(null, "Click OK to continue", "PLEASE INPUT SAME PWD",
//							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
//				} else {
//					setPwdString(pwd1.getText());
//					controller.onClickConfirmBtn();
//				}

				//setPwdString(pwd1.getText());
				controller.onClickConfirmBtn();
			}
		});
	}

	public ModifyPwdView(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public ModifyPwdView(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public ModifyPwdView(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public String getPwdString() {
		return pwdString;
	}

	public void setPwdString(String pwdString) {
		this.pwdString = pwdString;
	}

	private String pwdString;
	private ModifyPwdController controller;
	private static final long serialVersionUID = 1L;


}
