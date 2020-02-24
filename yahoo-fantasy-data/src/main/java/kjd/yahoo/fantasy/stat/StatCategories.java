package kjd.yahoo.fantasy.stat;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatCategories {

	@XmlElementWrapper(name="stats")
	private List<Stat> stats;
	
}
