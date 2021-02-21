package pdfs;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ITextHello {
    public static final String RESULT = "build/hello.pdf";

    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        new ITextHello().createPDF(RESULT);
    }

    private void createPDF(String filename) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filename));

        document.open();
        document.add(new Paragraph("Hello Graph"));
        document.close();
    }

}
