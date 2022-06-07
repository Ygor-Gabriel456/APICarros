import java.awt.*;

public class ResoluçãoTela {
    public static void main(String[] args) {
        Toolkit tk =  Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("O seu notbook tem uma tela de..." + d.width+ "x" + d.height);

    }

}
