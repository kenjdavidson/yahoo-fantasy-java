package kjd.yahoo.fantasy.data.stat;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stat {
	
	@JsonProperty(value="stat_id")
	private int id;
	
	private boolean enabled;
	
	private String name;
	
	private String displayName;
	
	private int sortOrder;
	
	private String positionType;
	
	@XmlElementWrapper(name="stat_position_types")
	private List<StatPositionType> statPositionTypes;

}
