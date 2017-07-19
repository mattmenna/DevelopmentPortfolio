import java.util.ArrayList;

public class Skills {
    public ArrayList<String> skillList = new ArrayList<>();

    public Skills() {
        skillList.add("Math and Physics Background");
        skillList.add("Excellent Communication Skills");
        skillList.add("Java 8 with IntelliJ IDE");
        skillList.add("Spring Framework");
        skillList.add("JavaScript, CSS, HTML");
        skillList.add("Hibernate Framework");
        skillList.add("Version Control with GIT");
        skillList.add("MySQL");
        skillList.add("Autodesk Inventor (3D Modeling)");
        skillList.add("C++ and Fortran");
        skillList.add("Math and Physics Background");
        skillList.add("LaTex");
    }

    public ArrayList<String> getSkillList() {
        return skillList;
    }

    public void setSkillList(ArrayList<String> skillList) {
        this.skillList = skillList;
    }
}
