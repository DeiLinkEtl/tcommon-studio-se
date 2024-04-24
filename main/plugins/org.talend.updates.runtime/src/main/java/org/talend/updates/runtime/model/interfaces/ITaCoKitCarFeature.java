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
package org.talend.updates.runtime.model.interfaces;

import java.io.File;

import org.eclipse.core.runtime.IProgressMonitor;
import org.talend.updates.runtime.model.ExtraFeature;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface ITaCoKitCarFeature extends ExtraFeature {

    File getCarFile(IProgressMonitor progress) throws Exception;

    void setAutoReloadAfterInstalled(boolean autoReload);
    
    void setDeployCommand(boolean isDeployCommand);

    boolean isAutoReloadAfterInstalled();
    
    void setDeleteCar(boolean deleteCar);
    
    boolean isDeleteCar();

}
