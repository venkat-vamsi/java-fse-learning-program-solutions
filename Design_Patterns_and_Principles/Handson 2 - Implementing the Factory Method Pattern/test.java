public class test{
    public static void main(String[] args) {
        Factory wordFactory = new Word_Factory();
        Document word = wordFactory.createDocument();
        word.vit();

        Factory pdfFactory = new Pdf_Factory();
        Document pdf = pdfFactory.createDocument();
        pdf.vit();

        Factory excelFactory = new Excel_Factory();
        Document excel = excelFactory.createDocument();
        excel.vit();
    }
}
