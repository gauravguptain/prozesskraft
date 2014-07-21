package de.caegroup.commons;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.license4j.License;
import com.license4j.LicenseValidator;

public class MyLicense {

	/*----------------------------
	  structure
	----------------------------*/

//	private long time = System.currentTimeMillis();
	private License license = null;
	private ArrayList<String> log = new ArrayList<String>();
	private int port;
	private String host;
	private String productEdition = null;
	private InetAddress inetAddressHost;
	
	private String publicKey =	"30819f300d06092a864886f70d010101050003818d003081893032301006"
							+ "072a8648ce3d02002EC311215SHA512withECDSA106052b81040006031e0"
							+ "004b460a863476ce8d60591192b45e656da25433f85feb56f0911f79c69G"
							+ "02818100b89d68e21006ec20808c60ba29d992bf3fc519c2109cb7f85f24"
							+ "07bbbd0ba620cf5b40148a4a5ba61e67e2423b528cb73e7db95013405d01"
							+ "a5e083a519fc5ebb5861aa51e785df6e9e2afd7c9dc89b9cbd4edde24278"
							+ "0f52dc58c07f8259c7d803RSA4102413SHA512withRSA5645cb91606642d"
							+ "1d00b916fbde2ebb7954dfe2531abdb5174835b5c09413a6f0203010001";

	/*----------------------------
	  constructors
	----------------------------*/
	public MyLicense(int port, String host, String productEdition)
	{
		this.port = port;
		this.productEdition = productEdition;
		try {
			inetAddressHost = InetAddress.getByName(host);
		} catch (UnknownHostException e) {
			log.add("["+new Timestamp(System.currentTimeMillis()) + "]:"+"warn:"+"unknown host "+host);
//			e.printStackTrace();
		}

		this.license = LicenseValidator.validate(publicKey, "1", productEdition, "0.1", null, null, inetAddressHost, port, null, null, null);
	}

	/*----------------------------
	  methods
	----------------------------*/
	public boolean isValid()
	{
		log.add("["+new Timestamp(System.currentTimeMillis()) + "]:"+"info:"+"trying license-server "+port+"@"+host);
		log.add("["+new Timestamp(System.currentTimeMillis()) + "]:"+"info:"+"license validation returns "+license.getValidationStatus().toString());
		log.add("["+new Timestamp(System.currentTimeMillis()) + "]:"+"info:"+"license issued for "+license.getLicenseText().getUserEMail()+ " expires in "+license.getLicenseText().getLicenseExpireDaysRemaining(null)+" day(s).");

		switch(license.getValidationStatus())
		{
			case LICENSE_VALID:
				return true;
			default:
				log.add("["+new Timestamp(System.currentTimeMillis()) + "]:"+"fatal:"+"no valid license found. forcing exit.");
				return false;
		}
	}
	
	/*----------------------------
	  methods getter & setter
	----------------------------*/
	public ArrayList<String> getLog()
	{
		return this.log;
	}

}
