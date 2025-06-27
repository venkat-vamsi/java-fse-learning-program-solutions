public class Excel_Factory extends Factory{
    public Document createDocument() {
        return new ExcelDocument();
    }
}
