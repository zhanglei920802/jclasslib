/*
    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    version 2 of the license, or (at your option) any later version.
*/

package org.gjt.jclasslib.browser.detail.constants;

import org.gjt.jclasslib.browser.BrowserServices;
import org.gjt.jclasslib.structures.constants.ConstantMethodTypeInfo;
import org.gjt.jclasslib.util.ExtendedJLabel;

import javax.swing.tree.TreePath;

/**
    Detail pane showing a <tt>CONSTANT_MethodType</tt> constant pool entry.
 
*/
public class ConstantMethodTypeDetailPane extends AbstractConstantInfoDetailPane {

    // Visual components
    
    private ExtendedJLabel lblType;
    private ExtendedJLabel lblTypeVerbose;

    /**
        Constructor.
        @param services the associated browser services.
     */
    public ConstantMethodTypeDetailPane(BrowserServices services) {
        super(services);
    }
    
    protected void setupLabels() {
        
        addDetailPaneEntry(normalLabel("Type:"),
                           lblType = linkLabel(),
                           lblTypeVerbose = highlightLabel());
    }


    public void show(TreePath treePath) {
        
        ConstantMethodTypeInfo entry = getConstant(treePath, ConstantMethodTypeInfo.class);

        constantPoolHyperlink(lblType,
                              lblTypeVerbose,
                              entry.getDescriptorIndex());

        super.show(treePath);
    }
    
}

