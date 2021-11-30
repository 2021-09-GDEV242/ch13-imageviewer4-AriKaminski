import java.awt.Color;

/**
 * An image filter to imitate Andy Warhol images.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 1.0
 */
public class WarholFilter extends Filter
{

	/**
	 * Constructor for objects of class GrayScaleFilter.
	 * @param name The name of the filter.
	 */
	public WarholFilter(String name)
    {
        super(name);
        RedTintFilter RedTintFilter = new RedTintFilter("");
        BlueTintFilter BlueTintFiler = new BlueTintFilter("");
        GreenTintFilter GreenTintFilter = new GreenTintFilter("");
	}

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight() / 4;
        int width = image.getWidth() / 4;
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                
            }
        }
    }
}