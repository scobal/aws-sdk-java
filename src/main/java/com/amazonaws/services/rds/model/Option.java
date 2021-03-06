/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

/**
 * <p>
 * Option details.
 * </p>
 */
public class Option {

    /**
     * The name of the option.
     */
    private String optionName;

    /**
     * The description of the option.
     */
    private String optionDescription;

    /**
     * If required, the port configured for this option to use.
     */
    private Integer port;

    /**
     * If the Option requires access to a port, then this DB Security Group
     * allows access to the port.
     */
    private java.util.List<DBSecurityGroupMembership> dBSecurityGroupMemberships;

    /**
     * If the Option requires access to a port, then this VPC Security Group
     * allows access to the port.
     */
    private java.util.List<VpcSecurityGroupMembership> vpcSecurityGroupMemberships;

    /**
     * The name of the option.
     *
     * @return The name of the option.
     */
    public String getOptionName() {
        return optionName;
    }
    
    /**
     * The name of the option.
     *
     * @param optionName The name of the option.
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
    
    /**
     * The name of the option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionName The name of the option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Option withOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }
    
    
    /**
     * The description of the option.
     *
     * @return The description of the option.
     */
    public String getOptionDescription() {
        return optionDescription;
    }
    
    /**
     * The description of the option.
     *
     * @param optionDescription The description of the option.
     */
    public void setOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
    }
    
    /**
     * The description of the option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionDescription The description of the option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Option withOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
        return this;
    }
    
    
    /**
     * If required, the port configured for this option to use.
     *
     * @return If required, the port configured for this option to use.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * If required, the port configured for this option to use.
     *
     * @param port If required, the port configured for this option to use.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * If required, the port configured for this option to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port If required, the port configured for this option to use.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Option withPort(Integer port) {
        this.port = port;
        return this;
    }
    
    
    /**
     * If the Option requires access to a port, then this DB Security Group
     * allows access to the port.
     *
     * @return If the Option requires access to a port, then this DB Security Group
     *         allows access to the port.
     */
    public java.util.List<DBSecurityGroupMembership> getDBSecurityGroupMemberships() {
        
        if (dBSecurityGroupMemberships == null) {
            dBSecurityGroupMemberships = new java.util.ArrayList<DBSecurityGroupMembership>();
        }
        return dBSecurityGroupMemberships;
    }
    
    /**
     * If the Option requires access to a port, then this DB Security Group
     * allows access to the port.
     *
     * @param dBSecurityGroupMemberships If the Option requires access to a port, then this DB Security Group
     *         allows access to the port.
     */
    public void setDBSecurityGroupMemberships(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
            return;
        }

        java.util.List<DBSecurityGroupMembership> dBSecurityGroupMembershipsCopy = new java.util.ArrayList<DBSecurityGroupMembership>(dBSecurityGroupMemberships.size());
        dBSecurityGroupMembershipsCopy.addAll(dBSecurityGroupMemberships);
        this.dBSecurityGroupMemberships = dBSecurityGroupMembershipsCopy;
    }
    
    /**
     * If the Option requires access to a port, then this DB Security Group
     * allows access to the port.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupMemberships If the Option requires access to a port, then this DB Security Group
     *         allows access to the port.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Option withDBSecurityGroupMemberships(DBSecurityGroupMembership... dBSecurityGroupMemberships) {
        if (getDBSecurityGroupMemberships() == null) setDBSecurityGroupMemberships(new java.util.ArrayList<DBSecurityGroupMembership>(dBSecurityGroupMemberships.length));
        for (DBSecurityGroupMembership value : dBSecurityGroupMemberships) {
            getDBSecurityGroupMemberships().add(value);
        }
        return this;
    }
    
    /**
     * If the Option requires access to a port, then this DB Security Group
     * allows access to the port.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupMemberships If the Option requires access to a port, then this DB Security Group
     *         allows access to the port.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Option withDBSecurityGroupMemberships(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
        } else {
            java.util.List<DBSecurityGroupMembership> dBSecurityGroupMembershipsCopy = new java.util.ArrayList<DBSecurityGroupMembership>(dBSecurityGroupMemberships.size());
            dBSecurityGroupMembershipsCopy.addAll(dBSecurityGroupMemberships);
            this.dBSecurityGroupMemberships = dBSecurityGroupMembershipsCopy;
        }

        return this;
    }
    
    /**
     * If the Option requires access to a port, then this VPC Security Group
     * allows access to the port.
     *
     * @return If the Option requires access to a port, then this VPC Security Group
     *         allows access to the port.
     */
    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroupMemberships() {
        
        if (vpcSecurityGroupMemberships == null) {
            vpcSecurityGroupMemberships = new java.util.ArrayList<VpcSecurityGroupMembership>();
        }
        return vpcSecurityGroupMemberships;
    }
    
    /**
     * If the Option requires access to a port, then this VPC Security Group
     * allows access to the port.
     *
     * @param vpcSecurityGroupMemberships If the Option requires access to a port, then this VPC Security Group
     *         allows access to the port.
     */
    public void setVpcSecurityGroupMemberships(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroupMemberships) {
        if (vpcSecurityGroupMemberships == null) {
            this.vpcSecurityGroupMemberships = null;
            return;
        }

        java.util.List<VpcSecurityGroupMembership> vpcSecurityGroupMembershipsCopy = new java.util.ArrayList<VpcSecurityGroupMembership>(vpcSecurityGroupMemberships.size());
        vpcSecurityGroupMembershipsCopy.addAll(vpcSecurityGroupMemberships);
        this.vpcSecurityGroupMemberships = vpcSecurityGroupMembershipsCopy;
    }
    
    /**
     * If the Option requires access to a port, then this VPC Security Group
     * allows access to the port.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupMemberships If the Option requires access to a port, then this VPC Security Group
     *         allows access to the port.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Option withVpcSecurityGroupMemberships(VpcSecurityGroupMembership... vpcSecurityGroupMemberships) {
        if (getVpcSecurityGroupMemberships() == null) setVpcSecurityGroupMemberships(new java.util.ArrayList<VpcSecurityGroupMembership>(vpcSecurityGroupMemberships.length));
        for (VpcSecurityGroupMembership value : vpcSecurityGroupMemberships) {
            getVpcSecurityGroupMemberships().add(value);
        }
        return this;
    }
    
    /**
     * If the Option requires access to a port, then this VPC Security Group
     * allows access to the port.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupMemberships If the Option requires access to a port, then this VPC Security Group
     *         allows access to the port.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Option withVpcSecurityGroupMemberships(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroupMemberships) {
        if (vpcSecurityGroupMemberships == null) {
            this.vpcSecurityGroupMemberships = null;
        } else {
            java.util.List<VpcSecurityGroupMembership> vpcSecurityGroupMembershipsCopy = new java.util.ArrayList<VpcSecurityGroupMembership>(vpcSecurityGroupMemberships.size());
            vpcSecurityGroupMembershipsCopy.addAll(vpcSecurityGroupMemberships);
            this.vpcSecurityGroupMemberships = vpcSecurityGroupMembershipsCopy;
        }

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOptionName() != null) sb.append("OptionName: " + getOptionName() + ", ");
        if (getOptionDescription() != null) sb.append("OptionDescription: " + getOptionDescription() + ", ");
        if (getPort() != null) sb.append("Port: " + getPort() + ", ");
        if (getDBSecurityGroupMemberships() != null) sb.append("DBSecurityGroupMemberships: " + getDBSecurityGroupMemberships() + ", ");
        if (getVpcSecurityGroupMemberships() != null) sb.append("VpcSecurityGroupMemberships: " + getVpcSecurityGroupMemberships() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode()); 
        hashCode = prime * hashCode + ((getOptionDescription() == null) ? 0 : getOptionDescription().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroupMemberships() == null) ? 0 : getDBSecurityGroupMemberships().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroupMemberships() == null) ? 0 : getVpcSecurityGroupMemberships().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Option == false) return false;
        Option other = (Option)obj;
        
        if (other.getOptionName() == null ^ this.getOptionName() == null) return false;
        if (other.getOptionName() != null && other.getOptionName().equals(this.getOptionName()) == false) return false; 
        if (other.getOptionDescription() == null ^ this.getOptionDescription() == null) return false;
        if (other.getOptionDescription() != null && other.getOptionDescription().equals(this.getOptionDescription()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getDBSecurityGroupMemberships() == null ^ this.getDBSecurityGroupMemberships() == null) return false;
        if (other.getDBSecurityGroupMemberships() != null && other.getDBSecurityGroupMemberships().equals(this.getDBSecurityGroupMemberships()) == false) return false; 
        if (other.getVpcSecurityGroupMemberships() == null ^ this.getVpcSecurityGroupMemberships() == null) return false;
        if (other.getVpcSecurityGroupMemberships() != null && other.getVpcSecurityGroupMemberships().equals(this.getVpcSecurityGroupMemberships()) == false) return false; 
        return true;
    }
    
}
    