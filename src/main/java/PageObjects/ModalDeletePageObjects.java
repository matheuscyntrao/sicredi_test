package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModalDeletePageObjects {

    @FindBy(css = "body > div.container-fluid.gc-container > div.row > div.delete-confirmation.modal.fade.in.show > div > div > div.modal-header > h5")
    private WebElement modal_title;

    @FindBy(css = "body > div.container-fluid.gc-container > div.row > div.delete-confirmation.modal.fade.in.show > div > div > div.modal-body > p")
    private WebElement modal_text;

    @FindBy(css = "body > div.container-fluid.gc-container > div.row > div.delete-confirmation.modal.fade.in.show > div > div > div.modal-footer > button.btn.btn-secondary")
    private WebElement modal_button_cancel;

    @FindBy(css = "body > div.container-fluid.gc-container > div.row > div.delete-confirmation.modal.fade.in.show > div > div > div.modal-footer > button.btn.btn-danger.delete-confirmation-button")
    private WebElement modal_button_delete;

}
