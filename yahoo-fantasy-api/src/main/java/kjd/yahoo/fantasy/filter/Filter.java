package kjd.yahoo.fantasy.filter;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * {@link Filter} are applied on Collections.  At this point my hope is to
 * make each Collection type have guarenteed filters, but for now we can 
 * just leave it wide open. 
 * 
 * @author kendavidson
 *
 * @param <T>
 */
@Getter
@EqualsAndHashCode(of = {"name", "value"})
public abstract class Filter<T> {

	private String name;
	private T value;
	
	public Filter(String name, T value) {
		this.name = name;
		this.value = value;
	}
	
	abstract public String apply();
	
	
	
}
