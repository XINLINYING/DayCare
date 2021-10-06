package SwingUI;

import edu.neu.csye6200.CSVdata;
import edu.neu.csye6200.DaycareSingleton;
import edu.neu.csye6200.Student;
import edu.neu.csye6200.Teacher;
import edu.neu.csye6200.DaycareSingleton.UserType;

import java.util.ArrayList;
import java.util.List;

public class ModifyPwdController {
	private ModifyPwdView pwdView;
	public static List<String> falseVaccineStatus = new ArrayList<>();

	public static void setupModifyViewController(List<String> falseVaccineStatusList) {

		ModifyPwdController modifyPwdController = new ModifyPwdController();
		falseVaccineStatus = ImmunizationSituationUI.falseVaccineStatusList;
	}

	public ModifyPwdController() {
		super();
		setupView();
	}

	private void setupView() {
		pwdView = ModifyPwdView.showPWDView(this);
	}

	public void onClickConfirmBtn() {

		pwdView.setVisible(false);
		DaycareSingleton.getInstance().getImmuneFrame().setVisible(true);

		//modifyUserData(pwdView.getPwdString());
	}

//	private void modifyUserData(String pwdString) {
//
//		if (DaycareSingleton.getInstance().userType == UserType.STUDENT) {
//
//			for (Student student : DaycareSingleton.getInstance().getDataStore().getStudentList()) {
//				if (student.getStuId() == DaycareSingleton.getInstance().getUserID()) {
//					student.setPwd(pwdString);
//				}
//			}
////			update csv
//			CSVdata.writeStudentFile();
//
//		} else {
//
//			for (Teacher teacher : DaycareSingleton.getInstance().getDataStore().getTeacherList()) {
//				if (teacher.getTeacherId() == DaycareSingleton.getInstance().getUserID()) {
//					teacher.setPwd(pwdString);
//				}
//			}
////			update csv
//			CSVdata.writeTeacherFile();
//		}
//	}
}
