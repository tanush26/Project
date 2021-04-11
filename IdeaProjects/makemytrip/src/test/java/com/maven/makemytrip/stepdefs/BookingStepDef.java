package com.maven.makemytrip.stepdefs;
import com.maven.makemytrip.pageobjects.Booking;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BookingStepDef {
   private Booking booking = new Booking();
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on \"([^\"]*)\" Link and I click on \"([^\"]*)\"$")
    public void iClickOnLinkAndIClickOn(String arg0, String arg1) throws Throwable {
        booking.selFlightAndRoundTrip();
    }


    @And("^select from \"([^\"]*)\"$")
    public void selectFrom(String arg0) throws Throwable {
       booking.from();
    }

    @And("^select to \"([^\"]*)\"$")
    public void selectTo(String arg0) throws Throwable {
       booking.To();
    }


    @And("^select \"([^\"]*)\" and \"([^\"]*)\"$")
    public void selectAnd(String arg0, String arg1) throws Throwable {
       booking.setDepartureDate();
       booking.setReturnDate();
    }

    @And("^printing total number of departure flights and return flights$")
    public void printingTotalNumberOfDepartureFlightsAndReturnFlights() {
        booking.printTotal();
        booking.selectedNames();
    }

    @And("^select stops \"([^\"]*)\" and \"([^\"]*)\"$")
    public void selectStopsAnd(String arg0, String arg1) throws Throwable {
       booking.stop();
    }
}
