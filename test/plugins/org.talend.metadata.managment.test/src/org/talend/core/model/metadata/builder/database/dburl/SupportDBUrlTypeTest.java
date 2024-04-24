// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.model.metadata.builder.database.dburl;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;

/**
 * DOC msjian class global comment. Detailled comment
 */
@PrepareForTest({ SupportDBUrlType.class })
public class SupportDBUrlTypeTest {

    /**
     * Test method for {@link org.talend.core.model.metadata.builder.database.dburl.SupportDBUrlType#isMssql(String)} .
     */
    @Test
    public void testIsMssql() {

        String dbKey = "Microsoft SQL Server"; //$NON-NLS-1$
        assertTrue(SupportDBUrlType.isMssql(dbKey));

    }

}
