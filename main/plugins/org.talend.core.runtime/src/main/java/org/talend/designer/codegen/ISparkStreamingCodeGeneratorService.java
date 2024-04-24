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
package org.talend.designer.codegen;

import org.talend.core.model.process.IProcess;

/**
 * DOC zwzhao class global comment. Detailled comment
 */
public interface ISparkStreamingCodeGeneratorService extends IBigDataCodeGeneratorService {

    boolean validProcess(IProcess process);

}
