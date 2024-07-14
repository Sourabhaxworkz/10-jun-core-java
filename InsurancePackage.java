class InsurancePackage{

	public static double search(String insuranceName){
			double insurancePrice = 0.0;
		if(insuranceName == "Hdfc life insurance"){
			insurancePrice = 8000.30;
			return insurancePrice;
		}
		if(insuranceName == "Max Lie"){
			return 6000.30;
		}
		if(insuranceName == "PNB Life"){
			return 7000.30;
		}
		if(insuranceName == "ICIC Life"){
			return 9000.30;
		}
		if(insuranceName == "SBI Smart Shield"){
			return  8956.20;
		}
		if(insuranceName == "LIC"){
			return  7895.36;
		}
		if(insuranceName == "Bajaj Allianz Life  Insurance"){
			return 7896.36;
		}
		if(insuranceName == "Tata Life Insurance"){
			return  7896.364;
		}
		if(insuranceName == "Kotak Mahindra Life  Insurance"){
			return 7563.21;
		}
		if(insuranceName == "Aditya Birla Sun Life Insurance"){
			return 8456.32;
		}
		if(insuranceName == "ING VYSYA LIFE INSURANCE"){
			return 8756.35;
		}
		if(insuranceName == "Reliance Nippon Life  Insurance"){
			return 7896.32;
		}
		if(insuranceName == "Canara HSBC Oriental Bank of Commerce Life  Insurance"){
			return 5698.34;
		}
		if(insuranceName == "Bharti AXA Life  Insurance"){
			return 4569.36;
		}
		if(insuranceName == "Aviva Life  Insurance"){
			return 4568.36;
		}
		else{
			System.out.println(insuranceName + " not found");
		}
		return insurancePrice;
	}
}