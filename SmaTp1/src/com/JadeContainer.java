package com;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;
import jade.wrapper.ControllerException;

public class JadeContainer {

	public static void main(String[] args) throws ControllerException {
		
		Runtime  runtime=Runtime.instance();
		
		Properties props=new ExtendedProperties();
		
		props.setProperty(Profile.GUI, "true");
		
		ProfileImpl prf=new ProfileImpl(props);
		
		AgentContainer cc=runtime.createMainContainer(prf);
		
		cc.start();
	}

}
