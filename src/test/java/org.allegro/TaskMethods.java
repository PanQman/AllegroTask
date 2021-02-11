package org.allegro;

import io.restassured.path.json.JsonPath;
import org.allegro.pojo.Category;
import org.allegro.pojo.CategoryRoot;
import org.allegro.pojo.ParameterRoot;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TaskMethods extends BaseTest {

    @Test
    public void getaCategoryById() {
        Category category = new Category();

        JsonPath jsonPath = given().pathParam("categoryId", 12)
                .when().get("/sale/categories/{categoryId}")
                .jsonPath();
        category.setName(jsonPath.getString("name"));

        assertEquals(category.getName(), "Pozostałe", "Verification of attribute 'name'");
    }

    @Test
    public void getIdsOfAllegroCategories() {
        CategoryRoot categoryRoot = given()
                .when().get("/sale/categories")
                .as(CategoryRoot.class);

        assertTrue(categoryRoot.getCategories().size() > 0, "List of Categories");
    }


    @Test
    public void getParametersSupportedByCategory() {
        ParameterRoot parameterRoot = given()
                .pathParam("categoryId", 709)
                .when().get("/sale/categories/{categoryId}/parameters")
                .as(ParameterRoot.class);

        assertTrue(parameterRoot.getParameters().size() > 0, "List of Parameters");
    }



}
