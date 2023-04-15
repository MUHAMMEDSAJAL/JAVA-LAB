import java.awt.*;
import java.awt.event.*;
public class KeyAdapterExample extends KeyAdapter {
    Label Label;
    TextArea textArea;
    Frame frame;
    KeyAdapterExample() {
        frame = new Frame("Key Adapter");
        Label = new Label();
        Label.setBounds(20, 50, 200, 20);
        textArea = new TextArea();
        textArea.setBounds(20, 80, 300, 300);
        textArea.addKeyListener(this);
        frame.add(Label);
        frame.add(textArea);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void keyReleased(KeyEvent e) {
        String text = textArea.getText();
        String words[] = text.split("\\s");
        Label.setText("Words: " + words.length + " Characters:" + text.length());
    }
    public static void main(String[] args) {
        new KeyAdapterExample();
    }
}