package ayman.example.retrofit;

/**
 * Created by zero on 1/16/2018.
 */
//todo:(2)identify DataMode item
public class DataMode {

    private String changeTime ;
    private  int changeTypeSell ;
    private  int changeTypeBuy;
    private  String oldBuy ;
    private  String oldSell ;

    public String getChangeTime() {
        return changeTime;
    }

    public int getChangeTypeSell() {
        return changeTypeSell;
    }

    public int getChangeTypeBuy() {
        return changeTypeBuy;
    }

    public String getOldBuy() {
        return oldBuy;
    }

    public String getOldSell() {
        return oldSell;
    }
}
