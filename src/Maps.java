import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		
		List<String> employeeNames = new ArrayList<>(Arrays.asList("Brian", "Doug", "Jennie", "Frank", "Carol"));
		
		Set<Integer> ids = new HashSet<>(Arrays.asList(1024, 2356, 3324, 4032, 5203));

		Map<Integer, String> employeeMap = new HashMap<>();
		
		int i = 0;
		
		for (Integer addEmpLoop : ids) {
		employeeMap.put(addEmpLoop, employeeNames.get(i));
		i++;
		}
		
		for (Integer printEmpLoop : employeeMap.keySet()) {
			System.out.println(printEmpLoop + ": " + employeeMap.get(printEmpLoop));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		
		for (Integer buildIdsLoop : ids) {
		idsBuilder.append(buildIdsLoop + " - ");
		}
		
		//Getting rid of the hanging dash
		if (idsBuilder.length() > 0) {
			idsBuilder.setLength(idsBuilder.length()-3);
		}
		
		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		
		for (String buildNamesLoop : employeeNames) {
			namesBuilder.append(buildNamesLoop + " ");
			}
		System.out.println(namesBuilder.toString());
	}

}
