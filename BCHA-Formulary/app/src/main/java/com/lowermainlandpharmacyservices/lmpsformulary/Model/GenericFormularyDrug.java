package com.lowermainlandpharmacyservices.lmpsformulary.Model;

import java.util.ArrayList;

public class GenericFormularyDrug extends GenericDrug {
	public ArrayList<String> strengths;

	public GenericFormularyDrug(String genericName, String brandName,
			String strength, String drugClass) {
		super(genericName, brandName, "Formulary", drugClass);

		strengths = new ArrayList<String>();
		strengths.add(strength);
	}

	public void addStrength(String strength) {
		strengths.add(strength);
	}

	public ArrayList<String> getStrengths() {
		return strengths;
	}

}
