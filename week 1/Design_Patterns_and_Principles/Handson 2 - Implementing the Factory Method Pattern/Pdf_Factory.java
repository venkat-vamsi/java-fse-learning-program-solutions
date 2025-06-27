public class Pdf_Factory extends Factory{
    public Document createDocument() {
        return new PdfDocument();
    }
}
