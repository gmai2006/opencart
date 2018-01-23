package intermediate;

	import java.util.Arrays;
	import java.util.List;

	import org.junit.Before;

	import com.google.inject.Guice;
	import com.google.inject.Injector;
	import com.google.inject.Module;
	import com.google.inject.persist.PersistService;
	import com.google.inject.persist.jpa.JpaPersistModule;
	import com.google.inject.AbstractModule;
	/**
	 * Base class for test cases that need to use Guice injection.
	 */
	public abstract class GoogleGuiceInjector {
	    protected Injector injector;

	    public GoogleGuiceInjector() {
	        final List<Module> modules = getModules();
	        injector = Guice.createInjector(modules);
	        withInjector(injector);
	        injector.injectMembers(this);
	    }

	    protected List<Module> getModules() {
	    	return Arrays.asList(new AbstractModule() {

	            @Override
	            protected void configure() {
	                install(new JpaPersistModule("opencarttest"));
	                final Module testModule = getTestModule();
	                if (null != testModule) {
	                    install(testModule);
	                }
	            }
	        });
	    }

	    protected void withInjector(final Injector injector) {
	        injector.getInstance(PersistService.class).start();
	    }
	    
	    protected abstract Module getTestModule();
}
