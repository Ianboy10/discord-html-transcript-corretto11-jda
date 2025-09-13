package de.ianboy10.utils.format.impl;
import de.ianboy10.utils.format.IFormatHelper;
import java.util.Arrays;
import java.util.List;

public class ImageFormat implements IFormatHelper {

    final List<String> formats = Arrays.asList("png", "jpg", "jpeg", "gif");
    @Override
    public List<String> formats() {
        return formats;
    }
}
