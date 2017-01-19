package javajframeunderstanding;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javafx.geometry.Bounds;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameByClassExtends extends JFrame implements ComponentListener

{
    public Insets myFrameInsets;
    public Container pane;
    public Insets paneInsets;
    public JLabel myLabel;
    public Dimension labelPreferredSize;
    public Font labelFont;

    
    public JFrameByClassExtends()
    {
        this.setTitle("Hello World Main Form");
        myFrameInsets = this.getInsets();
        this.setSize(350 + myFrameInsets.left + myFrameInsets.right ,200 + myFrameInsets.bottom + myFrameInsets.top);       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        pane = this.getContentPane();
        pane.setLayout(null);
        
        myLabel = new JLabel("Hello World");
       // System.out.println("====> " + this.pane.getSize().height);
        labelFont = new Font("Arial" ,Font.BOLD , this.pane.getSize().height);
                labelFont = new Font("Arial" ,Font.BOLD , 16);

        myLabel.setFont(labelFont);
        
        labelPreferredSize = myLabel.getPreferredSize();

        
       // myLabel.setBounds((pane.getSize().width/2)/* - (labelPreferredSize.width /2)*/ ,( pane.getSize().height / 2) /*- (labelPreferredSize.height /2)*/,
        myLabel.setBounds((this.getSize().width/2) - (labelPreferredSize.width /2) ,( this.getSize().height / 2) - (labelPreferredSize.height /2),
                    
                labelPreferredSize.width, labelPreferredSize.height);
        
        
               
        myLabel.setBounds(108 ,56,labelPreferredSize.width, labelPreferredSize.height);
        
        pane.add(myLabel);
        
        paneInsets = pane.getInsets();
        
        this.setVisible(true);
    }
/*
    public void componentResized(ComponentEvent evt)
    {
        //throw new UnsupportedOperationException("Not supported yet."); 
     //   this.myLabel.setBounds((this.getSize().width/2) - (this.labelPreferredSize.width /2) ,( this.getSize().height / 2) - (this.labelPreferredSize.height /2),

      //  this.labelPreferredSize.width, this.labelPreferredSize.height);
      //  this.invalidate();
       // System.out.println("Component resize");
    }
    */
    public void valuePrint()
    {        
        System.out.println("Frame Size : " + this.getSize());
        System.out.println("Frame insest Size : " + this.myFrameInsets);
        System.out.println("Frame pane Bounds : " + this.pane.getBounds());
        System.out.println("Frame pane Size : " + this.pane.getSize());
        System.out.println("Frame half pane Size : " + this.pane.getSize().width/2 + " , " + this.pane.getSize().height/2);
        System.out.println("Frame Label preffered Size : " + this.labelPreferredSize.width + " , " + this.labelPreferredSize.height);
        System.out.println("Frame Label half preffered Size : " + this.labelPreferredSize.width / 2+ " , " + this.labelPreferredSize.height /2);
        System.out.println("Frame Label Bounds : " + this.myLabel.getBounds());  
        System.out.println("Frame Label Font Size : " + this.myLabel.getFont().getSize()); 
        System.out.println("Frame Label Font Ratio : " + (double)( this.myLabel.getBounds().width) / (double)(this.myLabel.getBounds().height)); 
        System.out.println("\n\n\n\n\n\n");          
    }

    @Override
    public void componentResized(ComponentEvent ce) {
        
        int size = (this.pane.getSize().height)/2;
        if(size * 5 > this.pane.getSize().width)
            size = this.pane.getSize().width / 6;
        labelFont = new Font("Arial" ,Font.BOLD ,size);
        myLabel.setFont(labelFont);
        labelPreferredSize = myLabel.getPreferredSize();
         
        this.myLabel.setBounds((pane.getSize().width/2) - (this.labelPreferredSize.width /2) ,( pane.getSize().height / 2) - (this.labelPreferredSize.height /2),
        this.labelPreferredSize.width, this.labelPreferredSize.height);
        valuePrint();
        
    }

    @Override
    public void componentMoved(ComponentEvent ce) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void componentShown(ComponentEvent ce) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void componentHidden(ComponentEvent ce) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
