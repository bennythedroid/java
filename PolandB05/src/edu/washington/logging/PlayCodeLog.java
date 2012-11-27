package edu.washington.logging;

import org.apache.log4j.Logger;

public class PlayCodeLog {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(PlayCodeLog.class);

	public PlayCodeLog() {
		if (logger.isInfoEnabled()) {
			logger.info("PlayCodeLog() - Hi threr"); //$NON-NLS-1$
		}

	}
	public PlayCodeLog(String name) {
		if (logger.isDebugEnabled()) {
			logger.debug("PlayCodeLog(String) - start"); //$NON-NLS-1$
		}

		if (logger.isDebugEnabled()) {
			logger.debug("PlayCodeLog(String) - end"); //$NON-NLS-1$
		}
	}

	public void execute(String name) {

	}
}
