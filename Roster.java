import java.util.*;
import javax.swing.JOptionPane;

//import java.util.List;
//import java.util.ArrayList;
public class Roster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> name = new ArrayList<>();
		name.add("Diming Chu");
		name.add("Deep1");
		name.add("Deep2");
		name.add("Deep3");
		name.add("Deep4");
		System.out.println(name);
		Random rand = new Random();
		int i = rand.nextInt(name.size());
		String selected = name.get(i);
		System.out.println("The name chosen is: " + name.get(i));
		JOptionPane.showMessageDialog(null, selected, "InfoBox: " + "Program", JOptionPane.INFORMATION_MESSAGE);

	}

}
