package com;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.ControllerException;

public class JadeMyContainer {

	public static void main(String[] args) throws ControllerException {
		
		Runtime rt=Runtime.instance();
		ProfileImpl prf=new ProfileImpl(false);
		prf.setParameter(ProfileImpl.MAIN_HOST, "localhost");
		 AgentContainer ct = rt.createAgentContainer(prf);
		ct.start();
		
	}

}
