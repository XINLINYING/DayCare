package edu.neu.csye6200;

import java.io.*;

public class Manager extends Person {
    int ManagerId = 6200;
    int Password = 6200;


    public int getManagerId() {
        return ManagerId;
    }


    public int getPassword() {
        return Password;
    }

    public void hireTeacher(String teacher){
        String file = "teacherCSV.csv";
        BufferedWriter out = null ;
        try  {
            out = new  BufferedWriter( new OutputStreamWriter(
            		new FileOutputStream(file,  true )));
            out.write(teacher);
            out.newLine();
        } catch  (Exception e) {
            e.printStackTrace();
        } finally  {
            try  {
                out.close();
            } catch  (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void addStudent(String student){
        String file = "studentCSV.csv";
        BufferedWriter out = null ;
        try  {
            out = new  BufferedWriter( new OutputStreamWriter(
                    new FileOutputStream(file,  true )));
            out.write(student);
            out.newLine();
        } catch  (Exception e) {
            e.printStackTrace();
        } finally  {
            try  {
                out.close();
            } catch  (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void showStudent(){
        String fileName = "studentCSV.csv";
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            System.out.println("浠ヨ涓哄崟浣嶈鍙栨枃浠跺唴瀹癸紝涓�娆¤涓�鏁磋锛�");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 涓�娆¤鍏ヤ竴琛岋紝鐩村埌璇诲叆null涓烘枃浠剁粨鏉�
            while ((tempString = reader.readLine()) != null) {
                // 鏄剧ず琛屽彿
                System.out.println("line " + line + ": " + tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
    public void showTeacher(){
        String fileName = "teacherCSV.csv";
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            System.out.println("浠ヨ涓哄崟浣嶈鍙栨枃浠跺唴瀹癸紝涓�娆¤涓�鏁磋锛�");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 涓�娆¤鍏ヤ竴琛岋紝鐩村埌璇诲叆null涓烘枃浠剁粨鏉�
            while ((tempString = reader.readLine()) != null) {
                // 鏄剧ず琛屽彿
                System.out.println("line " + line + ": " + tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

}
