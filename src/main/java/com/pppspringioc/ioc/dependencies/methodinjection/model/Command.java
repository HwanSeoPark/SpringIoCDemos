package com.pppspringioc.ioc.dependencies.methodinjection.model;

import java.util.Map;

public interface Command {
	void setState(Map<String, Object> state);
    Object execute();

}
