package com.gyang.exmaples.resizable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResizableComponentEx
    extends JFrame
{

    private Resizable res;

    public ResizableComponentEx()
    {

        initUI();
    }

    private void initUI()
    {

        JPanel pnl = new JPanel(null);
        add(pnl);

        JPanel area = new JPanel();
        area.setBackground(Color.blue);
        area.requestFocus();
        res = new Resizable(area);
        res.setBounds(50, 50, 200, 150);
        pnl.add(res);

        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent me)
            {
                requestFocus();
                res.repaint();
            }
        });

        setSize(350, 300);
        setTitle("Resizable component");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {

        EventQueue.invokeLater(new Runnable()
        {

            @Override
            public void run()
            {
                ResizableComponentEx ex = new ResizableComponentEx();
                ex.setVisible(true);
            }
        });
    }
}