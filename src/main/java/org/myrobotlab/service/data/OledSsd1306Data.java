package org.myrobotlab.service.data;

/**
 * @author Mats
 * 
 *         Static arrays to be used to initiate the OLED for different sizes
 * 
 */
public class OledSsd1306Data {

  public static final int[] SSD1306_96_16Data = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x80, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x80, 0x80, 0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0xC0, 0xE0, 0xF0, 0xF8, 0xFC, 0xF8, 0xE0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x80, 0x80, 0x80, 0x00, 0x80, 0x80, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x80, 0x80, 0x80, 0x00, 0xFF };

  public static final int[] SSD1306_128_32Data = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x80, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x80, 0x80, 0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0xC0, 0xE0, 0xF0, 0xF8, 0xFC, 0xF8, 0xE0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x80, 0x80, 0x80, 0x00, 0x80, 0x80, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x80, 0x80, 0x80, 0x00, 0xFF, 0xFF, 0xFF, 0x00,
      0x00, 0x00, 0x00, 0x80, 0x80, 0x80, 0x80, 0x00, 0x00, 0x80, 0x80, 0x00, 0x00, 0x80, 0xFF, 0xFF, 0x80, 0x80, 0x00, 0x80, 0x80, 0x00, 0x80, 0x80, 0x80, 0x80, 0x00, 0x80, 0x80,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x00, 0x00, 0x8C, 0x8E, 0x84, 0x00, 0x00, 0x80, 0xF8, 0xF8, 0xF8, 0x80, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xE0, 0xE0, 0xC0, 0x80, 0x00, 0xE0, 0xFC, 0xFE, 0xFF, 0xFF, 0xFF, 0x7F, 0xFF, 0xFF,
      0xFF, 0xFF, 0xFF, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xFE, 0xFF, 0xC7, 0x01, 0x01, 0x01, 0x01, 0x83, 0xFF, 0xFF, 0x00, 0x00,
      0x7C, 0xFE, 0xC7, 0x01, 0x01, 0x01, 0x01, 0x83, 0xFF, 0xFF, 0xFF, 0x00, 0x38, 0xFE, 0xC7, 0x83, 0x01, 0x01, 0x01, 0x83, 0xC7, 0xFF, 0xFF, 0x00, 0x00, 0x01, 0xFF, 0xFF, 0x01,
      0x01, 0x00, 0xFF, 0xFF, 0x07, 0x01, 0x01, 0x01, 0x00, 0x00, 0x7F, 0xFF, 0x80, 0x00, 0x00, 0x00, 0xFF, 0xFF, 0x7F, 0x00, 0x00, 0xFF, 0xFF, 0xFF, 0x00, 0x00, 0x01, 0xFF, 0xFF,
      0xFF, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x03, 0x0F, 0x3F, 0x7F, 0x7F, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xE7, 0xC7,
      0xC7, 0x8F, 0x8F, 0x9F, 0xBF, 0xFF, 0xFF, 0xC3, 0xC0, 0xF0, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xF8, 0xF8, 0xF0, 0xF0, 0xE0, 0xC0,
      0x00, 0x01, 0x03, 0x03, 0x03, 0x03, 0x03, 0x01, 0x03, 0x03, 0x00, 0x00, 0x00, 0x00, 0x01, 0x03, 0x03, 0x03, 0x03, 0x01, 0x01, 0x03, 0x01, 0x00, 0x00, 0x00, 0x01, 0x03, 0x03,
      0x03, 0x03, 0x01, 0x01, 0x03, 0x03, 0x00, 0x00, 0x00, 0x03, 0x03, 0x00, 0x00, 0x00, 0x03, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x03, 0x03, 0x03, 0x03, 0x03,
      0x01, 0x00, 0x00, 0x00, 0x01, 0x03, 0x01, 0x00, 0x00, 0x00, 0x03, 0x03, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };

  public static final int[] SSD1306_128_64Data = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x80, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x80, 0x80, 0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0xC0, 0xE0, 0xF0, 0xF8, 0xFC, 0xF8, 0xE0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x80, 0x80, 0x80, 0x00, 0x80, 0x80, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x80, 0x80, 0x80, 0x00, 0xFF, 0xFF, 0xFF, 0x00,
      0x00, 0x00, 0x00, 0x80, 0x80, 0x80, 0x80, 0x00, 0x00, 0x80, 0x80, 0x00, 0x00, 0x80, 0xFF, 0xFF, 0x80, 0x80, 0x00, 0x80, 0x80, 0x00, 0x80, 0x80, 0x80, 0x80, 0x00, 0x80, 0x80,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x00, 0x00, 0x8C, 0x8E, 0x84, 0x00, 0x00, 0x80, 0xF8, 0xF8, 0xF8, 0x80, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xE0, 0xE0, 0xC0, 0x80, 0x00, 0xE0, 0xFC, 0xFE, 0xFF, 0xFF, 0xFF, 0x7F, 0xFF, 0xFF,
      0xFF, 0xFF, 0xFF, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xFE, 0xFF, 0xC7, 0x01, 0x01, 0x01, 0x01, 0x83, 0xFF, 0xFF, 0x00, 0x00,
      0x7C, 0xFE, 0xC7, 0x01, 0x01, 0x01, 0x01, 0x83, 0xFF, 0xFF, 0xFF, 0x00, 0x38, 0xFE, 0xC7, 0x83, 0x01, 0x01, 0x01, 0x83, 0xC7, 0xFF, 0xFF, 0x00, 0x00, 0x01, 0xFF, 0xFF, 0x01,
      0x01, 0x00, 0xFF, 0xFF, 0x07, 0x01, 0x01, 0x01, 0x00, 0x00, 0x7F, 0xFF, 0x80, 0x00, 0x00, 0x00, 0xFF, 0xFF, 0x7F, 0x00, 0x00, 0xFF, 0xFF, 0xFF, 0x00, 0x00, 0x01, 0xFF, 0xFF,
      0xFF, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x03, 0x0F, 0x3F, 0x7F, 0x7F, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xE7, 0xC7,
      0xC7, 0x8F, 0x8F, 0x9F, 0xBF, 0xFF, 0xFF, 0xC3, 0xC0, 0xF0, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xF8, 0xF8, 0xF0, 0xF0, 0xE0, 0xC0,
      0x00, 0x01, 0x03, 0x03, 0x03, 0x03, 0x03, 0x01, 0x03, 0x03, 0x00, 0x00, 0x00, 0x00, 0x01, 0x03, 0x03, 0x03, 0x03, 0x01, 0x01, 0x03, 0x01, 0x00, 0x00, 0x00, 0x01, 0x03, 0x03,
      0x03, 0x03, 0x01, 0x01, 0x03, 0x03, 0x00, 0x00, 0x00, 0x03, 0x03, 0x00, 0x00, 0x00, 0x03, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x03, 0x03, 0x03, 0x03, 0x03,
      0x01, 0x00, 0x00, 0x00, 0x01, 0x03, 0x01, 0x00, 0x00, 0x00, 0x03, 0x03, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x80, 0xC0, 0xE0, 0xF0, 0xF9, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0x3F, 0x1F, 0x0F, 0x87, 0xC7, 0xF7, 0xFF, 0xFF, 0x1F, 0x1F, 0x3D, 0xFC, 0xF8, 0xF8, 0xF8, 0xF8, 0x7C, 0x7D,
      0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0x7F, 0x3F, 0x0F, 0x07, 0x00, 0x30, 0x30, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xFE, 0xFE, 0xFC, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0xE0, 0xC0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x30, 0x30, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xC0, 0xFE, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0x7F, 0x7F, 0x3F, 0x1F, 0x0F, 0x07, 0x1F,
      0x7F, 0xFF, 0xFF, 0xF8, 0xF8, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFE, 0xF8, 0xE0, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xFE, 0xFE, 0x00, 0x00,
      0x00, 0xFC, 0xFE, 0xFC, 0x0C, 0x06, 0x06, 0x0E, 0xFC, 0xF8, 0x00, 0x00, 0xF0, 0xF8, 0x1C, 0x0E, 0x06, 0x06, 0x06, 0x0C, 0xFF, 0xFF, 0xFF, 0x00, 0x00, 0xFE, 0xFE, 0x00, 0x00,
      0x00, 0x00, 0xFC, 0xFE, 0xFC, 0x00, 0x18, 0x3C, 0x7E, 0x66, 0xE6, 0xCE, 0x84, 0x00, 0x00, 0x06, 0xFF, 0xFF, 0x06, 0x06, 0xFC, 0xFE, 0xFC, 0x0C, 0x06, 0x06, 0x06, 0x00, 0x00,
      0xFE, 0xFE, 0x00, 0x00, 0xC0, 0xF8, 0xFC, 0x4E, 0x46, 0x46, 0x46, 0x4E, 0x7C, 0x78, 0x40, 0x18, 0x3C, 0x76, 0xE6, 0xCE, 0xCC, 0x80, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x07, 0x0F, 0x1F, 0x1F, 0x3F, 0x3F, 0x3F, 0x3F, 0x1F, 0x0F, 0x03, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x0F, 0x0F, 0x00, 0x00, 0x00, 0x0F, 0x0F, 0x0F, 0x00, 0x00, 0x00, 0x00, 0x0F, 0x0F, 0x00, 0x00, 0x03, 0x07, 0x0E, 0x0C, 0x18,
      0x18, 0x0C, 0x06, 0x0F, 0x0F, 0x0F, 0x00, 0x00, 0x01, 0x0F, 0x0E, 0x0C, 0x18, 0x0C, 0x0F, 0x07, 0x01, 0x00, 0x04, 0x0E, 0x0C, 0x18, 0x0C, 0x0F, 0x07, 0x00, 0x00, 0x00, 0x0F,
      0x0F, 0x00, 0x00, 0x0F, 0x0F, 0x0F, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x0F, 0x0F, 0x00, 0x00, 0x00, 0x07, 0x07, 0x0C, 0x0C, 0x18, 0x1C, 0x0C, 0x06, 0x06, 0x00, 0x04, 0x0E,
      0x0C, 0x18, 0x0C, 0x0F, 0x07, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
      0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };

  // simple 7x5 font
  public static final byte FONT[] = { (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x3E, (byte) 0x5B, (byte) 0x4F, (byte) 0x5B, (byte) 0x3E, (byte) 0x3E,
      (byte) 0x6B, (byte) 0x4F, (byte) 0x6B, (byte) 0x3E, (byte) 0x1C, (byte) 0x3E, (byte) 0x7C, (byte) 0x3E, (byte) 0x1C, (byte) 0x18, (byte) 0x3C, (byte) 0x7E, (byte) 0x3C,
      (byte) 0x18, (byte) 0x1C, (byte) 0x57, (byte) 0x7D, (byte) 0x57, (byte) 0x1C, (byte) 0x1C, (byte) 0x5E, (byte) 0x7F, (byte) 0x5E, (byte) 0x1C, (byte) 0x00, (byte) 0x18,
      (byte) 0x3C, (byte) 0x18, (byte) 0x00, (byte) 0xFF, (byte) 0xE7, (byte) 0xC3, (byte) 0xE7, (byte) 0xFF, (byte) 0x00, (byte) 0x18, (byte) 0x24, (byte) 0x18, (byte) 0x00,
      (byte) 0xFF, (byte) 0xE7, (byte) 0xDB, (byte) 0xE7, (byte) 0xFF, (byte) 0x30, (byte) 0x48, (byte) 0x3A, (byte) 0x06, (byte) 0x0E, (byte) 0x26, (byte) 0x29, (byte) 0x79,
      (byte) 0x29, (byte) 0x26, (byte) 0x40, (byte) 0x7F, (byte) 0x05, (byte) 0x05, (byte) 0x07, (byte) 0x40, (byte) 0x7F, (byte) 0x05, (byte) 0x25, (byte) 0x3F, (byte) 0x5A,
      (byte) 0x3C, (byte) 0xE7, (byte) 0x3C, (byte) 0x5A, (byte) 0x7F, (byte) 0x3E, (byte) 0x1C, (byte) 0x1C, (byte) 0x08, (byte) 0x08, (byte) 0x1C, (byte) 0x1C, (byte) 0x3E,
      (byte) 0x7F, (byte) 0x14, (byte) 0x22, (byte) 0x7F, (byte) 0x22, (byte) 0x14, (byte) 0x5F, (byte) 0x5F, (byte) 0x00, (byte) 0x5F, (byte) 0x5F, (byte) 0x06, (byte) 0x09,
      (byte) 0x7F, (byte) 0x01, (byte) 0x7F, (byte) 0x00, (byte) 0x66, (byte) 0x89, (byte) 0x95, (byte) 0x6A, (byte) 0x60, (byte) 0x60, (byte) 0x60, (byte) 0x60, (byte) 0x60,
      (byte) 0x94, (byte) 0xA2, (byte) 0xFF, (byte) 0xA2, (byte) 0x94, (byte) 0x08, (byte) 0x04, (byte) 0x7E, (byte) 0x04, (byte) 0x08, (byte) 0x10, (byte) 0x20, (byte) 0x7E,
      (byte) 0x20, (byte) 0x10, (byte) 0x08, (byte) 0x08, (byte) 0x2A, (byte) 0x1C, (byte) 0x08, (byte) 0x08, (byte) 0x1C, (byte) 0x2A, (byte) 0x08, (byte) 0x08, (byte) 0x1E,
      (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x0C, (byte) 0x1E, (byte) 0x0C, (byte) 0x1E, (byte) 0x0C, (byte) 0x30, (byte) 0x38, (byte) 0x3E, (byte) 0x38,
      (byte) 0x30, (byte) 0x06, (byte) 0x0E, (byte) 0x3E, (byte) 0x0E, (byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
      (byte) 0x5F, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x07, (byte) 0x00, (byte) 0x07, (byte) 0x00, (byte) 0x14, (byte) 0x7F, (byte) 0x14, (byte) 0x7F, (byte) 0x14,
      (byte) 0x24, (byte) 0x2A, (byte) 0x7F, (byte) 0x2A, (byte) 0x12, (byte) 0x23, (byte) 0x13, (byte) 0x08, (byte) 0x64, (byte) 0x62, (byte) 0x36, (byte) 0x49, (byte) 0x56,
      (byte) 0x20, (byte) 0x50, (byte) 0x00, (byte) 0x08, (byte) 0x07, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x1C, (byte) 0x22, (byte) 0x41, (byte) 0x00, (byte) 0x00,
      (byte) 0x41, (byte) 0x22, (byte) 0x1C, (byte) 0x00, (byte) 0x2A, (byte) 0x1C, (byte) 0x7F, (byte) 0x1C, (byte) 0x2A, (byte) 0x08, (byte) 0x08, (byte) 0x3E, (byte) 0x08,
      (byte) 0x08, (byte) 0x00, (byte) 0x80, (byte) 0x70, (byte) 0x30, (byte) 0x00, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x00, (byte) 0x00,
      (byte) 0x60, (byte) 0x60, (byte) 0x00, (byte) 0x20, (byte) 0x10, (byte) 0x08, (byte) 0x04, (byte) 0x02, (byte) 0x3E, (byte) 0x51, (byte) 0x49, (byte) 0x45, (byte) 0x3E,
      (byte) 0x00, (byte) 0x42, (byte) 0x7F, (byte) 0x40, (byte) 0x00, (byte) 0x72, (byte) 0x49, (byte) 0x49, (byte) 0x49, (byte) 0x46, (byte) 0x21, (byte) 0x41, (byte) 0x49,
      (byte) 0x4D, (byte) 0x33, (byte) 0x18, (byte) 0x14, (byte) 0x12, (byte) 0x7F, (byte) 0x10, (byte) 0x27, (byte) 0x45, (byte) 0x45, (byte) 0x45, (byte) 0x39, (byte) 0x3C,
      (byte) 0x4A, (byte) 0x49, (byte) 0x49, (byte) 0x31, (byte) 0x41, (byte) 0x21, (byte) 0x11, (byte) 0x09, (byte) 0x07, (byte) 0x36, (byte) 0x49, (byte) 0x49, (byte) 0x49,
      (byte) 0x36, (byte) 0x46, (byte) 0x49, (byte) 0x49, (byte) 0x29, (byte) 0x1E, (byte) 0x00, (byte) 0x00, (byte) 0x14, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x40,
      (byte) 0x34, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x08, (byte) 0x14, (byte) 0x22, (byte) 0x41, (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0x14,
      (byte) 0x00, (byte) 0x41, (byte) 0x22, (byte) 0x14, (byte) 0x08, (byte) 0x02, (byte) 0x01, (byte) 0x59, (byte) 0x09, (byte) 0x06, (byte) 0x3E, (byte) 0x41, (byte) 0x5D,
      (byte) 0x59, (byte) 0x4E, (byte) 0x7C, (byte) 0x12, (byte) 0x11, (byte) 0x12, (byte) 0x7C, (byte) 0x7F, (byte) 0x49, (byte) 0x49, (byte) 0x49, (byte) 0x36, (byte) 0x3E,
      (byte) 0x41, (byte) 0x41, (byte) 0x41, (byte) 0x22, (byte) 0x7F, (byte) 0x41, (byte) 0x41, (byte) 0x41, (byte) 0x3E, (byte) 0x7F, (byte) 0x49, (byte) 0x49, (byte) 0x49,
      (byte) 0x41, (byte) 0x7F, (byte) 0x09, (byte) 0x09, (byte) 0x09, (byte) 0x01, (byte) 0x3E, (byte) 0x41, (byte) 0x41, (byte) 0x51, (byte) 0x73, (byte) 0x7F, (byte) 0x08,
      (byte) 0x08, (byte) 0x08, (byte) 0x7F, (byte) 0x00, (byte) 0x41, (byte) 0x7F, (byte) 0x41, (byte) 0x00, (byte) 0x20, (byte) 0x40, (byte) 0x41, (byte) 0x3F, (byte) 0x01,
      (byte) 0x7F, (byte) 0x08, (byte) 0x14, (byte) 0x22, (byte) 0x41, (byte) 0x7F, (byte) 0x40, (byte) 0x40, (byte) 0x40, (byte) 0x40, (byte) 0x7F, (byte) 0x02, (byte) 0x1C,
      (byte) 0x02, (byte) 0x7F, (byte) 0x7F, (byte) 0x04, (byte) 0x08, (byte) 0x10, (byte) 0x7F, (byte) 0x3E, (byte) 0x41, (byte) 0x41, (byte) 0x41, (byte) 0x3E, (byte) 0x7F,
      (byte) 0x09, (byte) 0x09, (byte) 0x09, (byte) 0x06, (byte) 0x3E, (byte) 0x41, (byte) 0x51, (byte) 0x21, (byte) 0x5E, (byte) 0x7F, (byte) 0x09, (byte) 0x19, (byte) 0x29,
      (byte) 0x46, (byte) 0x26, (byte) 0x49, (byte) 0x49, (byte) 0x49, (byte) 0x32, (byte) 0x03, (byte) 0x01, (byte) 0x7F, (byte) 0x01, (byte) 0x03, (byte) 0x3F, (byte) 0x40,
      (byte) 0x40, (byte) 0x40, (byte) 0x3F, (byte) 0x1F, (byte) 0x20, (byte) 0x40, (byte) 0x20, (byte) 0x1F, (byte) 0x3F, (byte) 0x40, (byte) 0x38, (byte) 0x40, (byte) 0x3F,
      (byte) 0x63, (byte) 0x14, (byte) 0x08, (byte) 0x14, (byte) 0x63, (byte) 0x03, (byte) 0x04, (byte) 0x78, (byte) 0x04, (byte) 0x03, (byte) 0x61, (byte) 0x59, (byte) 0x49,
      (byte) 0x4D, (byte) 0x43, (byte) 0x00, (byte) 0x7F, (byte) 0x41, (byte) 0x41, (byte) 0x41, (byte) 0x02, (byte) 0x04, (byte) 0x08, (byte) 0x10, (byte) 0x20, (byte) 0x00,
      (byte) 0x41, (byte) 0x41, (byte) 0x41, (byte) 0x7F, (byte) 0x04, (byte) 0x02, (byte) 0x01, (byte) 0x02, (byte) 0x04, (byte) 0x40, (byte) 0x40, (byte) 0x40, (byte) 0x40,
      (byte) 0x40, (byte) 0x00, (byte) 0x03, (byte) 0x07, (byte) 0x08, (byte) 0x00, (byte) 0x20, (byte) 0x54, (byte) 0x54, (byte) 0x78, (byte) 0x40, (byte) 0x7F, (byte) 0x28,
      (byte) 0x44, (byte) 0x44, (byte) 0x38, (byte) 0x38, (byte) 0x44, (byte) 0x44, (byte) 0x44, (byte) 0x28, (byte) 0x38, (byte) 0x44, (byte) 0x44, (byte) 0x28, (byte) 0x7F,
      (byte) 0x38, (byte) 0x54, (byte) 0x54, (byte) 0x54, (byte) 0x18, (byte) 0x00, (byte) 0x08, (byte) 0x7E, (byte) 0x09, (byte) 0x02, (byte) 0x18, (byte) 0xA4, (byte) 0xA4,
      (byte) 0x9C, (byte) 0x78, (byte) 0x7F, (byte) 0x08, (byte) 0x04, (byte) 0x04, (byte) 0x78, (byte) 0x00, (byte) 0x44, (byte) 0x7D, (byte) 0x40, (byte) 0x00, (byte) 0x20,
      (byte) 0x40, (byte) 0x40, (byte) 0x3D, (byte) 0x00, (byte) 0x7F, (byte) 0x10, (byte) 0x28, (byte) 0x44, (byte) 0x00, (byte) 0x00, (byte) 0x41, (byte) 0x7F, (byte) 0x40,
      (byte) 0x00, (byte) 0x7C, (byte) 0x04, (byte) 0x78, (byte) 0x04, (byte) 0x78, (byte) 0x7C, (byte) 0x08, (byte) 0x04, (byte) 0x04, (byte) 0x78, (byte) 0x38, (byte) 0x44,
      (byte) 0x44, (byte) 0x44, (byte) 0x38, (byte) 0xFC, (byte) 0x18, (byte) 0x24, (byte) 0x24, (byte) 0x18, (byte) 0x18, (byte) 0x24, (byte) 0x24, (byte) 0x18, (byte) 0xFC,
      (byte) 0x7C, (byte) 0x08, (byte) 0x04, (byte) 0x04, (byte) 0x08, (byte) 0x48, (byte) 0x54, (byte) 0x54, (byte) 0x54, (byte) 0x24, (byte) 0x04, (byte) 0x04, (byte) 0x3F,
      (byte) 0x44, (byte) 0x24, (byte) 0x3C, (byte) 0x40, (byte) 0x40, (byte) 0x20, (byte) 0x7C, (byte) 0x1C, (byte) 0x20, (byte) 0x40, (byte) 0x20, (byte) 0x1C, (byte) 0x3C,
      (byte) 0x40, (byte) 0x30, (byte) 0x40, (byte) 0x3C, (byte) 0x44, (byte) 0x28, (byte) 0x10, (byte) 0x28, (byte) 0x44, (byte) 0x4C, (byte) 0x90, (byte) 0x90, (byte) 0x90,
      (byte) 0x7C, (byte) 0x44, (byte) 0x64, (byte) 0x54, (byte) 0x4C, (byte) 0x44, (byte) 0x00, (byte) 0x08, (byte) 0x36, (byte) 0x41, (byte) 0x00, (byte) 0x00, (byte) 0x00,
      (byte) 0x77, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x41, (byte) 0x36, (byte) 0x08, (byte) 0x00, (byte) 0x02, (byte) 0x01, (byte) 0x02, (byte) 0x04, (byte) 0x02,
      (byte) 0x3C, (byte) 0x26, (byte) 0x23, (byte) 0x26, (byte) 0x3C, (byte) 0x1E, (byte) 0xA1, (byte) 0xA1, (byte) 0x61, (byte) 0x12, (byte) 0x3A, (byte) 0x40, (byte) 0x40,
      (byte) 0x20, (byte) 0x7A, (byte) 0x38, (byte) 0x54, (byte) 0x54, (byte) 0x55, (byte) 0x59, (byte) 0x21, (byte) 0x55, (byte) 0x55, (byte) 0x79, (byte) 0x41, (byte) 0x21,
      (byte) 0x54, (byte) 0x54, (byte) 0x78, (byte) 0x41, (byte) 0x21, (byte) 0x55, (byte) 0x54, (byte) 0x78, (byte) 0x40, (byte) 0x20, (byte) 0x54, (byte) 0x55, (byte) 0x79,
      (byte) 0x40, (byte) 0x0C, (byte) 0x1E, (byte) 0x52, (byte) 0x72, (byte) 0x12, (byte) 0x39, (byte) 0x55, (byte) 0x55, (byte) 0x55, (byte) 0x59, (byte) 0x39, (byte) 0x54,
      (byte) 0x54, (byte) 0x54, (byte) 0x59, (byte) 0x39, (byte) 0x55, (byte) 0x54, (byte) 0x54, (byte) 0x58, (byte) 0x00, (byte) 0x00, (byte) 0x45, (byte) 0x7C, (byte) 0x41,
      (byte) 0x00, (byte) 0x02, (byte) 0x45, (byte) 0x7D, (byte) 0x42, (byte) 0x00, (byte) 0x01, (byte) 0x45, (byte) 0x7C, (byte) 0x40, (byte) 0xF0, (byte) 0x29, (byte) 0x24,
      (byte) 0x29, (byte) 0xF0, (byte) 0xF0, (byte) 0x28, (byte) 0x25, (byte) 0x28, (byte) 0xF0, (byte) 0x7C, (byte) 0x54, (byte) 0x55, (byte) 0x45, (byte) 0x00, (byte) 0x20,
      (byte) 0x54, (byte) 0x54, (byte) 0x7C, (byte) 0x54, (byte) 0x7C, (byte) 0x0A, (byte) 0x09, (byte) 0x7F, (byte) 0x49, (byte) 0x32, (byte) 0x49, (byte) 0x49, (byte) 0x49,
      (byte) 0x32, (byte) 0x32, (byte) 0x48, (byte) 0x48, (byte) 0x48, (byte) 0x32, (byte) 0x32, (byte) 0x4A, (byte) 0x48, (byte) 0x48, (byte) 0x30, (byte) 0x3A, (byte) 0x41,
      (byte) 0x41, (byte) 0x21, (byte) 0x7A, (byte) 0x3A, (byte) 0x42, (byte) 0x40, (byte) 0x20, (byte) 0x78, (byte) 0x00, (byte) 0x9D, (byte) 0xA0, (byte) 0xA0, (byte) 0x7D,
      (byte) 0x39, (byte) 0x44, (byte) 0x44, (byte) 0x44, (byte) 0x39, (byte) 0x3D, (byte) 0x40, (byte) 0x40, (byte) 0x40, (byte) 0x3D, (byte) 0x3C, (byte) 0x24, (byte) 0xFF,
      (byte) 0x24, (byte) 0x24, (byte) 0x48, (byte) 0x7E, (byte) 0x49, (byte) 0x43, (byte) 0x66, (byte) 0x2B, (byte) 0x2F, (byte) 0xFC, (byte) 0x2F, (byte) 0x2B, (byte) 0xFF,
      (byte) 0x09, (byte) 0x29, (byte) 0xF6, (byte) 0x20, (byte) 0xC0, (byte) 0x88, (byte) 0x7E, (byte) 0x09, (byte) 0x03, (byte) 0x20, (byte) 0x54, (byte) 0x54, (byte) 0x79,
      (byte) 0x41, (byte) 0x00, (byte) 0x00, (byte) 0x44, (byte) 0x7D, (byte) 0x41, (byte) 0x30, (byte) 0x48, (byte) 0x48, (byte) 0x4A, (byte) 0x32, (byte) 0x38, (byte) 0x40,
      (byte) 0x40, (byte) 0x22, (byte) 0x7A, (byte) 0x00, (byte) 0x7A, (byte) 0x0A, (byte) 0x0A, (byte) 0x72, (byte) 0x7D, (byte) 0x0D, (byte) 0x19, (byte) 0x31, (byte) 0x7D,
      (byte) 0x26, (byte) 0x29, (byte) 0x29, (byte) 0x2F, (byte) 0x28, (byte) 0x26, (byte) 0x29, (byte) 0x29, (byte) 0x29, (byte) 0x26, (byte) 0x30, (byte) 0x48, (byte) 0x4D,
      (byte) 0x40, (byte) 0x20, (byte) 0x38, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x38, (byte) 0x2F,
      (byte) 0x10, (byte) 0xC8, (byte) 0xAC, (byte) 0xBA, (byte) 0x2F, (byte) 0x10, (byte) 0x28, (byte) 0x34, (byte) 0xFA, (byte) 0x00, (byte) 0x00, (byte) 0x7B, (byte) 0x00,
      (byte) 0x00, (byte) 0x08, (byte) 0x14, (byte) 0x2A, (byte) 0x14, (byte) 0x22, (byte) 0x22, (byte) 0x14, (byte) 0x2A, (byte) 0x14, (byte) 0x08, (byte) 0xAA, (byte) 0x00,
      (byte) 0x55, (byte) 0x00, (byte) 0xAA, (byte) 0xAA, (byte) 0x55, (byte) 0xAA, (byte) 0x55, (byte) 0xAA, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x00,
      (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0xFF, (byte) 0x00, (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0xFF, (byte) 0x00, (byte) 0x10, (byte) 0x10, (byte) 0xFF,
      (byte) 0x00, (byte) 0xFF, (byte) 0x10, (byte) 0x10, (byte) 0xF0, (byte) 0x10, (byte) 0xF0, (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0xFC, (byte) 0x00, (byte) 0x14,
      (byte) 0x14, (byte) 0xF7, (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0xFF, (byte) 0x14, (byte) 0x14, (byte) 0xF4, (byte) 0x04,
      (byte) 0xFC, (byte) 0x14, (byte) 0x14, (byte) 0x17, (byte) 0x10, (byte) 0x1F, (byte) 0x10, (byte) 0x10, (byte) 0x1F, (byte) 0x10, (byte) 0x1F, (byte) 0x14, (byte) 0x14,
      (byte) 0x14, (byte) 0x1F, (byte) 0x00, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0xF0, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x1F, (byte) 0x10,
      (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x1F, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0xF0, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x00,
      (byte) 0xFF, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0xFF, (byte) 0x10, (byte) 0x00,
      (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x14, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0x00, (byte) 0x1F, (byte) 0x10,
      (byte) 0x17, (byte) 0x00, (byte) 0x00, (byte) 0xFC, (byte) 0x04, (byte) 0xF4, (byte) 0x14, (byte) 0x14, (byte) 0x17, (byte) 0x10, (byte) 0x17, (byte) 0x14, (byte) 0x14,
      (byte) 0xF4, (byte) 0x04, (byte) 0xF4, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0xF7, (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0x14,
      (byte) 0x14, (byte) 0x14, (byte) 0xF7, (byte) 0x00, (byte) 0xF7, (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0x17, (byte) 0x14, (byte) 0x10, (byte) 0x10, (byte) 0x1F,
      (byte) 0x10, (byte) 0x1F, (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0xF4, (byte) 0x14, (byte) 0x10, (byte) 0x10, (byte) 0xF0, (byte) 0x10, (byte) 0xF0, (byte) 0x00,
      (byte) 0x00, (byte) 0x1F, (byte) 0x10, (byte) 0x1F, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x1F, (byte) 0x14, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFC,
      (byte) 0x14, (byte) 0x00, (byte) 0x00, (byte) 0xF0, (byte) 0x10, (byte) 0xF0, (byte) 0x10, (byte) 0x10, (byte) 0xFF, (byte) 0x10, (byte) 0xFF, (byte) 0x14, (byte) 0x14,
      (byte) 0x14, (byte) 0xFF, (byte) 0x14, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x1F, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xF0, (byte) 0x10,
      (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xF0, (byte) 0xF0, (byte) 0xF0, (byte) 0xF0, (byte) 0xF0, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
      (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0xFF, (byte) 0x0F, (byte) 0x0F, (byte) 0x0F, (byte) 0x0F, (byte) 0x0F, (byte) 0x38,
      (byte) 0x44, (byte) 0x44, (byte) 0x38, (byte) 0x44, (byte) 0x7C, (byte) 0x2A, (byte) 0x2A, (byte) 0x3E, (byte) 0x14, (byte) 0x7E, (byte) 0x02, (byte) 0x02, (byte) 0x06,
      (byte) 0x06, (byte) 0x02, (byte) 0x7E, (byte) 0x02, (byte) 0x7E, (byte) 0x02, (byte) 0x63, (byte) 0x55, (byte) 0x49, (byte) 0x41, (byte) 0x63, (byte) 0x38, (byte) 0x44,
      (byte) 0x44, (byte) 0x3C, (byte) 0x04, (byte) 0x40, (byte) 0x7E, (byte) 0x20, (byte) 0x1E, (byte) 0x20, (byte) 0x06, (byte) 0x02, (byte) 0x7E, (byte) 0x02, (byte) 0x02,
      (byte) 0x99, (byte) 0xA5, (byte) 0xE7, (byte) 0xA5, (byte) 0x99, (byte) 0x1C, (byte) 0x2A, (byte) 0x49, (byte) 0x2A, (byte) 0x1C, (byte) 0x4C, (byte) 0x72, (byte) 0x01,
      (byte) 0x72, (byte) 0x4C, (byte) 0x30, (byte) 0x4A, (byte) 0x4D, (byte) 0x4D, (byte) 0x30, (byte) 0x30, (byte) 0x48, (byte) 0x78, (byte) 0x48, (byte) 0x30, (byte) 0xBC,
      (byte) 0x62, (byte) 0x5A, (byte) 0x46, (byte) 0x3D, (byte) 0x3E, (byte) 0x49, (byte) 0x49, (byte) 0x49, (byte) 0x00, (byte) 0x7E, (byte) 0x01, (byte) 0x01, (byte) 0x01,
      (byte) 0x7E, (byte) 0x2A, (byte) 0x2A, (byte) 0x2A, (byte) 0x2A, (byte) 0x2A, (byte) 0x44, (byte) 0x44, (byte) 0x5F, (byte) 0x44, (byte) 0x44, (byte) 0x40, (byte) 0x51,
      (byte) 0x4A, (byte) 0x44, (byte) 0x40, (byte) 0x40, (byte) 0x44, (byte) 0x4A, (byte) 0x51, (byte) 0x40, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x01, (byte) 0x03,
      (byte) 0xE0, (byte) 0x80, (byte) 0xFF, (byte) 0x00, (byte) 0x00, (byte) 0x08, (byte) 0x08, (byte) 0x6B, (byte) 0x6B, (byte) 0x08, (byte) 0x36, (byte) 0x12, (byte) 0x36,
      (byte) 0x24, (byte) 0x36, (byte) 0x06, (byte) 0x0F, (byte) 0x09, (byte) 0x0F, (byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x18, (byte) 0x18, (byte) 0x00, (byte) 0x00,
      (byte) 0x00, (byte) 0x10, (byte) 0x10, (byte) 0x00, (byte) 0x30, (byte) 0x40, (byte) 0xFF, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x1F, (byte) 0x01, (byte) 0x01,
      (byte) 0x1E, (byte) 0x00, (byte) 0x19, (byte) 0x1D, (byte) 0x17, (byte) 0x12, (byte) 0x00, (byte) 0x3C, (byte) 0x3C, (byte) 0x3C, (byte) 0x3C, (byte) 0x00, (byte) 0x00,
      (byte) 0x00, (byte) 0x00, (byte) 0x00, };
}
