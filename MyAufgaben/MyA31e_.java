import ij.ImagePlus;
import ij.plugin.PlugIn;
import ij.process.ColorProcessor;
import ij.process.ImageProcessor;

/**
 * This a prototype ImageJ plug-in.
 */
public class MyA31e_ implements PlugIn {

    public void run(String arg) {
        int w = 400, h = 400;
        ImageProcessor ip = new ColorProcessor(w, h);
        int[] pixels = (int[]) ip.getPixels();
        int i = 0;
        int multiplier = 51;
        for (int y = 0; y < h; y++) {
            int j = 0;
            for (int x = 0; x < w; x++) {
                if (x != 0 && x % multiplier == 0)
                    j++;
                if (j % 2 == 0 && x >= j * multiplier && x < (j * multiplier) + multiplier) {
                    Double sin = (Math.sin((x % multiplier) * (2 * Math.PI / multiplier)));
                    Double val = ((0.5 * sin + 0.5) * 255);
                    pixels[i] = val.intValue() << 16 | val.intValue() << 8 | val.intValue();
                } else if (j % 2 != 0 && x >= j * multiplier && x < (j * multiplier) + multiplier) {
                    Double sin = (Math.sin((x % multiplier) * (2 * Math.PI / multiplier)));
                    Double val = ((0.5 * sin + 0.5) * 255);
                    pixels[i] = val.intValue() << 16 | val.intValue() << 8 | val.intValue();
                }
                i++;
            }
        }
        new ImagePlus("Saege", ip).show();
    }
}
