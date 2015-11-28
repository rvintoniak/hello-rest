package beans;

/**
 * Created by Roman on 28.11.2015.
 */
public class ResponseWrapper {
    private MainInfo mainInfo;

    public ResponseWrapper() {
    }

    public ResponseWrapper(MainInfo mainInfo) {
        this.mainInfo = mainInfo;
    }

    public MainInfo getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(MainInfo mainInfo) {
        this.mainInfo = mainInfo;
    }
}
