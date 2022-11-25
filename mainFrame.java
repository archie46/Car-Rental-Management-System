import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Car {
    //    String name;
//    String car_no;
//    String model;
//    String color;
//    String mf_year;
//    String car_type;
//    String airbag;
//    String seats;
//    String gear;
//    String mileage;
    ArrayList<String> car_a_details = new ArrayList<>();

    Car(String name, String cost, String mileage, String gear, String color, String car_no, String model, String mf_year, String car_type, String airbag, String seats) {
        car_a_details.add(name);
        car_a_details.add(cost);
        car_a_details.add(mileage);
        car_a_details.add(gear);
        car_a_details.add(color);
        car_a_details.add(car_no);
        car_a_details.add(model);
        car_a_details.add(mf_year);
        car_a_details.add(car_type);
        car_a_details.add(airbag);
        car_a_details.add(seats);

        car_a_details.add("n");
    }
}

public class mainFrame implements ActionListener {
    JFrame j;
    JButton add;
    JButton rent;
    JButton status;
    static ArrayList<Car> car_list = new ArrayList<>();
    static ArrayList<String> car_p = new ArrayList<>();

    mainFrame() {
        j = new JFrame("Car Rental System");
        add = new JButton("Add A Car");
        rent = new JButton("Rent A Car");
        status = new JButton("Check Status");
        add.setBounds(150, 100, 150, 30);
        rent.setBounds(150, 200, 150, 30);
        status.setBounds(150, 300, 150, 30);
        rent.addActionListener(this);
        status.addActionListener(this);
        add.addActionListener(this);
        j.add(add);
        j.add(rent);
        j.add(status);
        j.setLayout(null);
        j.setSize(500, 500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }

    public static void main(String[] args) {
        new mainFrame();
        car_list.add(new Car("Thar", "600", "15", "Automatic", "Black", "BH2003", "THAR2020", "2002", "Jeep", "Y", "4"));
        car_list.add(new Car("Hyundai", "300", "25", "Automatic", "Red", "BH2045", "Hyundai i20", "2020", "Sportz", "Y", "5"));
        car_list.add(new Car("Maruti", "200", "31", "Mannual", "Blue", "BH20432", "Maruti Dzire", "2015", "Sedan", "Y", "4"));
        car_list.add(new Car("Renault", "800", "20", "Automatic/Mannual", "Yellow", "BH2083", "Renault Triber", "219", "MUV", "Y", "4"));
        car_list.add(new Car("Lamborghini", "8000", "7", "Automatic", "Back", "BH20043", "Lamborghini Aventador", "2020", "Coupe", "Y", "2"));


        car_p.add("Name :");
        car_p.add("Cost (Pr/Hr :");
        car_p.add("MileAge(in KM/H) :");
        car_p.add("Gear :");
        car_p.add("Color :");
        car_p.add("Car Number :");
        car_p.add("Model :");
        car_p.add("Manufactured Year :");
        car_p.add("Type :");
        car_p.add("AirBags :");
        car_p.add("Seats :");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rent) {
            j.setVisible(false);
            new rentFrame();
        }
        if (e.getSource() == add) {
            new addFrame();
        }
        if (e.getSource() == status) {
            new statusFrame();
        }
    }
}