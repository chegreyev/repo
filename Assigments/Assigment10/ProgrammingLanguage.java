package Assigments.Assigment10;

public class ProgrammingLanguage {
    static int numberOfLanguages = 0;
    static String language = "";

    ProgrammingLanguage(){
        numberOfLanguages++;
    }

    public static void main(String[] args) {
        ProgrammingLanguage PL[] = new ProgrammingLanguage[5];
        String languages[] = {"Java" , "C++" , "Python" , "Ruby" , "Swift"};

        for (int i = 0; i < 5; i++) {
            PL[i] = new ProgrammingLanguage();
            PL[i].language += languages[i];
            System.out.println("Number of languages : " + PL[i].numberOfLanguages + " Languages: " + PL[i].language);
        }

    }
}