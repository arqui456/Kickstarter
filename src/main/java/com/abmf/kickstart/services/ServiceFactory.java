package main.java.com.abmf.kickstart.services;

public class ServiceFactory {
	
	public Service getService(ServiceType serviceType) {
		if(serviceType == ServiceType.AUTH)
			return new AuthService();
		if(serviceType == ServiceType.SESSION)
			return new SessionService();
		return null;
		
	}

}
