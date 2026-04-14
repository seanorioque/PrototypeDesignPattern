public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        System.out.println();

        // Create and open a PDF document
        PdfDocument pdf = registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");
        pdf.open();

        System.out.println();

        // Create and open a Text document
        TextDocument text = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        text.open();

        System.out.println();

        // Create and open a Spreadsheet document
        SpreadsheetDocument spreadsheet = registry.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);
        spreadsheet.open();

        System.out.println();

        // Clone the PDF and open a modified version
        PdfDocument summaryReport = registry.createPdf("summary_report.pdf", "Acme Corp", 30, "Summary Report");
        summaryReport.open();
    }
}