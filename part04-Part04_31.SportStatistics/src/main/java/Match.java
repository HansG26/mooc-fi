
public class Match {
    
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int awayPoints;
    
    public Match(String homeTeam, String visitingTeam, int homePoints, int awayPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitingTeam() {
        return this.visitingTeam;
    }
    
    public int getHomePoints() {
        return this.homePoints;
    }
    
    public int getAwayPoints() {
        return this.awayPoints;
    }
    
    @Override
    public String toString() {
        return this.homeTeam + ", " + this.visitingTeam + ", " + this.homePoints + ", " + this.awayPoints;
    }
}
