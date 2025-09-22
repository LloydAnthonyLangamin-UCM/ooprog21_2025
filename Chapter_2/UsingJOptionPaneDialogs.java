import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        String name;
        int choice;

        while (true) {
            name = JOptionPane.showInputDialog(null, "What is your name?",
                                               "Input Name", JOptionPane.QUESTION_MESSAGE);
            
            if (name == null) {
                JOptionPane.showMessageDialog(null, "Program exited.", "Exit", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            choice = JOptionPane.showConfirmDialog(null, "Do you want your name to be shown?",
                                                   "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name,
                                              "Name Display", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
}