package kjd.yahoo.fantasy.data;

public interface Coverage<T> {

	CoverageType getType();
	
	T getValue();
	
}
