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


package com.sap.ndb.datamodelgraph;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredicateOperator.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PredicateOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="EQ"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PredicateOperator")
@XmlEnum
public enum PredicateOperator {


  /**
   * Equal
   */
  EQ,

  /**
   * NotEqual
   */
  NE,

  /**
   * GreaterThan
   */
  GT,

  /**
   * GreaterEqual
   */
  GE,

  /**
   * LessThan
   */
  LT,

  /**
   * LessEqual
   */
  LE;

  public static PredicateOperator fromValue(String v) {
    return valueOf(v);
  }

  public String value() {
    return name();
  }

}
