package main.java.com.abmf.kickstart.services;

public class ServiceFactory {
	
	private static ServiceFactory INSTANCE = null;
	
	private ServiceFactory() {}
	
	public static ServiceFactory getInstance() {
		if(INSTANCE == null)
			INSTANCE = new ServiceFactory();
		return INSTANCE;
	}
	
	public Service getService(Object serviceType) {
		if(serviceType instanceof AuthService )
			return new AuthService();
		if(serviceType instanceof SessionService)
			return new SessionService();
		if(serviceType instanceof ProjectsDiscoverService)
			return new ProjectsDiscoverService();
		return null;
		
	}

}
