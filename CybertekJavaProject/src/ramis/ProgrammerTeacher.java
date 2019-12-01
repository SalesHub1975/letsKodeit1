package ramis;

import java.util.Properties;

public class ProgrammerTeacher extends Programmer{

    public boolean teach(Programmer programmer, String language){
        if(!programmer.getLanguages().contains(language)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        ProgrammerTeacher teacher = new ProgrammerTeacher();
        teacher.addLanguage("Java");

        Programmer programmer = new Programmer();
        teacher.teach(programmer, "Java");

        for(String language : programmer.getLanguages())
        System.out.println(language);

    }
}
