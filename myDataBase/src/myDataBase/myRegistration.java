package myDataBase;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
public class myRegistration extends JFrame
{
    public myRegistration()
    {
        //headers for the table
        String[] columns = new String[] {
            "Age-Groups", "Isixhosa", "English", "PureMaths", "MathsLit","LifeScience","CreativeArts","Accepted","Rejected",
            };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {"6 - 9", "15", "19", "28" , "23" , "14" , "19","34","0" },
            {"10 - 14", "9", "10", "12" , "13" , "15" , "12","15","1" },
            {"15 - 17", "8", "6", "5" , "8" , "7" , "9","10","5"  },
        };
        //create table with datas
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Table Registration");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new myRegistration();
            }
        });
    }   
}