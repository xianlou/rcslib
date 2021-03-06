/*
*	New Java File starts here.
*	This file should be named fwLaserStruct.java
*	Automatically generated by NML CodeGen Java Applet.
*	from nml_test_format.hh:205
*	with command line arguments :  generate_for_all_langs=true HHFile=nml_test_format.hh
*
*	.gen script :
*		0:load nml_test_format.hh
*		1:clear
*		2:select_from_file nml_test_format.hh
*		3:generate C protos>nml_test_format_c_n.h
*		4:generate C format>nml_test_format_c_n.c
*		5:generate C update>nml_test_format_c_n.c
*		6:generate C++ protos>nml_test_format_n_codegen_protos.hh
*		7:generate C++ format>nml_test_format_n.cc
*		8:generate C++ update>nml_test_format_n.cc
*		9:generate C++ constructor>nml_test_format_n.cc
*		10:generate Java dict>nml_test_format_MsgDict.java
*		11:generate Java classes >*
*		12:generate Ada spec>nml_test_format_n_ada.ads
*		13:generate Ada body>nml_test_format_n_ada.adb
*		14:exit
*
*/

// Import all NML and posemath interfaces
import rcs.nml.*;
import rcs.posemath.*;

/*
*	Class definition for fwLaserStruct
*	Automatically generated by NML CodeGen Java Applet.
*/
public class fwLaserStruct implements Cloneable
{
	public short rangep[] = new short[12];


	// Constructor 
	public fwLaserStruct()
	{
		for(int i_rangep = 0; i_rangep < 12; i_rangep++ )
		{
			rangep[i_rangep]  = 0;
		}

	}


	public void update(NMLFormatConverter nml_fc)
	{

		nml_fc.beginClass("fwLaserStruct",null);
		nml_fc.update_unsigned_with_name("rangep",rangep,12);

		nml_fc.endClass("fwLaserStruct",null);

	}


	public fwLaserStruct clone() throws CloneNotSupportedException
	{
		fwLaserStruct cloned_object = (fwLaserStruct) super.clone();
		if(this.rangep != null) {
			cloned_object.rangep = (short []) this.rangep.clone();
		}
		return cloned_object;

	}
}

