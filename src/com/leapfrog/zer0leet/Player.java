/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.zer0leet;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Max
 */
public class Player {

    private int y = Pong.WINDOW_HEIGHT / 2;
    private int yVelocity = 0;
    private int width = 10;
    private int height = 40;

    public Player() {
    }

    public void update() {
        y = y + yVelocity;
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(35, y, width, height);
    }

    public void setYVelocity(int speed) {
        yVelocity = speed;
    }

    public int getX() {
        return 35;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

