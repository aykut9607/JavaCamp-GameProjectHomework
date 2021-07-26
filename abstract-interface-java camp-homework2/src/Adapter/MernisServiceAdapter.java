package Adapter;
import java.rmi.RemoteException;
import Abstract.ICustomerCheckService;
import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

@Override

public boolean checkIfRealPerson(Customer customer) {
	
	KPSPublicSoapProxy clientProxy = new KPSPublicSoapProxy();
	
	boolean result = true;
	try {
		result = clientProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), customer.getDateOfBirth());
	} catch (RemoteException e) {

		e.printStackTrace();
	}
	return result;
}


}
