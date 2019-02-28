import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class kan {

    public static void main(String[] args) {

        Chen c=new Chen();
        Chen c2=fan();
        c.setCc("fdfsd");


        Object wu = Optional.of(c).map(s ->
            s.getCc()
        ).orElse("fd");

        Object wu1 = Optional.ofNullable(c2).map(s ->
                 c2.getCc()
        ).orElse("无");


        System.out.println(wu);
        System.out.println(wu1);
    }

    public static Chen fan(){
        return null;
    }
}

class Chen{
    private String cc;

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}

