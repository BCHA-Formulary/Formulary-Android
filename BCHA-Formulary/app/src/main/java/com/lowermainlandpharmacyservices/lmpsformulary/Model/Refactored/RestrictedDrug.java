package com.lowermainlandpharmacyservices.lmpsformulary.Model.Refactored;

import java.util.List;

/**
 * Created by Kelvin on 6/5/2016.
 */
public class RestrictedDrug extends DrugBase {
    public String criteria;

    public RestrictedDrug(){}

    public RestrictedDrug(String primaryName, NameType nameType, List<String> alternateNames, List<String> drugClass, Status status, String criteria) {
        super(primaryName, nameType, alternateNames, drugClass, status);
        this.criteria = criteria;
    }

    public RestrictedDrug(String criteria, DrugBase drugBase) {
        super(drugBase);
        this.criteria = criteria;
    }
}
