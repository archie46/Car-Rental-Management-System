import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class rentFrame implements ListSelectionListener {
    JFrame j;
    JList<String> list;


    rentFrame(){
        j = new JFrame();
        DefaultListModel<String> cars_list = new DefaultListModel<>();
        for(int i =0;i<mainFrame.car_list.size();i++){
            if(Objects.equals(mainFrame.car_list.get(i).car_a_details.get(11), "n")){
              //  System.out.println(Objects.equals(mainFrame.car_list.get(i).car_a_details.get(11), "n"));
                cars_list.addElement(mainFrame.car_list.get(i).car_a_details.get(0));
            }
        }
        System.out.println("here");
        cars_list.add(cars_list.size(),"BACK");
        list = new JList<>(cars_list);
      //  list.add("BACK",null);
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)list.getCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        list.addListSelectionListener(this);


        j.add(list);
      //  j.add(back);
     //   j.setLayout(null);
        j.setSize(500,500);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }

    public static void main(String[] args) {
      new rentFrame();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        j.setVisible(false);
        if(list.getSelectedIndex()==mainFrame.car_list.size()){
            new mainFrame();
        }
        else
        new detailFrame(list.getSelectedIndex());
    }

}
