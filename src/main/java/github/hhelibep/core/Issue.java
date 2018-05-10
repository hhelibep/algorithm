package github.hhelibep.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Issue {
	Logger logger = LoggerFactory.getLogger(Issue.class);

	void issue();
}
