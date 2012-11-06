package edu.washington.week4;


// TODO: Auto-generated Javadoc
/**
 * The Class Recorder.
 */
public class Recorder {

	/** The name. */
	private String name;
	
	/** The time length. */
	private int timeLength;
	

	/**
	 * Instantiates a new recorder.
	 *
	 * @param name the name
	 * @param timeLength the time length
	 */
	public Recorder(String name, int timeLength) {
		super();
		this.name = name;
		this.timeLength = timeLength;
	}
	

	/**
	 * Play.
	 */
	public void play() {
		
	}
	
	/**
	 * Record the event.
	 *
	 * @param location the location
	 * @return the string
	 */
	public String recordTheEvent(String location) {
		return null;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the time length.
	 *
	 * @return the time length
	 */
	public int getTimeLength() {
		return timeLength;
	}
	
	/**
	 * Sets the time length.
	 *
	 * @param timeLength the new time length
	 */
	public void setTimeLength(int timeLength) {
		this.timeLength = timeLength;
	}
	
}
