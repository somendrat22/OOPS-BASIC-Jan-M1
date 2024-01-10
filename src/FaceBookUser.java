import java.util.List;

public class FaceBookUser {
    String name;
    String email;
    private String password;
    private List<String> photos;

    public FaceBookUser(String name, String email, String password, List<String> photos) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.photos = photos;
    }

    public void setPassword(String pass){
        this.password = pass;
    }

    public List<String> getPhotos(){
        return photos;
    }
}
