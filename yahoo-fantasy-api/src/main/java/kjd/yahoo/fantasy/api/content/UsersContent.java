package kjd.yahoo.fantasy.api.content;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.user.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersContent extends FantasyContent<User>{

	@XmlElementWrapper(name="users")
	private List<User> users;
	
}
