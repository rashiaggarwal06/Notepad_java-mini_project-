//Notepad//
import java.awt.*;
import javax.swing.*;
class Notepad {
    Notepad(){
    JFrame f=new JFrame("Untitled");
    JMenuBar mb=new JMenuBar();
    JMenu m1=new JMenu("File");
    m1.setBounds(0,0,50,20);
    JMenuItem smf1=new JMenuItem("New Tab");
    JMenuItem smf2=new JMenuItem("New Window");
    JMenuItem smf3=new JMenuItem("Save (Ctrl + S)");
    JMenuItem smf4=new JMenuItem("Open (Ctrl + O)");
    JMenuItem smf5=new JMenuItem("Save as");
    JMenuItem smf6=new JMenuItem("Save all");
    JMenuItem smf7=new JMenuItem("Exit");
    JMenu m2=new JMenu("Edit");
    m2.setBounds(50,0,50,20);
    JMenuItem sme1=new JMenuItem("Undo (Ctrl + Z)");
    JMenuItem sme2=new JMenuItem("Cut (Ctrl + X)");
    JMenuItem sme3=new JMenuItem("Copy (Ctrl + C)");
    JMenuItem sme4=new JMenuItem("Paste (Ctrl + V)");
    JMenuItem sme5=new JMenuItem("Select All (Ctrl + A)");
    JMenuItem sme6=new JMenuItem("Delete");
    JMenuItem sme7=new JMenuItem("Find");
    JMenuItem sme8=new JMenuItem("Font");
    JMenu m3=new JMenu("View");
    m3.setBounds(100,0,50,20);
    JMenuItem smv1=new JMenuItem("Zoom");
    JMenuItem smvz1=new JMenuItem("Zoom in (Ctrl +)");
    JMenuItem smvz2=new JMenuItem("Zoom out (Ctrl -)");
    JMenuItem smvz3=new JMenuItem("Restore Default Zoom");
    JMenuItem smv2=new JMenuItem("Status Bar");
    JMenuItem smv3=new JMenuItem("Word Wrap");
    JMenu m4=new JMenu("Help");
    m3.setBounds(150,0,50,20);
    JMenuItem smh1=new JMenuItem("Help Center");
    JMenuItem smh2=new JMenuItem("About");
    m1.add(smf1);m1.add(smf2);m1.add(smf3);m1.add(smf4);m1.add(smf5);m1.add(smf6);m1.add(smf7);
    m2.add(sme1);m2.add(sme2);m2.add(sme3);m2.add(sme4);m2.add(sme5);m2.add(sme6);m2.add(sme7);m2.add(sme8);
    m3.add(smv1);m3.add(smv2);m3.add(smv3);
    smv1.add(smvz1);smv1.add(smvz2);smv1.add(smvz3);
    m4.add(smh1);m4.add(smh2);
    mb.add(m1);mb.add(m2);mb.add(m3);mb.add(m4);
    f.setJMenuBar(mb);
    f.setVisible(true);
    f.setLayout(null);
    f.setSize(400,500);
    }
    public static void main(String[] args){
        new Notepad();
    }
}