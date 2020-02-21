package kjd.yahoo.fantasy.data;

/**
 * {@link Collection} provides a wrapping to {@link Resource}(s), on top of which they will generally
 * all be wrapped in a LeagueContent
 * 
 * @author kdavidson
 *
 */
public interface Collection<T> {

	int getCount();
	
}
