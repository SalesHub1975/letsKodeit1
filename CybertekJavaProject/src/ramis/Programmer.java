package ramis;

import java.util.ArrayList;
import java.util.List;

    public class Programmer {

        private static List<String> languages = new ArrayList<>();

    public List<String> getLanguages(){
        return this.languages;
    }

    public void addLanguage(String language){
        this.languages.add(language);
    }

}
