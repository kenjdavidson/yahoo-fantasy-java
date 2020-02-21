package kjd.yahoo.fantasy.data.stat;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class StatModifier {
	
	@JsonProperty(value="stat_id")
	private int id;
	
	private double value;
	
	@XmlElementWrapper(name="bonuses")
	List<StatBonus> bonuses;
	
}
