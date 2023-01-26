package com.sharedbox.common.image;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.sharedbox.common.identify.CodeDecorator;
import com.sharedbox.common.utils.FileUtils;

/**
 * Add a image overlay to a code
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 09/01/2021 Version 1.0.0
 */
public class ImageOverlay implements CodeDecorator<BufferedImage> {
	/**
	 * 
	 */
	public static final Float DEFAULT_OVERLAY_TRANSPARENCY = 1f;

	/**
	 * 
	 */
	public static final Float DEFAULT_OVERLAY_RATIO = 0.25f;

	/**
	 * 
	 */
	private BufferedImage overlay;

	/**
	 * 
	 */
	private Float overlayRatio;

	/**
	 * 
	 */
	private Float transparency;

	/**
	 * Constructor
	 */
	private ImageOverlay(BufferedImage overlay, Float transparency, Float overlayRatio) {
		super();
		if (overlay == null) {
			throw new IllegalArgumentException("Overlay is required");
		}

		this.overlay = overlay;
		this.transparency = transparency == null ? DEFAULT_OVERLAY_TRANSPARENCY : transparency;
		this.overlayRatio = overlayRatio == null ? DEFAULT_OVERLAY_RATIO : overlayRatio;
	}

	/**
	 * Add overlay image It's safe to add a overlay that takes up more than 25%, if
	 * the transparency is less than .20
	 * 
	 * @param pathOverlay  - Image path of overlay rendered
	 * @param transparency - the overlays transparency from 0..1 where one is no
	 *                     transparency. Default is set to 1
	 * @param overlayRatio - Specifies the ratio of overlay image to QRCode in
	 *                     percentage, such as 0.20 = 20%. Overlays must not occupy
	 *                     more than 25% of the QRCode, otherwise code readability
	 *                     may be compromised. Default is set to 25%
	 * @throws Exception
	 */
	public static CodeDecorator<BufferedImage> addImageOverlay(String pathOverlay, Float transparency, Float overlayRatio)
			throws Exception {
		return addImageOverlay(new File(pathOverlay), transparency, overlayRatio);
	}

	/**
	 * Add overlay image It's safe to add a overlay that takes up more than 25%, if
	 * the transparency is less than .20
	 * 
	 * @param pathOverlay - Image path of overlay rendered
	 * @throws Exception
	 */
	public static CodeDecorator<BufferedImage> addImageOverlay(String pathOverlay) throws Exception {
		return addImageOverlay(new File(pathOverlay));
	}

	/**
	 * Add overlay image It's safe to add a overlay that takes up more than 25%, if
	 * the transparency is less than .20
	 * 
	 * @param pathOverlay  - Image file path (java.io.File) of overlay rendered
	 * @param transparency - the overlays transparency from 0..1 where one is no
	 *                     transparency. Default is set to 1
	 * @param overlayRatio - Specifies the ratio of overlay image to QRCode in
	 *                     percentage, such as 0.20 = 20%. Overlays must not occupy
	 *                     more than 25% of the QRCode, otherwise code readability
	 *                     may be compromised. Default is set to 25%
	 * @throws Exception
	 */
	public static CodeDecorator<BufferedImage> addImageOverlay(File overlay, Float transparency, Float overlayRatio)
			throws Exception {
		return addImageOverlay(FileUtils.getFile(overlay), transparency, overlayRatio);
	}

	/**
	 * Add overlay image It's safe to add a overlay that takes up more than 25%, if
	 * the transparency is less than .20
	 * 
	 * @param pathOverlay - Image file path (java.io.File) of overlay rendered
	 * @throws Exception
	 */
	public static CodeDecorator<BufferedImage> addImageOverlay(File overlay) throws Exception {
		return addImageOverlay(FileUtils.getFile(overlay));
	}

	/**
	 * Add overlay image It's safe to add a overlay that takes up more than 25%, if
	 * the transparency is less than .20
	 * 
	 * @param pathOverlay  - Image InputStream of overlay rendered
	 * @param transparency - the overlays transparency from 0..1 where one is no
	 *                     transparency. Default is set to 1
	 * @param overlayRatio - Specifies the ratio of overlay image to QRCode in
	 *                     percentage, such as 0.20 = 20%. Overlays must not occupy
	 *                     more than 25% of the QRCode, otherwise code readability
	 *                     may be compromised. Default is set to 25%
	 * @throws Exception
	 */
	public static CodeDecorator<BufferedImage> addImageOverlay(InputStream overlay, Float transparency, Float overlayRatio)
			throws Exception {
		return addImageOverlay(ImageIO.read(overlay), transparency, overlayRatio);
	}

	/**
	 * Add overlay image It's safe to add a overlay that takes up more than 25%, if
	 * the transparency is less than .20
	 * 
	 * @param pathOverlay - Image InputStream of overlay rendered
	 * @throws Exception
	 */
	public static CodeDecorator<BufferedImage> addImageOverlay(InputStream overlay) throws Exception {
		return addImageOverlay(ImageIO.read(overlay));
	}

	/**
	 * Add overlay image It's safe to add a overlay that takes up more than 25%, if
	 * the transparency is less than .20
	 * 
	 * @param pathOverlay  - BufferedImage of overlay rendered
	 * @param transparency - the overlays transparency from 0..1 where one is no
	 *                     transparency. Default is set to 1
	 * @param overlayRatio - Specifies the ratio of overlay image to QRCode in
	 *                     percentage, such as 0.20 = 20%. Overlays must not occupy
	 *                     more than 25% of the QRCode, otherwise code readability
	 *                     may be compromised. Default is set to 25%
	 * @throws Exception
	 */
	public static CodeDecorator<BufferedImage> addImageOverlay(BufferedImage overlay, Float transparency, Float overlayRatio) {
		return new ImageOverlay(overlay, transparency, overlayRatio);
	}

	/**
	 * Add overlay image It's safe to add a overlay that takes up more than 25%, if
	 * the transparency is less than .20
	 * 
	 * @param pathOverlay - BufferedImage of overlay rendered
	 * @throws Exception
	 */
	public static CodeDecorator<BufferedImage> addImageOverlay(BufferedImage overlay) {
		return addImageOverlay(overlay, null, null);
	}

	/**
	 * 
	 */
	public BufferedImage decorate(BufferedImage qrcode) {
		BufferedImage scaledOverlay = scaleOverlay(qrcode);

		Integer deltaHeight = qrcode.getHeight() - scaledOverlay.getHeight();
		Integer deltaWidth = qrcode.getWidth() - scaledOverlay.getWidth();

		BufferedImage combined = new BufferedImage(qrcode.getWidth(), qrcode.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = (Graphics2D) combined.getGraphics();
		g2.drawImage(qrcode, 0, 0, null);
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.transparency));
		g2.drawImage(scaledOverlay, Math.round(deltaWidth / 2), Math.round(deltaHeight / 2), null);

		return combined;
	}

	/**
	 * 
	 * @param qrcode
	 * @return
	 */
	private BufferedImage scaleOverlay(BufferedImage qrcode) {
		Integer scaledWidth = Math.round(qrcode.getWidth() * overlayRatio);
		Integer scaledHeight = Math.round(qrcode.getHeight() * overlayRatio);

		BufferedImage imageBuff = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = imageBuff.createGraphics();
		g.drawImage(this.overlay.getScaledInstance(scaledWidth, scaledHeight, BufferedImage.SCALE_SMOOTH), 0, 0, null);
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
		g.dispose();

		return imageBuff;
	}
}
