/**
 * Untuk memanggil masing-masing class yang diinginkan
 */
public class run {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grid();
            }
        });
    }
}