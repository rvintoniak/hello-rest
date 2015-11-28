package beans;

/**
 * Created by Roman Vintonyak
 */
public class MainInfo {
    private String teamName;
    private String version;

    public MainInfo() {
    }

    public MainInfo(String teamName, String version) {
        this.teamName = teamName;
        this.version = version;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
