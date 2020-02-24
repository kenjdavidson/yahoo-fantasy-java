package kjd.yahoo.fantasy;

public interface Coverage<T> {

	CoverageType getType();
	
	T getValue();
	
}
