package org.eml.fox.JUI;

import cn.hutool.http.useragent.Browser;
import org.eml.fox.Main;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        //���ý�����ɫ
        this.setBackground(Color.white);
        //���ý����С
        this.setSize(864,524);
        this.setTitle("ĩӰ�ҵ�����������-1.0-SNAPSHOT");
        //���ý����Ƿ�ɼ�
        this.setVisible(true);
        //���ý������
        this.setLocationRelativeTo(null);
        //���ý���ر�����
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
