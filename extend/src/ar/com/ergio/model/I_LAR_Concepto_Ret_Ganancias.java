/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package ar.com.ergio.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for LAR_Concepto_Ret_Ganancias
 *  @author Adempiere (generated) 
 *  @version 361.Final (6410:0234094) | LAR 2.1.2
 */
public interface I_LAR_Concepto_Ret_Ganancias 
{

    /** TableName=LAR_Concepto_Ret_Ganancias */
    public static final String Table_Name = "LAR_Concepto_Ret_Ganancias";

    /** AD_Table_ID=3000084 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Alicuota_Inscripto */
    public static final String COLUMNNAME_Alicuota_Inscripto = "Alicuota_Inscripto";

	/** Set Alicuota_Inscripto	  */
	public void setAlicuota_Inscripto (BigDecimal Alicuota_Inscripto);

	/** Get Alicuota_Inscripto	  */
	public BigDecimal getAlicuota_Inscripto();

    /** Column name Alicuota_No_Inscripto */
    public static final String COLUMNNAME_Alicuota_No_Inscripto = "Alicuota_No_Inscripto";

	/** Set Alicuota_No_Inscripto	  */
	public void setAlicuota_No_Inscripto (BigDecimal Alicuota_No_Inscripto);

	/** Get Alicuota_No_Inscripto	  */
	public BigDecimal getAlicuota_No_Inscripto();

    /** Column name Calculo_Por_Escala */
    public static final String COLUMNNAME_Calculo_Por_Escala = "Calculo_Por_Escala";

	/** Set Calculo_Por_Escala	  */
	public void setCalculo_Por_Escala (boolean Calculo_Por_Escala);

	/** Get Calculo_Por_Escala	  */
	public boolean isCalculo_Por_Escala();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name Importe_No_Sujeto_Inscripto */
    public static final String COLUMNNAME_Importe_No_Sujeto_Inscripto = "Importe_No_Sujeto_Inscripto";

	/** Set Importe_No_Sujeto_Inscripto	  */
	public void setImporte_No_Sujeto_Inscripto (BigDecimal Importe_No_Sujeto_Inscripto);

	/** Get Importe_No_Sujeto_Inscripto	  */
	public BigDecimal getImporte_No_Sujeto_Inscripto();

    /** Column name Importe_No_Sujeto_No_Insc */
    public static final String COLUMNNAME_Importe_No_Sujeto_No_Insc = "Importe_No_Sujeto_No_Insc";

	/** Set Importe_No_Sujeto_No_Insc	  */
	public void setImporte_No_Sujeto_No_Insc (BigDecimal Importe_No_Sujeto_No_Insc);

	/** Get Importe_No_Sujeto_No_Insc	  */
	public BigDecimal getImporte_No_Sujeto_No_Insc();

    /** Column name Importe_Ret_Minima_Inscripto */
    public static final String COLUMNNAME_Importe_Ret_Minima_Inscripto = "Importe_Ret_Minima_Inscripto";

	/** Set Importe_Ret_Minima_Inscripto	  */
	public void setImporte_Ret_Minima_Inscripto (BigDecimal Importe_Ret_Minima_Inscripto);

	/** Get Importe_Ret_Minima_Inscripto	  */
	public BigDecimal getImporte_Ret_Minima_Inscripto();

    /** Column name Importe_Ret_Minima_No_Insc */
    public static final String COLUMNNAME_Importe_Ret_Minima_No_Insc = "Importe_Ret_Minima_No_Insc";

	/** Set Importe_Ret_Minima_No_Insc	  */
	public void setImporte_Ret_Minima_No_Insc (BigDecimal Importe_Ret_Minima_No_Insc);

	/** Get Importe_Ret_Minima_No_Insc	  */
	public BigDecimal getImporte_Ret_Minima_No_Insc();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name LAR_Concepto_Ret_Ganancias_ID */
    public static final String COLUMNNAME_LAR_Concepto_Ret_Ganancias_ID = "LAR_Concepto_Ret_Ganancias_ID";

	/** Set Conceptos Retencion Ganancias	  */
	public void setLAR_Concepto_Ret_Ganancias_ID (int LAR_Concepto_Ret_Ganancias_ID);

	/** Get Conceptos Retencion Ganancias	  */
	public int getLAR_Concepto_Ret_Ganancias_ID();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();
}