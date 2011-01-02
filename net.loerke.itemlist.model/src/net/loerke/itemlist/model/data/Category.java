/*******************************************************************************
 * Copyright (c) 2010 Achim Loerke and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Achim Loerke - initial API and implementation
 *******************************************************************************/
package net.loerke.itemlist.model.data;

import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

/**
 * @author achim
 *
 */
@XmlRootElement(name="category")
@XmlDiscriminatorValue("category")
public class Category extends AbstractNode {

	/**
	 * needed by persistence API
	 */
	public Category() {
		super();
	}
	/**
	 * @see AbstractNode#AbstractNode(String)
	 */
	public Category(String name) {
		super(name);
	}

}