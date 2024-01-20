package software.ulpgc;

import software.ulpgc.swing.Mainframe;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CsvFileNetflixUserbaseLoader loader = new CsvFileNetflixUserbaseLoader(new File("C:\\Users\\miica\\IdeaProjects\\kata7\\Netflix Userbase.csv"));
        List<NetflixUserbase> list = loader.load();
        Map<String, Integer> process = new CountryNetflixUserbaseProcessor().process(list);

        Histogram usersPerCountryOnNetflix = new Histogram("Users per country on Netflix", "Country", "Users", process);
        Mainframe mainframe = new Mainframe();
        mainframe.getHistogramDisplay().show(usersPerCountryOnNetflix);
        mainframe.setVisible(true);
    }
}