package org.nikkii.alertify4j;

import org.nikkii.alertify4j.ui.AlertifyWindowClick;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.Optional;

/**
 * An alert config.
 *
 * @author Nikki
 */
public class AlertifyConfig {

	/**
	 * The alert type.
	 */
	private final AlertifyType type;
	/**
	 * The alert font.
	 */
	private final Font font;

	/**
	 * The alert label.
	 */
	private final JLabel label;

	/**
	 * The close delay, or 0 if it will not automatically close.
	 */
	private final long closeDelay;

	/**
	 * The window callback.
	 */
	private final AlertifyWindowClick callback;

	/**
	 * Create a new Alertify config.
	 * @param type The alert type.
	 * @param label The alert label.
	 * @param closeDelay The close delay.
	 * @param callback The callback.
	 */
	public AlertifyConfig(AlertifyType type, JLabel label, long closeDelay, AlertifyWindowClick callback, Font font) {
		this.type = type;
		this.label = label;
		this.closeDelay = closeDelay;
		this.callback = callback;
		this.font = font;
	}

	/**
	 * Get the alert type.
	 *
	 * @return The alert type.
	 */
	public AlertifyType getType() {
		return type;
	}
	
	/**
	 * Get the alert font.
	 *
	 * @return The alert font.
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * Get the alert label.
	 *
	 * @return The alert label.
	 */
	public JLabel getLabel() {
		return label;
	}

	/**
	 * Get the click callback.
	 *
	 * @return The click callback.
	 */
	public Optional<AlertifyWindowClick> getCallback() {
		return Optional.ofNullable(callback);
	}

	/**
	 * Return whether we should register an auto close task.
	 *
	 * @return If closeDelay != 0, true.
	 */
	public boolean shouldAutoClose() {
		return closeDelay != 0;
	}

	/**
	 * Get the close delay.
	 *
	 * @return The close delay, in milliseconds.
	 */
	public long getCloseDelay() {
		return closeDelay;
	}
}
