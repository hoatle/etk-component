package org.etk.reflect.core;

import org.etk.reflect.api.TypeInfo;

/**
 * Represents an array type
 * A multidimensional array type is represented as an array type
 * whose component type is also an array type.
 * @author thanh_vucong
 *
 */
public interface ArrayTypeInfo {

  TypeInfo getComponentType();
}
