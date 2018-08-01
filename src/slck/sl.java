package slck;

import org.apache.log4j.Logger;

public class sl {

	// <Define Logger

	final static Logger logger = Logger.getLogger(sl.class);

	// />

	public static void main(String[] args) {

		sl slck = new sl();

		// <Email Sending
		try {
			slck.runMe("");
			throw new Exception("");
		} catch (Exception ex) {
			logger.error("LAST ERROR LINE NOT CONSÝDERABLE!");
		}
		// />

		if (logger.isTraceEnabled()) {
			slck.runMe("TRACE LEVEL OR LOW LEVEL");

		}

		if (logger.isDebugEnabled()) {
			slck.runMe("DEBUG LEVEL OR LOW LEVEL");
		}
		if (logger.isInfoEnabled()) {
			slck.runMe("INFO LEVEL OR LOW LEVEL");

		}
	}

	private void runMe(String parameter) {
		if (logger.isInfoEnabled()) {
			logger.info(parameter);

		}

		if (logger.isDebugEnabled()) {
			logger.debug(parameter);

		}

		if (logger.isTraceEnabled()) {
			logger.trace(parameter);

		}

	}

}
