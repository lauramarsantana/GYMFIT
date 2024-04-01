/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryPDF;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.Ejercicio;

/**
 *
 * @author carla
 */
public class PDFContentGeneratorImp implements PDFContentGenerator {
    
    Document document = new Document();
    
    @Override
    public void createPDFContent(List<List<Ejercicio>> exercises, String outputPath) throws IOException {
        try{
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(outputPath));
            document.open();
            
            PdfContentByte cb = writer.getDirectContent();
            Graphics g = cb.createGraphics(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight());
            g.setColor(Color.BLACK);
            Font font = new Font("Tahoma",Font.PLAIN,30);
            
            int contador = 0;
            int x=10;
            int y=30;
            for (List<Ejercicio> e : exercises) {
                contador++;
                g.drawString("Dia "+contador+" :",x,y+30);
                for (Ejercicio exercise : e) {
                    g.drawString(exercise.getNombreEjercicio(), x, y+40);
                }
            }    
        } catch (DocumentException ex) {
            Logger.getLogger(PDFContentGeneratorImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        document.close();
        JOptionPane.showMessageDialog(null,"generado");
    }
}
