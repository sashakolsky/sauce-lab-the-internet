package com.dotdash.takehome.tests;

import com.dotdash.takehome.pages.ContextMenuPage;
import com.dotdash.takehome.pages.TheInternetHomePage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContextMenuTest extends BaseTest{

    @Test
    public void contextMenu_click() {
        ContextMenuPage contextMenuPage = new TheInternetHomePage(getDriver())
                .contextMenuClick()
                .hotSpotRightClick();

        assertThat(contextMenuPage.getAlertText()).contains("You selected a context menu");
        //contextMenuPage.closePopups();
    }

}
