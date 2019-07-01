import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

// prints employee name and weekly pay 
// use arraylist of employees to hold all the different employees 
// calculate the total payroll for the week, use a loop 


public class Main {
    public static void main(String[] args) {

ArrayList <Employee> list = new ArrayList<Employee>();
list.add(new CobraCommander("Cobra Commander", "Cobra Commander", 0, 120));
list.add(new HighCommand("High Commander", "Destro", 1200000, 90));
list.add(new  HighCommand("High Commander", "Baroness", 900000, 85));
list.add(new CrimsonGuard("Crimson Guard", "Greg", 125000, 60));
list.add(new CrimsonGuard("Crimson Guard", "Marcia", 125000, 67));
list.add(new CrimsonGuard("Crimson Guard", "Peter", 120000, 70));
list.add(new CrimsonGuard("Crimson Guard", "Jan", 80000, 40));
list.add(new CrimsonGuard("Crimson Guard", "Dommik Zorander", 125000, 60));
list.add(new CrimsonGuard("Crimson Guard", "Larsa Moonfall", 105000, 67));
list.add(new CrimsonGuard("Crimson Guard", "Karn Redwood", 127000, 70));
list.add(new CrimsonGuard("Crimson Guard", "Reyson Everbleed", 85000, 40));
list.add(new CobraTrooper("CobraTrooper", "Larry", 0, 45));
list.add(new CobraTrooper("CobraTrooper", "Curly", 0, 35));
list.add(new CobraTrooper("CobraTrooper", "Moe", 0, 50));
list.add(new CobraTrooper("CobraTrooper", "Marvin the Martian", 0, 33));
list.add(new CobraTrooper("CobraTrooper", "Hawk", 0, 18));
list.add(new CobraTrooper("CobraTrooper", "Torpedo", 0, 56));
list.add(new CobraTrooper("CobraTrooper", "Scarlett", 0, 43));
list.add(new CobraTrooper("CobraTrooper", "Scoop", 0, 25));
list.add(new CobraTrooper("CobraTrooper", "Loom Le Torneau", 0, 44));
list.add(new CobraTrooper("CobraTrooper", "Morren Manglyeong", 0, 12));
list.add(new CobraTrooper("CobraTrooper", "Colton Latimer", 0, 56));
list.add(new CobraTrooper("CobraTrooper", "Theodor Serphent", 0, 34));
list.add(new CobraTrooper("CobraTrooper", "Storm Shackleton", 0, 7));
list.add(new CobraTrooper("CobraTrooper", "Amarant Sephiran", 0, 45));
list.add(new CobraTrooper("CobraTrooper", "Thyme Graves", 0, 88));
list.add(new CobraTrooper("CobraTrooper", "Thunder Barclay", 0, 34));
list.add(new CobraTrooper("CobraTrooper", "Morren Victor", 0, 23));
list.add(new CobraTrooper("CobraTrooper", "Stryker Moriarty", 0, 34));
list.add(new CobraTrooper("CobraTrooper", "Aswang Christanti", 0, 40));
list.add(new CobraTrooper("CobraTrooper", "Grimina Maganti", 0, 40));
list.add(new CobraTrooper("CobraTrooper", "Nylora Redwood", 0, 40));
list.add(new CobraTrooper("CobraTrooper", "Hazelmere Vigil", 0, 22));
list.add(new CobraTrooper("CobraTrooper", "Autumn Keeling", 0, 14));
list.add(new CobraTrooper("CobraTrooper", "Athena Interfector", 0, 65));
list.add(new CobraTrooper("CobraTrooper", "Yureka Zul", 0, 45));
list.add(new CobraTrooper("CobraTrooper", "Karmin Shackleton", 0, 41));
list.add(new CobraTrooper("CobraTrooper", "Viessa Aura", 0, 4));
list.add(new CobraTrooper("CobraTrooper", "Qutie Whitmore", 0, 22));

//Collections.sort(list);


for (Employee employee : list )
{
	System.out.println(employee.toString());
}


    }


}
