package sikuli;


import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopMouse;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;

public class SikuliImageRecognition {

    private ScreenRegion screenRegion;

    public SikuliImageRecognition(){
        screenRegion = new DesktopScreenRegion();
    }

    public void clickOnImage(String imageName) {
        File buttonPathFile = new File("src\\test\\resources\\images\\" + imageName);
        Target imageTarget = new ImageTarget(buttonPathFile);
        ScreenRegion region = screenRegion.wait(imageTarget, 7000);
        Mouse mouse = new DesktopMouse();
        mouse.click(region.getCenter());
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Robot robot;
        try {
            robot = new Robot();
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
