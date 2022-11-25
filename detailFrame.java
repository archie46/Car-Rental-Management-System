import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class detailFrame implements ActionListener {

    JFrame j;
//    JLabel name = new JLabel("Name :");
//    JLabel car_no = new JLabel("Car Number :");
//    JLabel model = new JLabel("Model :");
//    JLabel color = new JLabel("Color :");
//    JLabel mf_year = new JLabel("Manufacture Year :");
//    JLabel car_type = new JLabel("Car Type :");
//    JLabel airbag = new JLabel("AirBags :");
//    JLabel seats = new JLabel("Number Of Seats :");
//    JLabel gear = new JLabel("Gear :");
//    JLabel mileage = new JLabel("MileAge");

    JLabel[]    details_desc = new JLabel[11];
    JTextField[] details = new JTextField[11];
    JLabel time = new JLabel("Time");
    JTextField t_field = new JTextField();
    JButton book,back;
    static int x ;
    static int y ;
    int hval;
    detailFrame(int val){
        hval = val;
        x =100;
        y =30;
        j = new JFrame("Details Of The Car");
        for(int i =0 ;i<mainFrame.car_p.size();i++){
            details_desc[i] = new JLabel(mainFrame.car_p.get(i));
            details[i] = new JTextField(mainFrame.car_list.get(val).car_a_details.get(i));
            details[i].setBounds(x+400,y,200,30);
            details[i].setEditable(false);
            details_desc[i].setBounds(x,y,200,30);
            j.add(details_desc[i]);
            j.add(details[i]);
            y+=40;
        }
//        name.setBounds(100,30,100,30);
//        j.add(name);
        back = new JButton("BACK");
        book = new JButton("BOOK");
        j.add(t_field);
        j.add(time);
        time.setBounds(x,y,100,30);
        t_field.setBounds(x+400,y,100,30);
        j.add(back);
        j.add(book);
        back.addActionListener(this);
        book.addActionListener(this);
        back.setBounds(500,500,100,30);
        book.setBounds(700,500,100,30);
        j.setLayout(null);
        j.setSize(1000,1000);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }

    public static void main(String[] args) {


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            j.setVisible(false);
            new mainFrame();
        }
        if(e.getSource()==book){
            int c = Integer.parseInt(details[10].getText());
            int t = Integer.parseInt(t_field.getText());
            int d = c*t;
            String a = "Your Cost Is "+d;
            JOptionPane.showMessageDialog(null,a);
           // System.out.println(mainFrame.car_list.get(hval-1).car_a_details.get(11));
             mainFrame.car_list.get(hval).car_a_details.set(11,"y");
        }
    }
}
