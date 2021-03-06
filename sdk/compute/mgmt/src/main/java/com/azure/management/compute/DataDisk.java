// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DataDisk model.
 */
@Fluent
public final class DataDisk {
    /*
     * Specifies the logical unit number of the data disk. This value is used
     * to identify data disks within the VM and therefore must be unique for
     * each data disk attached to a VM.
     */
    @JsonProperty(value = "lun", required = true)
    private int lun;

    /*
     * The disk name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Describes the uri of a disk.
     */
    @JsonProperty(value = "vhd")
    private VirtualHardDisk vhd;

    /*
     * Describes the uri of a disk.
     */
    @JsonProperty(value = "image")
    private VirtualHardDisk image;

    /*
     * Specifies the caching requirements. <br><br> Possible values are:
     * <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br>
     * Default: **None for Standard storage. ReadOnly for Premium storage**
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /*
     * Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     */
    @JsonProperty(value = "writeAcceleratorEnabled")
    private Boolean writeAcceleratorEnabled;

    /*
     * Specifies how the virtual machine should be created.<br><br> Possible
     * values are:<br><br> **Attach** \u2013 This value is used when you are
     * using a specialized disk to create the virtual machine.<br><br>
     * **FromImage** \u2013 This value is used when you are using an image to
     * create the virtual machine. If you are using a platform image, you also
     * use the imageReference element described above. If you are using a
     * marketplace image, you  also use the plan element previously described.
     */
    @JsonProperty(value = "createOption", required = true)
    private DiskCreateOptionTypes createOption;

    /*
     * Specifies the size of an empty data disk in gigabytes. This element can
     * be used to overwrite the size of the disk in a virtual machine image.
     * <br><br> This value cannot be larger than 1023 GB
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * The parameters of a managed disk.
     */
    @JsonProperty(value = "managedDisk")
    private ManagedDiskParameters managedDisk;

    /*
     * Specifies whether the data disk is in process of detachment from the
     * VirtualMachine/VirtualMachineScaleset
     */
    @JsonProperty(value = "toBeDetached")
    private Boolean toBeDetached;

    /**
     * Get the lun property: Specifies the logical unit number of the data
     * disk. This value is used to identify data disks within the VM and
     * therefore must be unique for each data disk attached to a VM.
     * 
     * @return the lun value.
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set the lun property: Specifies the logical unit number of the data
     * disk. This value is used to identify data disks within the VM and
     * therefore must be unique for each data disk attached to a VM.
     * 
     * @param lun the lun value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the name property: The disk name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The disk name.
     * 
     * @param name the name value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the vhd property: Describes the uri of a disk.
     * 
     * @return the vhd value.
     */
    public VirtualHardDisk vhd() {
        return this.vhd;
    }

    /**
     * Set the vhd property: Describes the uri of a disk.
     * 
     * @param vhd the vhd value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withVhd(VirtualHardDisk vhd) {
        this.vhd = vhd;
        return this;
    }

    /**
     * Get the image property: Describes the uri of a disk.
     * 
     * @return the image value.
     */
    public VirtualHardDisk image() {
        return this.image;
    }

    /**
     * Set the image property: Describes the uri of a disk.
     * 
     * @param image the image value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withImage(VirtualHardDisk image) {
        this.image = image;
        return this;
    }

    /**
     * Get the caching property: Specifies the caching requirements.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None**
     * &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for
     * Premium storage**.
     * 
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: Specifies the caching requirements.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None**
     * &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for
     * Premium storage**.
     * 
     * @param caching the caching value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled property: Specifies whether
     * writeAccelerator should be enabled or disabled on the disk.
     * 
     * @return the writeAcceleratorEnabled value.
     */
    public Boolean writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled property: Specifies whether
     * writeAccelerator should be enabled or disabled on the disk.
     * 
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Get the createOption property: Specifies how the virtual machine should
     * be created.&lt;br&gt;&lt;br&gt; Possible values are:&lt;br&gt;&lt;br&gt;
     * **Attach** \u2013 This value is used when you are using a specialized
     * disk to create the virtual machine.&lt;br&gt;&lt;br&gt; **FromImage**
     * \u2013 This value is used when you are using an image to create the
     * virtual machine. If you are using a platform image, you also use the
     * imageReference element described above. If you are using a marketplace
     * image, you  also use the plan element previously described.
     * 
     * @return the createOption value.
     */
    public DiskCreateOptionTypes createOption() {
        return this.createOption;
    }

    /**
     * Set the createOption property: Specifies how the virtual machine should
     * be created.&lt;br&gt;&lt;br&gt; Possible values are:&lt;br&gt;&lt;br&gt;
     * **Attach** \u2013 This value is used when you are using a specialized
     * disk to create the virtual machine.&lt;br&gt;&lt;br&gt; **FromImage**
     * \u2013 This value is used when you are using an image to create the
     * virtual machine. If you are using a platform image, you also use the
     * imageReference element described above. If you are using a marketplace
     * image, you  also use the plan element previously described.
     * 
     * @param createOption the createOption value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withCreateOption(DiskCreateOptionTypes createOption) {
        this.createOption = createOption;
        return this;
    }

    /**
     * Get the diskSizeGB property: Specifies the size of an empty data disk in
     * gigabytes. This element can be used to overwrite the size of the disk in
     * a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be
     * larger than 1023 GB.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Specifies the size of an empty data disk in
     * gigabytes. This element can be used to overwrite the size of the disk in
     * a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be
     * larger than 1023 GB.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the managedDisk property: The parameters of a managed disk.
     * 
     * @return the managedDisk value.
     */
    public ManagedDiskParameters managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The parameters of a managed disk.
     * 
     * @param managedDisk the managedDisk value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withManagedDisk(ManagedDiskParameters managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the toBeDetached property: Specifies whether the data disk is in
     * process of detachment from the VirtualMachine/VirtualMachineScaleset.
     * 
     * @return the toBeDetached value.
     */
    public Boolean toBeDetached() {
        return this.toBeDetached;
    }

    /**
     * Set the toBeDetached property: Specifies whether the data disk is in
     * process of detachment from the VirtualMachine/VirtualMachineScaleset.
     * 
     * @param toBeDetached the toBeDetached value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withToBeDetached(Boolean toBeDetached) {
        this.toBeDetached = toBeDetached;
        return this;
    }
}
