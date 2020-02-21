package kjd.yahoo.fantasy.data.user;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.FantasyContent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersCollection extends FantasyContent<UsersCollection>{

	@XmlElementWrapper(name="users")
	private List<User> users;
	
}
