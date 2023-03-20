import java.util.ArrayList;
import java.util.List;

public class LL {
    public static void main(String[] args) {
        // membuat objek List Hewan
        List<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        
        System.out.println("Hewan \n" + Hewan);
        
        List<String> HewanDelete = new ArrayList<>();
        HewanDelete.add("Kelinci");
        HewanDelete.add("Kambing");
        HewanDelete.add("Unta");
        
        System.out.println("Hewan yang dihapus: \n" + HewanDelete);
        
        Hewan.removeAll(HewanDelete);
        
        System.out.println("Output Hewan: " + Hewan);
    }
}
