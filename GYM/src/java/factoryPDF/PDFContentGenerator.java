/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryPDF;

import java.io.IOException;
import java.util.List;
import logica.Ejercicio;

/**
 *
 * @author carla
 */
public interface PDFContentGenerator {
    void createPDFContent(List<List<Ejercicio>> exercises, String outputPath) throws IOException;
}
