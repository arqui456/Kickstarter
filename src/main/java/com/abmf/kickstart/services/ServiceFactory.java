package main.java.com.abmf.kickstart.services;

public class ServiceFactory {
	
	private static ServiceFactory INSTANCE = null;
	
	private ServiceFactory() {}
	
	public static ServiceFactory getInstance() {
		if(INSTANCE == null)
			INSTANCE = new ServiceFactory();
		return INSTANCE;
	}
	
	public Service getService(ServiceType serviceType) {
		if(serviceType == ServiceType.AUTH)
			return new AuthService();
		if(serviceType == ServiceType.SESSION)
			return new SessionService();
		if(serviceType == ServiceType.PROJECT_DISCOVER)
			return new ProjectsDiscoverService();
		return null;
		
	}

}
