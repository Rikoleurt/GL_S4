package clock.util;

import javax.swing.*;
import java.util.Random;
import java.util.Vector;

public class RandomLayoutStrategy implements LayoutStrategy {

    private Random rand = new Random();

    @Override
    public void addFrameToLayout(Vector<JFrame> frames, JFrame frame) {
        if (!frames.contains(frame)) {
            frames.add(frame);
        }
        doLayout(frames);
    }

    @Override
    public void removeFrameFromLayout(Vector<JFrame> frames, JFrame frame) {
        frames.remove(frame);
        doLayout(frames);
    }

    @Override
    public void doLayout(Vector<JFrame> frames) {
        int screenWidth = 1200;
        int screenHeight = 800;

        for (JFrame frame : frames) {
            int x = rand.nextInt(screenWidth - frame.getWidth());
            int y = rand.nextInt(screenHeight - frame.getHeight());
            frame.setLocation(x, y);
        }
    }

    @Override
    public String getDescription() {
        return "Random Layout";
    }
}
