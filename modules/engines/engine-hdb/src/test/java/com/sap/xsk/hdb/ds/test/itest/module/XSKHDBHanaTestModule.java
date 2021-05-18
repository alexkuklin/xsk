/*
 * Copyright (c) 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.hdb.ds.test.itest.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.sap.xsk.hdb.ds.module.XSKHDBModule;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;

import static com.sap.xsk.hdb.ds.test.itest.utils.HanaConstants.*;

public class XSKHDBHanaTestModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new XSKHDBModule());
  }

  @Provides
  public DataSource getDataSource() {
    BasicDataSource basicDataSource = new BasicDataSource();
    basicDataSource.setDriverClassName(HANA_DRIVER);
    basicDataSource.setUrl(HANA_URL);
    basicDataSource.setUsername(HANA_USERNAME);
    basicDataSource.setPassword(HANA_PASSWORD);
    basicDataSource.setDefaultAutoCommit(true);
    basicDataSource.setAccessToUnderlyingConnectionAllowed(true);
    return basicDataSource;
  }

}
