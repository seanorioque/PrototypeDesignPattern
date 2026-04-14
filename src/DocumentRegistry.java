public class DocumentRegistry {
    private final PdfDocument pdfPrototype;
    private final TextDocument textDocumentPrototype;
    private final SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("default.pdf", "Unknown", 0, "Default PDF");

        System.out.println("Creating a Text Document prototype.");
        textDocumentPrototype = new TextDocument("default.txt", "UTF-8", 0);

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument("default.xlsx", 0, 0);
    }

    public PdfDocument createPdf(String fileName, String author, int pageCount, String name) {
        PdfDocument doc = pdfPrototype.clone();
        doc.setFileName(fileName);
        doc.setAuthor(author);
        doc.setPageCount(pageCount);
        doc.setName(name);
        return doc;
    }

    public TextDocument createTextDocument(String filePath, String encoding, int wordCount) {
        TextDocument doc = textDocumentPrototype.clone();
        doc.setFilePath(filePath);
        doc.setEncoding(encoding);
        doc.setWordCount(wordCount);
        return doc;
    }

    public SpreadsheetDocument createSpreadsheet(String name, int rows, int columns) {
        SpreadsheetDocument doc = spreadsheetPrototype.clone();
        doc.setSpreadsheetName(name);
        doc.setRowCount(rows);
        doc.setColumnCount(columns);
        return doc;
    }
}