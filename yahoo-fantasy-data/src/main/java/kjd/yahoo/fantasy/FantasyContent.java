package kjd.yahoo.fantasy;

import javax.xml.bind.annotation.XmlAttribute;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * Top level wrapper for Yahoo Fantasy {@link Collection} and {@link Resource} data.
 * 
 * @author kdavidson
 *
 */
@Getter
@Setter
public abstract class FantasyContent<T> {

	@XmlAttribute(namespace="xml",name="lang")
	private String lang;
	
	@XmlAttribute(namespace="yahoo",name="uri")
	private String uri;
	
	@XmlAttribute(name="time")
	private String time;
	
	@XmlAttribute(name="copyright")
	private String copyright;
	
	@JacksonXmlProperty(isAttribute=true,localName="refresh_rate")
	private int refreshRate;
	
}
