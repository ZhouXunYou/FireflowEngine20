/**
 * Copyright 2007-2010 非也
 * All rights reserved. 
 * 
 * This library is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License v3 as published by the Free Software
 * Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along
 * with this library; if not, see http://www.gnu.org/licenses/lgpl.html.
 *
 */
package org.fireflow.server.support;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.fireflow.client.query.AbsCriterion;

/**
 *
 * @author 非也 nychen2000@163.com
 * Fire Workflow 官方网站：www.firesoa.com 或者 www.fireflow.org
 *
 */
public class CriterionListXmlAdapter extends
		XmlAdapter<CriterionListWrapper, List<AbsCriterion>> {

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public List<AbsCriterion> unmarshal(CriterionListWrapper v)
			throws Exception {
		if (v==null)return null;
		return v.getAll();
	}

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public CriterionListWrapper marshal(List<AbsCriterion> v) throws Exception {
		CriterionListWrapper wrapper = new CriterionListWrapper();
		if (v==null)return wrapper;
		wrapper.addAll(v);
		return wrapper;
	}

}
