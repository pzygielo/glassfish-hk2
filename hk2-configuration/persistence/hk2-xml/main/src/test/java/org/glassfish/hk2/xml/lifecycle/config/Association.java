/*
 * Copyright (c) 2014, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.hk2.xml.lifecycle.config;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;

import org.jvnet.hk2.annotations.Contract;

@Contract
public interface Association extends Auditable {
  
  @XmlIDREF
  @XmlElement(required=true /*, reference=true */)
  Partition getPartition1();
  void setPartition1(Partition partition);
  
  @XmlIDREF
  @XmlElement(required=true /* reference=true */)
  Partition getPartition2();
  void setPartition2(Partition partition);

}
