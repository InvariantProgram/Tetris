import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TetrisMain extends JComponent implements Runnable {
    private TetrisMain tetrisMain;

    public TetrisMain() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                System.out.println(e);
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getPoint());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println(e.getPoint());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new TetrisMain());
    }
    public void run() {
        JFrame frame = new JFrame("Tetris");
        tetrisMain = new TetrisMain();
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    protected void paintComponent(Graphics g) {
    }

}
