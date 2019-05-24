package sources;

import java.util.LinkedList;

public class Case {

	LinkedList<Integer> bombes;
	LinkedList<Integer> listeCase;
	
	public Case(int column, int line)
	{
		initCase(column, line);
	}
	
	private void initCase(int column, int line)
	{
		listeCase = new LinkedList<>();
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				listeCase.add(0);
			}
		}
	}
	
	
	
}
