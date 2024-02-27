import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JLabel Label;

    public Menu(){
        initComponents();
    }
    public void initComponents(){
        setTitle("Menu Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Vytvoření menu baru
        JMenuBar menuBar = new JMenuBar();

        // Vytvoření položek menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");


        JMenuItem welcomeItem = new JMenuItem("Welcome");

        // Přidání akce k položce Welcome
        welcomeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Menu.this, "Welcome");
            }
        });

        // Přidání položky Welcome do menu
        fileMenu.add(welcomeItem);

        // Přidání akcí k jednotlivým položkám menu
        exitItem.addActionListener(e -> System.exit(0));

        // Přidání položek do menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Oddělovač mezi položkami
        fileMenu.add(exitItem);
        fileMenu.add(welcomeItem);

        // Přidání menu do menu baru
        menuBar.add(fileMenu);

        // Přidání obyčejného textu vedle menu "File"
        JLabel textLabel = new JLabel("Hi");
//        menuBar.add(Box.createHorizontalGlue()); Posune Wolcome na konec baru
        menuBar.add(textLabel);

        // Nastavení menu baru v okně
        setJMenuBar(menuBar);


    }
}