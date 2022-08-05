package locators;

public class LocatorsDiskPage {
    public static final String DISK = "//div[contains(@class, 'desk-notif-card')]//a[text()='Диск']";
    public static final String FILE_FOR_COPY = "//div[contains(@class, 'listing-item__title') and contains(@aria-label,'Файл для копирования.docx')]//ancestor::div[contains(@class, 'listing-item_type_file')]";
    public static final String COPY_BUTTON_PANEL = "//div[contains(@class, 'resources-actions-popup__action_type_copy')]";
    public static final String TEST_PACKAGE_MENU = "//div[contains(@class, 'b-tree__name') and text()='Тестовая папка']";
    public static final String COPY_BUTTON = "//span[text()='Копировать']//ancestor::button[contains(@class, 'Button2_view_action')]";
    public static final String DISK_ELEMENTS = "//div[@class ='listing-item listing-item_theme_tile listing-item_size_m listing-item_type_file js-prevent-deselect']";
    public static final String TEST_PACKAGE = "//div[contains(@class, 'listing-item__title') and contains(@aria-label,'Тестовая папка')]//ancestor::div[contains(@class, 'listing-item_type_dir')]";
    public static final String FILE_FOR_DELETE = "//div[contains(@class, 'listing-item__title') and contains(@aria-label,'Просто документ.docx')]//ancestor::div[contains(@class, 'listing-item_type_file')]";
    public static final String DELETE_BUTTON_PANEL = "//div[contains(@class, 'resources-actions-popup__action_type_delete')]";

}
