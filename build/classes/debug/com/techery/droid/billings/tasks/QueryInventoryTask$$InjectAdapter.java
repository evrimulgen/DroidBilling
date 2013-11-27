// Code generated by dagger-compiler.  Do not edit.
package com.techery.droid.billings.tasks;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binder<QueryInventoryTask>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code QueryInventoryTask} and its
 * dependencies.
 * 
 * Being a {@code Provider<QueryInventoryTask>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<QueryInventoryTask>} and handling injection
 * of annotated fields.
 */
public final class QueryInventoryTask$$InjectAdapter extends Binding<QueryInventoryTask>
    implements MembersInjector<QueryInventoryTask> {
  private Binding<com.techery.droid.billings.utils.BillingSecurity> billingSecurity;
  private Binding<com.techery.droid.billings.BillingConfig> billingConfig;
  private Binding<com.techery.droid.billings.models.BillingFeatureSupportingResult> supportingResult;
  private Binding<BillingTask> supertype;

  public QueryInventoryTask$$InjectAdapter() {
    super(null, "members/com.techery.droid.billings.tasks.QueryInventoryTask", NOT_SINGLETON, QueryInventoryTask.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    billingSecurity = (Binding<com.techery.droid.billings.utils.BillingSecurity>) linker.requestBinding("com.techery.droid.billings.utils.BillingSecurity", QueryInventoryTask.class, getClass().getClassLoader());
    billingConfig = (Binding<com.techery.droid.billings.BillingConfig>) linker.requestBinding("com.techery.droid.billings.BillingConfig", QueryInventoryTask.class, getClass().getClassLoader());
    supportingResult = (Binding<com.techery.droid.billings.models.BillingFeatureSupportingResult>) linker.requestBinding("com.techery.droid.billings.models.BillingFeatureSupportingResult", QueryInventoryTask.class, getClass().getClassLoader());
    supertype = (Binding<BillingTask>) linker.requestBinding("members/com.techery.droid.billings.tasks.BillingTask", QueryInventoryTask.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(billingSecurity);
    injectMembersBindings.add(billingConfig);
    injectMembersBindings.add(supportingResult);
    injectMembersBindings.add(supertype);
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<QueryInventoryTask>}.
   */
  @Override
  public void injectMembers(QueryInventoryTask object) {
    object.billingSecurity = billingSecurity.get();
    object.billingConfig = billingConfig.get();
    object.supportingResult = supportingResult.get();
    supertype.injectMembers(object);
  }
}