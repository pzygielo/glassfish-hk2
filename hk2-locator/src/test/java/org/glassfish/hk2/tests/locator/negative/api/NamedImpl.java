/*
 * Copyright (c) 2012, 2018 Oracle and/or its affiliates. All rights reserved.
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

package org.glassfish.hk2.tests.locator.negative.api;

import jakarta.inject.Named;

import org.glassfish.hk2.api.AnnotationLiteral;

/**
 * @author jwells
 *
 */
public class NamedImpl extends AnnotationLiteral<Named> implements Named {
    private final String name;
    
    /* package */ NamedImpl(String name) {
        this.name = name;
    }

    /**
     * 
     */
    private static final long serialVersionUID = -8893798618346961132L;

    /* (non-Javadoc)
     * @see jakarta.inject.Named#value()
     */
    @Override
    public String value() {
        return name;
    }

}
