package denominationcalculator;

/**
 *
 * @author OH.Rifat
 */
public class DenominationCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomePage h = new HomePage();
        h.setVisible(true);
        h.setLocationRelativeTo(null);
        h.setLocationRelativeTo(null);
        int i = 0;
        try {
            while (i <= 100) {
                // fill the menu bar
                h.jProgressBar1.setValue(i);

                // delay the thread
                Thread.sleep(100);
                i = i + 2;

            }
            new Denomination().setVisible(true);
            h.setVisible(false);
        } catch (Exception e) {
        }

    }
}
