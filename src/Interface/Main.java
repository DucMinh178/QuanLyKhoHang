package Interface;

public class Main {

    public static LoginFrame frmLogin;//static vaiable to call later

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        frmLogin = new LoginFrame();
        frmLogin.setVisible(true);
    }

}
