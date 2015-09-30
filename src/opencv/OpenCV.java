/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package opencv;


import java.math.MathContext;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.*;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author Aryandev
 */
public class OpenCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       new  CamCapture().setVisible(true);
    }
    
}
