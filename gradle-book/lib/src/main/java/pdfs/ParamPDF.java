package pdfs;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ParamPDF {
    public static final String RESULT = "my.pdf";

    public static final String MSG = "Hello";

    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        if (args.length == 0) {
            new ParamPDF().createPDF(RESULT, MSG);
        } else {
            new ParamPDF().createPDF(RESULT, args[0]);
        }

    }

    private void createPDF(String fileName, String word) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(fileName));

        document.open();
        document.add(new Paragraph(word));
        document.close();
    }


}
