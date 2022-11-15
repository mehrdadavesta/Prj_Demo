import javax.swing.*;

public class ButtonDemo {

    public static void main ( String[] args ) {
        JLabel jlable=new JLabel ( "demo sample button" );
        JFrame frame =new JFrame ( "demo project sample" );
        frame.getContentPane ().add ( jlable );
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        frame.setSize ( 400,400 );
        frame.setVisible ( true );



    }
}
