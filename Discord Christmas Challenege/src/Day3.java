import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;

class Day3 {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("C:\\Users\\mneem\\Documents\\GitHub\\Misc\\Discord Christmas Challenege\\src\\snowman.jpg");
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



        System.out.print("   _==_ _\n");
        System.out.print(" _,(\",)|_|\n");
        System.out.print("  \\/. \\-|\n");
        System.out.print("__( :  )|_\n");

    }
}