package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha2AllocationResultFluentImpl<A extends V1alpha2AllocationResultFluent<A>> extends BaseFluent<A> implements V1alpha2AllocationResultFluent<A>{
  public V1alpha2AllocationResultFluentImpl() {
  }
  public V1alpha2AllocationResultFluentImpl(V1alpha2AllocationResult instance) {
    if (instance != null) {
      this.withAvailableOnNodes(instance.getAvailableOnNodes());
      this.withResourceHandles(instance.getResourceHandles());
      this.withShareable(instance.getShareable());
    }
  }
  private V1NodeSelectorBuilder availableOnNodes;
  private ArrayList<V1alpha2ResourceHandleBuilder> resourceHandles;
  private Boolean shareable;
  
  /**
   * This method has been deprecated, please use method buildAvailableOnNodes instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getAvailableOnNodes() {
    return this.availableOnNodes!=null ?this.availableOnNodes.build():null;
  }
  public V1NodeSelector buildAvailableOnNodes() {
    return this.availableOnNodes!=null ?this.availableOnNodes.build():null;
  }
  public A withAvailableOnNodes(V1NodeSelector availableOnNodes) {
    _visitables.get("availableOnNodes").remove(this.availableOnNodes);
    if (availableOnNodes!=null){ this.availableOnNodes= new V1NodeSelectorBuilder(availableOnNodes); _visitables.get("availableOnNodes").add(this.availableOnNodes);} else { this.availableOnNodes = null; _visitables.get("availableOnNodes").remove(this.availableOnNodes); } return (A) this;
  }
  public Boolean hasAvailableOnNodes() {
    return this.availableOnNodes != null;
  }
  public V1alpha2AllocationResultFluentImpl.AvailableOnNodesNested<A> withNewAvailableOnNodes() {
    return new V1alpha2AllocationResultFluentImpl.AvailableOnNodesNestedImpl();
  }
  public V1alpha2AllocationResultFluentImpl.AvailableOnNodesNested<A> withNewAvailableOnNodesLike(V1NodeSelector item) {
    return new V1alpha2AllocationResultFluentImpl.AvailableOnNodesNestedImpl(item);
  }
  public V1alpha2AllocationResultFluentImpl.AvailableOnNodesNested<A> editAvailableOnNodes() {
    return withNewAvailableOnNodesLike(getAvailableOnNodes());
  }
  public V1alpha2AllocationResultFluentImpl.AvailableOnNodesNested<A> editOrNewAvailableOnNodes() {
    return withNewAvailableOnNodesLike(getAvailableOnNodes() != null ? getAvailableOnNodes(): new V1NodeSelectorBuilder().build());
  }
  public V1alpha2AllocationResultFluentImpl.AvailableOnNodesNested<A> editOrNewAvailableOnNodesLike(V1NodeSelector item) {
    return withNewAvailableOnNodesLike(getAvailableOnNodes() != null ? getAvailableOnNodes(): item);
  }
  public A addToResourceHandles(int index,V1alpha2ResourceHandle item) {
    if (this.resourceHandles == null) {this.resourceHandles = new ArrayList<V1alpha2ResourceHandleBuilder>();}
    V1alpha2ResourceHandleBuilder builder = new V1alpha2ResourceHandleBuilder(item);
    if (index < 0 || index >= resourceHandles.size()) { _visitables.get("resourceHandles").add(builder); resourceHandles.add(builder); } else { _visitables.get("resourceHandles").add(index, builder); resourceHandles.add(index, builder);}
    return (A)this;
  }
  public A setToResourceHandles(int index,V1alpha2ResourceHandle item) {
    if (this.resourceHandles == null) {this.resourceHandles = new ArrayList<V1alpha2ResourceHandleBuilder>();}
    V1alpha2ResourceHandleBuilder builder = new V1alpha2ResourceHandleBuilder(item);
    if (index < 0 || index >= resourceHandles.size()) { _visitables.get("resourceHandles").add(builder); resourceHandles.add(builder); } else { _visitables.get("resourceHandles").set(index, builder); resourceHandles.set(index, builder);}
    return (A)this;
  }
  public A addToResourceHandles(io.kubernetes.client.openapi.models.V1alpha2ResourceHandle... items) {
    if (this.resourceHandles == null) {this.resourceHandles = new ArrayList<V1alpha2ResourceHandleBuilder>();}
    for (V1alpha2ResourceHandle item : items) {V1alpha2ResourceHandleBuilder builder = new V1alpha2ResourceHandleBuilder(item);_visitables.get("resourceHandles").add(builder);this.resourceHandles.add(builder);} return (A)this;
  }
  public A addAllToResourceHandles(Collection<V1alpha2ResourceHandle> items) {
    if (this.resourceHandles == null) {this.resourceHandles = new ArrayList<V1alpha2ResourceHandleBuilder>();}
    for (V1alpha2ResourceHandle item : items) {V1alpha2ResourceHandleBuilder builder = new V1alpha2ResourceHandleBuilder(item);_visitables.get("resourceHandles").add(builder);this.resourceHandles.add(builder);} return (A)this;
  }
  public A removeFromResourceHandles(io.kubernetes.client.openapi.models.V1alpha2ResourceHandle... items) {
    for (V1alpha2ResourceHandle item : items) {V1alpha2ResourceHandleBuilder builder = new V1alpha2ResourceHandleBuilder(item);_visitables.get("resourceHandles").remove(builder);if (this.resourceHandles != null) {this.resourceHandles.remove(builder);}} return (A)this;
  }
  public A removeAllFromResourceHandles(Collection<V1alpha2ResourceHandle> items) {
    for (V1alpha2ResourceHandle item : items) {V1alpha2ResourceHandleBuilder builder = new V1alpha2ResourceHandleBuilder(item);_visitables.get("resourceHandles").remove(builder);if (this.resourceHandles != null) {this.resourceHandles.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromResourceHandles(Predicate<V1alpha2ResourceHandleBuilder> predicate) {
    if (resourceHandles == null) return (A) this;
    final Iterator<V1alpha2ResourceHandleBuilder> each = resourceHandles.iterator();
    final List visitables = _visitables.get("resourceHandles");
    while (each.hasNext()) {
      V1alpha2ResourceHandleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildResourceHandles instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha2ResourceHandle> getResourceHandles() {
    return resourceHandles != null ? build(resourceHandles) : null;
  }
  public List<V1alpha2ResourceHandle> buildResourceHandles() {
    return resourceHandles != null ? build(resourceHandles) : null;
  }
  public V1alpha2ResourceHandle buildResourceHandle(int index) {
    return this.resourceHandles.get(index).build();
  }
  public V1alpha2ResourceHandle buildFirstResourceHandle() {
    return this.resourceHandles.get(0).build();
  }
  public V1alpha2ResourceHandle buildLastResourceHandle() {
    return this.resourceHandles.get(resourceHandles.size() - 1).build();
  }
  public V1alpha2ResourceHandle buildMatchingResourceHandle(Predicate<V1alpha2ResourceHandleBuilder> predicate) {
    for (V1alpha2ResourceHandleBuilder item: resourceHandles) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingResourceHandle(Predicate<V1alpha2ResourceHandleBuilder> predicate) {
    for (V1alpha2ResourceHandleBuilder item: resourceHandles) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withResourceHandles(List<V1alpha2ResourceHandle> resourceHandles) {
    if (this.resourceHandles != null) { _visitables.get("resourceHandles").clear();}
    if (resourceHandles != null) {this.resourceHandles = new ArrayList(); for (V1alpha2ResourceHandle item : resourceHandles){this.addToResourceHandles(item);}} else { this.resourceHandles = null;} return (A) this;
  }
  public A withResourceHandles(io.kubernetes.client.openapi.models.V1alpha2ResourceHandle... resourceHandles) {
    if (this.resourceHandles != null) {this.resourceHandles.clear(); _visitables.remove("resourceHandles"); }
    if (resourceHandles != null) {for (V1alpha2ResourceHandle item :resourceHandles){ this.addToResourceHandles(item);}} return (A) this;
  }
  public Boolean hasResourceHandles() {
    return resourceHandles != null && !resourceHandles.isEmpty();
  }
  public V1alpha2AllocationResultFluentImpl.ResourceHandlesNested<A> addNewResourceHandle() {
    return new V1alpha2AllocationResultFluentImpl.ResourceHandlesNestedImpl();
  }
  public V1alpha2AllocationResultFluentImpl.ResourceHandlesNested<A> addNewResourceHandleLike(V1alpha2ResourceHandle item) {
    return new V1alpha2AllocationResultFluentImpl.ResourceHandlesNestedImpl(-1, item);
  }
  public V1alpha2AllocationResultFluentImpl.ResourceHandlesNested<A> setNewResourceHandleLike(int index,V1alpha2ResourceHandle item) {
    return new V1alpha2AllocationResultFluentImpl.ResourceHandlesNestedImpl(index, item);
  }
  public V1alpha2AllocationResultFluentImpl.ResourceHandlesNested<A> editResourceHandle(int index) {
    if (resourceHandles.size() <= index) throw new RuntimeException("Can't edit resourceHandles. Index exceeds size.");
    return setNewResourceHandleLike(index, buildResourceHandle(index));
  }
  public V1alpha2AllocationResultFluentImpl.ResourceHandlesNested<A> editFirstResourceHandle() {
    if (resourceHandles.size() == 0) throw new RuntimeException("Can't edit first resourceHandles. The list is empty.");
    return setNewResourceHandleLike(0, buildResourceHandle(0));
  }
  public V1alpha2AllocationResultFluentImpl.ResourceHandlesNested<A> editLastResourceHandle() {
    int index = resourceHandles.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resourceHandles. The list is empty.");
    return setNewResourceHandleLike(index, buildResourceHandle(index));
  }
  public V1alpha2AllocationResultFluentImpl.ResourceHandlesNested<A> editMatchingResourceHandle(Predicate<V1alpha2ResourceHandleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<resourceHandles.size();i++) { 
    if (predicate.test(resourceHandles.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching resourceHandles. No match found.");
    return setNewResourceHandleLike(index, buildResourceHandle(index));
  }
  public Boolean getShareable() {
    return this.shareable;
  }
  public A withShareable(Boolean shareable) {
    this.shareable=shareable; return (A) this;
  }
  public Boolean hasShareable() {
    return this.shareable != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2AllocationResultFluentImpl that = (V1alpha2AllocationResultFluentImpl) o;
    if (!java.util.Objects.equals(availableOnNodes, that.availableOnNodes)) return false;

    if (!java.util.Objects.equals(resourceHandles, that.resourceHandles)) return false;

    if (!java.util.Objects.equals(shareable, that.shareable)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(availableOnNodes,  resourceHandles,  shareable,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (availableOnNodes != null) { sb.append("availableOnNodes:"); sb.append(availableOnNodes + ","); }
    if (resourceHandles != null) { sb.append("resourceHandles:"); sb.append(resourceHandles + ","); }
    if (shareable != null) { sb.append("shareable:"); sb.append(shareable); }
    sb.append("}");
    return sb.toString();
  }
  public A withShareable() {
    return withShareable(true);
  }
  class AvailableOnNodesNestedImpl<N> extends V1NodeSelectorFluentImpl<V1alpha2AllocationResultFluentImpl.AvailableOnNodesNested<N>> implements V1alpha2AllocationResultFluentImpl.AvailableOnNodesNested<N>,Nested<N>{
    AvailableOnNodesNestedImpl(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    AvailableOnNodesNestedImpl() {
      this.builder = new V1NodeSelectorBuilder(this);
    }
    V1NodeSelectorBuilder builder;
    public N and() {
      return (N) V1alpha2AllocationResultFluentImpl.this.withAvailableOnNodes(builder.build());
    }
    public N endAvailableOnNodes() {
      return and();
    }
    
  }
  class ResourceHandlesNestedImpl<N> extends V1alpha2ResourceHandleFluentImpl<V1alpha2AllocationResultFluentImpl.ResourceHandlesNested<N>> implements V1alpha2AllocationResultFluentImpl.ResourceHandlesNested<N>,Nested<N>{
    ResourceHandlesNestedImpl(int index,V1alpha2ResourceHandle item) {
      this.index = index;
      this.builder = new V1alpha2ResourceHandleBuilder(this, item);
    }
    ResourceHandlesNestedImpl() {
      this.index = -1;
      this.builder = new V1alpha2ResourceHandleBuilder(this);
    }
    V1alpha2ResourceHandleBuilder builder;
    int index;
    public N and() {
      return (N) V1alpha2AllocationResultFluentImpl.this.setToResourceHandles(index,builder.build());
    }
    public N endResourceHandle() {
      return and();
    }
    
  }
  
}