import java.awt.Color;

/**
 * An image filter to tint an image green.
 * 
 * @author Michael Kölling and David J. Barnes and Ari Kaminski
 * @version 4.0
 */
public class GreenTintFilter extends Filter
{
	/**
	 * Constructor for objects of class GrayScaleFilter.
	 * @param name The name of the filter.
	 */
	public GreenTintFilter(String name)
    {
        super(name);
	}

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int red = pix.getRed();
                if(red > 0) {
                    red = red - red;
                }
                int green = pix.getGreen();
                if(green > 0) {
                    green = green;
                }
                int blue = pix.getBlue();
                if(blue > 0 ) {
                    blue = blue - blue;
                }
                image.setPixel(x, y, new Color(red, green, blue));
            }
        }
    }
}
