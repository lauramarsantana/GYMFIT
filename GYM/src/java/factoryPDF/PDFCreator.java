/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryPDF;

// PDFCreator.java
import java.io.IOException;
import java.util.List;
import logica.Ejercicio;

public class PDFCreator {
    private PDFContentGenerator contentGenerator;
    private ImageRender imageRenderer;

    public PDFCreator(PDFContentGenerator contentGenerator, ImageRender imageRenderer) {
        this.contentGenerator = contentGenerator;
        this.imageRenderer = imageRenderer;
    }

    public void createExercisePDF(List<List<Ejercicio>> exercises, String outputPath) throws IOException {
        contentGenerator.createPDFContent(exercises, outputPath);
        System.out.println("PDF con la lista de ejercicios creado correctamente en: " + outputPath);
    }
}
