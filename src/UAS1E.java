import java.util.ArrayList;

public class UAS1E {

    private String UserID;
    private String UserName;

    private ArrayList<String> MY_MESSAGES;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public ArrayList<String> getMY_MESSAGES() {
        return MY_MESSAGES;
    }

    public void setMY_MESSAGES(ArrayList<String> MY_MESSAGES) {
        this.MY_MESSAGES = MY_MESSAGES;
    }
    public UAS1E(String ID, String usr, ArrayList<String> MY_MESSAGES){
        this.UserID= ID;
        this.UserName= usr;
        this.MY_MESSAGES= MY_MESSAGES;
    }

    public static void main(String[] args) {
        UAS1E social=  new UAS1E(String 001,String usr,ArrayList<String> MY_MESSAGES);
        social.setUserID("001");
        social.setUserName("@whitehat");


        ArrayList<String> messages = new ArrayList<>();
        messages.add("HALOOO");
        messages.add("ARIGATOO...");
        messages.add("HEY!!!");



    }
}


