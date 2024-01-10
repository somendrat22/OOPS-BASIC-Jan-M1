import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Method overriding polymorphism -> Runtime PolyMorphism also
        // object of samsung class and refrence is of phone class
        // Will i be able to access a variable ?
//        List<Integer> li = new ArrayList<>();
//        Phone p = new Samsung();
//        p.call();
//        SBI sbi = new SBI();
//        sbi.deposit();
//        sbi.withdraw();
//        Bank b = new SBI();

        FaceBookUser user1 = new FaceBookUser("Somendra", "tiwarisomendra22@gmail.com", "123456", new ArrayList<>());
        user1.setPassword("cbcecbevbe");
        List<String> photos  = user1.getPhotos();

        Mercedes m = new Samsung();
        m.hey();

    }
}