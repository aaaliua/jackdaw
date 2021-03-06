package com.github.vbauer.jackdaw;

import com.github.vbauer.jackdaw.annotation.JAdapter;
import com.github.vbauer.jackdaw.annotation.JMessage;

/**
 * @author Vladislav Bauer
 */

@JAdapter
@JMessage({
    "Do not forget to remove this class in the next release",
    "MouseListener interface will be used instead of it"
})
public abstract class AbstractMouseListener implements MouseListener {

    private int x;
    private int y;


    public AbstractMouseListener() {
        this(0, 0);
    }

    public AbstractMouseListener(final int x, final int y) {
        this.x = x;
        this.y = y;
    }


    protected abstract void testMouse();

    @Override
    public int getX() {
        return x;
    }

    @Override
    public Integer getY() {
        return y;
    }

}
