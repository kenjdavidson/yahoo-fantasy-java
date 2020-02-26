package kjd.yahoo.fantasy.stat;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class StatModifier {
	
	@JsonProperty("stat_id")
	private int id;
	
	private double value;
	
	@XmlElementWrapper(name="bonuses")
	List<StatBonus> bonuses;
	
}
