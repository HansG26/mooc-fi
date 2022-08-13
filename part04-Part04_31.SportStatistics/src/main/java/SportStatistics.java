
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Match> matches = readMatchStatistics(file);
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        int games = 0;
        
        for (Match match: matches) {
            if (match.getHomeTeam().equals(team) || match.getVisitingTeam().equals(team)) {
                games++;
            }
        }
        
        System.out.println("Games: " + games);
        
    }
    
    public static ArrayList<Match> readMatchStatistics(String file) {
        
        ArrayList<Match> matches = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                String[] parts = line.split(",");
                
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                
                matches.add(new Match(homeTeam, awayTeam, homePoints, awayPoints));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        return matches;
    }

}
