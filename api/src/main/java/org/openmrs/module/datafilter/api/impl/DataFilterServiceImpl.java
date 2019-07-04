/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.datafilter.api.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.datafilter.api.DataFilterService;
import org.openmrs.module.datafilter.api.db.DataFilterDAO;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public class DataFilterServiceImpl extends BaseOpenmrsService implements DataFilterService {
	
	private DataFilterDAO dao;
	
	/**
	 * Sets the dao
	 *
	 * @param dao the dao to set
	 */
	public void setDao(DataFilterDAO dao) {
		this.dao = dao;
	}
	
}
