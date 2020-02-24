package kjd.yahoo.fantasy.filter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateFilter extends Filter<Date[]> {

	private static final DateFormat DF = new SimpleDateFormat("YYYY-MM-DD");
	
	public DateFilter(String name, Date[] value) {
		super(name, value);
	}

	@Override
	public String apply() {
		return getName() + "=" 
				+ Arrays.stream(getValue())
					.map(d -> DF.format(d))
					.reduce("", (p, d) -> p + "," + d);
	}

}
