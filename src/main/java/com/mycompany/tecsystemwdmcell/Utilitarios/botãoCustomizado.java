package com.mycompany.tecsystemwdmcell.Utilitarios;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class botãoCustomizado extends JButton implements MouseListener {

    public enum ButtonStyle {

        DEFAULT(new Color(255, 255, 255), new Color(221, 238, 255), new Color(126, 177, 229)),
        CADASTRAR(new Color(21, 53, 85), new Color(41, 105, 168), new Color(71, 96, 121)),
        LIMPAR(new Color(194, 225, 255), new Color(221, 238, 255), new Color(126, 177, 229)),
        ACESSORAPIDO(new Color(14, 122, 192), new Color(38, 153, 226), new Color(22, 85, 126)),
        CANCELAR(new Color(62, 174, 185), new Color(88, 200, 211), new Color(4, 127, 140));
        
        private final Color defaultColor;
        private final Color hoverColor;
        private final Color pressedColor;

        private ButtonStyle(Color defaultColor, Color hoverColor, Color pressedColor) {
            this.defaultColor = defaultColor;
            this.hoverColor = hoverColor;
            this.pressedColor = pressedColor;
        }

        public Color getDefaultColor() { return defaultColor; }

        public Color getHoverColor() { return hoverColor; }

        public Color getPressedColor() { return pressedColor; }
    }

    private ButtonStyle style;
    private int round;
    private Color backgroundColor;

    public botãoCustomizado() {
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setRolloverEnabled(false);
        setBorder(new EmptyBorder(8, 8, 8, 8));
        addMouseListener(this);
        this.backgroundColor = style.DEFAULT.defaultColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 0;
        int width = getWidth();
        int height = getHeight();
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, round, round));
        g2.setColor(backgroundColor);
        g2.fill(area);

        super.paintComponent(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        backgroundColor = style.getPressedColor();
        repaint();
        backgroundColor = style.getHoverColor();
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        backgroundColor = style.getPressedColor();
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        backgroundColor = style.getHoverColor();
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        backgroundColor = style.getDefaultColor();
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        backgroundColor = style.getHoverColor();
        repaint();
    }

    public void setStyle(ButtonStyle style) {
        this.style = style;
        this.backgroundColor = style.getDefaultColor();

    }

    public ButtonStyle getStyle() {
        return style;
    }

    public void setRound(int round) {
        this.round = round;
    }

}
