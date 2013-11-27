// Code generated by dagger-compiler.  Do not edit.
package com.techery.droid.billings.modules;


import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class BillingModule$$ModuleAdapter extends ModuleAdapter<BillingModule> {
  private static final String[] INJECTS = { "members/com.techery.droid.billings.BillingInitializationController", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public BillingModule$$ModuleAdapter() {
    super(INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, false /*complete*/, true /*library*/);
  }

  @Override
  public BillingModule newModule() {
    return new com.techery.droid.billings.modules.BillingModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(Map<String, Binding<?>> map) {
    map.put("com.techery.droid.billings.utils.ResponseHelper", new ProvideResponseHelperProvidesAdapter(module));
    map.put("com.techery.droid.billings.utils.BillingSecurity", new ProvideBillingSecurityProvidesAdapter(module));
    map.put("com.techery.droid.billings.BillingInitializationController", new ProvideBillingServiceProvidesAdapter(module));
    map.put("com.techery.droid.billings.utils.BillingSupportingChecker", new ProvideBillingSupportingCheckerProvidesAdapter(module));
    map.put("com.techery.droid.billings.BillingManager", new ProvideBillingManagerProvidesAdapter(module));
  }

  /**
   * A {@code Binder<com.techery.droid.billings.utils.ResponseHelper>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<com.techery.droid.billings.utils.ResponseHelper>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideResponseHelperProvidesAdapter extends Binding<com.techery.droid.billings.utils.ResponseHelper>
      implements Provider<com.techery.droid.billings.utils.ResponseHelper> {
    private final BillingModule module;

    public ProvideResponseHelperProvidesAdapter(BillingModule module) {
      super("com.techery.droid.billings.utils.ResponseHelper", null, IS_SINGLETON, "com.techery.droid.billings.modules.BillingModule.provideResponseHelper()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.techery.droid.billings.utils.ResponseHelper>}.
     */
    @Override
    public com.techery.droid.billings.utils.ResponseHelper get() {
      return module.provideResponseHelper();
    }
  }

  /**
   * A {@code Binder<com.techery.droid.billings.utils.BillingSecurity>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<com.techery.droid.billings.utils.BillingSecurity>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideBillingSecurityProvidesAdapter extends Binding<com.techery.droid.billings.utils.BillingSecurity>
      implements Provider<com.techery.droid.billings.utils.BillingSecurity> {
    private final BillingModule module;

    public ProvideBillingSecurityProvidesAdapter(BillingModule module) {
      super("com.techery.droid.billings.utils.BillingSecurity", null, IS_SINGLETON, "com.techery.droid.billings.modules.BillingModule.provideBillingSecurity()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.techery.droid.billings.utils.BillingSecurity>}.
     */
    @Override
    public com.techery.droid.billings.utils.BillingSecurity get() {
      return module.provideBillingSecurity();
    }
  }

  /**
   * A {@code Binder<com.techery.droid.billings.BillingInitializationController>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code com.techery.droid.billings.BillingInitializationController} and its
   * dependencies.
   * 
   * Being a {@code Provider<com.techery.droid.billings.BillingInitializationController>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideBillingServiceProvidesAdapter extends Binding<com.techery.droid.billings.BillingInitializationController>
      implements Provider<com.techery.droid.billings.BillingInitializationController> {
    private final BillingModule module;
    private Binding<dagger.ObjectGraph> objectGraph;

    public ProvideBillingServiceProvidesAdapter(BillingModule module) {
      super("com.techery.droid.billings.BillingInitializationController", null, NOT_SINGLETON, "com.techery.droid.billings.modules.BillingModule.provideBillingService()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      objectGraph = (Binding<dagger.ObjectGraph>) linker.requestBinding("dagger.ObjectGraph", BillingModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(objectGraph);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.techery.droid.billings.BillingInitializationController>}.
     */
    @Override
    public com.techery.droid.billings.BillingInitializationController get() {
      return module.provideBillingService(objectGraph.get());
    }
  }

  /**
   * A {@code Binder<com.techery.droid.billings.utils.BillingSupportingChecker>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code com.techery.droid.billings.utils.BillingSupportingChecker} and its
   * dependencies.
   * 
   * Being a {@code Provider<com.techery.droid.billings.utils.BillingSupportingChecker>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideBillingSupportingCheckerProvidesAdapter extends Binding<com.techery.droid.billings.utils.BillingSupportingChecker>
      implements Provider<com.techery.droid.billings.utils.BillingSupportingChecker> {
    private final BillingModule module;
    private Binding<android.content.Context> context;

    public ProvideBillingSupportingCheckerProvidesAdapter(BillingModule module) {
      super("com.techery.droid.billings.utils.BillingSupportingChecker", null, IS_SINGLETON, "com.techery.droid.billings.modules.BillingModule.provideBillingSupportingChecker()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", BillingModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.techery.droid.billings.utils.BillingSupportingChecker>}.
     */
    @Override
    public com.techery.droid.billings.utils.BillingSupportingChecker get() {
      return module.provideBillingSupportingChecker(context.get());
    }
  }

  /**
   * A {@code Binder<com.techery.droid.billings.BillingManager>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code com.techery.droid.billings.BillingManager} and its
   * dependencies.
   * 
   * Being a {@code Provider<com.techery.droid.billings.BillingManager>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideBillingManagerProvidesAdapter extends Binding<com.techery.droid.billings.BillingManager>
      implements Provider<com.techery.droid.billings.BillingManager> {
    private final BillingModule module;
    private Binding<de.greenrobot.event.EventBus> eventBus;

    public ProvideBillingManagerProvidesAdapter(BillingModule module) {
      super("com.techery.droid.billings.BillingManager", null, NOT_SINGLETON, "com.techery.droid.billings.modules.BillingModule.provideBillingManager()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      eventBus = (Binding<de.greenrobot.event.EventBus>) linker.requestBinding("de.greenrobot.event.EventBus", BillingModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(eventBus);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.techery.droid.billings.BillingManager>}.
     */
    @Override
    public com.techery.droid.billings.BillingManager get() {
      return module.provideBillingManager(eventBus.get());
    }
  }
}