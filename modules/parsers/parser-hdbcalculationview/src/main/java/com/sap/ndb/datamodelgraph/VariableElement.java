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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * For referencing an element of a variable
 *
 *
 * <p>Java class for VariableElement complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VariableElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="variable" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *       &lt;attribute name="element" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableElement")
@XmlSeeAlso({
    GraphVariableOrderBy.class,
    GraphVariableMapping.class
})
public class VariableElement {

  @XmlAttribute(name = "variable", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String variable;
  @XmlAttribute(name = "element", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String element;

  /**
   * Gets the value of the variable property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getVariable() {
    return variable;
  }

  /**
   * Sets the value of the variable property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setVariable(String value) {
    this.variable = value;
  }

  /**
   * Gets the value of the element property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getElement() {
    return element;
  }

  /**
   * Sets the value of the element property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setElement(String value) {
    this.element = value;
  }

}
