
package introsde.beemindergoals.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GoalsService", targetNamespace = "http://soap.beemindergoals.introsde/", wsdlLocation = "http://localhost:6915/soap/goals?wsdl")
public class GoalsService
    extends Service
{

    private final static URL GOALSSERVICE_WSDL_LOCATION;
    private final static WebServiceException GOALSSERVICE_EXCEPTION;
    private final static QName GOALSSERVICE_QNAME = new QName("http://soap.beemindergoals.introsde/", "GoalsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:6915/soap/goals?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GOALSSERVICE_WSDL_LOCATION = url;
        GOALSSERVICE_EXCEPTION = e;
    }

    public GoalsService() {
        super(__getWsdlLocation(), GOALSSERVICE_QNAME);
    }

    public GoalsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GOALSSERVICE_QNAME, features);
    }

    public GoalsService(URL wsdlLocation) {
        super(wsdlLocation, GOALSSERVICE_QNAME);
    }

    public GoalsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GOALSSERVICE_QNAME, features);
    }

    public GoalsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GoalsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Goals
     */
    @WebEndpoint(name = "GoalsImplPort")
    public Goals getGoalsImplPort() {
        return super.getPort(new QName("http://soap.beemindergoals.introsde/", "GoalsImplPort"), Goals.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Goals
     */
    @WebEndpoint(name = "GoalsImplPort")
    public Goals getGoalsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.beemindergoals.introsde/", "GoalsImplPort"), Goals.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GOALSSERVICE_EXCEPTION!= null) {
            throw GOALSSERVICE_EXCEPTION;
        }
        return GOALSSERVICE_WSDL_LOCATION;
    }

}
