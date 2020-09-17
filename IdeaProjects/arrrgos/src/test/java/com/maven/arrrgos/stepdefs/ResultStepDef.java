package com.maven.arrrgos.stepdefs;

import com.maven.arrrgos.pageobjects.Result;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class ResultStepDef {
    Result result = new Result();

    @And("^I select \"([^\"]*)\" category$")
    public void iSelectCategory(String csp) throws Throwable {
        result.selectedCategory(csp);

    }
    @And("^I select \"([^\"]*)\" categoryFilters$")
    public void iSelectCategoryFilters(String csf) throws Throwable {
       result.selectedCategoryFilters(csf);
    }



    @And("^I select filters \"([^\"]*)\"$")
    public void iSelectFilters(String csf) throws Throwable {
        result.selectedFilter(csf);
       // result.setAlert();
    }



}
