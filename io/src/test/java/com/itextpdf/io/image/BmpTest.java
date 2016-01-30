package com.itextpdf.io.image;

import java.io.IOException;

import com.itextpdf.test.annotations.type.UnitTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(UnitTest.class)
public class BmpTest {

    static final public String sourceFolder = "./src/test/resources/com/itextpdf/io/image/";

    @Test
    public void openBmp1() throws IOException {
        Image img = ImageFactory.getImage(sourceFolder + "WP_20140410_001.bmp");
        BmpImageHelper.processImage(img, null);
        Assert.assertEquals(2592, img.getWidth(), 0);
        Assert.assertEquals(1456, img.getHeight(), 0);
        Assert.assertEquals(8, img.getBpc());
    }

    @Test
    public void openBmp2() throws IOException {
        Image img = ImageFactory.getImage(sourceFolder + "WP_20140410_001_gray.bmp");
        BmpImageHelper.processImage(img, null);
        Assert.assertEquals(2592, img.getWidth(), 0);
        Assert.assertEquals(1456, img.getHeight(), 0);
        Assert.assertEquals(8, img.getBpc());
    }

    @Test
    public void openBmp3() throws IOException {
        Image img = ImageFactory.getImage(sourceFolder + "WP_20140410_001_monochrome.bmp");
        BmpImageHelper.processImage(img, null);
        Assert.assertEquals(2592, img.getWidth(), 0);
        Assert.assertEquals(1456, img.getHeight(), 0);
        Assert.assertEquals(1, img.getBpc());
    }
}
