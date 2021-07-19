/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.basemodelbase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CycleHandling.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CycleHandling"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BREAKUP"/&gt;
 *     &lt;enumeration value="TRAVERSE_COMPLETELY"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "CycleHandling")
@XmlEnum
public enum CycleHandling {


  /**
   * (break up at load time): This is the default for new and old models. Cycles are broken up at load time.
   * They might be traversed incompletely if starting from within a cycle and not from the root node.
   * Which node is marked with IS_CYCLE = 1 depends on the initial traversal during the hierarchy instantiation.
   */
  BREAKUP,

  /**
   * (Traverse completely, then break up): Cycles are completely traversed once and then broken up.
   * The duplicate node is marked with IS_CYCLE = 1 in the result
   */
  TRAVERSE_COMPLETELY,

  /**
   * Error in case the hierarchy navigation traverses a cycle
   */
  ERROR;

  public static CycleHandling fromValue(String v) {
    return valueOf(v);
  }

  public String value() {
    return name();
  }

}
