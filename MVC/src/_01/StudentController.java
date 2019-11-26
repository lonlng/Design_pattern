package _01;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentsName(String Name) {
        model.setName(Name);
    }

    public void setStudentRollNo(String RolloName) {
        model.setRollNo(RolloName);
    }
    public void setStudentAge(int age){
        model.setAge(age);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo(),model.getAge());
    }


}
