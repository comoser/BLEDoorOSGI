package com.da.osgi.provider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import com.da.osgi.provider.able.HelloWorldService;
import com.da.osgi.provider.impl.HelloWorldServiceImpl;
import java.util.Timer;

public class ProviderActivator implements BundleActivator {
    private ServiceRegistration registration;
    private Timer timer;

    public void start(BundleContext bundleContext) throws Exception {
        registration = bundleContext.registerService(HelloWorldService.class.getName(), new HelloWorldServiceImpl(), null);
        ServiceReference reference = bundleContext.getServiceReference(HelloWorldService.class.getName());
        HelloWorldService service = (HelloWorldService) bundleContext.getService(reference);
        service.hello();
        //this.timer = new Timer();
        //timer.scheduleAtFixedRate(new TimerTask() {
        //    @Override
        //    public void run() {
        //        service.hello();
        //    }
        //}, 1000, 1000);
    }

    public void stop(BundleContext bundleContext) throws Exception {
        //this.timer.cancel();
        registration.unregister();
    }
}
