package org.etk.reflect.core;

import org.etk.reflect.api.TypeInfo;
import org.etk.reflect.api.relationship.TypeRelationship;

public abstract class AbstractTypeInfo<T, M, A, P, F> extends ReflectedObject<T, M, A, P, F> implements TypeInfo {
 
  public AbstractTypeInfo(TypeResolverImpl<T, M, A, P, F> domain) {
    super(domain);
  }
  
  @Override
  public abstract int hashCode();

  @Override
  public abstract boolean equals(Object obj);
  
  public final boolean isSubType(TypeInfo ti) {
    return TypeRelationship.SUB_TYPE.isSatisfied(this, ti);
  }
  
  

}
