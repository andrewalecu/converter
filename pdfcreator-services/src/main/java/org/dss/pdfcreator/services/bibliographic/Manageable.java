/**
 * 
 */
package org.dss.pdfcreator.services.bibliographic;

import java.util.List;

/**
 * @author Andrei
 *
 */
public interface Manageable<T> {
	
	void add(T item);
	void delete(T item);
	void update(T item);
	List<T> list();
}
