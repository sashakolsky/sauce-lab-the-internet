package com.dotdash.takehome.tests;

import com.dotdash.takehome.base.BaseTest;
import com.dotdash.takehome.pages.DropdownPage;
import com.dotdash.takehome.pages.TheInternetHomePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Dropdown List page: /dropdown")
public class DropdownTest extends BaseTest {

    @Test
    @DisplayName("Verify value changes on select")
    void verifyValueChangesOnSelect() {
        String actual;
        DropdownPage dropdownPage;
        dropdownPage = new TheInternetHomePage(getDriver()).dropdownClick();

        dropdownPage.getDropdown().selectByValue("1");
        actual = dropdownPage.getDropdown().getFirstSelectedOption().getText();
        assertThat(actual).isEqualTo("Option 1");

        dropdownPage.getDropdown().selectByValue("2");
        actual = dropdownPage.getDropdown().getFirstSelectedOption().getText();
        assertThat(actual).isEqualTo("Option 2");
    }

}
