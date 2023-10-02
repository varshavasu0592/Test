package StepDefinition;

import io.cucumber.java.en.When;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Prod {

    @When("user validates capcha")
    public void user_validates_capcha() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {

        List<List<String>> data = dataTable.asLists(String.class);
       System.out.println("first row "+data.get(0).get(0));
        System.out.println("first row "+data.get(0).get(1));
        System.out.println("second row "+data.get(1).get(0));
        System.out.println("secind row "+data.get(1).get(1));
    }

    @When("user enters firstname and middlename")
    public void user(io.cucumber.datatable.DataTable dataTable) {

        List<Map<String, String>>  map =  dataTable.asMaps(String.class,String.class);
        System.out.println("first row "+map.get(0).get("firstname"));
        System.out.println("first row "+map.get(0).get("middlename"));
        System.out.println("first row "+map.get(1).get("firstname"));
        System.out.println("first row "+map.get(1).get("middlename"));
//        Map<String, String> stringStringMap = map.get(0);
//
//        for(String s : stringStringMap.keySet())
//        {
//            System.out.println(stringStringMap.get(s)) ;
//        }

    }


}
