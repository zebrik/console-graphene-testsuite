package org.jboss.as.console.testsuite.fragments.shared.tables;

import org.jboss.as.console.testsuite.fragments.BaseFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResourceTableRowFragment extends BaseFragment {

    public String getCellValue(int index) {
        WebElement cell = getCell(index);

        return cell.getText();
    }

    public void click() {
        getCell(0).click();
    }

    public WebElement getCell(int index) {
        By selector = By.className("cellTableCell");
        List<WebElement> cells = root.findElements(selector);

        return cells.get(index);
    }
}
